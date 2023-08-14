package br.com.matheuspierro.automatedtests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void createUser_ReturnsUsers() {
        // AAA
        // Arrange
        User user = new User("matheusPierro", "teste123");

        // Act
        List<User> users = userService.create(user);

        // Assert
        assertEquals(1, users.size());
        assertEquals(user, users.get(0));

    }

    @Test
    public void createUser_ThrowsException() {
        User user = new User("matheusPierro", "teste123");
        userService.create(user);

        assertThrows(Exception.class,
                () -> userService.create(user));
    }
}