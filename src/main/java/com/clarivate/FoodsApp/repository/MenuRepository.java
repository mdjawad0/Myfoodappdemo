package com.clarivate.FoodsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodsApp.dto.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
