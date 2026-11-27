package com.library;

public interface LibraryService {

	
	void create(Book b);
	void update(Integer id,Book b);
	void delete(Integer id);
	void getBookById(Integer id);
	void getAllBooks();
	
	
}
