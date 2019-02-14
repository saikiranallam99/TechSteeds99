package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IStudentDao;
import com.app.model.AddSibling;
import com.app.model.Addmore;
import com.app.model.Category;
import com.app.model.Clas;
import com.app.model.ParentDetails;
import com.app.model.Sections;
import com.app.model.Student;
import com.app.model.StudentDetails;
import com.app.model.StudentReport;

@Repository
public class studentDaoImpl implements IStudentDao{
	@Autowired
    private HibernateTemplate ht;
    
     public int saveStudent(Student st) {
		
		return (Integer) ht.save(st);
	}
     public void updateStudent(Student stu) {
    	 ht.update(stu);
 		
 	}
 	public void deleteStudent(int studentId) {
 		ht.delete(new Student(studentId));

 		
 	}
 	public Student getStudentById(int studentId) {
 		
 		 return ht.get(Student.class, studentId);
 	}
 	public List<Student> getAllStudents() {
 		return ht.loadAll(Student.class);
 	}
 	public List<Category> getAllCategory() {
		return ht.loadAll(Category.class);
	}
 	
 	@SuppressWarnings("unchecked")
	public List<Object[]> getStudentTypeCount() {
 		String hql="select custType, count(stuType) from com.app.model.Student group by stuType";
	    List<Object[]> list=ht.find(hql);
		return list;
 	}
     
	@SuppressWarnings("unchecked")
	public List<Object[]> gettIdAndName() {
		String hql="select studentId,rlnm,clas,sections,fsnm,lsnm,gen,dob,category,rgn,cast,mbnm,email,addt ,fileName from com.app.model.Student";
		List<Object[]> ob=ht.find(hql);
		return ob;
	}
	
	public int saveAddSibling(AddSibling as) {
		return (Integer) ht.save(as);
	}
	public int saveParentDetails(ParentDetails pd) {
		
		return (Integer) ht.save(pd);
	}
	
	public void updateParentDetails(ParentDetails pd) {
		ht.update(pd);
		
	}
	public void deleteParentDetails(int parentId) {
		ht.delete(new ParentDetails(parentId));
		
	}
	public ParentDetails getParentDetailsById(int parentId) {
		
		return ht.get(ParentDetails.class, parentId);
	}
	public List<ParentDetails> getAllParentDetails() {
		return ht.loadAll(ParentDetails.class);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getParentDetailsTypeCount() {
		String hql="select parentType, count(pdType) from com.app.model.ParentDetails group by pdType";
	    List<Object[]> list=ht.find(hql);
		return list;
	}
	public int saveAddmore(Addmore am) {
		
		return (Integer) ht.save(am);
	}
    public int saveCategory(Category cat) {
		
		return (Integer) ht.save(cat);
	}
	
	public List<Clas> getAllClas() {
		return ht.loadAll(Clas.class);
	}
	public List<Sections> getAllSections() {
		return ht.loadAll(Sections.class);
	}
	@SuppressWarnings("unchecked")
	public List<Student> findAllByclasAndsections(StudentDetails studentDetails) 
    {
		String clas=studentDetails.getClas();
		String sections=studentDetails.getSections();
		String hql="from Student s where s.clas='"+clas+"' and s.sections='"+sections+"'";
		List<Student> student1=ht.find(hql);
		return student1;
	}
	public List<Student> findAllstudents(StudentReport studentReport) {
		String cls=studentReport.getCls();
		String section=studentReport.getSection();
		String category=studentReport.getCategory();
		String gender=studentReport.getGender();
		String rte=studentReport.getRte() ;
		String hql="from Student s where s.clas='"+cls+"' and s.sections='"+section+"' and s.category='"+category+"' and s.gen='"+gender+"' and s.rte='"+rte+"'";
		@SuppressWarnings("unchecked")
		List<Student> student1=ht.find(hql);
		return student1;
	}
	public List<Student> findstudentByclasAndsectionAndName(
			StudentDetails studentDetails) {
		String clas=studentDetails.getClas();
		String sections=studentDetails.getSections();
		String studentName=studentDetails.getSname();
		String hql="from Student s where s.clas='"+clas+"' and s.sections='"+sections+"' and s.fsnm='"+studentName+"'";
		@SuppressWarnings("unchecked")
		List<Student> student=ht.find(hql);
		return student;
	}
	
	
	
;	}
	
	

