package com.fuhrmannmaciej.mybookapp.controller;

import com.fuhrmannmaciej.mybookapp.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/login")
    public boolean login(@RequestBody User user) {

        return user.getName().equals("user") && user.getPassword().equals("password");
    }

    @PutMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () -> new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }

}
