package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjecttable")
public class Subjects {

	@Id
	@GeneratedValue
	@Column(name="subjectid")
	int subjectId;
	@Column (name="subjectname")
	String subjectname;
	@Column (name="subject")
	String subject;
	@Column (name="subjectcode")
	String subjectcode;
	public Subjects() {
		super();
	}
	public Subjects(int subjectId) {
		super();
		this.subjectId = subjectId;
	}
	public Subjects(int subjectId, String subjectname, String subject,
			String subjectcode) {
		super();
		this.subjectId = subjectId;
		this.subjectname = subjectname;
		this.subject = subject;
		this.subjectcode = subjectcode;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubjectcode() {
		return subjectcode;
	}
	public void setSubjectcode(String subjectcode) {
		this.subjectcode = subjectcode;
	}
	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", subjectname="
				+ subjectname + ", subject=" + subject + ", subjectcode="
				+ subjectcode + "]";
	}
	
	
	
	
}
