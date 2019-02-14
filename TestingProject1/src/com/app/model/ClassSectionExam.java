package com.app.model;

public class ClassSectionExam {
String cls;
String section;
String examName;
public ClassSectionExam() {
	super();
}
public ClassSectionExam(String cls, String section, String examName) {
	super();
	this.cls = cls;
	this.section = section;
	this.examName = examName;
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
public String getExamName() {
	return examName;
}
public void setExamName(String examName) {
	this.examName = examName;
}
@Override
public String toString() {
	return "ClassSectionExam [cls=" + cls + ", section=" + section
			+ ", examName=" + examName + "]";
}

}
