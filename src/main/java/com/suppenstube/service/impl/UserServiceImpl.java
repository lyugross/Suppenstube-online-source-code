package com.suppenstube.service.impl;

import com.suppenstube.model.dto.UserRegisterDTO;
import com.suppenstube.model.entity.User;
import com.suppenstube.repo.UserRepository;
import com.suppenstube.service.UserService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    private final ApplicationEventPublisher appEventPublisher;
    private final UserDetailsService userDetailsService;

    public UserServiceImpl(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            ApplicationEventPublisher appEventPublisher,
            UserDetailsService userDetailsService) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.appEventPublisher = appEventPublisher;
        this.userDetailsService = userDetailsService;
    }
/*
   @Override
    public boolean register(
           UserRegistrationDTO userRegistrationDTO) {

        userRepository.save(map(userRegistrationDTO));

        appEventPublisher.publishEvent(new UserRegisteredEvent(
                "UserService",
                userRegistrationDTO.email(),
                userRegistrationDTO.fullName()
        ));
    }
*/


    @Override
    public void registerUser(UserRegisterDTO userRegisterDTO) {
        userRepository.save(map(userRegisterDTO));
    }

    @Override
    public Authentication login(String userName) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);

        Authentication auth = new UsernamePasswordAuthenticationToken(
                userDetails,
                userDetails.getPassword(),
                userDetails.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(auth);

        return auth;
    }

    private User map(UserRegisterDTO userRegisterDTO) {
        User user = new User();
        user.setPhoneNumber(userRegisterDTO.phoneNumber());
        user.setUserName(userRegisterDTO.userName());
        user.setFirstName(userRegisterDTO.firstName());
        user.setLastName(userRegisterDTO.lastName());
        user.setEmail(userRegisterDTO.email());
        user.setPassword(passwordEncoder.encode(userRegisterDTO.password()));
        return user;
    }


}