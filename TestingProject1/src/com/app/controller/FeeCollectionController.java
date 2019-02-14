package com.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Accountant;
import com.app.model.AssignFee;
import com.app.model.Category;
import com.app.model.Clas;
import com.app.model.CollectFee;
import com.app.model.FeesDiscount;
import com.app.model.FeesGroup;
import com.app.model.FeesMaster;
import com.app.model.FeesType;
import com.app.model.Sections;
import com.app.model.Student;
import com.app.model.StudentDetails;
import com.app.model.StudentFeePaid;
import com.app.service.IFeesCollectionService;
import com.app.service.IStudentService;



@Controller
public class FeeCollectionController {
	@Autowired
	private IFeesCollectionService service;
	@Autowired
	private IStudentService service1;
	//Fee Collection
	@RequestMapping("/showFeesCollection")
	public String sshowFeesCollection(){
		return "FeesCollection";
	}
	//Accountants
	@RequestMapping("/showAccountants")
	public String showAccountants(ModelMap map){
		List<Accountant> accountants=service.getAllAccountants();
		map.addAttribute("accountants",accountants );
		return "Accountants";
	}
	
	@RequestMapping(value="/insertAccountant",method=RequestMethod.POST)
	public String saveAccountant(@RequestParam("accountantName")String accountantName,
			@RequestParam("accountantEmail")String accountantEmail,
			@RequestParam("accountantGender")String accountantGender,
			@RequestParam("accountantDateOfBirth")String accountantDateOfBirth,
			@RequestParam("accountantAddress")String accountantAddress,
			@RequestParam("accountantPhone")String accountantPhone,
			@RequestParam("accountantPhoto")CommonsMultipartFile cmf ,
			ModelMap map
			)
	{
		if(cmf!=null){
			
			Accountant accountant=new Accountant();
			accountant.setAccountantName(accountantName);
			accountant.setAccountantEmail(accountantEmail);
			accountant.setAccountantGender(accountantGender);
			accountant.setAccountantDateOfBirth(accountantDateOfBirth);
			accountant.setAccountantAddress(accountantAddress);
			accountant.setAccountantPhone(accountantPhone);
			accountant.setAccountantPhotoName(cmf.getOriginalFilename());
			accountant.setAccountantPhoto(cmf.getBytes());
			service.addAccountant(accountant);
			String message="Accountant saved with name:"+accountant.getAccountantName();
			map.addAttribute("msg",message);
			
		}
		
		return "Accountants";
	}
	
	
	
	
	
	
	
	//Balance Fees Report
	@RequestMapping("/showBalanceFeesReport")
	public String showBalanceFeesReport(ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		//List<CollectFee> allPayments=service.getAllPayments();
		return "BalanceFeesReport";
		
		
	}
	
	@RequestMapping("/studentFeesReport")
	public String showstudentFeesReport(
			@RequestParam("clas") String clas,
            @RequestParam("sections") String sections,ModelMap map){
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service1.findAllByclasAndsections(studentDetails);
		List<StudentFeePaid> studentFeePaid = new ArrayList<StudentFeePaid>();
		for (Student stu : students) 
		{
			int studentId=stu.getStudentId();
			long sum=service.getCollectFee(studentId);
			Student stu1=service1.getStudentById(studentId);
			String studentName=stu1.getFsnm();	
			int admissionNumber=stu1.getStudentId();
			String rollNumber=stu1.getRlnm();	
			String fatherName=stu1.getGname();	
			String cls=stu1.getClas();
		    String section=stu1.getSections();
		    long totalFee=service.getsumofAllFeesAssignedToStudent(studentId, cls, section);
			long paidFees=sum;	
			StudentFeePaid studentFeePaid1=new StudentFeePaid();
			studentFeePaid1.setAdmissionNumber(admissionNumber);
			studentFeePaid1.setFatherName(fatherName);
			studentFeePaid1.setRollNumber(rollNumber);
			studentFeePaid1.setStudentName(studentName);
			studentFeePaid1.setPaidFees(paidFees);
			studentFeePaid1.setTotalFees(totalFee);
			studentFeePaid.add(studentFeePaid1);	
		}
		map.addAttribute("studentFeePaid",studentFeePaid);
		return "StudentFeesReport";
	}
	
	
	
