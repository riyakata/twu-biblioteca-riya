package com.twu.biblioteca.Domain;

public class Movie extends BaseModel {

  private String name;
  private String year;
  private String directorName;
  private String rating;

  public Movie(Long id, String name, String year, String directorName, String rating) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.directorName = directorName;
    this.rating = rating;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getYear() {
    return year;
  }

  public String getDirectorName() {
    return directorName;
  }

  public String getRating() {
    return rating;
  }
}
