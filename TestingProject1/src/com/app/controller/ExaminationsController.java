package com.app.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Clas;
import com.app.model.ClassSectionExam;
import com.app.model.ExamList;
import com.app.model.ExamSchedule;
import com.app.model.MarksFrom;
import com.app.model.Sections;
import com.app.model.Student;
import com.app.model.StudentDetails;
import com.app.model.StudentSubjectMarks;
import com.app.model.marksGrade;
import com.app.service.IAcademicsService;
import com.app.service.IExaminationsService;
import com.app.service.IStudentService;


@Controller
public class ExaminationsController {
	
	@Autowired
	private IExaminationsService service;
	@Autowired
	private IAcademicsService service1;
	@Autowired
	private IStudentService service2;
	//Exam List  In Examination Module
	@RequestMapping("/showExamList")
	public String showexamPage(){
		return "ExamList";
	}
	
	//Exam List
	@RequestMapping(value="/insertExamsList",method=RequestMethod.POST)
	public String saveExamList(@ModelAttribute("ExamList")ExamList et,ModelMap map){
		int examid=service.saveExamList(et);		
		String message="ExamList Details:"+examid ;
		map.addAttribute("msg",message);
		return "ExamList";
	}
	
	@RequestMapping("/viewAllEms")
	public String getAllTeachers(ModelMap map){
		List<ExamList> et=service.getAllExamList();
		map.addAttribute("ExamList",et);

		return "ExamListData";
	}
	
	//4
	@RequestMapping("/deleteet")
	public String deleteExamList(@RequestParam("examid")int examid){
		service.deleteExamList(examid);
		return "redirect:viewAllEms";
	}
	//5.
	@RequestMapping("/editet")
	public String showexamEdit(@RequestParam("examid")int examid, ModelMap map){
		ExamList etOb=service.getExamListById(examid);
		map.addAttribute("et",etOb);
		return "ExamListDataEdit";
	}
	@RequestMapping(value="/updateet" , method=RequestMethod.POST)
	public String updateExamList(@ModelAttribute("ExamList")ExamList et){
		service.updateExamList(et);
		return "redirect:viewAllEms";
	}
	//Exams List Excel Export
	@RequestMapping("/etExcelExport")
	public String showExcelData(ModelMap map)
	{
		List<ExamList> ets=service.getAllExamList();
		map.addAttribute("ets", ets);
		return "etExcelView";
	}
	
	// ExamsList Pdf Export
	@RequestMapping("/etPdfExport")
	public String showPdfData(ModelMap map){
		List<ExamList> ets=service.getAllExamList();
		map.addAttribute("ets", ets);
		return "etPdfView";
	}
	
	//Marks Grade  In Examination Module
	
	@RequestMapping("/showmarksGrade")
	public String showmarksPage(){
		return "marksGrade";
	}
	@RequestMapping(value="/insertMarksGrade",method=RequestMethod.POST)
	public String savemarksGrade(@ModelAttribute("marksGrade")marksGrade mg,ModelMap map){
		int marksId=service.savemarksGrade(mg);		
		String message="Marks grade Details:"+marksId ;
		map.addAttribute("msg",message);
		return "marksGrade";
	}
	
	@RequestMapping("/viewAllmks")
	public String getAllmarksGrade(ModelMap map){
		List<marksGrade> mg=service.getAllmarksGrade();
		map.addAttribute("marksGrade",mg);

		return "marksGradeData";
	}
	
	//4
	@RequestMapping("/deletemg")
	public String deletemarksGrade(@RequestParam("marksId")int marksId){
		service.deletemarksGrade(marksId);
		return "redirect:viewAllmks";
	}
	//5.
	@RequestMapping("/editmg")
	public String showmgEdit(@RequestParam("marksId")int marksId, ModelMap map){
		marksGrade mgOb=service.getmarksGradeById(marksId);
		map.addAttribute("mg",mgOb);
		return "marksGradeDataEdit";
	}
	@RequestMapping(value="/updatemg" , method=RequestMethod.POST)
	public String updatemarksGrade(@ModelAttribute("marksGrade")marksGrade mg){
		service.updatemarksGrade(mg);
		return "redirect:viewAllmks";
	}
	
	//Marks Grade Excel Export
	@RequestMapping("/mgExcelExport")
	public String showExcelData1(ModelMap map)
	{
		List<marksGrade> mgs=service.getAllmarksGrade();
		map.addAttribute("mgs", mgs);
		return "mgExcelView";
	}
	
	// Marks Grade Pdf Export
	@RequestMapping("/mgPdfExport")
	public String showPdfData1(ModelMap map){
		List<marksGrade> mgs=service.getAllmarksGrade();
		map.addAttribute("mgs", mgs);
		return "mgPdfView";
	}
	

	//Exam Schedule in Examination Module
	
	@RequestMapping("/showExamSchedule")
	public String showexamsPage(ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "ExamSchedule";
	}
	@RequestMapping(value="/insertExamSchedule",method=RequestMethod.POST)
	public String saveExamSchedule(@ModelAttribute("examSchedule")ExamSchedule examSchedule,ModelMap map){
		int examscheduleid=service.saveExamSchedule(examSchedule);		
		String message="Exam Schedule Details:"+examscheduleid ;
		map.addAttribute("msg",message);
		return "ShowAddExamSchedule";
	}
	
	@RequestMapping("/showAddExamSchedule")
	public String showadexamsPage(ModelMap map){
		List<ExamList> names=service.getAllExamList();
		map.addAttribute("names", names);
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "ShowAddExamSchedule";
	}
	// Marks Register
	@RequestMapping("/showmarksRegister")
	public String showmarksRegister(ModelMap map){
		List<ExamList> exams=service.getAllExamList();
		map.addAttribute("exams", exams);
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "MarksRegister";
	}
	
