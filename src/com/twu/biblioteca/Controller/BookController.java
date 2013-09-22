package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {

  public static List books = new ArrayList();

  public Book getBookByTitle(String title) {
    for (Book book : getAllBooks())
    {
      if (book.getTitle().equals(title))
        return book;
    }
    return null;
  }

  public List<Book> getAllBooks() {
    return books;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public boolean isBookIssued(String title) {
    Book book = getBookByTitle(title);
    if(book!=null) {
      Boolean isIssued = book.getIsIssued();
      if(!isIssued)
        book.setIsIssued(true);
      return !isIssued;
    }
    return false;
  }

}
