package com.twu.biblioteca.Domain;

import com.twu.biblioteca.Domain.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {

  @Test
  public void shouldCreateAUserObject() {
    User user = new User(1L, "John", 1L);
    assertThat(user.getId(), is(1L));
    assertThat(user.getName(), is("John"));
    assertThat(user.getEmployeeId(), is(1L));
  }

}