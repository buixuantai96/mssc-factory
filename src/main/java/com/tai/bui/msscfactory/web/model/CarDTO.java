package com.tai.bui.msscfactory.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDTO {
    private UUID id;
    private String name;
    private String color;
    private BigDecimal price;
    private Long quantity;
}
