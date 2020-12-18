package com.vsu.by.entities.customer;

import com.vsu.by.entities.customer.dtos.CustomerDto;
import com.vsu.by.entities.customer.dtos.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customers")
@Transactional
public class CustomerController {
    @Autowired
    private CustomerService service;
    @Autowired
    private CustomerMapper mapper;

    @GetMapping
    public ResponseEntity<List<CustomerDto>> getCustomers() {
        return new ResponseEntity<>(
                this.mapper.toCustomerDto(this.service.findAll()),
                HttpStatus.OK
        );
    }
}
