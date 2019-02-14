package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Classtable")
public class Clas {
	@Id
	@GeneratedValue
	@Column(name="classid")
	int classid;
	@Column (name="clas")
	String clas;
	@Column (name="section")
	String sections;
	public Clas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clas(int classid) {
		super();
		this.classid = classid;
	}
	public Clas(int classid, String clas, String sections) {
		super();
		this.classid = classid;
		this.clas = clas;
		this.sections = sections;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
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
	@Override
	public String toString() {
		return "Clas [classid=" + classid + ", clas=" + clas + ", sections="
				+ sections + "]";
	}
	
	
	
	

}
