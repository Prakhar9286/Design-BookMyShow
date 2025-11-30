package com.example.bookMyShow.dto.userDto;

import com.example.bookMyShow.models.User;

public class CreateUserResponseDto {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
