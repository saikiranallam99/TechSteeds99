package com.app.model;

import java.util.Arrays;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;



@Entity
public class Student {
	@Id
	@GeneratedValue
	int studentId;
	String rlnm;
	String clas;
	String sections;
	String fsnm;
	String lsnm;
	String gen;
	String dob;
	String category;
	String rgn;
	String cast;
	String mbnm;
	String email;
	String addt;
	private String fileName;
	@Lob
	private byte[] fileData;
	String rte;
    String name;
	String phone;
	String occup;
	String mname;
	String mphone;
	String moccup;
	String grn;
	String gname;
	String grltn;
	String gemail;
	String gphone;
	String goccp;
	String gadrs;
	public Student() {
		super();
		
	}
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}
	public Student(int studentId, String rlnm, String clas, String sections,
			String fsnm, String lsnm, String gen, String dob, String category,
			String rgn, String cast, String mbnm, String email, String addt,
			String fileName, byte[] fileData, String rte, String name,
			String phone, String occup, String mname, String mphone,
			String moccup, String grn, String gname, String grltn,
			String gemail, String gphone, String goccp, String gadrs) {
		super();
		this.studentId = studentId;
		this.rlnm = rlnm;
		this.clas = clas;
		this.sections = sections;
		this.fsnm = fsnm;
		this.lsnm = lsnm;
		this.gen = gen;
		this.dob = dob;
		this.category = category;
		this.rgn = rgn;
		this.cast = cast;
		this.mbnm = mbnm;
		this.email = email;
		this.addt = addt;
		this.fileName = fileName;
		this.fileData = fileData;
		this.rte = rte;
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
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getRlnm() {
		return rlnm;
	}
	public void setRlnm(String rlnm) {
		this.rlnm = rlnm;
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
	public String getFsnm() {
		return fsnm;
	}
	public void setFsnm(String fsnm) {
		this.fsnm = fsnm;
	}
	public String getLsnm() {
		return lsnm;
	}
	public void setLsnm(String lsnm) {
		this.lsnm = lsnm;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRgn() {
		return rgn;
	}
	public void setRgn(String rgn) {
		this.rgn = rgn;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getMbnm() {
		return mbnm;
	}
	public void setMbnm(String mbnm) {
		this.mbnm = mbnm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddt() {
		return addt;
	}
	public void setAddt(String addt) {
		this.addt = addt;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
	public String getRte() {
		return rte;
	}
	public void setRte(String rte) {
		this.rte = rte;
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
	public String getGrn() {
		return grn;
	}
	public void setGrn(String grn) {
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
		return "Student [studentId=" + studentId + ", rlnm=" + rlnm + ", clas="
				+ clas + ", sections=" + sections + ", fsnm=" + fsnm
				+ ", lsnm=" + lsnm + ", gen=" + gen + ", dob=" + dob
				+ ", category=" + category + ", rgn=" + rgn + ", cast=" + cast
				+ ", mbnm=" + mbnm + ", email=" + email + ", addt=" + addt
				+ ", fileName=" + fileName + ", fileData="
				+ Arrays.toString(fileData) + ", rte=" + rte + ", name=" + name
				+ ", phone=" + phone + ", occup=" + occup + ", mname=" + mname
				+ ", mphone=" + mphone + ", moccup=" + moccup + ", grn=" + grn
				+ ", gname=" + gname + ", grltn=" + grltn + ", gemail="
				+ gemail + ", gphone=" + gphone + ", goccp=" + goccp
				+ ", gadrs=" + gadrs + "]";
	}
	
}
