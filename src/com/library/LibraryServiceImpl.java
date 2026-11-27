package com.library;

public class LibraryServiceImpl implements LibraryService{

	Book[] books = new Book[10];
	Integer count=0;
	
	@Override
	public void create(Book b) {
		if(count<books.length) {
			books[count]=b;
			count++;
		}
	}

	@Override
	public void update(Integer id, Book b) {
		for(Integer i=0;i<count;i++) {
			if(books[i].getId()==id) {
				Book book = books[i];
				book.setAuthor(b.getAuthor());
				book.setName(b.getName());
				book.setPrice(b.getPrice());
				book.setYear(b.getYear());
				return; 
			}
		}
	}

	@Override
	public void delete(Integer id) {
		for(Integer i=0;i<count;i++) {
			if(books[i].getId()==id) {
				for(Integer j=i;j<count-1;j++) {
					books[j]=books[j+1];
				}
				books[count-1]=null;
				count--;
				return;
			}
		}
	}

	@Override
	public void getBookById(Integer id) {
		for(Integer i=0;i<count;i++) {
			if(books[i].getId()==id) {
				books[i].displayAll();
				return;
			}
		}
	}

	@Override
	public void getAllBooks() {
		for(Integer i=0;i<count;i++) {
			books[i].displayAll();
		}
	}
	
	
}
