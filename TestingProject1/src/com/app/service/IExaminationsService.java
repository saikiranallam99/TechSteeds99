package com.app.service;

import java.util.List;

import com.app.model.ClassSectionExam;
import com.app.model.ExamList;
import com.app.model.ExamSchedule;

import com.app.model.StudentSubjectMarks;
import com.app.model.marksGrade;

public interface IExaminationsService {
	//Exam List In Examination Module
	public int saveExamList(ExamList et);
	public void updateExamList(ExamList et);
	public void deleteExamList(int examid);
	public ExamList getExamListById(int examid);
	public List<ExamList> getAllExamList();
   
	public List<Object[]> getExamListTypeCount();
	
	//Marks Grade In Examination Module
	public int savemarksGrade(marksGrade mg);
	public void updatemarksGrade(marksGrade mg);
	public void deletemarksGrade(int marksId);
	public marksGrade getmarksGradeById(int marksId);
	public List<marksGrade> getAllmarksGrade();
   
	public List<Object[]> getmarksGradeTypeCount();
	
	// Exam Schedule In Examination Module
	public int saveExamSchedule(ExamSchedule es);
	public List<ExamSchedule> getAllExamSchedules();
	public List<ExamSchedule> findAllByclasAndsectionsandexam(ClassSectionExam classSectionExam) ;
	public int saveStudentSubjectMarks(StudentSubjectMarks studentSubjectMarks);
  
	public List<StudentSubjectMarks> getStudentSubjectMarks(ClassSectionExam classSectionExam);
}
