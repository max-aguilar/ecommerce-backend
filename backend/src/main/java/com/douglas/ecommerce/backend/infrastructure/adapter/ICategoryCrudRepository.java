package com.douglas.ecommerce.backend.infrastructure.adapter;

import com.douglas.ecommerce.backend.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryCrudRepository extends CrudRepository<CategoryEntity, Integer>{
}
