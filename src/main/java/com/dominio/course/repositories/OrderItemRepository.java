package com.dominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.course.entities.OrderItem;
import com.dominio.course.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
