package com.vsu.by.entities.customer.dtos;

import com.vsu.by.entities.customer.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer fromCustomerDto(CustomerDto customerDto);

    List<Customer> fromCustomerDto(List<CustomerDto> customerDto);

    Customer fromCustomerNoListsDto(CustomerNoListsDto customer);

    Customer fromCustomerNoPrefersDto(CustomerNoPrefersDto customer);

    Customer fromCustomerNoPurchasesDto(CustomerNoPurchasesDto customer);

    CustomerDto toCustomerDto(Customer customer);

    List<CustomerDto> toCustomerDto(List<Customer> customers);

    CustomerNoListsDto toCustomerNoListsDto(Customer customer);

    CustomerNoPrefersDto toCustomerNoPrefersDto(Customer customer);

    CustomerNoPurchasesDto toCustomerNoPurchasesDto(Customer customer);
}
