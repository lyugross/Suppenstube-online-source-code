package com.suppenstube.controller;

import com.suppenstube.model.dto.UserRegisterDTO;
import com.suppenstube.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegisterController {

    private final UserService userService;

    public UserRegisterController(
            UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(UserRegisterDTO userRegisterDTO) {
        userService.registerUser(userRegisterDTO);
        return "register";
    }


}
