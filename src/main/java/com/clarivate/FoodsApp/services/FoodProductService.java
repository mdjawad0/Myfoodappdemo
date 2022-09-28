package com.clarivate.FoodsApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarivate.FoodsApp.dao.FoodProductDao;
import com.clarivate.FoodsApp.dto.FoodProduct;
import com.clarivate.FoodsApp.dto.User;

@Service
public class FoodProductService {
	@Autowired
	FoodProductDao foodProductDao;

	public FoodProduct saveFoodProduct(FoodProduct foodProduct) {
		return foodProductDao.saveFoodProduct(foodProduct);
	}

	public List<FoodProduct> getAllFoodProducts() {
		return foodProductDao.getAllFoodProducts();
	}

	public void deleteFoodProducts(int id) {
		foodProductDao.deleteFoodProducts(id);
	}

}
