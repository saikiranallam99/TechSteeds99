package com.app.dao;

import java.util.List;






import com.app.model.ClassSectionExam;
import com.app.model.ExamList;
import com.app.model.ExamSchedule;

import com.app.model.StudentSubjectMarks;
import com.app.model.marksGrade;

public interface IExaminationsDao {
	//Exams List
	public int saveExamList(ExamList et);
	public void updateExamList(ExamList et);
	public void deleteExamList(int examid);
	public ExamList getExamListById(int examid);
	public List<ExamList> getAllExamList();
	

	public List<Object[]> getExamListTypeCount();
	
	//Marks Grade
	public int savemarksGrade(marksGrade mg);
	public void updatemarksGrade(marksGrade mg);
	public void deletemarksGrade(int marksId);
	public marksGrade getmarksGradeById(int marksId);
	public List<marksGrade> getAllmarksGrade();

	public List<Object[]> getmarksGradeTypeCount();
	
	//Exam Schedule
	public int saveExamSchedule(ExamSchedule es);
	public List<ExamSchedule> getAllExamSchedules();
	public List<ExamSchedule> findAllByclasAndsectionsandexam(ClassSectionExam classSectionExam) ;
	public int saveStudentSubjectMarks(StudentSubjectMarks studentSubjectMarks);
	
	public List<StudentSubjectMarks> getStudentSubjectMarks(ClassSectionExam classSectionExam);
	
	
   
}
