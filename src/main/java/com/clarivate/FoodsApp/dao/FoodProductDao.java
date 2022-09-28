package com.clarivate.FoodsApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.FoodProduct;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.repository.FoodProductRepository;

@Repository
public class FoodProductDao {
	private static final Optional<FoodProduct> FoodProduct = null;
	@Autowired
	FoodProductRepository foodProductRepository;

	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		return foodProductRepository.save(foodProduct);

	}

	public List<FoodProduct> getAllFoodProducts() {
		return foodProductRepository.findAll();
	}

	public FoodProduct updateFoodProduct(FoodProduct foodProduct) {
		return foodProductRepository.save(foodProduct);
	}

	public void deleteFoodProducts(int id) {
		foodProductRepository.deleteById(id);
	}

	public FoodProduct getfoodProductById(int id) {
		Optional<FoodProduct> foodProduct = foodProductRepository.findById(id);
		return foodProduct.get();
	}
}
