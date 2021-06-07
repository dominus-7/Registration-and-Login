package com.javaguide.tabane.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguide.tabane.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public User findByEmail(String email);
}