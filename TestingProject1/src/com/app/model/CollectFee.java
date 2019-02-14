package com.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CollectFee 
{
	@Id
	@GeneratedValue
	int paymentId;
	int admissionNumber;
	Date date;
	int amount;
	int discount;
	int fine;
	String mode;
	String note;
	public CollectFee() {
		super();
	}
	public CollectFee(int paymentId) {
		super();
		this.paymentId = paymentId;
	}
	public CollectFee(int paymentId, int admissionNumber, Date date,
			int amount, int discount, int fine, String mode, String note) {
		super();
		this.paymentId = paymentId;
		this.admissionNumber = admissionNumber;
		this.date = date;
		this.amount = amount;
		this.discount = discount;
		this.fine = fine;
		this.mode = mode;
		this.note = note;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
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
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getFine() {
		return fine;
	}
	public void setFine(int fine) {
		this.fine = fine;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "CollectFee [paymentId=" + paymentId + ", admissionNumber="
				+ admissionNumber + ", date=" + date + ", amount=" + amount
				+ ", discount=" + discount + ", fine=" + fine + ", mode="
				+ mode + ", note=" + note + "]";
	}
	
	
}
