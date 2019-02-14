package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.app.dao.IIncomeDao;
import com.app.model.Income;
import com.app.model.IncomeHead;
import com.app.model.SearchByDate;
import com.app.service.IIncomeService;
@Service
public class IncomeServiceImpl implements IIncomeService {
	@Autowired
    private IIncomeDao dao;
	public int addIncomeHead(IncomeHead incomeHead) {
		
		return dao.addIncomeHead(incomeHead);
	}

	public IncomeHead getIncomeHeadById(int incomeHeadId) {
		
		return dao.getIncomeHeadById(incomeHeadId);
	}

	public List<IncomeHead> getAllIncomeHeads() {
		
		return dao.getAllIncomeHeads();
	}

	public void updateIncomeHead(IncomeHead incomeHead) {
		
		dao.updateIncomeHead(incomeHead);
	}

	public void deleteIncomeHead(int incomeHeadId) {
		dao.deleteIncomeHead(incomeHeadId);
		
	}

	public int addIncome(Income income) {
		
		return dao.addIncome(income);
	}

	public Income getIncomeById(int incomeId) {
		
		return dao.getIncomeById(incomeId);
	}

	public List<Income> getAllIncome() {
		
		return dao.getAllIncome();
	}

	public void updateIncome(Income income) {
		dao.updateIncome(income);
		
	}

	public void deleteIncome(int incomeId) {
		dao.deleteIncome(incomeId);
		
	}

	public List<Income> findAllByIncomeDatesBetweenDates(
			SearchByDate searchByDate) {
	
		return dao.findAllByIncomeDatesBetweenDates(searchByDate);
	}

}
