package com.example.FoodieHub.service.impl;

import com.example.FoodieHub.dto.RegisterRequest;
import com.example.FoodieHub.entity.User;
import com.example.FoodieHub.repository.UserRepository;
import com.example.FoodieHub.service.UserService;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public String registerUser(RegisterRequest request){

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setPhone(request.getPhone());
        user.setRole("CUSTOMER");


        userRepository.save(user);


        return "User Registered Successfully";
    }

}