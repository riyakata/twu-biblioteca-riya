package com.twu.biblioteca;

public class Library {

  private Long id;
  private String name;

  public Library(Long id, String name) {
    this.id = id;
    this.name = name;

    new Book(1L, "HarryPotter", "J.K. Rowling", false);
    new Book(2L, "A Journey", "Tony Blair", false);
    new Book(3L, "A week with Gandhi", "L. Fischer", false);
    new Book(4L, "Anna Karenina", "Leo Tolstoy", false);
    new Book(5L, "Das Capital", "Karl Marks", false);
    new Book(6L, "Bandit Queen", "Mala Sen", false);
    new Book(7L, "Guide", "R. K. Narayanan", false);
    new Book(8L, "Hind Swaraj", "M. K. Gandhi", false);
    new Book(9L, "Historica", "Herodotus", false);
    new Book(10L, "I Van Ho", "Walter Scot", false);
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
