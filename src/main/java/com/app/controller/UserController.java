package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.iservice.IUserService;
import com.app.model.User;
import com.app.securityconfig.*;



@RestController
@RequestMapping("/app")
public class UserController {
	
	@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;
    
    @Autowired
    private IUserService service;
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody User user,HttpSession session) throws AuthenticationException {
        final Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken( user.getUserName(), user.getUserPwd()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        final String token = jwtTokenUtil.generateToken(authentication);
        return ResponseEntity.ok(token);
    }
   

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user){
        return service.saveUser(user);
    }
    
    @PreAuthorize("hasAnyRole('ADMIN')")
    @RequestMapping("/admin")
    public String adminSource() {
    	return "admin source here";
    }
    @PreAuthorize("hasAnyRole('USER')")
    @RequestMapping("/user")
    public String userSource() {
    	return "user source here";
    }
    
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @RequestMapping("/common")
    public String commonSource() {
    	return "common source for both admin and user here";
    }

}
