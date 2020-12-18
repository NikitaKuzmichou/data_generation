package com.vsu.by.entities.product.dtos;

import com.vsu.by.entities.category.dtos.CategoryNoCustomersDto;
import lombok.Data;

@Data
public class ProductNoSellerDto {
    private Long id;
    private String name;
    private CategoryNoCustomersDto category;
    private Double price;
}
