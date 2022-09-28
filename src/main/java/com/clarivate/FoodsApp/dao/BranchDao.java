package com.clarivate.FoodsApp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.clarivate.FoodsApp.dto.Branch;
import com.clarivate.FoodsApp.dto.Item;
import com.clarivate.FoodsApp.dto.User;
import com.clarivate.FoodsApp.repository.BranchRepository;

@Repository
public class BranchDao {
	private static final Optional<Branch> Branch = null;
	@Autowired
	BranchRepository branchRepository;

	public Branch saveBranch(Branch branch) {
		return branchRepository.save(branch);

	}

	public List<Branch> getAllBranchs() {
		return branchRepository.findAll();
	}

	public Branch updateBranch(Branch branch) {
		return branchRepository.save(branch);
	}

	public void deleteBranchs(int id) {
		branchRepository.deleteById(id);
	}

	public Branch getBranchById(int id) {
		Optional<Branch> branch = branchRepository.findById(id);
		return branch.get();
	}

}
