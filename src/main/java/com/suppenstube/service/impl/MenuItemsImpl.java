package com.suppenstube.service.impl;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.model.entity.MenuItem;
import com.suppenstube.repo.MenuItemRepository;
import com.suppenstube.service.MenuItemsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MenuItemsImpl implements MenuItemsService {

    private final MenuItemRepository menuItemRepository;

    public MenuItemsImpl(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }


    @Override
    public List<MenuDTO> getAllMenuItems() {
        return menuItemRepository
                .findAll()
                .stream()
                .map(model -> new MenuDTO(model.getName(), model.getPrice(),model.getLabel()))
                .toList();
    }

    @Override
    public void updateMenu(MenuDTO menuDTO) {
        MenuItem menu= new MenuItem();
        menu.setName(menuDTO.name());
        menu.setLabel(menuDTO.label());
        menu.setPrice(menuDTO.price());
        menuItemRepository.save(menu);
    }

    @Override
    @Transactional
    public void deleteMenuItems() {
            menuItemRepository.deleteAll();

    }
}
