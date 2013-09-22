package com.twu.biblioteca.Domain;

public class Library extends BaseModel {

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
