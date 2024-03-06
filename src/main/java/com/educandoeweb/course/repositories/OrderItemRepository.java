package com.educandoeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoeweb.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
