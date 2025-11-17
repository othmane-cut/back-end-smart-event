package com.smart.event.back_end.database.repositories;

import com.smart.event.back_end.database.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByfirstName(String username);
    Optional<User> findByLastName(String username);
}
