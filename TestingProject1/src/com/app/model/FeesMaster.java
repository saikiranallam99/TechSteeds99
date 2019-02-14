package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeesMaster {
	@Id
	@GeneratedValue
	int feeMasterId;
	String feesGroupName; 
	String feesTypeName; 
	String dueDate;
	int amount;
	public FeesMaster() {
		super();
	}
	public FeesMaster(int feeMasterId) {
		super();
		this.feeMasterId = feeMasterId;
	}
	public FeesMaster(int feeMasterId, String feesGroupName,
			String feesTypeName, String dueDate, int amount) {
		super();
		this.feeMasterId = feeMasterId;
		this.feesGroupName = feesGroupName;
		this.feesTypeName = feesTypeName;
		this.dueDate = dueDate;
		this.amount = amount;
	}
	public int getFeeMasterId() {
		return feeMasterId;
	}
	public void setFeeMasterId(int feeMasterId) {
		this.feeMasterId = feeMasterId;
	}
	public String getFeesGroupName() {
		return feesGroupName;
	}
	public void setFeesGroupName(String feesGroupName) {
		this.feesGroupName = feesGroupName;
	}
	public String getFeesTypeName() {
		return feesTypeName;
	}
	public void setFeesTypeName(String feesTypeName) {
		this.feesTypeName = feesTypeName;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "FeesMaster [feeMasterId=" + feeMasterId + ", feesGroupName="
				+ feesGroupName + ", feesTypeName=" + feesTypeName
				+ ", dueDate=" + dueDate + ", amount=" + amount + "]";
	}
	
}
