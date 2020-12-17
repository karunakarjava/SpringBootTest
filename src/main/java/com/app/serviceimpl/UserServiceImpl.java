package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.iservice.IUserService;
import com.app.mailingservice.SendMail;
import com.app.model.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private SendMail sendMail;

	@Override
	public String saveUser(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUserEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sendMail() {
		sendMail.sendMailWithAttachment();
		return "";
	}

	/*@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Autowired
	private UserRepo repo;
	
	@Override
	public String saveUser(User u) {
		String pwd=u.getUserPwd();
	    u.setUserPwd(bcryptPasswordEncoder.encode(pwd));
		repo.save(u);
		return "User saved successfully";
	}

	@Override
	public User findByUserEmail(String email) {
		
		return repo.findByUserEmail(email);
	}

	@Override
	public List<User> findAll() {
		
		return repo.findAll();
	}

	@Override
	public User findById(String id) {
		Optional<User> user= repo.findById(id);
		return user.get();
	}*/

}	
