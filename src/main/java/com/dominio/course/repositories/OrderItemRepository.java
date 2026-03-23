package com.dominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
