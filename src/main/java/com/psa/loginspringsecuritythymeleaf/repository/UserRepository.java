package com.psa.loginspringsecuritythymeleaf.repository;

import com.psa.loginspringsecuritythymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pyaesoneaung at 10/05/2021
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
