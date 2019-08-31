package com.fuhrmannmaciej.mybookapp.service.security;

import org.springframework.security.core.userdetails.UserDetailsService;

public class UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}