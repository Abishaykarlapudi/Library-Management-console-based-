package com.library;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LibraryService libraryService = new LibraryServiceImpl();
		Boolean flag = true;
		System.out.println("Wellcome to library");
		while(flag) {
			System.out.println("Choose Your opestion in the below --");
			System.out.println("1. Create a book ---");
			System.out.println("2. Update the book ---");
			System.out.println("3. Delete a book ---");
			System.out.println("4. Display a book ---");
			System.out.println("5. Disaplay all the book ---");
			System.out.println("6. Exit ---");
			System.out.print("Enter your opestion : ");
			int choise = sc.nextInt();
			switch (choise) {
			case 1 -> {
				Book b = new Book();
				System.out.print("Enter Book id :");
				b.setId(sc.nextInt());
				System.out.print("Enter Book name :");
				sc.nextLine();
				b.setName(sc.nextLine());
				System.out.print("Enter Book price :");
				b.setPrice(sc.nextDouble());
				System.out.print("Enter Book year :");
				b.setYear(sc.nextInt());
				System.out.print("Enter Book author :");
				sc.nextLine();
				b.setAuthor(sc.nextLine());
				
				libraryService.create(b);
				
			}
			case 2 -> {
				Book b = new Book();
				System.out.print("Enter Book id :");
				b.setId(sc.nextInt());
				System.out.print("Enter Book name :");
				sc.nextLine();
				b.setName(sc.nextLine());
				System.out.print("Enter Book price :");
				b.setPrice(sc.nextDouble());
				System.out.print("Enter Book year :");
				b.setYear(sc.nextInt());
				sc.nextLine();
				System.out.print("Enter Book Author :");
				b.setAuthor(sc.nextLine());
				
				libraryService.update(b.getId() ,b);
				
			}
			case 3 -> {
				System.out.print("Enter Book id :");				
				libraryService.delete(sc.nextInt());
			}
			case 4 -> {
				System.out.print("Enter Book id :");				
				libraryService.getBookById(sc.nextInt());
			}
			case 5 -> {				
				libraryService.getAllBooks();
			}
			case 6 -> {
				System.out.print("Thanks for visiting ----");				
				flag=false;
			}
			
			
			default->
				System.out.println ("Unexpected value: " + choise);
			}
		}
		
	}

}
