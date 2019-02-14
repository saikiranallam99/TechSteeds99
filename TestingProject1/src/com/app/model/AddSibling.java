package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="siblingtable")

public class AddSibling {
	@Id
	@GeneratedValue
	@Column(name="sbid")
	int siblingId;
	@Column(name="class")
    String cls;
	@Column(name="section")
	String sec;
	@Column(name="student")
	String stu;
	public AddSibling() {
		super();
	}
	
	public AddSibling(int siblingId) {
		super();
		this.siblingId = siblingId;
	}

	public AddSibling(int siblingId, String cls, String sec, String stu) {
		super();
		this.siblingId = siblingId;
		this.cls = cls;
		this.sec = sec;
		this.stu = stu;
	}
	public int getSiblingId() {
		return siblingId;
	}
	public void setSiblingId(int siblingId) {
		this.siblingId = siblingId;
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
	public String getStu() {
		return stu;
	}
	public void setStu(String stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "AddSibling [siblingId=" + siblingId + ", cls=" + cls + ", sec="
				+ sec + ", stu=" + stu + "]";
	}
	
	

}
