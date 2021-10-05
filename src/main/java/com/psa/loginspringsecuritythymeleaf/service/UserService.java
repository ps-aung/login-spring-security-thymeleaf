package com.psa.loginspringsecuritythymeleaf.service;

import com.psa.loginspringsecuritythymeleaf.model.User;
import com.psa.loginspringsecuritythymeleaf.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by pyaesoneaung at 10/05/2021
 */
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
