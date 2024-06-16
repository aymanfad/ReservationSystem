package com.exemple.reservationsystem.repositories;

import com.exemple.reservationsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
