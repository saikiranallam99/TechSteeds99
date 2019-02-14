package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IExaminationsDao;
import com.app.model.ClassSectionExam;
import com.app.model.ExamList;
import com.app.model.ExamSchedule;
import com.app.model.StudentSubjectMarks;
import com.app.model.marksGrade;

@Repository
public class IExaminationsDaoImpl implements IExaminationsDao {

	@Autowired
    private HibernateTemplate ht;
	
	//Exam List In Examination Module
	public int saveExamList(ExamList et) {
		return (Integer) ht.save(et);
	}
	public void updateExamList(ExamList et) {
		ht.update(et);
		
	}

	public void deleteExamList(int examid) {
		ht.delete(new ExamList(examid));
		
	}

	public ExamList getExamListById(int examid) {
		return ht.get(ExamList.class, examid);
	}

	public List<ExamList> getAllExamList() {
		return ht.loadAll(ExamList.class);
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getExamListTypeCount() {
		String hql="select etType, count(etType) from com.app.model.ExamList group by etType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}
	
	//Exam Schedule In Examination Module
		public int saveExamSchedule(ExamSchedule es) {
			return (Integer) ht.save(es);
		}
		
		public List<ExamSchedule> getAllExamSchedules() {
			
			return ht.loadAll(ExamSchedule.class);
		}
	
	//Marks List In Examination Module
	public int savemarksGrade(marksGrade mg) {
		
		return (Integer) ht.save(mg);
	}
	
	
	public void updatemarksGrade(marksGrade mg) {
		ht.update(mg);
		
	}
	public void deletemarksGrade(int marksId) {
		ht.delete(new marksGrade(marksId));
		
	}
	public marksGrade getmarksGradeById(int marksId) {
		return ht.get(marksGrade.class, marksId);

	}
	public List<marksGrade> getAllmarksGrade() {
		return ht.loadAll(marksGrade.class);
	}
	@SuppressWarnings("unchecked")
	public List<Object[]> getmarksGradeTypeCount() {
		String hql="select mgType, count(mgType) from com.app.model.marksGrade group by mgType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}	

	public List<ExamSchedule> findAllByclasAndsectionsandexam(ClassSectionExam classSectionExam) 
    {
		String clas=classSectionExam.getCls();
		String section=classSectionExam.getSection();
		String examName=classSectionExam.getExamName();
		String hql="from ExamSchedule es where es.cls='"+clas+"' and es.sec='"+section+"'and es.examName='"+examName+"'";
		@SuppressWarnings("unchecked")
		List<ExamSchedule> examSchedule1=ht.find(hql);
		return examSchedule1;
	}
	public int saveStudentSubjectMarks(StudentSubjectMarks studentSubjectMarks) {
		return (Integer) ht.save(studentSubjectMarks);
	}
	public List<StudentSubjectMarks> getStudentSubjectMarks(ClassSectionExam classSectionExam) {
		
		String clas=classSectionExam.getCls();
		String sections=classSectionExam.getSection();
		String exam=classSectionExam.getExamName();
		String hql="from StudentSubjectMarks s where s.cls='"+clas+"' and s.section='"+sections+"' and s.subject='"+exam+"'";
		@SuppressWarnings("unchecked")
		List<StudentSubjectMarks> studentSubjectMarks=ht.find(hql);
		return studentSubjectMarks;
	}
}
