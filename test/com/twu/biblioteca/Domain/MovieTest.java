package com.twu.biblioteca.Domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

  @Test
  public void shouldCreateAMovieObject() {
    Movie movie = new Movie(1L, "Sholay",	"1975",	"Ramesh Sippy",	"N/A");

    assertThat(movie.getId(), is(1L));
    assertThat(movie.getName(), is("Sholay"));
    assertThat(movie.getYear(), is("1975"));
    assertThat(movie.getDirectorName(), is("Ramesh Sippy"));
    assertThat(movie.getRating(), is("N/A"));
  }

}
