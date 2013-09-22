package com.twu.biblioteca.Domain;

import com.twu.biblioteca.Domain.Library;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LibraryTest {

  @Test
  public void shouldCreateALibraryObject() {
    Library library = new Library(1L, "Bangalore Library");
    assertThat(library.getId(), is(1L));
    assertThat(library.getName(), is("Bangalore Library"));
  }

}