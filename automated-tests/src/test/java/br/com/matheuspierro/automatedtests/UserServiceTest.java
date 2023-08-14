package br.com.matheuspierro.automatedtests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void createUser() {
        // AAA
        // Arrange
        User user = new User("matheusPierro", "teste123");

        // Act
        List<User> users = userService.create(user);

        // Assert
        assertEquals(2, users.size());
        assertEquals(user, users.get(0));

    }
}