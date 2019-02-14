package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IncomeHead {
	@Id
	@GeneratedValue
	int incomeHeadId;
	String incomeHeadName; 
	String description;
	public IncomeHead() {
		super();
	}
	public IncomeHead(int incomeHeadId) {
		super();
		this.incomeHeadId = incomeHeadId;
	}
	public IncomeHead(int incomeHeadId, String incomeHeadName,
			String description) {
		super();
		this.incomeHeadId = incomeHeadId;
		this.incomeHeadName = incomeHeadName;
		this.description = description;
	}
	public int getIncomeHeadId() {
		return incomeHeadId;
	}
	public void setIncomeHeadId(int incomeHeadId) {
		this.incomeHeadId = incomeHeadId;
	}
	public String getIncomeHeadName() {
		return incomeHeadName;
	}
	public void setIncomeHeadName(String incomeHeadName) {
		this.incomeHeadName = incomeHeadName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "IncomeHead [incomeHeadId=" + incomeHeadId + ", incomeHeadName="
				+ incomeHeadName + ", description=" + description + "]";
	}
	
	
}
