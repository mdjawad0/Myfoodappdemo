package com.clarivate.FoodsApp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.Menu;
import com.clarivate.FoodsApp.repository.MenuRepository;

@Repository
public class MenuDao {
	@Autowired
	MenuRepository menuRepository;

	public Menu saveMenu(Menu menu) {
		return menuRepository.save(menu);

	}

}
