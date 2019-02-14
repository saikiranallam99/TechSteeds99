package com.app.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="teachertable")
public class Teachers {
	@Id
	@GeneratedValue
	@Column(name="tid")
	int teacherId;	
	@Column (name="teachername")
	String teachername;
	@Column (name="email")
	String email;
	@Column (name="gender")
	String gen;
	@Column (name="dateofbirth")
	String dob;
	@Column (name="address")
	String teacherAddr;
	@Column (name="phone")
	String phone;
	@Column(name="filename")
	private String fileName;
	@Lob
	@Column(name="fileData")
	private byte[] fileData;
	public Teachers() {
		super();
	}
	public Teachers(int teacherId) {
		super();
		this.teacherId = teacherId;
	}
	public Teachers(int teacherId, String teachername, String email,
			String gen, String dob, String teacherAddr, String phone,
			String fileName, byte[] fileData) {
		super();
		this.teacherId = teacherId;
		this.teachername = teachername;
		this.email = email;
		this.gen = gen;
		this.dob = dob;
		this.teacherAddr = teacherAddr;
		this.phone = phone;
		this.fileName = fileName;
		this.fileData = fileData;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getTeacherAddr() {
		return teacherAddr;
	}
	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	@Override
	public String toString() {
		return "Teachers [teacherId=" + teacherId + ", teachername="
				+ teachername + ", email=" + email + ", gen=" + gen + ", dob="
				+ dob + ", teacherAddr=" + teacherAddr + ", phone=" + phone
				+ ", fileName=" + fileName + ", fileData="
				+ Arrays.toString(fileData) + "]";
	}
	
}
