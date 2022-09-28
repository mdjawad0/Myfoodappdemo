package com.clarivate.FoodsApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clarivate.FoodsApp.dao.BranchDao;
import com.clarivate.FoodsApp.dao.ItemDao;
import com.clarivate.FoodsApp.dto.Branch;
import com.clarivate.FoodsApp.dto.User;

@Service
public class BranchService {
	@Autowired
	BranchDao branchDao;
	

	public Branch saveBranch(Branch branch) {
		return branchDao.saveBranch(branch);
	}
	public List<Branch> getAllBranchs() {
		return branchDao.getAllBranchs();
	}

	public void deleteBranchs(int id) {
		branchDao.deleteBranchs(id);
	}

}
