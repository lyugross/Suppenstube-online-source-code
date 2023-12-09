package com.suppenstube.model.dto;

import com.suppenstube.model.entity.MenuItem;
import com.suppenstube.model.entity.User;

import java.math.BigDecimal;
import java.util.Map;

public record OrderDTO (Map<Integer, MenuItem> items,
                       BigDecimal total, User orderedBy){
}
