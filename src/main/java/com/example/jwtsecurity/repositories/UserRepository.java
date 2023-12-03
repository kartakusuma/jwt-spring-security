package com.example.jwtsecurity.repositories;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jwtsecurity.entities.Role;
import com.example.jwtsecurity.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);

    User findByRole(Role role);
}
