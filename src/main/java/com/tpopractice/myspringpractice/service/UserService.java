package com.tpopractice.myspringpractice.service;

import com.tpopractice.myspringpractice.repository.UserRepository;
import org.springframework.stereotype.Service;

public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) { this.userRepository = userRepository; }


}