	//Fees Statement
	@RequestMapping("/showFeesStatement")
	public String showFeesStatement(ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "FeesStatement";
	}
	
	@RequestMapping("/showFeesStatement1")
	public String showFeesStatement1(@RequestParam("clas") String clas,
            @RequestParam("sections") String sections, ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service1.findAllByclasAndsections(studentDetails);	
		map.addAttribute("students",students);
		String studentClass=clas;
		String studentSection=sections;
		map.addAttribute("studentClass",studentClass);
		map.addAttribute("studentSection",studentSection);
		return "FeeStatement1";
	}
	
	@RequestMapping(value="/studentFeesStatement",method=RequestMethod.POST)
	public String studentFeesStatement(@RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections,
			                    @RequestParam("student1") String student1,ModelMap map){
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		studentDetails.setSname(student1);
		List<Student> student2=service1.findstudentByclasAndsectionAndName(studentDetails);
		Student student=student2.get(0);
		int admissionNumber=student.getStudentId();
		List<AssignFee> assignFee=service.getAllAssignFeesToStudent(admissionNumber);
		map.addAttribute("assignFee",assignFee);
		List<CollectFee> payments=service.getAllStudentPayments(admissionNumber);
		map.addAttribute("payments",payments);
		map.addAttribute("student",student);
		return "FeesStatementByStudent";
	}
	//Search Due Fees
	@RequestMapping("/showSearchDueFees")
	public String showSearchDueFees(ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "SearchDueFees";
	}
	
	@RequestMapping(value="/searchDueFeesByStudent",method=RequestMethod.POST)
	public String SearchDueFeesDetails(@RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections, ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		//List<Student> students=service1.findAllByclasAndsections(studentDetails);	
		//map.addAttribute("students",students);
		return "SearchDueFeesByStudent";
	}
	//Search Fees Payment
	@RequestMapping("/showSearchFeesPayment")
	public String showSearchFeesPayment(ModelMap map){
		return "SearchFeesPayment";
	}
	
	
	
	//Fees Discount
	@RequestMapping("/showFeesDiscount")
	public String showFeesDiscount(ModelMap map){
		List<FeesDiscount> feesDiscounts=service.getAllFeesDiscounts();
		map.addAttribute("feesDiscounts",feesDiscounts );
		return "FeesDiscount";
	}
	
	
	@RequestMapping(value="/insertFeesDiscount",method=RequestMethod.POST)
	public String saveFeesDiscount(@ModelAttribute("feesDiscount")FeesDiscount feesDiscount,ModelMap map){
		int feesDiscountId=service.addFeesDiscount(feesDiscount);
		FeesDiscount feesDiscount1=service.getFeesDiscountById(feesDiscountId);
		String message="FeesDiscount saved with Name:"+feesDiscount1.getDiscountName();
		map.addAttribute("msg",message);
		return "FeesDiscount";
	}

	@RequestMapping("/deleteFeesDiscount")
	public String deleteFeesDiscount(@RequestParam("discountId")int discountId){
		service.deleteFeesDiscount(discountId);
		return "redirect:showFeesDiscount";
	}
	
	@RequestMapping("/showFeesDiscountDataEdit")
	public String showFeesDiscountDataEdit(@RequestParam("discountId")int discountId,ModelMap map){
		FeesDiscount feesDiscount=service.getFeesDiscountById(discountId);
		map.addAttribute("feesDiscount",feesDiscount);
		return "FeesDiscountDataEdit";
	}
	@RequestMapping(value="/editFeesDiscount",method=RequestMethod.POST)
	public String editFeesDiscount(@ModelAttribute("feesDiscount")FeesDiscount feesDiscount){
		service.updateFeesDiscount(feesDiscount);;
		return "redirect:showFeesDiscount";
	}
	 
	
	
