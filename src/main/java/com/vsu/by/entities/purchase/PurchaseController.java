package com.vsu.by.entities.purchase;

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

    @GetMapping
    public ResponseEntity<List<Purchase>> getPurchases() {
        /**TODO recursive data returning. need Mapstruct*/
        return new ResponseEntity<>(
                this.service.findAll(),
                HttpStatus.OK
        );
    }
}
