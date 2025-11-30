package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.userDto.CreateUserRequestDto;
import com.example.bookMyShow.dto.userDto.CreateUserResponseDto;
import com.example.bookMyShow.models.User;
import com.example.bookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public CreateUserResponseDto createUser(CreateUserRequestDto request) {
        User savedUser = userService.createUser(request.getName(), request.getEmail());

        CreateUserResponseDto response = new CreateUserResponseDto();
        response.setUser(savedUser);
        return response;
    }

}
