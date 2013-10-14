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
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1", "jane@gmail.com", "9999111133"));

    assertThat(userController.getAllUsers().size(), is(2));
  }

  @Test
  public void shouldAddUser() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1", "jane@gmail.com", "9999111133"));

    assertThat(userController.getAllUsers().size(), is(2));
  }

  @Test
  public void shouldDeleteAllUsers() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1", "jane@gmail.com", "9999111133"));

    assertThat(userController.getAllUsers().size(), is(2));

    userController.deleteAllUsers();

    assertThat(userController.getAllUsers().size(), is(0));
  }

  @Test
  public void shouldValidateCorrectCredentialsOfAUser() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1", "jane@gmail.com", "9999111133"));

    assertThat(userController.validateCredentials("111-1111", "password"), is(Boolean.TRUE));
  }

  @Test
  public void shouldValidateIncorrectCredentialsOfAUser() {
    UserController userController = new UserController();
    userController.addUser(new User(1L, "John", 1L, "111-1111", "password", "john@gmail.com", "9999111122"));
    userController.addUser(new User(2L, "Jane", 2L, "222-2222", "password1", "jane@gmail.com", "9999111133"));

    assertThat(userController.validateCredentials("111-1111", "abcdefgh"), is(Boolean.FALSE));
  }
}
