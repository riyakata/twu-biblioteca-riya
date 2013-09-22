package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.Library;

import java.util.ArrayList;
import java.util.List;
public class LibraryController {

  public Library createLibrary(Long id, String name) {
    Library library = new Library(id,name);
    return library;
  }

  public void addBookToLibrary(Book book) {
    BookController bookController = new BookController();
    bookController.addBook(book);
  }

  public List<Book> getAllBooks() {
    return new BookController().getAllBooks();
  }

  public void printBookList() {
    for(Book book: getAllBooks()) {
      String status = book.getIsIssued()? "Not Available": "Available";
      System.out.println(book.getTitle() + " BY " + book.getAuthor() + "\t(" + status + ")");
    }
  }

  public boolean isBookIssued(String title) {
    Boolean isIssued = new BookController().isBookIssued(title);
    return isIssued;
  }

  public void updateBookStatus(String title, boolean status) {
    BookController bookController = new BookController();
    Book book = bookController.getBookByTitle(title);
    book.setIsIssued(status);
  }
}
