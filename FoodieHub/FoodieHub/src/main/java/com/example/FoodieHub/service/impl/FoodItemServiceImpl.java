package com.example.FoodieHub.service.impl;

import com.example.FoodieHub.dto.FoodItemRequestDTO;
import com.example.FoodieHub.entity.FoodItem;
import com.example.FoodieHub.repository.FoodItemRepository;
import com.example.FoodieHub.service.FoodItemService;
import org.springframework.stereotype.Service;

@Service
public class FoodItemServiceImpl implements FoodItemService {


    private final FoodItemRepository foodItemRepository;


    public FoodItemServiceImpl(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }


    @Override
    public String addFoodItem(FoodItemRequestDTO requestDTO) {


        FoodItem foodItem = new FoodItem();


        foodItem.setName(requestDTO.getName());

        foodItem.setDescription(requestDTO.getDescription());

        foodItem.setPrice(requestDTO.getPrice());

        foodItem.setImage(requestDTO.getImage());


        foodItem.setAvailable(true);


        foodItemRepository.save(foodItem);


        return "Food Item Added Successfully";
    }
}