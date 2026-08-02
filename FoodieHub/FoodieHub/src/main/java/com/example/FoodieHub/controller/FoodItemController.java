package com.example.FoodieHub.controller;

import com.example.FoodieHub.dto.FoodItemRequestDTO;
import com.example.FoodieHub.service.FoodItemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/food-items")
@CrossOrigin
public class FoodItemController {


    private final FoodItemService foodItemService;


    public FoodItemController(FoodItemService foodItemService) {
        this.foodItemService = foodItemService;
    }


    @PostMapping
    public String addFoodItem(
            @RequestBody FoodItemRequestDTO requestDTO
    ){

        return foodItemService.addFoodItem(requestDTO);

    }

}