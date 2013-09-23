package com.twu.biblioteca.Domain;

public class User extends BaseModel {

  private String name;
  private Long employeeId;
  private String username;
  private String password;

  public User(Long id, String name, Long employeeId, String username, String password) {
    this.id = id;
    this.name = name;
    this.employeeId = employeeId;
    this.username = username;
    this.password = password;
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
