package com.vsu.by.entities.customer.dtos;

import com.vsu.by.entities.category.dtos.CategoryNoCustomersDto;
import lombok.Data;

import java.util.List;

@Data
public class CustomerNoPurchasesDto {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;
    private List<CategoryNoCustomersDto> preferences;
}
