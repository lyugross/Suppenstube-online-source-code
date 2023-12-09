package com.suppenstube.service;

import com.suppenstube.model.dto.MenuDTO;

import java.util.List;

public interface MenuItemsService {
    List<MenuDTO> getAllMenuItems();

    void updateMenu(MenuDTO menuDTO);
    void deleteMenuItems();
}
