package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AssignFee 
{
	@Id
	@GeneratedValue
	int assignFeeId;
	String feeGroup;
	String feeType;
	int amount;
	String dueDate;
	String cls;
	String section;
	String availabileFor;
	public AssignFee() {
		super();
	}
	public AssignFee(int assignFeeId) {
		super();
		this.assignFeeId = assignFeeId;
	}
	public AssignFee(int assignFeeId, String feeGroup, String feeType,
			int amount, String dueDate, String cls, String section,
			String availabileFor) {
		super();
		this.assignFeeId = assignFeeId;
		this.feeGroup = feeGroup;
		this.feeType = feeType;
		this.amount = amount;
		this.dueDate = dueDate;
		this.cls = cls;
		this.section = section;
		this.availabileFor = availabileFor;
	}
	public int getAssignFeeId() {
		return assignFeeId;
	}
	public void setAssignFeeId(int assignFeeId) {
		this.assignFeeId = assignFeeId;
	}
	public String getFeeGroup() {
		return feeGroup;
	}
	public void setFeeGroup(String feeGroup) {
		this.feeGroup = feeGroup;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAvailabileFor() {
		return availabileFor;
	}
	public void setAvailabileFor(String availabileFor) {
		this.availabileFor = availabileFor;
	}
	@Override
	public String toString() {
		return "AssignFee [assignFeeId=" + assignFeeId + ", feeGroup="
				+ feeGroup + ", feeType=" + feeType + ", amount=" + amount
				+ ", dueDate=" + dueDate + ", cls=" + cls + ", section="
				+ section + ", availabileFor=" + availabileFor + "]";
	}
	
	
}
