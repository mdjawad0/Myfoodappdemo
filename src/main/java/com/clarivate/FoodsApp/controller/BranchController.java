package com.clarivate.FoodsApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clarivate.FoodsApp.dto.Branch;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.services.BranchService;
import com.clarivate.FoodsApp.services.UserService;

@RestController
public class BranchController {
	@Autowired
	BranchService branchService;

	@PostMapping("/addbranchs")
	public Branch saveBranch(@RequestBody Branch branch) {
		return branchService.saveBranch(branch);
	}

	@GetMapping("/branchs")
	public List<Branch> getAllBranchs() {
		return branchService.getAllBranchs();
	}

	@DeleteMapping("/deleteBranch/{id}")
	public String deleteBranch(@PathVariable("id") int id) {
		branchService.deleteBranchs(id);
		return "Deleted id" + id;
	}

}
