package com.app.service;

import java.util.List;

import com.app.model.Expenses;
import com.app.model.ExpensesHead;
import com.app.model.SearchByDate;

public interface IExpensesService {
	public int  addExpensesHead(ExpensesHead expensesHead);
	public ExpensesHead  getExpensesHeadById(int expensesHeadId);
	public List<ExpensesHead> getAllExpensesHeads();
	public void updateExpensesHead(ExpensesHead expensesHead);
	public void deleteExpensesHead(int expensesHeadId);
	
	public int  addExpenses(Expenses expenses);
	public Expenses  getExpensesById(int expensesId);
	public List<Expenses> getAllExpenses();
	public void updateExpenses(Expenses expenses);
	public void deleteExpenses(int expensesId);
	
	List<Expenses> findAllByExpensesDatesBetween(SearchByDate searchByDate);
}
