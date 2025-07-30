package com.tpopractice.myspringpractice.service;

import com.tpopractice.myspringpractice.domain.User;
import com.tpopractice.myspringpractice.repository.JpaUserRepository;
import com.tpopractice.myspringpractice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final JpaUserRepository jpaUserRepository;
    private UserRepository userRepository;
    public UserService(UserRepository userRepository, JpaUserRepository jpaUserRepository) { this.userRepository = userRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    public User createUser(User user) {
        return jpaUserRepository.save(user);
    }

    public Optional<User> findByUid(String uid) {
        return jpaUserRepository.findByUid(uid);
    }

    public List<User> findAll() {
        return jpaUserRepository.findAll();
    }
}
