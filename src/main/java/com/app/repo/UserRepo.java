package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	void save(Optional<User> u);
	
	//@Cacheable
	public User findByUserEmail(String email);

}
