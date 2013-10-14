package com.twu.biblioteca.Domain;

public class User extends BaseModel {

  private String name;
  private Long employeeId;
  private String username;
  private String password;
  private String email;
  private String phoneNumber;

  public User(Long id, String name, Long employeeId, String username, String password, String email, String phoneNumber) {
    this.id = id;
    this.name = name;
    this.employeeId = employeeId;
    this.username = username;
    this.password = password;
    this.email = email;
    this.phoneNumber = phoneNumber;
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

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

}
