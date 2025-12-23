package com.fitness.userserci.service;

import com.fitness.userserci.dto.RegisterRequest;
import com.fitness.userserci.dto.UserResponse;
import com.fitness.userserci.model.User;
import com.fitness.userserci.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserResponse register(@Valid RegisterRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirsName(request.getFirstName());
        user.setLastName(request.getLastName());

        User savedUser = repository.save(user);

        UserResponse userResponse = new UserResponse();
        userResponse
    }
}
