package com.vsu.by.entities.product.dtos;

import com.vsu.by.entities.category.dtos.CategoryNoCustomersDto;
import com.vsu.by.entities.seller.dtos.SellerNoProductsDto;
import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private CategoryNoCustomersDto category;
    private SellerNoProductsDto seller;
    private Double price;
}
