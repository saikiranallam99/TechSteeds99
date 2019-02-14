package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assigntable")
public class AssignSubjects {

	@Id
	@GeneratedValue
	@Column(name="aid")
	int assignId;
	@Column(name="clas")
    String cls;
	@Column(name="section")
    String sec;
	public AssignSubjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignSubjects(int assignId) {
		super();
		this.assignId = assignId;
	}
	public AssignSubjects(int assignId, String cls, String sec) {
		super();
		this.assignId = assignId;
		this.cls = cls;
		this.sec = sec;
	}
	public int getAssignId() {
		return assignId;
	}
	public void setAssignId(int assignId) {
		this.assignId = assignId;
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
	@Override
	public String toString() {
		return "AssignSubjects [assignId=" + assignId + ", cls=" + cls
				+ ", sec=" + sec + "]";
	}
	
	


}

