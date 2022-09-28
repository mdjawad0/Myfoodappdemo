package com.clarivate.FoodsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodsApp.dto.FoodOrder;
import com.clarivate.FoodsApp.services.FoodOrderService;

@RestController
public class FoodOrderController {
	@Autowired
	FoodOrderService foodOrderService;

	@PostMapping("/addfoodorders")
	public FoodOrder saveUser(@RequestBody FoodOrder foodOrder) {
		return foodOrderService.saveFoodOrder(foodOrder);
	}

	@GetMapping("/foodorders")
	public List<FoodOrder> getAllFoodOrders() {
		return foodOrderService.getAllFoodOrders();
	}

	@DeleteMapping("/deleteFoodOrder/{id}")
	public String deleteFoodOrder(@PathVariable("id") int id) {
		foodOrderService.deleteFoodOrders(id);
		return "Deleted id" + id;
	}

}
