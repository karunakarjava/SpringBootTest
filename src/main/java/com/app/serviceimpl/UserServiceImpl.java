package com.app.serviceimpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
		return "mail sended";
	}

	@Override
	public String uploadFile(MultipartFile file) {
		try {
			Path path = Paths.get("/home/karunakar/tony/"+LocalDate.now()+"_"+(new String(file.getOriginalFilename().toString().getBytes(), "UTF-8")));
			byte[] bytes=file.getBytes();
			Files.write(path, bytes);
			return "fileUploaded";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.getMessage().toString();
		}
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
