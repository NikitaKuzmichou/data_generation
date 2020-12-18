package com.vsu.by.entities.purchase.dtos;

import com.vsu.by.entities.customer.dtos.CustomerNoListsDto;
import com.vsu.by.entities.product.dtos.ProductDto;

import java.sql.Date;

public class PurchaseDto {
    private Long id;
    private ProductDto product;
    private CustomerNoListsDto customer;
    private Date purchaseDate;
}
