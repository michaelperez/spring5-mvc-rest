package com.perezma.spring5mvcrest.repositories;

import com.perezma.spring5mvcrest.domains.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
