package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.Library;

import java.util.Scanner;

public class LibraryApp {

  public static void main(String args[]) {
    String choice;
    int ch;

    Library library = new Library(1L,"Bangalore Library");

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
        case 1: System.out.println("case 1");
                break;

        case 2: System.out.println("case 2");
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
