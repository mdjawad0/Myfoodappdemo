package com.clarivate.FoodsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodsApp.dto.FoodProduct;

public interface FoodProductRepository extends JpaRepository<FoodProduct, Integer> {

}
