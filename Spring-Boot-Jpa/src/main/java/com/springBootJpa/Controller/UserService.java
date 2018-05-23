package com.springBootJpa.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

	@Autowired
	UserRepository userRepository;  
	
	public void addUser(UserData userData) {
		
		userRepository.save(userData);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}

	public Optional<UserData> getUser(String id) {
		return userRepository.findById(id);
	}

	public List<UserData> getAllUser() {
		List<UserData> userData= new ArrayList<>();
		userRepository.findAll().forEach(userData :: add);
		return userData;
	}
}
