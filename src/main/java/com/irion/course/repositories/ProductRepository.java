package com.irion.course.repositories;

import com.irion.course.entities.Category;
import com.irion.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
