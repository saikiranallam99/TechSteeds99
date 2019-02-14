package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class UserLog 
{
	@Id
	@GeneratedValue
	int userLogId;
	 String users;	
	 String role;	
	 String ipAddress;	
	 String loginTime;	
	 String userAgent;
	public UserLog() {
		super();
	}
	public UserLog(int userLogId) {
		super();
		this.userLogId = userLogId;
	}
	public UserLog(int userLogId, String users, String role, String ipAddress,
			String loginTime, String userAgent) {
		super();
		this.userLogId = userLogId;
		this.users = users;
		this.role = role;
		this.ipAddress = ipAddress;
		this.loginTime = loginTime;
		this.userAgent = userAgent;
	}
	public int getUserLogId() {
		return userLogId;
	}
	public void setUserLogId(int userLogId) {
		this.userLogId = userLogId;
	}
	public String getUsers() {
		return users;
	}
	public void setUsers(String users) {
		this.users = users;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	@Override
	public String toString() {
		return "UserLog [userLogId=" + userLogId + ", users=" + users
				+ ", role=" + role + ", ipAddress=" + ipAddress
				+ ", loginTime=" + loginTime + ", userAgent=" + userAgent + "]";
	}
	
	
}
