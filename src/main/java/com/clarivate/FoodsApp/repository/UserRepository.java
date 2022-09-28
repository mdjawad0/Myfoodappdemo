package com.clarivate.FoodsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodsApp.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
