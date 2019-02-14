package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IExaminationsDao;


import com.app.model.ClassSectionExam;
import com.app.model.ExamList;
import com.app.model.ExamSchedule;
import com.app.model.StudentSubjectMarks;
import com.app.model.marksGrade;
import com.app.service.IExaminationsService;

@Service
public class ExaminationsServiceImpl implements IExaminationsService {

	@Autowired
	private IExaminationsDao dao;
	//Exam List In Examination Module
	public int saveExamList(ExamList et) {
		return dao.saveExamList(et);
	}
	public void updateExamList(ExamList et) {
		dao.updateExamList(et);
		
	}

	public void deleteExamList(int examid) {
	   dao.deleteExamList(examid);
		
	}

	public ExamList getExamListById(int examid) {
		return dao.getExamListById(examid);
	}

	public List<ExamList> getAllExamList() {
		return dao.getAllExamList();
	}

	public List<Object[]> getExamListTypeCount() {
		return dao.getExamListTypeCount();
	}

	//Exam Schedule in In Examination Module
		public int saveExamSchedule(ExamSchedule es) {
			return dao.saveExamSchedule(es);
		}
		
	//Marks List  In Examination Module
	public int savemarksGrade(marksGrade mg) {
		return dao.savemarksGrade(mg);
	}
	public void updatemarksGrade(marksGrade mg) {
		dao.updatemarksGrade(mg);
		
	}
	public void deletemarksGrade(int marksId) {
		dao.deletemarksGrade(marksId);
		
	}
	public marksGrade getmarksGradeById(int marksId) {
		return dao.getmarksGradeById(marksId);
	}
	public List<marksGrade> getAllmarksGrade() {
		return dao.getAllmarksGrade();
	}
	public List<Object[]> getmarksGradeTypeCount() {
		return dao.getmarksGradeTypeCount();
	}
	public List<ExamSchedule> getAllExamSchedules() {
		return dao.getAllExamSchedules();
	}

	
	public List<ExamSchedule> findAllByclasAndsectionsandexam(ClassSectionExam classSectionExam) {
		return dao.findAllByclasAndsectionsandexam(classSectionExam);
		}
	public int saveStudentSubjectMarks(StudentSubjectMarks studentSubjectMarks) {
		
		return dao.saveStudentSubjectMarks(studentSubjectMarks);
	}
	public List<StudentSubjectMarks> getStudentSubjectMarks(ClassSectionExam classSectionExam) {
	
		return dao.getStudentSubjectMarks(classSectionExam);
	}


	
	
}
