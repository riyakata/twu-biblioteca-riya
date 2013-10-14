package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieController {

  public static List movies = new ArrayList();

  public void addMovie(Movie movie) {
    movies.add(movie);
  }

  public List<Movie> getAllMovies() {
    return movies;
  }

  public void deleteAllMovies() {
    movies.clear();
  }
}
