package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryController {

  public static List books = new ArrayList();

  public Library createLibrary(Long id, String name) {
    Library library = new Library(id,name);
    return library;
  }

  public void addBookToLibrary(Book book) {
    books.add(book);
  }

  public List<Book> getAllBooks() {
    return books;
  }

  public void printBookList() {
    for(Book book: getAllBooks()) {
      String status = book.getIsIssued()? "Not Available": "Available";
      System.out.println(book.getTitle() + " BY " + book.getAuthor() + "\t(" + status + ")");
    }
  }

  public boolean isBookIssued(String title) {
    for (Book book : getAllBooks())
    {
      if (book.getTitle().equals(title)) {
        Boolean isIssued = book.getIsIssued();
        if(!isIssued)
          updateBookStatus(book,true);
        return !isIssued;
      }
    }
    return false;
  }

  public void updateBookStatus(Book book, boolean status) {
    book.setIsIssued(status);
  }

}
