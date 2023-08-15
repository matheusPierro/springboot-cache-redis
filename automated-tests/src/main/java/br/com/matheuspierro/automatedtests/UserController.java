package br.com.matheuspierro.automatedtests;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public List<User> create(@RequestBody User user) {
        return userService.create(user);
    }

}