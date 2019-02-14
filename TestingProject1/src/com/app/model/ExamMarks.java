package com.app.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExamMarks {

	@Id
	int examId;
	String examName;
	List<Student> students;
	
	
}
