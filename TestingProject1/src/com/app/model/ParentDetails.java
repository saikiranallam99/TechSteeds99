package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="parenttable")
public class ParentDetails {
	@Id
	@GeneratedValue
	@Column(name="pid")
	int parentId;
	
	@Column(name="fname")
    String name;
	@Column(name="fphone")
	String phone;
	@Column(name="foccupation")
	String occup;
	@Column(name="mname")
	String mname;
	@Column(name="mphone")
	String mphone;
	@Column(name="moccupation")
	String moccup;
	@Column(name="type")
	String grn;
	@Column(name="gname")
	String gname;
	@Column(name="grelation")
	String grltn;
	@Column(name="gemail")
	String gemail;
	@Column(name="gphone")
	String gphone;
	@Column(name="goccupation")
	String goccp;
	@Column(name="gaddress")
	String gadrs;
	public ParentDetails() {
		super();
	}
	
	public ParentDetails(int parentId) {
		super();
		this.parentId = parentId;
	}

	public ParentDetails(int parentId, String name,
			String phone, String occup, String mname, String mphone,
			String moccup, String grn, String gname, String grltn,
			String gemail, String gphone, String goccp, String gadrs) {
		super();
		this.parentId = parentId;
		
		this.name = name;
		this.phone = phone;
		this.occup = occup;
		this.mname = mname;
		this.mphone = mphone;
		this.moccup = moccup;
		this.grn = grn;
		this.gname = gname;
		this.grltn = grltn;
		this.gemail = gemail;
		this.gphone = gphone;
		this.goccp = goccp;
		this.gadrs = gadrs;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOccup() {
		return occup;
	}
	public void setOccup(String occup) {
		this.occup = occup;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMoccup() {
		return moccup;
	}
	public void setMoccup(String moccup) {
		this.moccup = moccup;
	}
	public String getgrn() {
		return grn;
	}
	public void setgrn(String grn) {
		this.grn = grn;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGrltn() {
		return grltn;
	}
	public void setGrltn(String grltn) {
		this.grltn = grltn;
	}
	public String getGemail() {
		return gemail;
	}
	public void setGemail(String gemail) {
		this.gemail = gemail;
	}
	public String getGphone() {
		return gphone;
	}
	public void setGphone(String gphone) {
		this.gphone = gphone;
	}
	public String getGoccp() {
		return goccp;
	}
	public void setGoccp(String goccp) {
		this.goccp = goccp;
	}
	public String getGadrs() {
		return gadrs;
	}
	public void setGadrs(String gadrs) {
		this.gadrs = gadrs;
	}
	@Override
	public String toString() {
		return "ParentDetails [parentId=" + parentId + ", supplierId="
				 + ", name=" + name + ", phone=" + phone
				+ ", occup=" + occup + ", mname=" + mname + ", mphone="
				+ mphone + ", moccup=" + moccup + ", grn=" + grn
				+ ", gname=" + gname + ", grltn=" + grltn + ", gemail="
				+ gemail + ", gphone=" + gphone + ", goccp=" + goccp
				+ ", gadrs=" + gadrs + "]";
	}
	
	
	

}
