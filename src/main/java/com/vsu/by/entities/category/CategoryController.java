package com.vsu.by.entities.category;

import com.vsu.by.entities.category.dtos.CategoryDto;
import com.vsu.by.entities.category.dtos.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
@Transactional
public class CategoryController {
    @Autowired
    private CategoryService service;
    @Autowired
    private CategoryMapper mapper;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> getCustomers() {
        return new ResponseEntity<>(
                this.mapper.toCategoryDto(this.service.findAll()),
                HttpStatus.OK
        );
    }
}
