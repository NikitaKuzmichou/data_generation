package com.vsu.by.entities.category.dtos;

import com.vsu.by.entities.category.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    Category fromCategoryDto(CategoryDto categoryDto);

    List<Category> fromCategoryDto(List<CategoryDto> categoryDto);

    Category fromCategoryNoCustomers(CategoryNoCustomersDto categoryDto);

    List<Category> fromCategoryNoCustomers(
                                     List<CategoryNoCustomersDto> categoryDto);

    CategoryDto toCategoryDto(Category category);

    List<CategoryDto> toCategoryDto(List<Category> categories);

    CategoryNoCustomersDto toCategoryNoCustomers(Category category);

    List<CategoryNoCustomersDto> toCategoryNoCustomers(
                                                    List<Category> categories);
}
