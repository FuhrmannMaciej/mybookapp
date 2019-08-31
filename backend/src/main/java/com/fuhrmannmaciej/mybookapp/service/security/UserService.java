package com.fuhrmannmaciej.mybookapp.service.security;

import com.fuhrmannmaciej.mybookapp.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
