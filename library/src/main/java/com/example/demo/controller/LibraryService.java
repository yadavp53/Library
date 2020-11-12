package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepository l;
	
	
	public List<Library> getAllBooks(){
		List<Library> l1=new ArrayList<>();
		l.findAll().forEach(l1::add);
		return l1;
	}	
	
	public void addBook(Library l1) {
		l.save(l1);
	}
	
	public void updateBook(String id,Library l1) {
		l.save(l1);
		}

	public void deleteBook(String id) {
		
		l.deleteById(id);
	}// TODO Auto-generated method stub
		
	}
	
	
