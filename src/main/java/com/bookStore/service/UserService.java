package com.bookStore.service;

import com.bookStore.entity.User;

public interface UserService {
    User save(User user);
    User findByUsername(String username);
    boolean authenticate(String username, String password);
}
