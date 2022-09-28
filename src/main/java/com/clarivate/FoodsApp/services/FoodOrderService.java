package com.clarivate.FoodsApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarivate.FoodsApp.dao.FoodOrderDao;
import com.clarivate.FoodsApp.dto.FoodOrder;

@Service
public class FoodOrderService {
	@Autowired
	FoodOrderDao foodOrderDao;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		return foodOrderDao.saveFoodOrder(foodOrder);
	}

	public List<FoodOrder> getAllFoodOrders() {
		return foodOrderDao.getAllFoodOrders();
	}

	public void deleteFoodOrders(int id) {
		foodOrderDao.deleteFoodOrders(id);
	}

}
