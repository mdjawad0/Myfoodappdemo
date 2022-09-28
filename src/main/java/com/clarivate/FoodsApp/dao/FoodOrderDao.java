package com.clarivate.FoodsApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.FoodOrder;
import com.clarivate.FoodsApp.dto.FoodProduct;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.repository.FoodOrderRepository;

@Repository
public class FoodOrderDao {

	private static final Optional<FoodOrder> FoodOrder = null;

	@Autowired
	FoodOrderRepository foodOrderRepository;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);

	}

	public List<FoodOrder> getAllFoodOrders() {
		return foodOrderRepository.findAll();
	}

	public FoodOrder updateFoodOrder(FoodOrder foodOrder) {
		return foodOrderRepository.save(foodOrder);
	}

	public void deleteFoodOrders(int id) {
		foodOrderRepository.deleteById(id);
	}

	public FoodOrder getFoodOrderById(int id) {
		Optional<FoodOrder> foodOrder = foodOrderRepository.findById(id);
		return foodOrder.get();
	}

}
