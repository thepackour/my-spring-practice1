package com.tpopractice.myspringpractice.repository;

import com.tpopractice.myspringpractice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByUid(String uid);
    List<User> findAll();
}
