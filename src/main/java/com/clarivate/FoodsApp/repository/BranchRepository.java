package com.clarivate.FoodsApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clarivate.FoodsApp.dto.Branch;

public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
