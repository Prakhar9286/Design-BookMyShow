package com.example.bookMyShow.service;

import com.example.bookMyShow.models.User;
import com.example.bookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email) {
        User user = new User();
        user.setEmail(email);
        user.setName(name);

        userRepository.save(user);

        return null;
    }

}
