package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UserController {

  private static List users = new ArrayList();

  public void addUser(User user) {
    users.add(user);
  }

  public List<User> getAllUsers() {
    return users;
  }

  public void deleteAllUsers() {
    users.clear();
  }

  private Boolean validateUsername(String username) {
    final String USERNAME_PATTERN = "^[0-9]{3}-{1}[0-9]{4}$";
    Pattern pattern = Pattern.compile(USERNAME_PATTERN);
    if(username!=null && !pattern.matcher(username).matches()) {
      return false;
    }
    return true;
  }

  public Boolean validateCredentials(String username, String password) {
    if(validateUsername(username)) {
      if(getUserByUsernameAndPassword(username, password)!=null) {
        return true;
      }
      else
        return false;
    }
    return false;
  }

  private User getUserByUsernameAndPassword(String username, String password) {
    for (User user : getAllUsers())
    {
      if (user.getUsername().equals(username) && user.getPassword().equals(password))
        return user;
    }
    return null;
  }

}
