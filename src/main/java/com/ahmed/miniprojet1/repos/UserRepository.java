package com.ahmed.miniprojet1.repos;

import com.ahmed.miniprojet1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername (String username);
}