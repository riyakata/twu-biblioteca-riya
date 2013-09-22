package com.twu.biblioteca.Domain;

import com.twu.biblioteca.Domain.Book;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

  @Test
  public void shouldCreateABookObject() {
    Book book = new Book(1L,"HarryPotter","J.K. Rowling", false);
    assertThat(book.getId(),is(1L));
    assertThat(book.getTitle(),is("HarryPotter"));
    assertThat(book.getAuthor(),is("J.K. Rowling"));
    assertThat(book.getIsIssued(),is(false));
  }

  @Test
  public void shouldSetIsIssued() {
    Book book = new Book(1L,"HarryPotter","J.K. Rowling", false);
    book.setIsIssued(true);
    assertThat(book.getIsIssued(),is(true));
  }
}
