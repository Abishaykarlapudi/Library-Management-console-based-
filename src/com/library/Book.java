package com.library;

public class Book {

	private Integer id;
	private String name;
	private String author;
	private Double price;
	private Integer year;
	
	
	
	public Book() {
		
	}
	
	public Book(Integer id, String name, String author, Double price, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.year = year;
	}
	
	public void displayAll() {
		System.out.println( "Book [id=" + id + ", \nname=" + name + ", \nauthor=" + author + ", \nprice=" + price + ", \nyear=" + year + "]");
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
}
