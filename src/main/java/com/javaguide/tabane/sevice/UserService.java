package com.javaguide.tabane.sevice;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.javaguide.tabane.model.User;
import com.javaguide.tabane.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
