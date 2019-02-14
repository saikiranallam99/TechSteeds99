package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExpensesHead 
{
	@Id
	@GeneratedValue
	int expensesHeadId;
	String expenseHeadName; 
	String description;
	public ExpensesHead() {
		super();
	}
	public ExpensesHead(int expensesHeadId) {
		super();
		this.expensesHeadId = expensesHeadId;
	}
	public ExpensesHead(int expensesHeadId, String expenseHeadName,
			String description) {
		super();
		this.expensesHeadId = expensesHeadId;
		this.expenseHeadName = expenseHeadName;
		this.description = description;
	}
	public int getExpensesHeadId() {
		return expensesHeadId;
	}
	public void setExpensesHeadId(int expensesHeadId) {
		this.expensesHeadId = expensesHeadId;
	}
	public String getExpenseHeadName() {
		return expenseHeadName;
	}
	public void setExpenseHeadName(String expenseHeadName) {
		this.expenseHeadName = expenseHeadName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ExpensesHead [expensesHeadId=" + expensesHeadId
				+ ", expenseHeadName=" + expenseHeadName + ", description="
				+ description + "]";
	}
	
}
