package com.vsu.by.generation.entities.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductPrefix {
    private String name;
    private Double costModifier;
}
