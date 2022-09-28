package com.clarivate.FoodsApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.Item;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.repository.ItemRepository;

@Repository
public class ItemDao {

	private static final Optional<Item> Item = null;

	@Autowired
	ItemRepository itemRepository;

	public Item saveItem(Item item) {
		return itemRepository.save(item);

	}

	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

	public Item updateItem(Item item) {
		return itemRepository.save(item);
	}

	public void deleteItems(int id) {
		itemRepository.deleteById(id);
	}

	public Item getItemById(int id) {
		Optional<Item> item = itemRepository.findById(id);
		return item.get();
	}

}
