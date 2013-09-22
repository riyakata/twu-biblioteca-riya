package com.twu.biblioteca;

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