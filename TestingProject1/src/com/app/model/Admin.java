package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	String adminName;
	@Id
	String adminEmail;
	String adminPassword;
	public Admin() {
		super();
	}
	public Admin(String adminEmail) {
		super();
		this.adminEmail = adminEmail;
	}
	public Admin(String adminName, String adminEmail, String adminPassword) {
		super();
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminEmail=" + adminEmail
				+ ", adminPassword=" + adminPassword + "]";
	}
	

}
