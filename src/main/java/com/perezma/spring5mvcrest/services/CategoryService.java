package com.perezma.spring5mvcrest.services;

import com.perezma.spring5mvcrest.api.v1.models.CategoryDTO;

import java.util.List;

public interface CategoryService {

    List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);
}
