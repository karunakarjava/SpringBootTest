package com.app;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.app.iservice.IUserService;
import com.app.model.Role;
import com.app.model.User;



@SpringBootApplication
@EnableCaching
public class SpringBootTestApplication {
	/*@Autowired
	private IUserService service;

	@PostConstruct
	public void initUsers() {
		User u=new User();
		Set<Role> r=new HashSet<Role>();
		Role rr=new Role();
		rr.setRoleName("USER");
		r.add(rr);
		u.setRoles(r);
		u.setUserEmail("karun@gmail.com");
		u.setUserPwd("karun");
		u.setUserName("karun");
		service.saveUser(u);
	}*/
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

}
//https://books.google.co.in/books?id=dIvgDwAAQBAJ&lpg=PA391&ots=otOqVP19x1&dq=SharedSessionContractImplementor%20will%20close%20connection%20automatically%3F&pg=PA20#v=onepage&q&f=false