	@RequestMapping("/showAddExamMarks")
	public String showAddmarksRegister(ModelMap map){
		List<ExamList> exams=service.getAllExamList();
		map.addAttribute("exams", exams);
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "AddExamMarks";
	}
	
	@RequestMapping(value="/showAddmarks",method=RequestMethod.POST)
	public String saveExamMarks(
			@RequestParam("exams")String exams,
			@RequestParam("clas")String clas,
			@RequestParam("sections")String sections,ModelMap map)
	{
		ClassSectionExam classSectionExam=new ClassSectionExam();
		classSectionExam.setCls(clas);
		classSectionExam.setSection(sections);
		classSectionExam.setExamName(exams);
		String section=sections;
		String cls=clas;
		List<ExamSchedule> examSchedule1=service.findAllByclasAndsectionsandexam(classSectionExam);
		boolean flag=examSchedule1.isEmpty();
		System.out.println(flag);
		if(!flag){
			System.out.println(examSchedule1);
		ExamSchedule examSchedule2=examSchedule1.get(0);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service2.findAllByclasAndsections(studentDetails);
		map.addAttribute("examSchedule2", examSchedule2);
		map.addAttribute("students",students);
		map.addAttribute("section",section);
		map.addAttribute("cls",cls);
		List<StudentSubjectMarks> studentSubjectMarks=service.getStudentSubjectMarks(classSectionExam);
		map.addAttribute("studentSubjectMarks",studentSubjectMarks);
		return "Addmarks";
		}
		else
		{
			String msg="No Record Found";
			map.addAttribute("msg",msg);
			return "redirect:showAddExamMarks";
		}
	}

	/*
	 * @RequestMapping(value="/addMarks",method=RequestMethod.POST) public String
	 * saveMarks(
	 * 
	 * @RequestParam("subject")String subject ,
	 * 
	 * @RequestParam("cls")String cls ,
	 * 
	 * @RequestParam("section")String section ,
	 * 
	 * @RequestParam("admissionNumber")int admissionNumber ,
	 * 
	 * @RequestParam("absent")String absent ,
	 * 
	 * @RequestParam("marks")int marks , ModelMap map) { StudentSubjectMarks
	 * studentSubjectMarks= new StudentSubjectMarks();
	 * studentSubjectMarks.setSubject(subject); studentSubjectMarks.setMarks(marks);
	 * studentSubjectMarks.setAbsent(absent);
	 * studentSubjectMarks.setAdmissionNumber(admissionNumber); Student
	 * student=service2.getStudentById(admissionNumber); String
	 * clss=student.getClas(); String rollnumber=student.getRlnm(); String
	 * section1=student.getSections(); String studentName=student.getFsnm(); String
	 * parentName=student.getGname(); studentSubjectMarks.setCls(clss);
	 * studentSubjectMarks.setRollNumber(rollnumber);
	 * studentSubjectMarks.setSection(section1);
	 * studentSubjectMarks.setStudentName(studentName);
	 * studentSubjectMarks.setFathername(parentName);
	 * service.saveStudentSubjectMarks(studentSubjectMarks); return "Addmarks"; }
	 */
	@RequestMapping(value="/addMarks",method=RequestMethod.POST)
	public String saveMarks(@ModelAttribute("marksFrom")MarksFrom marksFrom,ModelMap map)
	{
		MarksFrom marksFrom1=new MarksFrom();
	    System.out.println(marksFrom);
		StudentSubjectMarks studentSubjectMarks= new StudentSubjectMarks();
		System.out.println(studentSubjectMarks);
		List<StudentSubjectMarks> studentSubjectMarksList=new ArrayList<StudentSubjectMarks>();
		studentSubjectMarksList=marksFrom.getStudentSubjectMarks();
		System.out.println(marksFrom.getStudentSubjectMarks());
	     System.out.println(marksFrom.getStudentSubjectMarks());
		for(StudentSubjectMarks studentSubjectMarks1 :studentSubjectMarksList) {
		       service.saveStudentSubjectMarks(studentSubjectMarks1);
		    }
		
		String message="Marks saved" ;
		map.addAttribute("msg",message);
		System.out.println("marks saved");
		return "Addmarks";
	}
	
	
	@RequestMapping(value="/marksReport",method=RequestMethod.POST)
	public String marksReport(
			@RequestParam("exams")String exams,
			@RequestParam("clas")String clas,
			@RequestParam("sections")String sections,ModelMap map)
	{
		ClassSectionExam classSectionExam=new ClassSectionExam();
		classSectionExam.setCls(clas);
		classSectionExam.setSection(sections);
		classSectionExam.setExamName(exams);
		String section=sections;
		String cls=clas;
		List<ExamSchedule> examSchedule1=service.findAllByclasAndsectionsandexam(classSectionExam);
		boolean flag=examSchedule1.isEmpty();
		System.out.println(flag);
		if(!flag){
		ExamSchedule examSchedule2=examSchedule1.get(0);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service2.findAllByclasAndsections(studentDetails);
		map.addAttribute("examSchedule2", examSchedule2);
		map.addAttribute("students",students);
		map.addAttribute("section",section);
		map.addAttribute("cls",cls);
		List<StudentSubjectMarks> studentSubjectMarks=service.getStudentSubjectMarks(classSectionExam);
		map.addAttribute("studentSubjectMarks",studentSubjectMarks);
		return "MarksReport";
		}
		else
		{
			String msg="No Record Found";
			map.addAttribute("msg",msg);
			return "MarksReport";
		}
	}
}
