package com.vsu.by.entities.purchase;

import com.vsu.by.entities.purchase.dtos.PurchaseDto;
import com.vsu.by.entities.purchase.dtos.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("purchases")
@Transactional
public class PurchaseController {
    @Autowired
    private PurchaseService service;
    @Autowired
    private PurchaseMapper mapper;

    @GetMapping
    public ResponseEntity<List<PurchaseDto>> getPurchases() {
        return new ResponseEntity<>(
                this.mapper.toPurchaseDto(this.service.findAll()),
                HttpStatus.OK
        );
    }
}
