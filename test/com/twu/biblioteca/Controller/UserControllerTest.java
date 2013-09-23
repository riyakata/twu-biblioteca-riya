package com.twu.biblioteca.Controller;

import com.twu.biblioteca.Domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserControllerTest {

  @Before
  public void reset() {
    new UserController().deleteAllUsers();
  }

  @Test
  public void shouldGetAllUsers() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1"));

    assertThat(userController.getAllUsers().size(), is(2));
  }

  @Test
  public void shouldAddUser() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1"));

    assertThat(userController.getAllUsers().size(), is(2));
  }
}
