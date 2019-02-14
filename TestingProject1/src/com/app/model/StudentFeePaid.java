package com.app.model;

public class StudentFeePaid 
{
	String studentName;	
	int admissionNumber;
	String rollNumber;	
	String fatherName;	
	long totalFees;	
	long discount;	
	long paidFees;	
	long balance;
	public StudentFeePaid() {
		super();
	}
	public StudentFeePaid(String studentName, int admissionNumber,
			String rollNumber, String fatherName, long totalFees,
			long discount, long paidFees, long balance) {
		super();
		this.studentName = studentName;
		this.admissionNumber = admissionNumber;
		this.rollNumber = rollNumber;
		this.fatherName = fatherName;
		this.totalFees = totalFees;
		this.discount = discount;
		this.paidFees = paidFees;
		this.balance = balance;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(int admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(long totalFees) {
		this.totalFees = totalFees;
	}
	public long getDiscount() {
		return discount;
	}
	public void setDiscount(long discount) {
		this.discount = discount;
	}
	public long getPaidFees() {
		return paidFees;
	}
	public void setPaidFees(long paidFees) {
		this.paidFees = paidFees;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "StudentFeePaid [studentName=" + studentName
				+ ", admissionNumber=" + admissionNumber + ", rollNumber="
				+ rollNumber + ", fatherName=" + fatherName + ", totalFees="
				+ totalFees + ", discount=" + discount + ", paidFees="
				+ paidFees + ", balance=" + balance + "]";
	}
	
	
}
