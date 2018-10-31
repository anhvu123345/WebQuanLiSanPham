package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {
	Iterable<User> finAll();
	Long countAll();
	User save(User user);
	void delete(Long id);
	
	Optional<User> findById(Long id);
	public User findByEmail(String email);
}