	//Fees type
	@RequestMapping("/showFeestype")
	public String showFeestype(ModelMap map){
		List<FeesType> feesTypes=service.getAllFeesTypes();
		map.addAttribute("feesTypes",feesTypes );
		return "Feestype";
	}
	
	@RequestMapping(value="/insertFeesType",method=RequestMethod.POST)
	public String saveFeesType(@ModelAttribute("feesType")FeesType feesType,ModelMap map){
		int feesTypeId=service.addFeesType(feesType);
		FeesType feesType1=service.getFeesTypeById(feesTypeId);
		String message="FeesType saved with Name:"+feesType1.getFeesTypeName();
		map.addAttribute("msg",message);
		return "Feestype";
	}

	@RequestMapping("/deleteFeesType")
	public String deleteFeesType(@RequestParam("feesTypeId")int feesTypeId){
		service.deleteFeesType(feesTypeId);
		return "redirect:showFeestype";
	}
	
	@RequestMapping("/showFeesTypeDataEdit")
	public String showFeesTypeDataEdit(@RequestParam("feesTypeId")int feesTypeId,ModelMap map){
		FeesType feesType=service.getFeesTypeById(feesTypeId);
		map.addAttribute("feesType",feesType);
		return "FeestypeDataEdit";
	}
	@RequestMapping(value="/editFeesType",method=RequestMethod.POST)
	public String editFeesType(@ModelAttribute("feesType")FeesType feesType){
		service.updateFeesType(feesType);;
		return "redirect:showFeestype";
	}
	 
	//Fees Group
	@RequestMapping("/showFeesGroup")
	public String showFeesGroup(ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		return "FeesGroup";
	}
	@RequestMapping(value="/insertFeesGroup",method=RequestMethod.POST)
	public String saveFeesGroup(@ModelAttribute("feesGroup")FeesGroup feesGroup,ModelMap map){
		int feesGroupId=service.addFeesGroup(feesGroup);
		FeesGroup feesGroup1=service.getFeesGroupById(feesGroupId);
		String message="FeesGroup saved with Name:"+feesGroup1.getFeesGroupName();
		map.addAttribute("msg",message);
		return "FeesGroup";
	}

	@RequestMapping("/deleteFeesGroup")
	public String deleteFeesGroup(@RequestParam("feesGroupId")int feesGroupId){
		service.deleteFeesGroup(feesGroupId);
		return "redirect:showFeesGroup";
	}
	
	@RequestMapping("/showEditFeesGroup")
	public String showFeesGroupDataEdit(@RequestParam("feesGroupId")int feesGroupId,ModelMap map){
		FeesGroup feesGroup=service.getFeesGroupById(feesGroupId);
		map.addAttribute("feesGroup",feesGroup);
		return "FeesGroupDataEdit";
	}
	@RequestMapping(value="/editFeesGroup",method=RequestMethod.POST)
	public String editFeesGroup(@ModelAttribute("feesGroup")FeesGroup feesGroup){
		service.updateFeesGroup(feesGroup);;
		return "redirect:showFeesGroup";
	}
	
	//Excel Export
	@RequestMapping("/feesGroupExcelExport")
	public String showfeesGroupExcelData(ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		return "feesGroupExcelView";
	}
	
	//8. PDF Export
	@RequestMapping("/feesGroupPdfExport")
	public String showfeesGroupPdfData(ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		return "feesGroupPdfView";
	}

	//Fees Master
	@RequestMapping("/showFeesMaster")
	public String showFeesMaster(ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		List<FeesType> feesTypes=service.getAllFeesTypes();
		map.addAttribute("feesTypes",feesTypes );
		List<FeesMaster> feesMasters=service. getAllFeesMasters();
		map.addAttribute("feesMasters",feesMasters );
		return "FeesMaster";
	}
	
