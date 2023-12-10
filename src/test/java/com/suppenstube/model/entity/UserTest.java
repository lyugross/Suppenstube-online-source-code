package com.suppenstube.model.entity;

import com.suppenstube.model.entity.enums.UserRoleEnum;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserTest {

    @Test
    public void testGetUserNameWhenCalledThenReturnUserName() {
        // Arrange
        User user = new User();
        String expectedUserName = "testUser";
        user.setUserName(expectedUserName);

        // Act
        String actualUserName = user.getUserName();

        // Assert
        Assertions.assertThat(actualUserName).isEqualTo(expectedUserName);
    }

    @Test
    public void testSetUserNameWhenCalledThenSetUserName() {
        // Arrange
        User user = new User();
        String userNameToSet = "testUser";

        // Act
        user.setUserName(userNameToSet);
        String actualUserName = user.getUserName();

        // Assert
        Assertions.assertThat(actualUserName).isEqualTo(userNameToSet);
    }

    @Test
    public void testGetEmailWhenCalledThenReturnEmail() {
        // Arrange
        User user = new User();
        String expectedEmail = "test@example.com";
        user.setEmail(expectedEmail);

        // Act
        String actualEmail = user.getEmail();

        // Assert
        Assertions.assertThat(actualEmail).isEqualTo(expectedEmail);
    }

    @Test
    public void testSetEmailWhenCalledThenSetEmail() {
        // Arrange
        User user = new User();
        String emailToSet = "test@example.com";

        // Act
        user.setEmail(emailToSet);
        String actualEmail = user.getEmail();

        // Assert
        Assertions.assertThat(actualEmail).isEqualTo(emailToSet);
    }

    @Test
    public void testGetRolesWhenCalledThenReturnRoles() {
        // Arrange
        User user = new User();
        List<UserRole> expectedRoles = new ArrayList<>();
        expectedRoles.add(new UserRole().setRole(UserRoleEnum.USER));
        user.setRoles(expectedRoles);

        // Act
        List<UserRole> actualRoles = user.getRoles();

        // Assert
        Assertions.assertThat(actualRoles).isEqualTo(expectedRoles);
    }

    @Test
    public void testSetRolesWhenCalledThenSetRoles() {
        // Arrange
        User user = new User();
        List<UserRole> rolesToSet = new ArrayList<>();
        rolesToSet.add(new UserRole().setRole(UserRoleEnum.USER));

        // Act
        user.setRoles(rolesToSet);
        List<UserRole> actualRoles = user.getRoles();

        // Assert
        Assertions.assertThat(actualRoles).isEqualTo(rolesToSet);
    }

    @Test
    public void testGetPasswordWhenCalledThenReturnPassword() {
        // Arrange
        User user = new User();
        String expectedPassword = "securePassword123";
        user.setPassword(expectedPassword);

        // Act
        String actualPassword = user.getPassword();

        // Assert
        Assertions.assertThat(actualPassword).isEqualTo(expectedPassword);
    }

    @Test
    public void testSetPasswordWhenCalledThenSetPassword() {
        // Arrange
        User user = new User();
        String passwordToSet = "securePassword123";

        // Act
        user.setPassword(passwordToSet);
        String actualPassword = user.getPassword();

        // Assert
        Assertions.assertThat(actualPassword).isEqualTo(passwordToSet);
    }

    @Test
    public void testGetFirstNameWhenCalledThenReturnFirstName() {
        // Arrange
        User user = new User();
        String expectedFirstName = "John";
        user.setFirstName(expectedFirstName);

        // Act
        String actualFirstName = user.getFirstName();

        // Assert
        Assertions.assertThat(actualFirstName).isEqualTo(expectedFirstName);
    }

    @Test
    public void testSetFirstNameWhenCalledThenSetFirstName() {
        // Arrange
        User user = new User();
        String firstNameToSet = "John";

        // Act
        user.setFirstName(firstNameToSet);
        String actualFirstName = user.getFirstName();

        // Assert
        Assertions.assertThat(actualFirstName).isEqualTo(firstNameToSet);
    }

    @Test
    public void testGetLastNameWhenCalledThenReturnLastName() {
        // Arrange
        User user = new User();
        String expectedLastName = "Doe";
        user.setLastName(expectedLastName);

        // Act
        String actualLastName = user.getLastName();

        // Assert
        Assertions.assertThat(actualLastName).isEqualTo(expectedLastName);
    }

    @Test
    public void testSetLastNameWhenCalledThenSetLastName() {
        // Arrange
        User user = new User();
        String lastNameToSet = "Doe";

        // Act
        user.setLastName(lastNameToSet);
        String actualLastName = user.getLastName();

        // Assert
        Assertions.assertThat(actualLastName).isEqualTo(lastNameToSet);
    }

    @Test
    public void testGetPhoneNumberWhenCalledThenReturnPhoneNumber() {
        // Arrange
        User user = new User();
        String expectedPhoneNumber = "1234567890";
        user.setPhoneNumber(expectedPhoneNumber);

        // Act
        String actualPhoneNumber = user.getPhoneNumber();

        // Assert
        Assertions.assertThat(actualPhoneNumber).isEqualTo(expectedPhoneNumber);
    }

    @Test
    public void testSetPhoneNumberWhenCalledThenSetPhoneNumber() {
        // Arrange
        User user = new User();
        String phoneNumberToSet = "1234567890";

        // Act
        user.setPhoneNumber(phoneNumberToSet);
        String actualPhoneNumber = user.getPhoneNumber();

        // Assert
        Assertions.assertThat(actualPhoneNumber).isEqualTo(phoneNumberToSet);
    }

    @Test
    public void testGetOrdersWhenCalledThenReturnOrders() {
        // Arrange
        User user = new User();
        Set<Order> expectedOrders = new HashSet<>();
        expectedOrders.add(new Order());
        user.setOrders(expectedOrders);

        // Act
        Set<Order> actualOrders = user.getOrders();

        // Assert
        Assertions.assertThat(actualOrders).isEqualTo(expectedOrders);
    }

    @Test
    public void testSetOrdersWhenCalledThenSetOrders() {
        // Arrange
        User user = new User();
        Set<Order> ordersToSet = new HashSet<>();
        ordersToSet.add(new Order());

        // Act
        user.setOrders(ordersToSet);
        Set<Order> actualOrders = user.getOrders();

        // Assert
        Assertions.assertThat(actualOrders).isEqualTo(ordersToSet);
    }
}