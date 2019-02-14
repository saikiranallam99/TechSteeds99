package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IIncomeDao;
import com.app.model.Income;
import com.app.model.IncomeHead;
import com.app.model.SearchByDate;
@Repository
public class IncomeDaoImpl implements IIncomeDao {
	@Autowired
	private HibernateTemplate ht;
	public int addIncomeHead(IncomeHead incomeHead) {
		int incomeHeadId=(Integer) ht.save(incomeHead);
		return incomeHeadId;
	}

	public IncomeHead getIncomeHeadById(int incomeHeadId) {
		IncomeHead incomeHead=ht.get(IncomeHead.class, incomeHeadId);
		return incomeHead;
	}

	public List<IncomeHead> getAllIncomeHeads() {
		return ht.loadAll(IncomeHead.class);
	}

	public void updateIncomeHead(IncomeHead incomeHead) {
		ht.update(incomeHead);
		
	}

	public void deleteIncomeHead(int incomeHeadId) {
		
		ht.delete(new IncomeHead(incomeHeadId));
	}

	public int addIncome(Income income) {
		int incomeId=(Integer) ht.save(income);
		return incomeId;
	}

	public Income getIncomeById(int incomeId) {
		Income income=ht.get(Income.class, incomeId);
		return income;
	}

	public List<Income> getAllIncome() {
		return ht.loadAll(Income.class);
	}

	public void updateIncome(Income income) {
		ht.update(income);
		
	}

	public void deleteIncome(int incomeId) {
	
		ht.delete(new Income(incomeId));
		
	}

	public List<Income> findAllByIncomeDatesBetweenDates(
			SearchByDate searchByDate) {
		java.util.Date uDate = searchByDate.getDateFrom();
        java.sql.Date sDate = new java.sql.Date(uDate.getTime()); 
		java.util.Date uDate1 = searchByDate.getDateTo();
		java.sql.Date sDate1 = new java.sql.Date(uDate1.getTime());
		String hql="from Income i where i.date between  '"+sDate+"'  and '"+sDate1+"' ";
     	@SuppressWarnings("unchecked")
		List<Income> income1=ht.find(hql);
		return income1;
	}

	
}
