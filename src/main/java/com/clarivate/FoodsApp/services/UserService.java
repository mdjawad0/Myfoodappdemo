package com.clarivate.FoodsApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarivate.FoodsApp.dao.UserDao;
import com.clarivate.FoodsApp.dto.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public User saveUser(User user) {
		return userDao.saveUser(user);
	}

	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	public void deleteUsers(int id) {
		userDao.deleteUsers(id);
	}
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}
	public User updateUser(User user) {
		return userDao.updateUser(user);
	}

}
