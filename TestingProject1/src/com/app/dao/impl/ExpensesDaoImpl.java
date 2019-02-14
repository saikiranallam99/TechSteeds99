package com.app.dao.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IExpensesDao;
import com.app.model.Expenses;
import com.app.model.ExpensesHead;
import com.app.model.SearchByDate;
@Repository

public class ExpensesDaoImpl implements IExpensesDao {

	@Autowired
	private HibernateTemplate ht;
	public int addExpensesHead(ExpensesHead expensesHead) {
		int expensesHeadId=(Integer) ht.save(expensesHead);
		return expensesHeadId;
	}

	public ExpensesHead getExpensesHeadById(int expensesHeadId) {
		ExpensesHead expensesHead=ht.get(ExpensesHead.class, expensesHeadId);
		return expensesHead;
	}

	public List<ExpensesHead> getAllExpensesHeads() {
		return ht.loadAll(ExpensesHead.class);
	}

	public void updateExpensesHead(ExpensesHead expensesHead) {
		ht.update(expensesHead);

	}

	public void deleteExpensesHead(int expensesHeadId) {
		ht.delete(new ExpensesHead(expensesHeadId));

	}

	public int addExpenses(Expenses expenses) {

		int expenseId=(Integer) ht.save(expenses);
		return expenseId;
	}

	public Expenses getExpensesById(int expensesId) {
		Expenses expenses=ht.get(Expenses.class, expensesId);
		return expenses;
	}

	public List<Expenses> getAllExpenses() {
		return ht.loadAll(Expenses.class);
	}

	public void updateExpenses(Expenses expenses) {
		ht.update(expenses);

	}

	public void deleteExpenses(int expensesId) {
		ht.delete(new Expenses(expensesId));

	}


	@Transactional
	public List<Expenses> findAllByExpensesDatesBetween(
			SearchByDate searchByDate) {

		java.util.Date uDate = searchByDate.getDateFrom();
        java.sql.Date sDate = new java.sql.Date(uDate.getTime()); 
		java.util.Date uDate1 = searchByDate.getDateTo();
		java.sql.Date sDate1 = new java.sql.Date(uDate1.getTime());
		String hql="from Expenses e where e.date between  '"+sDate+"'  and '"+sDate1+"' ";
     	@SuppressWarnings("unchecked")
		List<Expenses> expenses1=ht.find(hql);
		return expenses1;
	}



}
