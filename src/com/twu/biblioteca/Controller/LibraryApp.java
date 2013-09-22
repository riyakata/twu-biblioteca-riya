package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Book;
import com.twu.biblioteca.Domain.Library;

import java.util.Scanner;

public class LibraryApp {

  private static void setUpLibrary(LibraryController libraryController) {
    libraryController.addBookToLibrary(new Book(1L, "HarryPotter", "J.K. Rowling", false));
    libraryController.addBookToLibrary(new Book(2L, "A Journey", "Tony Blair", false));
    libraryController.addBookToLibrary(new Book(3L, "A week with Gandhi", "L. Fischer", false));
    libraryController.addBookToLibrary(new Book(4L, "Anna Karenina", "Leo Tolstoy", false));
    libraryController.addBookToLibrary(new Book(5L, "Das Capital", "Karl Marks", false));
    libraryController.addBookToLibrary(new Book(6L, "Bandit Queen", "Mala Sen", false));
    libraryController.addBookToLibrary(new Book(7L, "Guide", "R. K. Narayanan", false));
    libraryController.addBookToLibrary(new Book(8L, "Hind Swaraj", "M. K. Gandhi", false));
    libraryController.addBookToLibrary(new Book(9L, "Historica", "Herodotus", false));
    libraryController.addBookToLibrary(new Book(10L, "I Van Ho", "Walter Scot", false));
  }

  public static void main(String args[]) {
    String choice;
    int ch;
    String chBook;

    LibraryController libraryController = new LibraryController();
    Library library = libraryController.createLibrary(1L,"Bangalore Library");
    setUpLibrary(libraryController);

    System.out.println("***********************************");
    System.out.println("Welcome to " + library.getName());
    System.out.println("***********************************");

    do {
      System.out.println("1. View all the books ");
      System.out.println("2. Reserve a book ");
      System.out.println("3. View your membership details ");
      System.out.println("\nPlease select an option!");
      System.out.println("***********************************");

      Scanner sc = new Scanner(System.in);
      ch = sc.nextInt();

      switch (ch) {
        case 1: libraryController.printBookList();
          break;

        case 2: libraryController.printBookList();
          System.out.println("Please enter book title to be issued");
          chBook = sc.next();
          if(libraryController.isBookIssued(chBook)) {
            System.out.println("Thank You! Enjoy the book.");
          }
          else
            System.out.println("Sorry we don't have that book yet.");
          break;

        case 3: System.out.println("Please talk to a Librarian. Thank you.");
          break;

        default: System.out.println("Select a valid option!!");
      }

      System.out.println("Do you want to continue? (yes/no)");
      choice = sc.next();
    }while(choice.equals("yes"));

  }

}
