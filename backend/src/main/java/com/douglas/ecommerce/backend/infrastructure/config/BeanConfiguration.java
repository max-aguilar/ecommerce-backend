package com.douglas.ecommerce.backend.infrastructure.config;

import com.douglas.ecommerce.backend.application.CategoryService;
import com.douglas.ecommerce.backend.application.ProductService;
import com.douglas.ecommerce.backend.application.UserService;
import com.douglas.ecommerce.backend.domain.port.ICategoryRepository;
import com.douglas.ecommerce.backend.domain.port.IProductRepository;
import com.douglas.ecommerce.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);
    }

    @Bean
    public CategoryService categoryService(ICategoryRepository iCategoryRepository){
        return new CategoryService(iCategoryRepository);
    }

    @Bean
    public ProductService productService(IProductRepository iProductRepository){
        return  new ProductService(iProductRepository);
    }

}
