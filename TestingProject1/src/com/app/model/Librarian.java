package com.app.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="Librarian")
public class Librarian 
{

	@Id
	@GeneratedValue
	int librarianId;
	String librarianName ;
	String librarianEmail;
	String librarianGender  ;  
	String librarianDateOfBirth ;
	String librarianAddress ;
	String librarianPhone;
    String librarianPhotoName;
	@Lob
	byte[] librarianPhoto;
	public Librarian() {
		super();
	}
	public Librarian(int librarianId) {
		super();
		this.librarianId = librarianId;
	}
	public Librarian(int librarianId, String librarianName,
			String librarianEmail, String librarianGender,
			String librarianDateOfBirth, String librarianAddress,
			String librarianPhone, String librarianPhotoName,
			byte[] librarianPhoto) {
		super();
		this.librarianId = librarianId;
		this.librarianName = librarianName;
		this.librarianEmail = librarianEmail;
		this.librarianGender = librarianGender;
		this.librarianDateOfBirth = librarianDateOfBirth;
		this.librarianAddress = librarianAddress;
		this.librarianPhone = librarianPhone;
		this.librarianPhotoName = librarianPhotoName;
		this.librarianPhoto = librarianPhoto;
	}
	public int getLibrarianId() {
		return librarianId;
	}
	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}
	public String getLibrarianName() {
		return librarianName;
	}
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public String getLibrarianEmail() {
		return librarianEmail;
	}
	public void setLibrarianEmail(String librarianEmail) {
		this.librarianEmail = librarianEmail;
	}
	public String getLibrarianGender() {
		return librarianGender;
	}
	public void setLibrarianGender(String librarianGender) {
		this.librarianGender = librarianGender;
	}
	public String getLibrarianDateOfBirth() {
		return librarianDateOfBirth;
	}
	public void setLibrarianDateOfBirth(String librarianDateOfBirth) {
		this.librarianDateOfBirth = librarianDateOfBirth;
	}
	public String getLibrarianAddress() {
		return librarianAddress;
	}
	public void setLibrarianAddress(String librarianAddress) {
		this.librarianAddress = librarianAddress;
	}
	public String getLibrarianPhone() {
		return librarianPhone;
	}
	public void setLibrarianPhone(String librarianPhone) {
		this.librarianPhone = librarianPhone;
	}
	public String getLibrarianPhotoName() {
		return librarianPhotoName;
	}
	public void setLibrarianPhotoName(String librarianPhotoName) {
		this.librarianPhotoName = librarianPhotoName;
	}
	public byte[] getLibrarianPhoto() {
		return librarianPhoto;
	}
	public void setLibrarianPhoto(byte[] librarianPhoto) {
		this.librarianPhoto = librarianPhoto;
	}
	@Override
	public String toString() {
		return "Librarian [librarianId=" + librarianId + ", librarianName="
				+ librarianName + ", librarianEmail=" + librarianEmail
				+ ", librarianGender=" + librarianGender
				+ ", librarianDateOfBirth=" + librarianDateOfBirth
				+ ", librarianAddress=" + librarianAddress
				+ ", librarianPhone=" + librarianPhone
				+ ", librarianPhotoName=" + librarianPhotoName
				+ ", librarianPhoto=" + Arrays.toString(librarianPhoto) + "]";
	}
	
	
	
}
