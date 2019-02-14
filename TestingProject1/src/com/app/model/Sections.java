package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sectiontable")
public class Sections {

	@Id
	@GeneratedValue
	@Column(name="scid")
	int sectiontId;
	@Column (name="sections")
	String sections;
	public Sections() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Sections(int sectiontId) {
		super();
		this.sectiontId = sectiontId;
	}

	public Sections(int sectiontId, String sections) {
		super();
		this.sectiontId = sectiontId;
		this.sections = sections;
	}

	public int getSectiontId() {
		return sectiontId;
	}

	public void setSectiontId(int sectiontId) {
		this.sectiontId = sectiontId;
	}

	public String getSections() {
		return sections;
	}

	public void setSections(String sections) {
		this.sections = sections;
	}

	@Override
	public String toString() {
		return "Sections [sectiontId=" + sectiontId + ", sections=" + sections
				+ "]";
	}

   
}