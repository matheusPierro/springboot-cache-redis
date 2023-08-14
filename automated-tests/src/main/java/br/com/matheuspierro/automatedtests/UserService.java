package br.com.matheuspierro.automatedtests;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    List<User> users = new ArrayList<>();

    public List<User> create(User user) {
        users.add(user);
        return users;
    }
}