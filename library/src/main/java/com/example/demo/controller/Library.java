package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {

	
	@Id
	private String id;
	
	private String name;
	private String author;
	public Library(String id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public Library() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
