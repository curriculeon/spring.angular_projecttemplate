package com.github.curriculeon.ecommerce.repository;

import com.github.curriculeon.ecommerce.model.OrderProduct;
import com.github.curriculeon.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
