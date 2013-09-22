package com.twu.biblioteca;

public class Book {

  private Long id;
  private String title;
  private String author;
  private Boolean isIssued;

  public Book(Long id, String title, String author, Boolean isIssued) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.isIssued = isIssued;
  }


  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Boolean getIsIssued() {
    return isIssued;
  }

  public void setIsIssued(boolean status) {
    this.isIssued = status;
  }
}
