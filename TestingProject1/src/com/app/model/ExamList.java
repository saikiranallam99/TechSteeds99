package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ExamListtable")
public class ExamList {
	@Id
	@GeneratedValue
	@Column(name="examid")
	int examid;
	@Column(name="name")
	String name;
	@Column(name="note")
	String note;
	public ExamList() {
		super();
	}
	public ExamList(int examid) {
		super();
		this.examid = examid;
	}
	public ExamList(int examid, String name, String note) {
		super();
		this.examid = examid;
		this.name = name;
		this.note = note;
	}
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "ExamList [examid=" + examid + ", name=" + name + ", note="
				+ note + "]";
	}
	
	

}
