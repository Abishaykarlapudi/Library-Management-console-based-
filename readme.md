# 📚 Library Management System (Console-Based)

A simple **Library Management System** developed using Core Java. This project allows users to manage book records through a menu-driven console application.

## 🚀 Features

- **Create Book:** Add a new book with its ID, name, author, price, and publication year.
- **Update Book:** Update the details of an existing book using its ID.
- **Delete Book:** Remove a book from the library using its ID.
- **Search Book:** Find and display a book using its ID.
- **Display All Books:** View all available book records.
- **Exit:** Close the application.

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- Scanner Class
- Switch Statements
- Interfaces
- Service Implementation

## 📂 Project Structure

```text
Library-Management/
│
├── src/
│   └── com/
│       └── library/
│           ├── Book.java
│           ├── LibraryManagement.java
│           ├── LibraryService.java
│           └── LibraryServiceImpl.java
│
├── .gitignore
└── README.md
```

## ⚙️ How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/Abishaykarlapudi/Library-Management-console-based-.git
```

### 2. Open the Project

Open the project in Eclipse IDE or your preferred Java IDE.

### 3. Compile the Java Files

From the project root directory, run:

```bash
javac -d bin src/com/library/*.java
```

### 4. Run the Application

```bash
java -cp bin com.library.LibraryManagement
```

## 📋 Application Menu

```text
Welcome to library

Choose Your option in the below --

1. Create a book
2. Update the book
3. Delete a book
4. Display a book
5. Display all the books
6. Exit

Enter your option:
```

## 💡 Concepts Learned

- Implementing CRUD operations using Core Java.
- Understanding interfaces and implementation classes.
- Using arrays to manage multiple objects.
- Applying encapsulation through getters and setters.
- Implementing menu-driven applications using loops and switch statements.
- Separating application logic using a service layer.

## ⚠️ Note

This is a console-based application. Book records are stored in an array with a maximum capacity of 10 books. Data is maintained only while the application is running and is not permanently stored in a database.

## 👨‍💻 Author

**Abishay Karlapudi**

GitHub: [Abishaykarlapudi](https://github.com/Abishaykarlapudi)

---

⭐ If you find this project useful, feel free to explore the repository!