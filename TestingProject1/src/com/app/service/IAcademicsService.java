package com.app.service;

import java.util.List;

import com.app.model.Add;
import com.app.model.AssignSubjects;
import com.app.model.Clas;
import com.app.model.Sections;
import com.app.model.Subjects;
import com.app.model.Teachers;
import com.app.model.TimeTable;

;public interface IAcademicsService {

	//Teachers
	public int saveTeachers(Teachers t);
	 public List<Object[]> gettIdAndName();
	public void updateTeachers(Teachers stu);
	public void deleteTeachers(int teacherId);
	public Teachers getTeachersById(int teacherId);
	public List<Teachers> getAllTeachers();
   
	public List<Object[]> getTeachersTypeCount();
	
	//Subjects
	public int saveSubjects(Subjects sb);
	public void updateSubjects(Subjects sb);
	public void deleteSubjects(int subjectId);
	public Subjects getSubjectsById(int subjectId);
	public List<Subjects> getAllSubjects();
   
	public List<Object[]> getSubjectsTypeCount();
	
	//Class
	public int saveClas(Clas cs);
	public void updateClas(Clas cs);
	public void deleteClas(int classid);
	public Clas getClasById(int classid);
	public List<Clas> getAllClas();
	public List<Sections> getAllSections();
	public List<Object[]> getClasTypeCount();
	
	//Section
	public int saveSections(Sections sc);
	public void updateSections(Sections sc);
	public void deleteSections(int sectiontId);
	public Sections getSectionsById(int sectiontId);

   
	public List<Object[]> getSectionsTypeCount();
	
	//Time Table
	public int saveTimeTable(TimeTable tt);
	
	//Add
	public int saveAdd(Add a);
	
	//Assign Projects
	public int saveAssignSubjects(AssignSubjects as);
}
