package com.Ramesh.H2Console.course;

public class course1
{
	private int id;
	private String name;
	private String author;
	public course1(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "course1 [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
