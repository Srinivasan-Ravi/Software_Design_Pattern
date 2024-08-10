package com.max.quizspring.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.max.quizspring.model.Users;

public interface UserRepo extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
}