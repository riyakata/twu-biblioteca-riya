package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.User;

public class LoginController {

  public void loginUser(User user) {
    user.setIsLoggedIn(true);
  }

  public void logoutUser(User user) {
    user.setIsLoggedIn(false);
  }

  public boolean isLoggedIn(User user) {
    if(user!=null) {
      return user.getIsLoggedIn();
    }
    return false;
  }
}
