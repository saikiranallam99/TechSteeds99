package com.app.model;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="updoctab")

public class Upload {
	@Id
	@GeneratedValue
	@Column(name="stid")
	private int studentId;
	@Column (name="rollnumber")
	String rlnm;
	@Column (name="Class")
	String cls;
	@Column(name="sectiong")
	String sec;
	@Column(name="filename")
	private String fileName;
	@Lob
	@Column(name="fileData")
	private byte[] fileData;
	public Upload() {
		super();
	}
	
	
	public Upload(int studentId) {
		super();
		this.studentId = studentId;
	}


	public Upload(int studentId, String rlnm, String cls, String sec,
			String fileName, byte[] fileData) {
		super();
		this.studentId = studentId;
		this.rlnm = rlnm;
		this.cls = cls;
		this.sec = sec;
		this.fileName = fileName;
		this.fileData = fileData;
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
		return "UploadDocument [studentId=" + studentId + ", rlnm=" + rlnm
				+ ", cls=" + cls + ", sec=" + sec + ", fileName=" + fileName
				+ ", fileData=" + Arrays.toString(fileData) + "]";
	}
	
}
