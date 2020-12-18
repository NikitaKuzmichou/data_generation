package com.vsu.by.entities.category.dtos;

import com.vsu.by.entities.customer.dtos.CustomerNoPrefersDto;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private Long id;
    private String name;
    private List<CustomerNoPrefersDto> customers;
}
