package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeesDiscount {
	@Id
	@GeneratedValue
	int discountId;
	String discountName; 
	String discountCode ;
	int discountAmount; 
	String discountDescription;
	public FeesDiscount() {
		super();
	}
	public FeesDiscount(int discountId) {
		super();
		this.discountId = discountId;
	}
	public FeesDiscount(int discountId, String discountName,
			String discountCode, int discountAmount, String discountDescription) {
		super();
		this.discountId = discountId;
		this.discountName = discountName;
		this.discountCode = discountCode;
		this.discountAmount = discountAmount;
		this.discountDescription = discountDescription;
	}
	public int getDiscountId() {
		return discountId;
	}
	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}
	public String getDiscountName() {
		return discountName;
	}
	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public int getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
	public String getDiscountDescription() {
		return discountDescription;
	}
	public void setDiscountDescription(String discountDescription) {
		this.discountDescription = discountDescription;
	}
	@Override
	public String toString() {
		return "FeesDiscount [discountId=" + discountId + ", discountName="
				+ discountName + ", discountCode=" + discountCode
				+ ", discountAmount=" + discountAmount
				+ ", discountDescription=" + discountDescription + "]";
	}
	
	
}
