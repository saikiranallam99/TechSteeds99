package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IExpensesDao;
import com.app.model.Expenses;
import com.app.model.ExpensesHead;
import com.app.model.SearchByDate;
import com.app.service.IExpensesService;
@Service
public class ExpensesServiceImpl implements IExpensesService  
{

	@Autowired
	private IExpensesDao dao;
	public int addExpensesHead(ExpensesHead expensesHead) {
		
		return dao.addExpensesHead(expensesHead);
	}

	public ExpensesHead getExpensesHeadById(int expensesHeadId) {
		
		return dao.getExpensesHeadById(expensesHeadId);
	}

	public List<ExpensesHead> getAllExpensesHeads() {
		
		return dao.getAllExpensesHeads();
	}

	public void updateExpensesHead(ExpensesHead expensesHead) {
		dao.updateExpensesHead(expensesHead);
		
	}

	public void deleteExpensesHead(int expensesHeadId) {
		dao.deleteExpensesHead(expensesHeadId);
		
	}

	public int addExpenses(Expenses expenses) {
	
		return dao.addExpenses(expenses);
	}

	public Expenses getExpensesById(int expensesId) {
	
		return dao.getExpensesById(expensesId);
	}

	public List<Expenses> getAllExpenses() {
	
		return dao.getAllExpenses();
	}

	public void updateExpenses(Expenses expenses) {
		dao.updateExpenses(expenses);
		
	}

	public void deleteExpenses(int expensesId) {
		dao.deleteExpenses(expensesId);
		
	}

	public List<Expenses> findAllByExpensesDatesBetween(
			SearchByDate searchByDate) {
		
		return dao.findAllByExpensesDatesBetween(searchByDate);
	}

}
