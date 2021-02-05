package com.tefnick.userservice.service;

import com.tefnick.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserRepository {

    public List<User> getAllUsers() {
        ArrayList<User> users =  new ArrayList<>();
        users.add(new User("Amalia", "Ruiz", 32));
        users.add(new User("Nick", "Ruiz", 33));
        users.add(new User("Molly", "Wolly", 12));

        return users;
    }
}
