package com.vsu.by.entities.product;

import com.vsu.by.entities.product.dtos.ProductDto;
import com.vsu.by.entities.product.dtos.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
@Transactional
public class ProductController {
    @Autowired
    private ProductService service;
    @Autowired
    private ProductMapper mapper;

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() {
        return new ResponseEntity<>(
                this.mapper.toProductDto(this.service.findAll()),
                HttpStatus.OK
        );
    }
}
