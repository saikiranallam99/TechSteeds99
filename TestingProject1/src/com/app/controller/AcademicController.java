package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import com.app.model.Add;
import com.app.model.AssignSubjects;
import com.app.model.Clas;
import com.app.model.Sections;
import com.app.model.Subjects;
import com.app.model.Teachers;
import com.app.model.TimeTable;
import com.app.service.IAcademicsService;


@Controller
public class AcademicController {


	@Autowired
	private IAcademicsService service;
	@RequestMapping("/showAcedemic")
	public String showacademicpage(){
		return "Acedemic";
	}

	//Teacher
	@RequestMapping("/showTeachers")
	public String showtechPage(ModelMap map){
		List<Object[]> obs=service.gettIdAndName();
		map.addAttribute("t", obs);
		return "Teachers";


	}

	@RequestMapping(value="/insertTeachers",method=RequestMethod.POST)
	public String Teachers(@RequestParam("teachername")String teachername,
			@RequestParam("email")String email,
			@RequestParam("gen") String gen
			,@RequestParam("dob") String dob,
			@RequestParam("teacherAddr") String teacherAddr,
			@RequestParam("phone") String phone,
			@RequestParam("fileOb")
	CommonsMultipartFile cmf){

		if(cmf!=null)
		{
			Teachers t=new Teachers();
			t.setTeachername(teachername);
			t.setEmail(email);
			t.setGen(gen);
			t.setDob(dob);
			t.setTeacherAddr(teacherAddr);
			t.setPhone(phone);
			t.setFileName(cmf.getOriginalFilename());
			t.setFileData(cmf.getBytes());
			service.saveTeachers(t);


		}
		return "redirect:showTeachers";
	}

	@RequestMapping("/viewAllTchs")
	public String getAllTeachers(ModelMap map){
		List<Teachers> t=service.getAllTeachers();
		map.addAttribute("Teachers",t);

		return "TeachersData";


	}

	//4
	@RequestMapping("/deletet")
	public String deleteStudent(@RequestParam("teacherId")int teacherId){
		service.deleteTeachers(teacherId);
		return "redirect:viewAllTchs";
	}
	//5.
	@RequestMapping("/editt")
	public String showtEdit(@RequestParam("teacherId")int teacherId, ModelMap map){
		Teachers tOb=service.getTeachersById(teacherId);
		map.addAttribute("t",tOb);
		return "TeachersDataEdit";
	}
	@RequestMapping(value="/updatet" , method=RequestMethod.POST)
	public String updateTeachers(@ModelAttribute("teachers")Teachers t){
		service.updateTeachers(t);
		return "redirect:viewAllTchs";
	}

	//Teachers Excel Export
	@RequestMapping("/tExcelExport")
	public String showExcelData(ModelMap map)
	{
		List<Teachers> ts=service.getAllTeachers();
		map.addAttribute("ts", ts);
		return "tExcelView";
	}

	// Teachers Pdf Export
	@RequestMapping("/tPdfExport")
	public String showPdfData(ModelMap map){
		List<Teachers> ts=service.getAllTeachers();
		map.addAttribute("ts", ts);
		return "tPdfView";
	}
	//Subjects
	@RequestMapping("/showSubjects")
	public String showsubjPage(){
		return "Subjects";
	}

	@RequestMapping(value="/insertSubjects",method=RequestMethod.POST)
	public String saveSubjects(@ModelAttribute("subject")Subjects sb,ModelMap map){
		int subjectId=service.saveSubjects(sb);		
		String message="Subjects Details:"+subjectId ;
		map.addAttribute("msg",message);
		return "Subjects";
	}


	@RequestMapping("/viewAllSbjs")
	public String getAllSubjects(ModelMap map){
		List<Subjects> sb=service.getAllSubjects();
		map.addAttribute("Subjects",sb);

		return "SubjectsData";
	}

	//4
	@RequestMapping("/deletesb")
	public String deleteSubjects(@RequestParam("subjectId")int subjectId){
		service.deleteSubjects(subjectId);
		return "redirect:viewAllSbjs";
	}
	//5.
	@RequestMapping("/editsb")
	public String showsbEdit(@RequestParam("subjectId")int subjectId, ModelMap map){
		Subjects sbOb=service.getSubjectsById(subjectId);
		map.addAttribute("sb",sbOb);
		return "SubjectsDataEdit";
	}
	@RequestMapping(value="/updatesb" , method=RequestMethod.POST)
	public String updateSubjects(@ModelAttribute("Subjects")Subjects sb){
		service.updateSubjects(sb);
		return "redirect:viewAllSbjs";
	}

	//Subject Excel Export
	@RequestMapping("/sbExcelExport")
	public String showExcelData4(ModelMap map)
	{
		List<Subjects> sbs=service.getAllSubjects();
		map.addAttribute("sbs", sbs);
		return "sbExcelView";
	}

	//Subject pdf Export
	@RequestMapping("/sbPdfExport")
	public String showPdfData4(ModelMap map){
		List<Subjects> sbs=service.getAllSubjects();
		map.addAttribute("sbs", sbs);
		return "sbPdfView";
	}


