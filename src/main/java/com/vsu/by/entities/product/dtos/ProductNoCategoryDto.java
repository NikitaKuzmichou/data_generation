package com.vsu.by.entities.product.dtos;

import com.vsu.by.entities.seller.dtos.SellerNoProductsDto;
import lombok.Data;

@Data
public class ProductNoCategoryDto {
    private Long id;
    private String name;
    private SellerNoProductsDto seller;
    private Double price;
}
