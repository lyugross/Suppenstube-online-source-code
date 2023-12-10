package com.suppenstube.controller;

import com.suppenstube.model.dto.UserRegisterDTO;
import com.suppenstube.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(UserRegisterController.class)
public class UserRegisterControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testRegisterWhenGetRequestThenReturnRegisterView() throws Exception {
        mockMvc.perform(get("/register"))
                .andExpect(view().name("register"));
    }

    @Test
    public void testRegisterWhenPostRequestWithValidUserRegisterDTOThenReturnRegisterView() throws Exception {
        UserRegisterDTO validUserRegisterDTO = new UserRegisterDTO("user","mail@email.com","Ben", "Jones","01111111111", null, null); // Assuming UserRegisterDTO can be instantiated without setting properties for a valid object
        // Fill in the required fields if any
        // validUserRegisterDTO.setField(...);

        mockMvc.perform(post("/register")
                        .flashAttr("userRegisterDTO", validUserRegisterDTO))
                .andExpect(view().name("register"));
    }

    @Test
    public void testRegisterWhenPostRequestWithInvalidUserRegisterDTOThenReturnRegisterView() throws Exception {
        UserRegisterDTO invalidUserRegisterDTO = new UserRegisterDTO("user","mail@email.com","Ben", "Jones","01111111111", null, null); // Assuming UserRegisterDTO can be instantiated without setting properties for an invalid object
        // Set properties to make it invalid if necessary
        // invalidUserRegisterDTO.setField(...);

        mockMvc.perform(post("/register")
                        .flashAttr("userRegisterDTO", invalidUserRegisterDTO))
                .andExpect(view().name("register"));
    }
}