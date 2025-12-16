package com.irion.course.repositories;

import com.irion.course.entities.OrderItem;
import com.irion.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
