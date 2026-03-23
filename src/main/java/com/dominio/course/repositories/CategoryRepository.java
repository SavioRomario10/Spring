package com.dominio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
