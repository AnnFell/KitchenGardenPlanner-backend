package com.example.KitchenGardenPlanner.controllers;

import com.example.KitchenGardenPlanner.model.Account;
import com.example.KitchenGardenPlanner.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class UserController {
    final UserService userService;

    @PostMapping("/api/login")
    Account login(@Valid @RequestBody Account user) throws Exception {
        return userService.findUser(user).orElseThrow(() -> new Exception("No user found"));
    }

    @PostMapping("/api/register")
    Account register(@Valid @RequestBody Account user) {
        return userService.register(user);
    }

}
