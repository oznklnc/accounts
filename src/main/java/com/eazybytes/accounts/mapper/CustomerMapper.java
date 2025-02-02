package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper extends AbstractMapper<Customer, CustomerDto> {

    @Override
    public CustomerDto toDto(Customer entity) {
        return CustomerDto.builder()
                .email(entity.getEmail())
                .name(entity.getName())
                .mobileNumber(entity.getMobileNumber())
                .build();
    }

    @Override
    public Customer toEntity(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setEmail(dto.getEmail());
        customer.setName(dto.getName());
        customer.setMobileNumber(dto.getMobileNumber());
        return customer;
    }

    @Override
    public Customer toEntity(CustomerDto dto, Customer entity) {
        entity.setEmail(dto.getEmail());
        entity.setName(dto.getName());
        entity.setMobileNumber(dto.getMobileNumber());
        return entity;
    }
}
