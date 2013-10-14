package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.Library;
import com.twu.biblioteca.Domain.Movie;

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

  public void addMovieToLibrary(Movie movie) {
    MovieController movieController = new MovieController();
    movieController.addMovie(movie);
  }

  public List<Movie> getAllMovies() {
    return new MovieController().getAllMovies();
  }

  public void printMovieList() {
    System.out.println("NAME" + "\t" + "YEAR" + "\t" + "DIRECTOR" + "\t" + "RATING");
    System.out.println("***********************************");
    for(Movie movie: getAllMovies()) {
      System.out.println(movie.getName() + "\t" + movie.getYear() + "\t" + movie.getDirectorName() + "\t" + movie.getRating());
    }
  }

}
