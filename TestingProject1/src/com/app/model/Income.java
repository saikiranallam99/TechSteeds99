package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Income {
	@Id
	@GeneratedValue
	int incomeId;
	String incomeHead;
	String incomeName;
	Date date;
	int amount;
	String incomeDocumentName;
	@Lob
	byte[] incomeDocument;

	String description;

	public Income() {
		super();
	}

	public Income(int incomeId) {
		super();
		this.incomeId = incomeId;
	}

	public Income(int incomeId, String incomeHead, String incomeName,
			Date date, int amount, String incomeDocumentName,
			byte[] incomeDocument, String description) {
		super();
		this.incomeId = incomeId;
		this.incomeHead = incomeHead;
		this.incomeName = incomeName;
		this.date = date;
		this.amount = amount;
		this.incomeDocumentName = incomeDocumentName;
		this.incomeDocument = incomeDocument;
		this.description = description;
	}

	public int getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}

	public String getIncomeHead() {
		return incomeHead;
	}

	public void setIncomeHead(String incomeHead) {
		this.incomeHead = incomeHead;
	}

	public String getIncomeName() {
		return incomeName;
	}

	public void setIncomeName(String incomeName) {
		this.incomeName = incomeName;
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

	public String getIncomeDocumentName() {
		return incomeDocumentName;
	}

	public void setIncomeDocumentName(String incomeDocumentName) {
		this.incomeDocumentName = incomeDocumentName;
	}

	public byte[] getIncomeDocument() {
		return incomeDocument;
	}

	public void setIncomeDocument(byte[] incomeDocument) {
		this.incomeDocument = incomeDocument;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Income [incomeId=" + incomeId + ", incomeHead=" + incomeHead
				+ ", incomeName=" + incomeName + ", date=" + date + ", amount="
				+ amount + ", incomeDocumentName=" + incomeDocumentName
				+ ", incomeDocument=" + Arrays.toString(incomeDocument)
				+ ", description=" + description + "]";
	}

}
