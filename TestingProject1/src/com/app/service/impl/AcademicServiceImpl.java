package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAcademicsDao;
import com.app.model.Add;
import com.app.model.AssignSubjects;
import com.app.model.Clas;
import com.app.model.Sections;
import com.app.model.Subjects;
import com.app.model.Teachers;
import com.app.model.TimeTable;
import com.app.service.IAcademicsService;


@Service
public class AcademicServiceImpl implements IAcademicsService {
	
	@Autowired
	private IAcademicsDao dao;
	
    //Teachers
	public int saveTeachers(Teachers t) {
		
		return dao.saveTeachers(t);
	}
	public List<Object[]> gettIdAndName() {
		
		return dao.gettIdAndName();
	}

	public void updateTeachers(Teachers t) {
		
		dao.updateTeachers(t);
		
	}


	public void deleteTeachers(int teacherId) {
		dao.deleteTeachers(teacherId);
	}


	public Teachers getTeachersById(int teacherId) {
		return dao.getTeachersById(teacherId);
	}


	public List<Teachers> getAllTeachers() {
		return dao.getAllTeachers();
		
	}


	public List<Object[]> getTeachersTypeCount() {
		return dao.getTeachersTypeCount();
		
	}

  //Subjects
	public int saveSubjects(Subjects sb) {
		
		return dao.saveSubjects(sb);
	}

	public void updateSubjects(Subjects sb) {
		dao.updateSubjects(sb);
		
	}

	public void deleteSubjects(int subjectId) {
		dao.deleteSubjects(subjectId);
		
	}

	public Subjects getSubjectsById(int subjectId) {
		
		return dao.getSubjectsById(subjectId);
	}

	public List<Subjects> getAllSubjects() {
		return dao.getAllSubjects();
	}

	public List<Object[]> getSubjectsTypeCount() {
		return dao.getSubjectsTypeCount();
	}
	
	
   //Class
	public int saveClas(Clas cs) {
		
		return dao.saveClass(cs);
	}
	public void updateClas(Clas cs) {
		dao.updateClas(cs);
	}

	public void deleteClas(int classid) {
		dao.deleteClas(classid);
		
	}

	public Clas getClasById(int classid) {
		
		return dao.getClasById(classid);
	}

	public List<Clas> getAllClas() {
		
		return dao.getAllClas();
	}

	public List<Object[]> getClasTypeCount() {
		
		return dao.getClasTypeCount();
	}
	
   public List<Sections> getAllSections() {
		
		return dao.getAllSections();
	}

    //Sections
	public int saveSections(Sections sc) {
		
		return dao.saveSections(sc);
	}
	public void updateSections(Sections sc) {
		dao.updateSections(sc);
		
	}

	public void deleteSections(int sectiontId) {
		dao.deleteSections(sectiontId);
		
	}

	public Sections getSectionsById(int sectiontId) {
		
		return dao.getSectionsById(sectiontId);
	}

	

	public List<Object[]> getSectionsTypeCount() {
		
		return dao.getSectionsTypeCount();
	}


   //Time Table
	public int saveTimeTable(TimeTable tt) {
		
		return dao.saveTimeTable(tt);
	}

   //Add
	public int saveAdd(Add A) {
		
		return dao.saveAdd(A);
	}

   //Assign Projects
	public int saveAssignSubjects(AssignSubjects as) {
	
		return dao.saveAssignSubjects(as);
	}

}
