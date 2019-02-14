package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import java.util.Date;
@Entity
public class StudentSubjectMarks 
{	
@Id
@GeneratedValue	
int studentSubjectMarksId;
int admissionNumber;
String cls;
String section;
String subject;
String rollNumber; 	
String studentName;	
String fathername;
String absent;
int marks;
public StudentSubjectMarks() {
	super();
}
public StudentSubjectMarks(int studentSubjectMarksId) {
	super();
	this.studentSubjectMarksId = studentSubjectMarksId;
}
public StudentSubjectMarks(int studentSubjectMarksId, int admissionNumber,
		String cls, String section, String subject, String rollNumber,
		String studentName, String fathername, String absent, int marks) {
	super();
	this.studentSubjectMarksId = studentSubjectMarksId;
	this.admissionNumber = admissionNumber;
	this.cls = cls;
	this.section = section;
	this.subject = subject;
	this.rollNumber = rollNumber;
	this.studentName = studentName;
	this.fathername = fathername;
	this.absent = absent;
	this.marks = marks;
}
public int getStudentSubjectMarksId() {
	return studentSubjectMarksId;
}
public void setStudentSubjectMarksId(int studentSubjectMarksId) {
	this.studentSubjectMarksId = studentSubjectMarksId;
}
public int getAdmissionNumber() {
	return admissionNumber;
}
public void setAdmissionNumber(int admissionNumber) {
	this.admissionNumber = admissionNumber;
}
public String getCls() {
	return cls;
}
public void setCls(String cls) {
	this.cls = cls;
}
public String getSection() {
	return section;
}
public void setSection(String section) {
	this.section = section;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getRollNumber() {
	return rollNumber;
}
public void setRollNumber(String rollNumber) {
	this.rollNumber = rollNumber;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getFathername() {
	return fathername;
}
public void setFathername(String fathername) {
	this.fathername = fathername;
}
public String getAbsent() {
	return absent;
}
public void setAbsent(String absent) {
	this.absent = absent;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "StudentSubjectMarks [studentSubjectMarksId="
			+ studentSubjectMarksId + ", admissionNumber=" + admissionNumber
			+ ", cls=" + cls + ", section=" + section + ", subject=" + subject
			+ ", rollNumber=" + rollNumber + ", studentName=" + studentName
			+ ", fathername=" + fathername + ", absent=" + absent + ", marks="
			+ marks + "]";
}

}
