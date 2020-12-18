package com.vsu.by.entities.purchase.dtos;

import com.vsu.by.entities.purchase.Purchase;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    Purchase fromPurchaseDto(PurchaseDto purchaseDto);

    List<Purchase> fromPurchaseDto(List<PurchaseDto> purchaseDtos);

    PurchaseDto toPurchaseDto(Purchase purchase);

    List<PurchaseDto> toPurchaseDto(List<Purchase> purchases);
}
