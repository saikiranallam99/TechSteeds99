package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Expenses {
	@Id
	@GeneratedValue
	int expenseId;
	String expensesHead;
	String expensesName;
	Date date;
	int amount;
	String expensesDocumentName;
	@Lob
	byte[] expensesDocument;

	String description;

	public Expenses() {
		super();
	}

	public Expenses(int expenseId) {
		super();
		this.expenseId = expenseId;
	}

	public Expenses(int expenseId, String expensesHead, String expensesName,
			Date date, int amount, String expensesDocumentName,
			byte[] expensesDocument, String description) {
		super();
		this.expenseId = expenseId;
		this.expensesHead = expensesHead;
		this.expensesName = expensesName;
		this.date = date;
		this.amount = amount;
		this.expensesDocumentName = expensesDocumentName;
		this.expensesDocument = expensesDocument;
		this.description = description;
	}

	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getExpensesHead() {
		return expensesHead;
	}

	public void setExpensesHead(String expensesHead) {
		this.expensesHead = expensesHead;
	}

	public String getExpensesName() {
		return expensesName;
	}

	public void setExpensesName(String expensesName) {
		this.expensesName = expensesName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getExpensesDocumentName() {
		return expensesDocumentName;
	}

	public void setExpensesDocumentName(String expensesDocumentName) {
		this.expensesDocumentName = expensesDocumentName;
	}

	public byte[] getExpensesDocument() {
		return expensesDocument;
	}

	public void setExpensesDocument(byte[] expensesDocument) {
		this.expensesDocument = expensesDocument;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Expenses [expenseId=" + expenseId + ", expensesHead="
				+ expensesHead + ", expensesName=" + expensesName + ", date="
				+ date + ", amount=" + amount + ", expensesDocumentName="
				+ expensesDocumentName + ", expensesDocument="
				+ Arrays.toString(expensesDocument) + ", description="
				+ description + "]";
	}
	
}
