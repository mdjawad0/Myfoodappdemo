package com.clarivate.FoodsApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.repository.UserRepository;

@Repository
public class UserDao {

	private static final Optional<User> User = null;
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUsers(int id) {
		userRepository.deleteById(id);
	}

	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

}
