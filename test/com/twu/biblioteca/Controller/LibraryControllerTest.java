package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.Library;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LibraryControllerTest {

  @Test
  public void shouldCreateLibrary() {
    LibraryController libraryController = new LibraryController();
    Library library = libraryController.createLibrary(1L,"Bangalore Library");
    assertThat(library.getId(), is(1L));
    assertThat(library.getName(), is("Bangalore Library"));
  }

  @Test
  public void shouldAddBookToList() {
    LibraryController libraryController = new LibraryController();
    Book book = new Book(1L, "HarryPotter", "J.K. Rowling", false);

    libraryController.addBookToLibrary(book);

    assertThat(libraryController.getAllBooks().size(), is(3));
  }

  @Test
  public void shouldGetAllBooks() {
    LibraryController libraryController = new LibraryController();
    Book book = new Book(1L, "HarryPotter", "J.K. Rowling", false);
    libraryController.addBookToLibrary(book);

    List books = libraryController.getAllBooks();

    assertThat(books.size(), is(2));
  }
}
