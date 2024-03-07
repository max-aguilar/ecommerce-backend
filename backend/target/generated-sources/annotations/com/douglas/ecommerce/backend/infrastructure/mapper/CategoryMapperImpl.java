package com.douglas.ecommerce.backend.infrastructure.mapper;

import com.douglas.ecommerce.backend.domain.model.Category;
import com.douglas.ecommerce.backend.infrastructure.entity.CategoryEntity;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-06T09:28:23-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.9 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toCategory(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryEntity.getId() );
        category.setName( categoryEntity.getName() );
        category.setDateCreated( categoryEntity.getDateCreated() );
        category.setDateUpdated( categoryEntity.getDateUpdated() );

        return category;
    }

    @Override
    public Iterable<Category> toCategoryList(Iterable<CategoryEntity> categoryEntities) {
        if ( categoryEntities == null ) {
            return null;
        }

        ArrayList<Category> iterable = new ArrayList<Category>();
        for ( CategoryEntity categoryEntity : categoryEntities ) {
            iterable.add( toCategory( categoryEntity ) );
        }

        return iterable;
    }

    @Override
    public CategoryEntity toCategoryEntity(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        categoryEntity.setId( category.getId() );
        categoryEntity.setName( category.getName() );
        categoryEntity.setDateCreated( category.getDateCreated() );
        categoryEntity.setDateUpdated( category.getDateUpdated() );

        return categoryEntity;
    }
}
