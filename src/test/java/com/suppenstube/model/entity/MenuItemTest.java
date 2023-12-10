package com.suppenstube.model.entity;

import com.suppenstube.model.entity.enums.SoupLabels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MenuItemTest {

    private MenuItem menuItem;

    @BeforeEach
    public void setUp() {
        menuItem = new MenuItem();
    }

    @Test
    public void testGetNameWhenCalledThenReturnName() {
        // Arrange
        String expectedName = "Tomato Soup";
        menuItem.setName(expectedName);

        // Act
        String actualName = menuItem.getName();

        // Assert
        Assertions.assertThat(actualName).isEqualTo(expectedName);
    }

    @Test
    public void testSetNameWhenCalledThenUpdateName() {
        // Arrange
        String newName = "Chicken Soup";

        // Act
        menuItem.setName(newName);
        String actualName = menuItem.getName();

        // Assert
        Assertions.assertThat(actualName).isEqualTo(newName);
    }

    @Test
    public void testGetPriceWhenCalledThenReturnPrice() {
        // Arrange
        BigDecimal expectedPrice = BigDecimal.valueOf(5.99);
        menuItem.setPrice(expectedPrice);

        // Act
        BigDecimal actualPrice = menuItem.getPrice();

        // Assert
        Assertions.assertThat(actualPrice).isEqualTo(expectedPrice);
    }

    @Test
    public void testSetPriceWhenCalledThenUpdatePrice() {
        // Arrange
        BigDecimal newPrice = BigDecimal.valueOf(6.99);

        // Act
        menuItem.setPrice(newPrice);
        BigDecimal actualPrice = menuItem.getPrice();

        // Assert
        Assertions.assertThat(actualPrice).isEqualTo(newPrice);
    }

    @Test
    public void testGetLabelWhenCalledThenReturnLabel() {
        // Arrange
        SoupLabels expectedLabel = SoupLabels.VEGAN;
        menuItem.setLabel(expectedLabel);

        // Act
        SoupLabels actualLabel = menuItem.getLabel();

        // Assert
        Assertions.assertThat(actualLabel).isEqualTo(expectedLabel);
    }

    @Test
    public void testSetLabelWhenCalledThenUpdateLabel() {
        // Arrange
        SoupLabels newLabel = SoupLabels.MEAT;

        // Act
        menuItem.setLabel(newLabel);
        SoupLabels actualLabel = menuItem.getLabel();

        // Assert
        Assertions.assertThat(actualLabel).isEqualTo(newLabel);
    }
}