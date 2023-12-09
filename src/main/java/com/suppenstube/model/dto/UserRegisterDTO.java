package com.suppenstube.model.dto;

import com.suppenstube.model.validation.FieldMatch;
import com.suppenstube.model.validation.UniqueUserEmail;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

    @FieldMatch(
            first = "password",
            second = "confirmPassword",
            message = "Passwords should match."
    )
    public record UserRegisterDTO(String userName,
                                  @NotNull @Email @UniqueUserEmail String email,
                                  @NotEmpty String firstName,
                                  @NotEmpty String lastName,
                                  @NotEmpty String phoneNumber,
                                  String password,
                                  String confirmPassword) {

        public String fullName() {
            return firstName + " " + lastName;
        }

    }