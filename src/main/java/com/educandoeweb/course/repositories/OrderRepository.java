package com.educandoeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoeweb.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
