package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Accountant {
	
	@Id
	@GeneratedValue
	int accountantId;
	String accountantName ;
	String accountantEmail;
	String accountantGender  ;  
	String accountantDateOfBirth ;
	String accountantAddress ;
	String accountantPhone;
    String accountantPhotoName;
	@Lob
	byte[] accountantPhoto;
	public Accountant() {
		super();
	}
	public Accountant(int accountantId) {
		super();
		this.accountantId = accountantId;
	}
	public Accountant(int accountantId, String accountantName,
			String accountantEmail, String accountantGender,
			String accountantDateOfBirth, String accountantAddress,
			String accountantPhone, String accountantPhotoName,
			byte[] accountantPhoto) {
		super();
		this.accountantId = accountantId;
		this.accountantName = accountantName;
		this.accountantEmail = accountantEmail;
		this.accountantGender = accountantGender;
		this.accountantDateOfBirth = accountantDateOfBirth;
		this.accountantAddress = accountantAddress;
		this.accountantPhone = accountantPhone;
		this.accountantPhotoName = accountantPhotoName;
		this.accountantPhoto = accountantPhoto;
	}
	public int getAccountantId() {
		return accountantId;
	}
	public void setAccountantId(int accountantId) {
		this.accountantId = accountantId;
	}
	public String getAccountantName() {
		return accountantName;
	}
	public void setAccountantName(String accountantName) {
		this.accountantName = accountantName;
	}
	public String getAccountantEmail() {
		return accountantEmail;
	}
	public void setAccountantEmail(String accountantEmail) {
		this.accountantEmail = accountantEmail;
	}
	public String getAccountantGender() {
		return accountantGender;
	}
	public void setAccountantGender(String accountantGender) {
		this.accountantGender = accountantGender;
	}
	public String getAccountantDateOfBirth() {
		return accountantDateOfBirth;
	}
	public void setAccountantDateOfBirth(String accountantDateOfBirth) {
		this.accountantDateOfBirth = accountantDateOfBirth;
	}
	public String getAccountantAddress() {
		return accountantAddress;
	}
	public void setAccountantAddress(String accountantAddress) {
		this.accountantAddress = accountantAddress;
	}
	public String getAccountantPhone() {
		return accountantPhone;
	}
	public void setAccountantPhone(String accountantPhone) {
		this.accountantPhone = accountantPhone;
	}
	public String getAccountantPhotoName() {
		return accountantPhotoName;
	}
	public void setAccountantPhotoName(String accountantPhotoName) {
		this.accountantPhotoName = accountantPhotoName;
	}
	public byte[] getAccountantPhoto() {
		return accountantPhoto;
	}
	public void setAccountantPhoto(byte[] accountantPhoto) {
		this.accountantPhoto = accountantPhoto;
	}
	@Override
	public String toString() {
		return "Accountant [accountantId=" + accountantId + ", accountantName="
				+ accountantName + ", accountantEmail=" + accountantEmail
				+ ", accountantGender=" + accountantGender
				+ ", accountantDateOfBirth=" + accountantDateOfBirth
				+ ", accountantAddress=" + accountantAddress
				+ ", accountantPhone=" + accountantPhone
				+ ", accountantPhotoName=" + accountantPhotoName
				+ ", accountantPhoto=" + Arrays.toString(accountantPhoto) + "]";
	}
	
	

}
