package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Movie;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieControllerTest {

  @Before
  public void reset() {
    new MovieController().deleteAllMovies();
  }

  @Test
  public void shouldAddMovieToList() {
    MovieController movieController = new MovieController();
    movieController.addMovie(new Movie(1L, "Sholay",	"1975",	"Ramesh Sippy",	"N/A"));
    movieController.addMovie(new Movie(2L, "Krish",	"2006",	"Rakesh Roshan",	"8"));

    assertThat(movieController.movies.size(), is(2));
  }

  @Test
  public void shouldGetAllMovies() {
    MovieController movieController = new MovieController();
    movieController.addMovie(new Movie(1L, "Sholay",	"1975",	"Ramesh Sippy",	"N/A"));
    movieController.addMovie(new Movie(2L, "Sholay",	"1975",	"Ramesh Sippy",	"N/A"));

    List movies = movieController.getAllMovies();

    assertThat(movies.size(), is(2));
  }
}
