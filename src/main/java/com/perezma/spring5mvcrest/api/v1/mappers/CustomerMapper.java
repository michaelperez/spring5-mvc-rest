package com.perezma.spring5mvcrest.api.v1.mappers;

import com.perezma.spring5mvcrest.api.v1.models.CustomerDTO;
import com.perezma.spring5mvcrest.domains.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToCustomerDTO(Customer customer);

    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
