package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Promote {
	@Id
	@GeneratedValue
	@Column(name="pid")
	int promoteId;
	@Column(name="clas")
	String clas;
	@Column(name="sections")
	String sections;
	public Promote() {
		super();
		
	}
	public Promote(int promoteId) {
		super();
		this.promoteId = promoteId;
	}
	public Promote(int promoteId, String clas, String sections) {
		super();
		this.promoteId = promoteId;
		this.clas = clas;
		this.sections = sections;
	}
	public int getPromoteId() {
		return promoteId;
	}
	public void setPromoteId(int promoteId) {
		this.promoteId = promoteId;
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
		return "Promote [promoteId=" + promoteId + ", clas=" + clas
				+ ", sections=" + sections + "]";
	}
	
}
