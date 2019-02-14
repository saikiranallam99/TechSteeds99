package com.app.dao;

import java.util.List;
import com.app.model.Income;
import com.app.model.IncomeHead;
import com.app.model.SearchByDate;



public interface IIncomeDao {
	
	public int  addIncomeHead(IncomeHead incomeHead);
	public IncomeHead  getIncomeHeadById(int incomeHeadId);
	public List<IncomeHead> getAllIncomeHeads();
	public void updateIncomeHead(IncomeHead incomeHead);
	public void deleteIncomeHead(int incomeHeadId);
	
	public int  addIncome(Income income);
	public Income  getIncomeById(int incomeId);
	public List<Income> getAllIncome();
	public void updateIncome(Income income);
	public void deleteIncome(int incomeId);
	
	
	
	
	List<Income> findAllByIncomeDatesBetweenDates(SearchByDate searchByDate);
}
