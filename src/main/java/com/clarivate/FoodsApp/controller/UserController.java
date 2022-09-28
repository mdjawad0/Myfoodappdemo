package com.clarivate.FoodsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodsApp.dto.FoodProduct;
import com.clarivate.FoodsApp.dto.Item;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.dao.UserDao;
import com.clarivate.FoodsApp.services.FoodProductService;
import com.clarivate.FoodsApp.services.ItemService;
import com.clarivate.FoodsApp.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/addusers")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		userService.deleteUsers(id);
		return "Deleted id" + id;
	}
	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		User u1 = userService.getUserById(user.getId());
		if (u1 == null) {
			System.out.println("no user found");
		}
			return userService.updateUser(user);
	}

}
