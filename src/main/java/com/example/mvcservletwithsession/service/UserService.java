package com.example.mvcservletwithsession.service;

// src/main/java/com/example/mvc/service/UserService.java

import com.example.mvcservletwithsession.model.User;

public class UserService {
    public User authenticate(String username, String password) {
        // Fake check (replace with DB in real app)
        if ("admin".equals(username) && "1234".equals(password)) {
            return new User(username, "Administrator");
        }
        return null;
    }
}
