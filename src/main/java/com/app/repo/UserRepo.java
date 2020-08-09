package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.User;

public interface UserRepo extends JpaRepository<User, String> {

	void save(Optional<User> u);
	public User findByUserEmail(String email);

}
