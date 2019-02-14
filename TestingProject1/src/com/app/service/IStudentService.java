package com.app.service;

import java.util.List;

import com.app.model.AddSibling;
import com.app.model.Addmore;
import com.app.model.Category;
import com.app.model.Clas;
import com.app.model.ParentDetails;
import com.app.model.Sections;
import com.app.model.Student;
import com.app.model.StudentDetails;
import com.app.model.StudentReport;

public interface IStudentService {
	public int saveStudent(Student st);
	public void updateStudent(Student stu);
	public void deleteStudent(int studentId);
	public Student getStudentById(int studentId);
	public List<Student> getAllStudents();
	public List<Category> getAllCategory();
	public List<Object[]> getStudentTypeCount();
	public List<Object[]> gettIdAndName();
	public List<Clas> getAllClas();
	public List<Sections> getAllSections();
	
	public int saveAddSibling(AddSibling as);
	
	public int saveParentDetails(ParentDetails pd);
	public void updateParentDetails(ParentDetails pd);
	public void deleteParentDetails(int parentId);
	public ParentDetails getParentDetailsById(int parentId);
	public List<ParentDetails> getAllParentDetails();
	public List<Object[]> getParentDetailsTypeCount();
	
    public int saveAddmore(Addmore am);
    
    /*public int saveUploadDocumnet(UploadDocument doc);
    public List<Object[]> getDocsIdAndName();
    
    public int saveStudentDetails(StudentDetails sd);
    public List<Student> getAllStudent();*/
    
    /*public String addStudentDetails(StudentDetails sd);*/
    /*public List<Student> findByclasAndsec(Student student);*/
    
    public int saveCategory(Category cat);
    
    
    /*public int savePromote(Promote p);*/
    public List<Student> findAllByclasAndsections(StudentDetails studentDetails) ;
    public List<Student> findAllstudents(StudentReport studentReport) ;
    public List<Student> findstudentByclasAndsectionAndName(StudentDetails studentDetails) ;
	
	
	
    
    
}
