package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.iservice.IUserService;



@RestController
@RequestMapping("/app")
public class UserController {
	@Autowired
    private IUserService service;
	
	/*@Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtTokenUtil;
    
    
    
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
    }*/
	
	@RequestMapping("/sendemail")
	public String sendMail() {
		return service.sendMail();
	}
	
	@RequestMapping("/uploadingfile")
	public String uploadFile( @RequestParam(value = "file") MultipartFile file) {
		if(file!=null && !file.isEmpty()) {
			return service.uploadFile(file);
		}else {
			return "Somthing Wrong";
		}
		
	}

}
