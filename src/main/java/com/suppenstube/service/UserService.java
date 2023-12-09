package com.suppenstube.service;


import com.suppenstube.model.dto.UserRegisterDTO;
import org.springframework.security.core.Authentication;

public interface UserService {
    void registerUser(UserRegisterDTO userRegisterDTO);
    Authentication login(String username);
}

