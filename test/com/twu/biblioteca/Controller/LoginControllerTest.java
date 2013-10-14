package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class LoginControllerTest {

  @Test
  public void shouldLoginAUser() {
    User user = new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122");
    UserController userController = new UserController();
    userController.addUser(user);
    LoginController loginController = new LoginController();

    loginController.loginUser(user);

    assertThat(user.getIsLoggedIn(), is(true));
  }

  @Test
  public void shouldLogoutAUser() {
    User user = new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122");
    UserController userController = new UserController();
    userController.addUser(user);
    LoginController loginController = new LoginController();
    loginController.loginUser(user);
    assertThat(user.getIsLoggedIn(), is(true));

    loginController.logoutUser(user);
    assertThat(user.getIsLoggedIn(), is(false));
  }

  @Test
  public void shouldCheckIfAUserIsLoggedInOrNot() {
    User user = new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122");
    UserController userController = new UserController();
    userController.addUser(user);
    LoginController loginController = new LoginController();
    loginController.loginUser(user);

    assertThat(loginController.isLoggedIn(user), is(true));
  }

}
