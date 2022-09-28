package com.clarivate.FoodsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodsApp.dto.FoodProduct;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.services.FoodProductService;

@RestController
public class FoodProductController {
	@Autowired
	FoodProductService foodProductService;

	@PostMapping("/addFoodProducts")
	public FoodProduct saveFoodProduct(@RequestBody FoodProduct foodProduct) {
		return foodProductService.saveFoodProduct(foodProduct);
	}

	@GetMapping("/foodProducts")
	public List<FoodProduct> getAllFoodProducts() {
		return foodProductService.getAllFoodProducts();
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		foodProductService.deleteFoodProducts(id);
		return "Deleted id" + id;
	}

}