	@RequestMapping(value="/insertFeesMaster",method=RequestMethod.POST)
	public String saveFeesMaster(@ModelAttribute("feesMaster")FeesMaster feesMaster,ModelMap map){
		int feeMasterId=service.addFeesMaster(feesMaster);
		FeesMaster feesMaster1=service.getFeesMasterById(feeMasterId);
		String message="FeesMaster saved with Id :"+feesMaster1.getFeeMasterId();
		map.addAttribute("msg",message);
		return "FeesMaster";
	}

	@RequestMapping("/deleteFeesMaster")
	public String deleteFeesMaster(@RequestParam("feeMasterId")int feeMasterId){
		service.deleteFeesMaster(feeMasterId);
		return "redirect:showFeesMaster";
	}
	
	@RequestMapping("/showFeesMasterDataEdit")
	public String showFeesMasterDataEdit(@RequestParam("feeMasterId")int feeMasterId,ModelMap map){
		List<FeesGroup> feesGroups=service.getAllFeesGroups();
		map.addAttribute("feesGroups",feesGroups );
		List<FeesType> feesTypes=service.getAllFeesTypes();
		map.addAttribute("feesTypes",feesTypes );
		FeesMaster feesMaster=service.getFeesMasterById(feeMasterId);
		map.addAttribute("feesMaster",feesMaster);
		return "FeesMasterDataEdit";
	}
	@RequestMapping(value="/editFeesMaster",method=RequestMethod.POST)
	public String editFeesMaster(@ModelAttribute("feesMaster")FeesMaster feesMaster){
		service.updateFeesMaster(feesMaster);;
		return "redirect:showFeesMaster";
	}
	
	@RequestMapping("/showFeesMasterAssign")
	public String showStudentReportsPage(@RequestParam("feeMasterId")int feeMasterId,ModelMap map)
	{
		int feeMasterId1=feeMasterId;
		map.addAttribute("feeMasterId1",feeMasterId1);
		List<Category> categories=service1.getAllCategory();	
		map.addAttribute("categories", categories);
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "ShowFeesMasterAssign";
	}
	@RequestMapping(value="/searchStudentsForFeeAssign",method=RequestMethod.POST)
	public String searchStudentsForFeeAssign(
			                    @RequestParam("feeMasterId") String feeMasterId,
			                    @RequestParam("cls") String cls,
					            @RequestParam("section") String section
					                    ,ModelMap map){
		int feeMasterId1=Integer.parseInt(feeMasterId);
		FeesMaster feeMaster=service.getFeesMasterById(feeMasterId1);
		map.addAttribute("feeMaster",feeMaster);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(cls);
		studentDetails.setSections(section);
		List<Student> students=service1.findAllByclasAndsections(studentDetails);
		String classss=cls;
		String sectionnn=section;
		map.addAttribute("classss",classss);
		map.addAttribute("sectionnn",sectionnn);
		map.addAttribute("students",students);
		return "AssignFeeMaster";
	}
	
	@RequestMapping(value="/saveAssignFee",method=RequestMethod.POST)
	public String saveAssignFee(@ModelAttribute("assignFee")AssignFee assignFee,ModelMap map)
	{
		service.saveAssignFee(assignFee);
		String msg="Record Saved successfully";
		map.addAttribute("msg",msg);
		return "AssignFeeMaster";
	}
	//7. Excel Export
		@RequestMapping("/feesMasterExcelExport")
		public String showExcelData(ModelMap map){
			List<FeesMaster> feesMasters=service. getAllFeesMasters();
			map.addAttribute("feesMasters",feesMasters );
			return "feesMasterExcelView";
		}
		
		//8. PDF Export
		@RequestMapping("/feesMasterPdfExport")
		public String showPdfData(ModelMap map){
			List<FeesMaster> feesMasters=service. getAllFeesMasters();
			map.addAttribute("feesMasters",feesMasters );
			return "feesMasterPdfView";
		}
	
