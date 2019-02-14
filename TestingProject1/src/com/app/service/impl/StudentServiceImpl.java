package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.app.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	private IStudentDao dao;
	
    public int saveStudent(Student st) {
		
		return dao.saveStudent(st);
	}
    
    public void updateStudent(Student stu) {
    	 dao.updateStudent(stu);
		
	}

	public void deleteStudent(int studentId) {
		dao.deleteStudent(studentId);
	}

	public Student getStudentById(int studentId) {
		
		return dao.getStudentById(studentId);
	}

	public List<Student> getAllStudents() {
		
		return dao.getAllStudents();
	}

	public List<Object[]> getStudentTypeCount() {
		
		return dao.getStudentTypeCount();
	}

	public List<Object[]> gettIdAndName() {
		return dao.gettIdAndName();
	}
	public int saveAddSibling(AddSibling as) {
		
		return dao.saveAddSibling(as);
	}
	
      public int saveParentDetails(ParentDetails pd) {
		
		return dao.saveParentDetails(pd);
	}
      
      public void updateParentDetails(ParentDetails pd) {
       	  dao.updateParentDetails(pd);
     		
     	}

     	public void deleteParentDetails(int parentId) {
     		dao.deleteParentDetails(parentId);
     		
     	}

     	public ParentDetails getParentDetailsById(int parentId) {
     		return dao.getParentDetailsById(parentId);
     	}

     	public List<ParentDetails> getAllParentDetails() {
     		return dao.getAllParentDetails();
     	}

    	public List<Object[]> getParentDetailsTypeCount() {
    		return dao.getParentDetailsTypeCount();
    	}
    
     
	public int saveAddmore(Addmore am) {
		
		return dao.saveAddmore(am);
	}

	/*public int saveUploadDocumnet(UploadDocument doc) {
		
		return dao.saveUploadDocument(doc);
	}

	public List<Object[]> getDocsIdAndName() {
		return dao.getDocsIdAndName();
	}*/
/*
	public int saveStudentDetails(StudentDetails sd) {
		
		return dao.saveStudentDetails(sd);
	}*/
	
	public int saveCategory(Category cat) {
		
		return dao.saveCategory(cat);
	}

	/*public int savePromote(Promote p) {
		
		return dao.savePromote(p);
	}*/

	public List<Category> getAllCategory() {
		
		return dao.getAllCategory();
	}

	
	public List<Student> getAllStudents(String cls, String sec) {
		
		return dao.getAllStudents();
	}

	public List<Clas> getAllClas() {
		
		return dao.getAllClas();
	}

	public List<Sections> getAllSections() {
		return dao.getAllSections();
	}

	public List<Student> findAllByclasAndsections(StudentDetails studentDetails)  {
		return dao.findAllByclasAndsections(studentDetails);
	}

	public List<Student> findAllstudents(StudentReport studentReport) {
		
		return dao.findAllstudents(studentReport);
	}

	public List<Student> findstudentByclasAndsectionAndName(
			StudentDetails studentDetails) {
		
		return dao.findstudentByclasAndsectionAndName(studentDetails);
	}

	

	 

	
}
