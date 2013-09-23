package com.twu.biblioteca.Domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest {

  @Test
  public void shouldCreateAUserObject() {
    User user = new User(1L, "John", 1L, "111-1111", "password");
    assertThat(user.getId(), is(1L));
    assertThat(user.getName(), is("John"));
    assertThat(user.getEmployeeId(), is(1L));
  }

}
