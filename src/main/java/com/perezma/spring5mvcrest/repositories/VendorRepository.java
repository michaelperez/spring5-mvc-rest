package com.perezma.spring5mvcrest.repositories;

import com.perezma.spring5mvcrest.domains.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