	//Collect Fees
	@RequestMapping("/showCollectFees")
	public String showCollectFees(ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		return "CollectFees";
	}
	
	@RequestMapping("/showCollectFees1")
	public String showCollectFees1(@RequestParam("clas") String clas,
            @RequestParam("sections") String sections, ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service1.getAllSections();
		map.addAttribute("Sections",Sections);
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		List<Student> students=service1.findAllByclasAndsections(studentDetails);	
		map.addAttribute("students",students);
		String studentClass=clas;
		String studentSection=sections;
		map.addAttribute("studentClass",studentClass);
		map.addAttribute("studentSection",studentSection);
		return "CollectFee1";
	}
	
	@RequestMapping(value="/showCollectFees2",method=RequestMethod.POST)
	public String showCollectFees2(@RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections,
			                    @RequestParam("student1") String student1,ModelMap map){
		
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setClas(clas);
		studentDetails.setSections(sections);
		studentDetails.setSname(student1);
		List<Student> student2=service1.findstudentByclasAndsectionAndName(studentDetails);
		Student student=student2.get(0);
		map.addAttribute("student",student);
		return "CollectFee2";
	}
	
	@RequestMapping(value="/showCollectFees3",method=RequestMethod.POST)
	public String showCollectFees3(
			                    @RequestParam("clas") String clas,
			                    @RequestParam("sections") String sections,
			                    @RequestParam("studentId") int studentId,
			                    @RequestParam("fsnm") String fsnm,
			                    @RequestParam("gname") String gname,
			                    @RequestParam("dob") String dob,
			                    @RequestParam("mbnm") String mbnm, 
			                    ModelMap map)
	{
		
		//Student student=new Student();
		int admissionNumber=studentId;
		Student student =service1.getStudentById(admissionNumber);
		map.addAttribute("student",student);
		//map.addAttribute("admissionNumber", admissionNumber);
		List<AssignFee> assignFee=service.getAllAssignFeesToStudent(admissionNumber);
		map.addAttribute("assignFee",assignFee);
		List<CollectFee> payments=service.getAllStudentPayments(admissionNumber);
		map.addAttribute("payments",payments);
		return "CollectFee3";
	}
	@RequestMapping("/showCollectFees4")
	public String showCollectFees4(@RequestParam("admissionNumber")int admissionNumber, ModelMap map){
		String admissionNumber1=Integer.toString(admissionNumber);
		map.addAttribute("admissionNumber1",admissionNumber1);
		return "CollectFee4";
	}
	@RequestMapping(value="/saveCollectFees123",method=RequestMethod.POST)
	public String saveCollectFees(
			@RequestParam("admissionNumber") String admissionNumber,
            @RequestParam("date") String date,
            @RequestParam("amount") String amount,
            @RequestParam("discount") String discount,
            @RequestParam("fine") String fine,
            @RequestParam("mode") String mode,
            @RequestParam("note") String note,
            ModelMap map) throws ParseException
	{
		
		
		CollectFee collectFee= new CollectFee();
		collectFee.setAdmissionNumber(Integer.parseInt(admissionNumber));
		collectFee.setAmount(Integer.parseInt(amount));
		collectFee.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		collectFee.setDiscount(Integer.parseInt(discount));
		collectFee.setFine(Integer.parseInt(fine));
		collectFee.setMode(mode);
		collectFee.setNote(note);
	    int paymentId=service.saveCollectFee(collectFee);
		String msg="Fee paid successfully with paymentId :"+paymentId;
		map.addAttribute("msg",msg);
		return "CollectFee4";
	}
	
	@RequestMapping("/searchByPaymentId")
	public String searchByPaymentId(@RequestParam("paymentId")int paymentId, ModelMap map){
		CollectFee collectFee=service.getCollectFeeById(paymentId);
		map.addAttribute("collectFee",collectFee);
		return "SearchByPaymentId";
	}
}
