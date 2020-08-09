package com.app.iservice;

import java.util.List;

import com.app.model.User;

public interface IUserService {
	public String saveUser(User u);
	public User findByUserEmail(String email);
	public List<User> findAll();
	public User findById(String id);
}
