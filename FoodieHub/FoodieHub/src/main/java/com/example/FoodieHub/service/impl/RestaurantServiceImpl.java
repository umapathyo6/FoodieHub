package com.example.FoodieHub.service.impl;

import com.example.FoodieHub.dto.RestaurantRequestDTO;
import com.example.FoodieHub.entity.Restaurant;
import com.example.FoodieHub.repository.RestaurantRepository;
import com.example.FoodieHub.service.RestaurantService;
import org.springframework.stereotype.Service;

@Service
public class RestaurantServiceImpl implements RestaurantService {


    private final RestaurantRepository restaurantRepository;


    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    @Override
    public String addRestaurant(RestaurantRequestDTO requestDTO) {


        Restaurant restaurant = new Restaurant();


        restaurant.setName(requestDTO.getName());

        restaurant.setDescription(requestDTO.getDescription());

        restaurant.setAddress(requestDTO.getAddress());

        restaurant.setImage(requestDTO.getImage());


        restaurant.setRating(0.0);


        restaurantRepository.save(restaurant);


        return "Restaurant Added Successfully";
    }
}