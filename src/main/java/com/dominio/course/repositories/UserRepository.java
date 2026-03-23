package com.dominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
