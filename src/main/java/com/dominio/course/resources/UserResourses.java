package com.dominio.course.resources;

import com.dominio.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResourses {

  @RequestMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Maria", "oBvHt@example.com", "999999999", "123456");

    return ResponseEntity.ok().body(u);
  }
}
