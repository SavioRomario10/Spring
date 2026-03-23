package com.dominio.course.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dominio.course.repositories.ProductRepository;
import com.dominio.course.entities.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService{

  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> obj = repository.findById(id);
    return obj.get();
  }
}
