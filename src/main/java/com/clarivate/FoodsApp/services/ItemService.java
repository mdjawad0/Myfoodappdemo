package com.clarivate.FoodsApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarivate.FoodsApp.dao.ItemDao;
import com.clarivate.FoodsApp.dto.Item;

@Service
public class ItemService {
	@Autowired
	ItemDao itemDao;

	public Item saveItem(Item item) {
		return itemDao.saveItem(item);
	}

	public List<Item> getAllItems() {
		return itemDao.getAllItems();
	}

	public void deleteItems(int id) {
		itemDao.deleteItems(id);
	}

}
