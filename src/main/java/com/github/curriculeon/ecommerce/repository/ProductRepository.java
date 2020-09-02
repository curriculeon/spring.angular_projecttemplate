package com.github.curriculeon.ecommerce.repository;

import com.github.curriculeon.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
