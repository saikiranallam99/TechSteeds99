package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timettable")
public class TimeTable {

	@Id
	@GeneratedValue
	@Column(name="tableid")
	int tableId;
	@Column (name="clas")
	String cls;
	@Column (name="section")
	String sec;
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TimeTable(int tableId) {
		super();
		this.tableId = tableId;
	}
	public TimeTable(int tableId, String cls, String sec) {
		super();
		this.tableId = tableId;
		this.cls = cls;
		this.sec = sec;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
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
		return "TimeTable [tableId=" + tableId + ", cls=" + cls + ", sec="
				+ sec + "]";
	}

	
	
}

