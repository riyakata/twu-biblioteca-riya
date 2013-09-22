package com.twu.biblioteca;

public class User {

  private Long id;
  private String name;
  private Long employeeId;

  public User(Long id, String name, Long employeeId) {
    this.id = id;
    this.name = name;
    this.employeeId = employeeId;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Long getEmployeeId() {
    return employeeId;
  }
}
