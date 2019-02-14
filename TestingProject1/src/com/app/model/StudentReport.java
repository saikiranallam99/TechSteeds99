package com.app.model;

public class StudentReport 
{
String cls;
String section;
String category;
String gender;
String rte;
public StudentReport() {
	super();
}
public StudentReport(String cls, String section, String category,
		String gender, String rte) {
	super();
	this.cls = cls;
	this.section = section;
	this.category = category;
	this.gender = gender;
	this.rte = rte;
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
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getRte() {
	return rte;
}
public void setRte(String rte) {
	this.rte = rte;
}
@Override
public String toString() {
	return "StudentReport [cls=" + cls + ", section=" + section + ", category="
			+ category + ", gender=" + gender + ", rte=" + rte + "]";
}


}
