package com.twu.biblioteca;

public class Library {

  private Long id;
  private String name;

  public Library(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
