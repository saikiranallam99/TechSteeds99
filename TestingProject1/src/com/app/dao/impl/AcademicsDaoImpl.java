package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IAcademicsDao;
import com.app.model.Add;
import com.app.model.AssignSubjects;
import com.app.model.Clas;
import com.app.model.Sections;
import com.app.model.Subjects;
import com.app.model.Teachers;
import com.app.model.TimeTable;

@Repository
public class AcademicsDaoImpl implements IAcademicsDao {
	
	@Autowired
    private HibernateTemplate ht;

	//Teachers
	public int saveTeachers(Teachers t) {
		
		return (Integer) ht.save(t);
	}
	public void updateTeachers(Teachers t) {
		ht.update(t);
		
	}

	public void deleteTeachers(int teacherId) {
		ht.delete(new Teachers(teacherId));
		
	}

	public Teachers getTeachersById(int teacherId) {
		return ht.get(Teachers.class, teacherId);
	}

	public List<Teachers> getAllTeachers() {
		return ht.loadAll(Teachers.class);
	}

	@SuppressWarnings("unchecked")
	public List<Object[]> getTeachersTypeCount() {
		String hql="select tType, count(tType) from com.app.model.Teachers group by tType";
	    List<Object[]> list=ht.find(hql);
		return list;
 	}
	@SuppressWarnings("unchecked")
	public List<Object[]> gettIdAndName() {
		String hql="select teacherId,teachername,email,gen,dob,teacherAddr,phone,fileName from com.app.model.Teachers";
		List<Object[]> obs=ht.find(hql);
		return obs;
	}
	
	
   //Subjects
	public int saveSubjects(Subjects sb) {
		
		return (Integer) ht.save(sb);
	}
	
	public void updateSubjects(Subjects sb) {
		ht.update(sb);
	}
	public void deleteSubjects(int subjectId) {
		ht.delete(new Subjects(subjectId));
		
	}
	public Subjects getSubjectsById(int subjectId) {
		return ht.get(Subjects.class, subjectId);
	}
	public List<Subjects> getAllSubjects() {
		return ht.loadAll(Subjects.class);
	}
	@SuppressWarnings("unchecked")
	public List<Object[]> getSubjectsTypeCount() {
		String hql="select sbType, count(sbType) from com.app.model.Subjects group by tType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}
	
	
	//Class
	public int saveClass(Clas cs) {
		
		return (Integer) ht.save(cs);
	}
	public void updateClas(Clas cs) {
	   ht.update(cs);
		
	}
	public void deleteClas(int classid) {
		ht.delete(new Clas(classid));
		
	}
	public Clas getClasById(int classid) {
		return ht.get(Clas.class, classid);
	}
	public List<Clas> getAllClas() {
		return ht.loadAll(Clas.class);
	}
	@SuppressWarnings("unchecked")
	public List<Object[]> getClasTypeCount() {
		String hql="select csType, count(csType) from com.app.model.Clas group by csType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}
	public List<Sections> getAllSections() {
		return ht.loadAll(Sections.class);
	}
	
	

	//Section
	public int saveSections(Sections sc) {
		
		return (Integer) ht.save(sc);
	}
	public void updateSections(Sections sc) {
		ht.update(sc);
		
	}
	public void deleteSections(int sectiontId) {
		ht.delete(new Sections(sectiontId));
		
	}
	public Sections getSectionsById(int sectiontId) {
		return ht.get(Sections.class, sectiontId);
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getSectionsTypeCount() {
		String hql="select scType, count(scType) from com.app.Sections.Clas group by scType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}
	

	//Time Table
	public int saveTimeTable(TimeTable tt) {
		
		return (Integer) ht.save(tt);
	}

	//Add
	public int saveAdd(Add A) {
		
		return (Integer) ht.save(A);
	}
	

	//Assign Projects
	public int saveAssignSubjects(AssignSubjects as) {
	
		return (Integer) ht.save(as);
	}
	
	


}
