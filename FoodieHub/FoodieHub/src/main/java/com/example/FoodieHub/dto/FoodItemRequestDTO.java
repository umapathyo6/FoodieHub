package com.example.FoodieHub.dto;

import lombok.Data;

@Data
public class FoodItemRequestDTO {

    private String name;

    private String description;

    private Double price;

    private String image;

}