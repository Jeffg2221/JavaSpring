package com.jeffgomez.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.jeffgomez.bookclub.models.LoginUser;
import com.jeffgomez.bookclub.models.User;
import com.jeffgomez.bookclub.repositories.UserRepository;

@Service
public class UserService {
	
	
	private  static UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public User create(User registerringUser) {
		String hashed = BCrypt.hashpw(registerringUser.getPassword(), BCrypt.gensalt());
		registerringUser.setPassword(hashed);
		return userRepo.save(registerringUser);
	}
	
	public User getUser(Long id) {
		Optional<User> potentialUser = userRepo.findById(id);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User getUser(String email) {
		Optional<User> potentialUser = userRepo.findByEmail(email);
		return potentialUser.isPresent() ? potentialUser.get() : null;
	}
	
	public User login(LoginUser loginUser, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		User existingUser = getUser(loginUser.getEmail());
		if (existingUser == null) {
			result.rejectValue("Email", "Unique", "Unknown Email!");
			return null;
		}
		if(!BCrypt.checkpw(loginUser.getPassword(), existingUser.getPassword())) {
			result.rejectValue("password", "Matches", "Incorrect Password!");
			return null;
		}
		return existingUser;
	}
	
	
//    // retrive one
//	public User getOne(Long id) {
//		Optional<User> user = userRepo.findById(id);
//		
//		if (user.isPresent()) {
//			return user.get();
//		} else return null;
//	}
//
//    // create / register user
//	public User register(User newUser, BindingResult result) {
//		if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
//			result.rejectValue("email", "Unique", "This email is already in use");
//		}
//		if(!newUser.getPassword().equals(newUser.getConfirm())) {
//			result.rejectValue("confirm", "Matches", "Confirm password must match password");
//		}
//		if(result.hasErrors()) {
//			return null;
//		} else {
//			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
//			newUser.setPassword(hashed);
//			return userRepo.save(newUser);
//		}
//	}
//
//    // login user
//	public User login(LoginUser newLogin, BindingResult result) {
//		if(result.hasErrors()) {
//			return null;
//		}
//		Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
//		if(!potentialUser.isPresent()) {
//			result.rejectValue("email", "Unique", "Unknown email");
//			return null;
//		}
//		User user = potentialUser.get();
//		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
//			result.rejectValue("password", "Matches", "Invalid Password");
//		}
//		if(result.hasErrors()) {
//			return null;
//		} else {
//			return user;
//		}
//	}

	

}
