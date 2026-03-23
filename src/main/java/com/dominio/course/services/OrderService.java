package com.dominio.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dominio.course.repositories.OrderRepository;
import com.dominio.course.entities.Order;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService{

  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    return repository.findAll();
  }

  public Order findById(Long id) {
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }
}
