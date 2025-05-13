# Book Order System with Custom Exception

This is a simple Java application that simulates a book ordering system. It uses object-oriented principles and demonstrates how to handle errors using a custom exception.

## Overview

The system includes:
- A list of books in the library.
- A way to order a book using its ID.
- A custom exception (`BookNotFoundException`) that is thrown when the requested book ID is not found.

## Technologies Used

- Java
- Collections (`ArrayList`)
- Exception Handling
- Custom Exception Class

## Project Structure

### Book class
Represents a book with:
- id
- title
- author

Includes a toString() method for formatted printing.

### BookNotFoundException class
A custom exception that extends Exception, used to signal that a book was not found in the list.

### LibrarySystem class
Contains:
- An ArrayList<Book> representing the library's book collection.
- A method orderBook(int id) that searches for a book by ID and either prints the book or throws BookNotFoundException.

### Main class
Runs the program:
- Tries to order books by ID.
- Handles any exceptions thrown if a book ID does not exist.

## Example Output
Book not found ID= 6
Order accepted 1 The Last Camelia Sarah Jio

## How to Run

1. Copy all the classes (`Book`, BookNotFoundException, LibrarySystem, and `Main`) into your Java project.
2. Compile and run Main.java.
3. Try changing the orderBook(id) calls to see how the system behaves.

## Author

Created by a Java backend student practicing exception handling and OOP concepts.
