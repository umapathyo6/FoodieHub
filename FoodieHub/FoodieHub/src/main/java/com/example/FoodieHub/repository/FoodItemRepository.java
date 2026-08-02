package com.example.FoodieHub.repository;

import com.example.FoodieHub.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}