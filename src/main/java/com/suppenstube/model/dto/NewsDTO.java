package com.suppenstube.model.dto;

import javax.validation.constraints.NotEmpty;

public record NewsDTO(@NotEmpty String headline,
                      @NotEmpty String text) {
}