	//Class
	@RequestMapping("/showClas")
	public String showclasPage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "Clas";
	}

	@RequestMapping(value="/insertClas",method=RequestMethod.POST)
	public String saveClas(@ModelAttribute("clas")Clas cs,ModelMap map){
		int classid=service.saveClas(cs);
		Clas cs1=service.getClasById(classid);
		String message="Section saved with name:"+cs1.getSections();
		map.addAttribute("msg",message);
		return "Clas";
	}

	@RequestMapping("/viewAllcs")
	public String getAllClas(ModelMap map){
		List<Clas> cs=service.getAllClas();
		map.addAttribute("Clas",cs);

		return "ClasData";
	}

	//4
	@RequestMapping("/deletecs")
	public String deleteClas(@RequestParam("classid")int classid){
		service.deleteClas(classid);
		return "redirect:viewAllcs";
	}
	//5.
	@RequestMapping("/editcs")
	public String showcsEdit(@RequestParam("classid")int classid, ModelMap map){
		Clas csOb=service.getClasById(classid);
		map.addAttribute("cs",csOb);
		return "ClasDataEdit";
	}
	@RequestMapping(value="/updatecs" , method=RequestMethod.POST)
	public String updateClas(@ModelAttribute("Clas")Clas cs){
		service.updateClas(cs);
		return "redirect:viewAllcs";
	}
	//Clas Excel Export
	@RequestMapping("/csExcelExport")
	public String showExcelData3(ModelMap map)
	{
		List<Clas> css=service.getAllClas();
		map.addAttribute("css", css);
		return "csExcelView";
	}

	//Clas pdf Export
	@RequestMapping("/csPdfExport")
	public String showPdfData3(ModelMap map){
		List<Clas> css=service.getAllClas();
		map.addAttribute("css", css);
		return "csPdfView";
	}


	//Section
	@RequestMapping("/showSections")
	public String showsectPage(ModelMap map){

		return "Sections";
	}

	@RequestMapping(value="/insertSections",method=RequestMethod.POST)
	public String saveSections(@ModelAttribute("sections")Sections sc,ModelMap map){
		int sectiontId=service.saveSections(sc);		
		String message="Sections Details:"+sectiontId ;
		map.addAttribute("msg",message);
		return "Sections";
	}
	@RequestMapping("/viewAllsc")
	public String getAllSections(ModelMap map){
		List<Sections> sc=service.getAllSections();
		map.addAttribute("Sections",sc);
		return "SectionsData";
	}

	//4
	@RequestMapping("/deletesc")
	public String deleteSections(@RequestParam("sectiontId")int sectiontId){
		service.deleteSections(sectiontId);
		return "redirect:viewAllsc";
	}
	//5.
	@RequestMapping("/editsc")
	public String showscEdit(@RequestParam("sectiontId")int sectiontId, ModelMap map){
		Sections scOb=service.getSectionsById(sectiontId);
		map.addAttribute("sc",scOb);
		return "SectionsDataEdit";
	}
	@RequestMapping(value="/updatesc" , method=RequestMethod.POST)
	public String updateSections(@ModelAttribute("Sections")Sections sc){
		service.updateSections(sc);
		return "redirect:viewAllsc";
	}

	//Sections Excel Export
	@RequestMapping("/scExcelExport")
	public String showExcelData1(ModelMap map)
	{
		List<Sections> scs=service.getAllSections();
		map.addAttribute("scs", scs);
		return "scExcelView";
	}

	//Sections pdf Export
	@RequestMapping("/scPdfExport")
	public String showPdfData2(ModelMap map){
		List<Sections> scs=service.getAllSections();
		map.addAttribute("scs", scs);
		return "scPdfView";
	}

	//TimeTable
	@RequestMapping("/showTimetable")
	public String showtimePage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "TimeTable";
	}

	@RequestMapping(value="/insertTimeTable",method=RequestMethod.POST)
	public String saveTimeTable(@ModelAttribute("timetable")TimeTable tt,ModelMap map){
		int tableId=service.saveTimeTable(tt);		
		String message="time table Details:"+tableId ;
		map.addAttribute("msg",message);
		return "TimeTable";
	}

	@RequestMapping("/showAdd")
	public String showaddPage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		List<Subjects> Subjects=service.getAllSubjects();
		map.addAttribute("Subjects",Subjects);
		return "Add";
	}

	@RequestMapping(value="/insertAdd",method=RequestMethod.POST)
	public String saveAdd(@ModelAttribute("add")Add A,ModelMap map){
		int addId=service.saveAdd(A);		
		String message="Add Details:"+addId ;
		map.addAttribute("msg",message);
		return "Add";
	}

	@RequestMapping("/showAssignSubjects")
	public String showassPage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "AssignSubjects";
	}

	@RequestMapping(value="/insertAssignSubjects",method=RequestMethod.POST)
	public String saveAssignSubjects(@ModelAttribute("AssignSubjects")AssignSubjects as,ModelMap map){
		int assignId=service.saveAssignSubjects(as);		
		String message="Assiggn Subjects Details:"+assignId ;
		map.addAttribute("msg",message);
		return "AssignSubjects";
	}	

}

