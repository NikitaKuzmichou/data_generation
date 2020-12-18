package com.vsu.by.entities.customer.dtos;

import com.vsu.by.entities.category.dtos.CategoryNoCustomersDto;
import com.vsu.by.entities.purchase.dtos.PurchaseDto;
import lombok.Data;

import java.util.List;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private List<PurchaseDto> purchases;
    private List<CategoryNoCustomersDto> preferences;
}
