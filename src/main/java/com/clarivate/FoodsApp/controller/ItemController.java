package com.clarivate.FoodsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodsApp.dto.Item;
import com.clarivate.FoodsApp.services.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;

	@GetMapping("/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@PostMapping("/addItem")
	public Item saveItem(@RequestBody Item item) {
		return itemService.saveItem(item);
	}
	
	@DeleteMapping("/deleteItem/{id}")
	public String deleteBranch(@PathVariable("id") int id) {
		itemService.deleteItems(id);
		return "Deleted id" + id;
	}

}
