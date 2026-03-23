package com.dominio.course.resources;

import com.dominio.course.entities.Product;
import com.dominio.course.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/products")
public class ProductResourse {
  
  @Autowired(required = true)
  private ProductService service;
  @GetMapping
  public ResponseEntity<List<Product>> findAll() {

    List<Product> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Long id) {
    Product obj = service.findById(id);
    return ResponseEntity.ok().body(obj);
  }
}