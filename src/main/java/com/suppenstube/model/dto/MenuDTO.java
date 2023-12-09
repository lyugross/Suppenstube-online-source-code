package com.suppenstube.model.dto;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public record MenuDTO(@NotEmpty String name,
                      @NotEmpty BigDecimal price,
                      com.suppenstube.model.entity.enums.SoupLabels label) {
}
