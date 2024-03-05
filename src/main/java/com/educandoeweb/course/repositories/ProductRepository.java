package com.educandoeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoeweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
