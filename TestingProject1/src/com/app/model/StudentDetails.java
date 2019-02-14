package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")
public class StudentDetails {
	@Id
	@GeneratedValue
	@Column(name="sdid")
	int studentdId;
	@Column(name="clas")
	String clas;
	@Column(name="sections")
	String sections;
	String sname;
	public StudentDetails(int studentdId, String clas, String sections,
			String sname) {
		super();
		this.studentdId = studentdId;
		this.clas = clas;
		this.sections = sections;
		this.sname = sname;
	}
	public StudentDetails() {
		super();		
	}
	public StudentDetails(int studentdId) {
		super();
		this.studentdId = studentdId;
	}
	public int getStudentdId() {
		return studentdId;
	}
	public void setStudentdId(int studentdId) {
		this.studentdId = studentdId;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentdId=" + studentdId + ", clas=" + clas
				+ ", sections=" + sections + ", sname=" + sname + "]";
	}
	
	

}
