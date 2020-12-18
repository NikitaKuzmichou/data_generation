package com.vsu.by.entities.seller;

import com.vsu.by.entities.seller.dtos.SellerDto;
import com.vsu.by.entities.seller.dtos.SellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sellers")
@Transactional
public class SellerController {
    @Autowired
    private SellerService service;
    @Autowired
    private SellerMapper mapper;

    @GetMapping
    public ResponseEntity<List<SellerDto>> getSellers() {
        return new ResponseEntity<>(
                this.mapper.toSellerDto(this.service.findAll()),
                HttpStatus.OK
        );
    }
}
