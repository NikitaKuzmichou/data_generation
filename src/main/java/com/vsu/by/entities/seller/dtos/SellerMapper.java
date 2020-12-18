package com.vsu.by.entities.seller.dtos;

import com.vsu.by.entities.seller.Seller;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SellerMapper {

    Seller fromSellerDto(SellerDto sellerDto);

    List<Seller> fromSellerDto(List<SellerDto> sellerDtos);

    Seller fromSellerNoProductsDto(SellerNoProductsDto sellerNoProductsDto);

    SellerDto toSellerDto(Seller seller);

    List<SellerDto> toSellerDto(List<Seller> sellers);

    SellerNoProductsDto toSellerNoProductsDto(Seller seller);
}
