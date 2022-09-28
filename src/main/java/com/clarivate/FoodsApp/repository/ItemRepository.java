package com.clarivate.FoodsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodsApp.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
