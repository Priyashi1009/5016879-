package com.bookstore.bookstoreapi.mapper;

import com.bookstore.bookstoreapi.dto.CustomerDTO;
import com.bookstore.bookstoreapi.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO toDTO(Customer customer);
    Customer toEntity(CustomerDTO customerDTO);
}
