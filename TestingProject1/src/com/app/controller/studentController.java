package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.AddSibling;
import com.app.model.Addmore;
import com.app.model.Category;
import com.app.model.Clas;
import com.app.model.ParentDetails;
import com.app.model.Sections;
import com.app.model.Student;
import com.app.model.StudentDetails;
import com.app.service.IStudentService;

import java.util.List;

















import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class studentController {
	@Autowired
	private IStudentService service;
	@RequestMapping("/showHomePage")
	public String showMainPage(ModelMap map){
		
		return "MainPage";
	}
	//Student Admission
	@RequestMapping("/showStudent")
	public String showstPage(ModelMap map){
		List<Object[]> ob=service.gettIdAndName();
		map.addAttribute("st", ob);
		List<Category> categories=service.getAllCategory();	
		map.addAttribute("categories", categories);
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "Student";
	}
	
	@RequestMapping(value="/insertStudent",method=RequestMethod.POST)
	public String saveStudent(@RequestParam("rlnm") String rlnm,
		                      @RequestParam ("clas") String clas,
		                      @RequestParam("sections") String sections,
		                      @RequestParam("fsnm") String fsnm,
		                      @RequestParam("lsnm") String lsnm,
		                      @RequestParam("gen") String gen,
		                      @RequestParam("dob") String dob,
		                      @RequestParam("category") String category,
		                      @RequestParam("rgn") String rgn,
		                      @RequestParam("cast") String cast,
		                      @RequestParam("mbnm") String mbnm,
		                      @RequestParam("email") String email,
		                      @RequestParam("addt") String addt,
		                      @RequestParam("rte") String rte,
		                      @RequestParam("fileOb") CommonsMultipartFile cmf ,
		                      @RequestParam("name") String name ,
		                      @RequestParam("phone") String phone,
		                      @RequestParam("occup") String occup,
		                      @RequestParam("mname") String mname,
		                      @RequestParam("mphone") String mphone,
		                      @RequestParam("moccup") String moccup,
		                      @RequestParam("grn") String grn,
		                      @RequestParam("gname") String gname,
		                      @RequestParam("grltn") String grltn,
		                      @RequestParam("gemail") String gemail,
		                      @RequestParam("gphone") String gphone,
		                      @RequestParam("goccp") String goccp ,
		                      @RequestParam("gadrs") String gadrs 
		                      ){
		if(cmf!=null)
		{
			Student st=new Student();
			st.setRlnm(rlnm);
			st.setClas(clas);
			st.setSections(sections);
			st.setFsnm(fsnm);
			st.setLsnm(lsnm);
			st.setGen(gen);
			st.setDob(dob);
			st.setCategory(category);
			st.setRgn(rgn);
			st.setCast(cast);
			st.setMbnm(mbnm);
			st.setEmail(email);
			st.setAddt(addt);
			st.setRte(rte);
			st.setFileName(cmf.getOriginalFilename());
			st.setFileData(cmf.getBytes());
			st.setName(name);
			st.setPhone(phone);
			st.setOccup(occup);
			st.setMname(mname);
			st.setMphone(mphone);
			st.setMoccup(moccup);
			st.setGrn(grn);;
			st.setGname(gname);
			st.setGrltn(grltn);
			st.setGemail(gemail);
			st.setGphone(gphone);
			st.setGoccp(goccp);
			st.setGadrs(gadrs);
			ParentDetails parent = new ParentDetails();
			parent.setName(name);
			parent.setPhone(phone);
			parent.setOccup(occup);
			parent.setMname(mname);
			parent.setMphone(mphone);
			parent.setMoccup(moccup);
			parent.setgrn(grn);
			parent.setGname(gname);
			parent.setGrltn(grltn);
			parent.setGemail(gemail);
			parent.setGphone(gphone);
			parent.setGoccp(goccp);
			parent.setGadrs(gadrs);
			service.saveStudent(st);
			service.saveParentDetails(parent);
		}
		
		/*Student st1=service.getStudentById(studentId);
		String message="student saved with name:"+st1.getCategory();
		map.addAttribute("msg",message);*/
		return "redirect:showStudent";
	}
	@RequestMapping("/viewAllStus")
	public String getAllStudents(ModelMap map){
		List<Student> stus=service.getAllStudents();
		map.addAttribute("Students",stus);

		return "StudentData";
	}
	
	//4
	@RequestMapping("/deleteStu")
	public String deleteStudent(@RequestParam("studentId")int studentId){
		service.deleteStudent(studentId);
		return "redirect:viewAllStus";
	}
	//5.
	@RequestMapping("/editStu")
	public String showStuEdit(@RequestParam("studentId")int studentId, ModelMap map){
		Student stuOb=service.getStudentById(studentId);
		map.addAttribute("stu",stuOb);
		return "StudentDataEdit";
	}
	@RequestMapping(value="/updateStu" , method=RequestMethod.POST)
	public String updateStudent(@ModelAttribute("student")Student stu){
		service.updateStudent(stu);
		return "redirect:viewAllStus";
	}
	
	//Siblings
	
	@RequestMapping("/showAddsibling")
	public String showAsibPage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "AddSibling";
	}
	
	@RequestMapping(value="/insertSibling",method=RequestMethod.POST)
	public String saveAddSibling(@ModelAttribute("AddSibling")AddSibling as,ModelMap map){
		int siblingId=service.saveAddSibling(as);
		
		String message="AddSibling Details:"+siblingId ;
		map.addAttribute("msg",message);
		return "AddSibling";
	}
	//Student Excel Export
	@RequestMapping("/stuExcelExport")
	public String showExcelData(ModelMap map)
	{
		List<Student> stus=service.getAllStudents();
		map.addAttribute("stus", stus);
		return "stuExcelView";
	}
	
	//Student Pdf Export
	@RequestMapping("/stuPdfExport")
	public String showPdfData(ModelMap map){
		List<Student> stus=service.getAllStudents();
		map.addAttribute("stus", stus);
		return "stuPdfView";
	}
	
	//parent Details
	
	@RequestMapping("/showParentDetails")
	public String showpPage(){
		return "ParentDetails";
	}
	
	@RequestMapping(value="/insertparent",method=RequestMethod.POST)
	public String saveParentDetails(@ModelAttribute("parentDetails")ParentDetails pd,ModelMap map){
		int parentId=service.saveParentDetails(pd);
		
		String message="Parent Details:"+parentId ;
		map.addAttribute("msg",message);
		return "ParentDetails";
	}
	
	@RequestMapping("/viewAllPds")
	public String getAllParentDetails(ModelMap map){
		List<ParentDetails> pds=service.getAllParentDetails();
		map.addAttribute("ParentDetails",pds);

		return "ParentDetailsData";
	}
	
	//4
	@RequestMapping("/deletePd")
	public String deleteParentDetails(@RequestParam("parentId")int parentId){
		service.deleteParentDetails(parentId);
		return "redirect:viewAllPds";
	}
	//5.
	@RequestMapping("/editPd")
	public String showPdEdit(@RequestParam("parentId")int parentId, ModelMap map){
		ParentDetails pdOb=service.getParentDetailsById(parentId);
		map.addAttribute("pd",pdOb);
		return "ParentDetailsDataEdit";
	}
	@RequestMapping(value="/updatePd" , method=RequestMethod.POST)
	public String updateParentDetails(@ModelAttribute("parentDetails")ParentDetails pd){
		service.updateParentDetails(pd);
		return "redirect:viewAllPds";
	}
	
	
	//Add More
	@RequestMapping("/showAddmore")
	public String showaddPage(){
		return "Addmore";
	}
	
	@RequestMapping(value="/insertmore",method=RequestMethod.POST)
	public String saveAddmore(@ModelAttribute("adddmore")Addmore am,ModelMap map){
		int addmoreId=service.saveAddmore(am);
		
		String message="Parent Details:"+addmoreId ;
		map.addAttribute("msg",message);
		return "Addmore";
	}
	
	

	@RequestMapping("/showStudentDetails")
	public String showsearchstudent(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "StudentDetails";
	}
	
	@RequestMapping(value="/searchDetails",method=RequestMethod.POST)
	public String searchStudent(@RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections, ModelMap map){
		

		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service.findAllByclasAndsections(studentDetails);	
		map.addAttribute("students",students);
		return "StudentDetails";
	}
	
	//Category

	@RequestMapping("/showCategory")
	public String showRegPage(){
		return "Category";
	}

	@RequestMapping(value="/insertCategory",method=RequestMethod.POST)
	public String saveCategory(@ModelAttribute("Category")Category cat,ModelMap map){
		int categoryid=service.saveCategory(cat);
		
		String message="Category:"+categoryid ;
		map.addAttribute("msg",message);
		return "Category";
	}
	
	//Promote
	@RequestMapping("/showPromote")
	public String showProPage(ModelMap map){
		List<Clas> Clas=service.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service.getAllSections();
		map.addAttribute("Sections",Sections);
		return "Promote";
	}
		
	@RequestMapping(value="/searchPromote",method=RequestMethod.POST)
	public String searchPromote(@RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections,ModelMap map){
		
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		service.findAllByclasAndsections(studentDetails);		
	
		return "showStudentData";
	}
	
	
	
}
	
