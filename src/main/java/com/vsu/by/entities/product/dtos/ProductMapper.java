package com.vsu.by.entities.product.dtos;

import com.vsu.by.entities.product.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product fromProductDto(ProductDto productDto);

    List<Product> fromProductDto(List<ProductDto> productDtos);

    Product fromProductNoCategoryDto(ProductNoCategoryDto product);

    Product fromProductNoSellerDto(ProductNoSellerDto product);

    ProductDto toProductDto(Product product);

    List<ProductDto> toProductDto(List<Product> products);

    ProductNoCategoryDto toProductNoCategoryDto(Product product);

    ProductNoSellerDto toProductNoSellerDto(Product product);
}
