package com.vsu.by.entities.seller.dtos;

import com.vsu.by.entities.product.dtos.ProductNoSellerDto;
import lombok.Data;

import java.util.List;

@Data
public class SellerDto {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private String organization;
    private List<ProductNoSellerDto> product;
}
