package com.example.FoodieHub.controller;

import com.example.FoodieHub.dto.RestaurantRequestDTO;
import com.example.FoodieHub.service.RestaurantService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin
public class RestaurantController {


    private final RestaurantService restaurantService;


    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @PostMapping
    public String addRestaurant(
            @RequestBody RestaurantRequestDTO requestDTO
    ){

        return restaurantService.addRestaurant(requestDTO);

    }

}