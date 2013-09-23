package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {

  private static List users = new ArrayList();

  public void addUser(User user) {
    users.add(user);
  }

  public List getAllUsers() {
    return users;
  }

  public void deleteAllUsers() {
    users.clear();
  }
}
