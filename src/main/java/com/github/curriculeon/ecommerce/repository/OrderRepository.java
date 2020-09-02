package com.github.curriculeon.ecommerce.repository;

import com.github.curriculeon.ecommerce.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
