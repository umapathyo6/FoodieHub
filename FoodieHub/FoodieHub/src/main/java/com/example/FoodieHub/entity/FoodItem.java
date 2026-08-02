package com.example.FoodieHub.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "food_items")
@Data
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    private String image;

    private Boolean available;

}