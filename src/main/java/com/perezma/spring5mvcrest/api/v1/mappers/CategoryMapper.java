package com.perezma.spring5mvcrest.api.v1.mappers;

import com.perezma.spring5mvcrest.api.v1.models.CategoryDTO;
import com.perezma.spring5mvcrest.domains.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);

}
