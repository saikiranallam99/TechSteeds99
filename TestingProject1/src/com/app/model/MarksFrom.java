package com.app.model;

import java.util.List;

public class MarksFrom 
{
	private List<StudentSubjectMarks> studentSubjectMarks;

	public List<StudentSubjectMarks> getStudentSubjectMarks() {
		return studentSubjectMarks;
	}

	public void setStudentSubjectMarks(List<StudentSubjectMarks> studentSubjectMarks) {
		this.studentSubjectMarks = studentSubjectMarks;
	}

	@Override
	public String toString() {
		return "MarksFrom [studentSubjectMarks=" + studentSubjectMarks + "]";
	}

	
	

}
