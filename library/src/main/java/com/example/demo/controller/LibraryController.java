package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	@Autowired
	LibraryService libraryService;
	@RequestMapping("/library")
	public List<Library> getRequest() {
		return libraryService.getAllBooks();
	}	
	
	@PostMapping(value="/library/post")	
		public void addBook(@RequestBody Library t) {
		libraryService.addBook(t);		
		}
	@PutMapping(value="/library/update/{id}")
	public void updateBook(@PathVariable String id,@RequestBody Library t) {
		libraryService.updateBook(id,t);		
		}
	@DeleteMapping(value="/library/delete/{id}")
	public void deleteBook(@PathVariable String id) {
		libraryService.deleteBook(id);
	}


}
