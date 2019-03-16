package com.perezma.spring5mvcrest.repositories;

import com.perezma.spring5mvcrest.domains.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);
}
