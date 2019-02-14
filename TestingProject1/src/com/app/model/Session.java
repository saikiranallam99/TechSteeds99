package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Session {
	@Id
	@GeneratedValue
	int sessionId;
	String sessionTimePediod;
	public Session() {
		super();
	}
	public Session(int sessionId) {
		super();
		this.sessionId = sessionId;
	}
	public Session(int sessionId, String sessionTimePediod) {
		super();
		this.sessionId = sessionId;
		this.sessionTimePediod = sessionTimePediod;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getSessionTimePediod() {
		return sessionTimePediod;
	}
	public void setSessionTimePediod(String sessionTimePediod) {
		this.sessionTimePediod = sessionTimePediod;
	}
	@Override
	public String toString() {
		return "Session [sessionId=" + sessionId + ", sessionTimePediod="
				+ sessionTimePediod + "]";
	}
	
	
}
