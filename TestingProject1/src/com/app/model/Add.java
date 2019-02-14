package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="addtable")
public class Add {

	@Id
	@GeneratedValue
	@Column(name="aid")
	int addId;
	@Column(name="clas")
    String cls;
	@Column(name="section")
    String sec;
	@Column(name="subject")
    String subject;
	public Add() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Add(int addId) {
		super();
		this.addId = addId;
	}
	public Add(int addId, String cls, String sec, String subject) {
		super();
		this.addId = addId;
		this.cls = cls;
		this.sec = sec;
		this.subject = subject;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Add [addId=" + addId + ", cls=" + cls + ", sec=" + sec
				+ ", subject=" + subject + "]";
	}
	
	
}
