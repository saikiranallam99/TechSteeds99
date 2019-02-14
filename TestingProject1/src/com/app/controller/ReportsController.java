package com.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Category;
import com.app.model.Clas;
import com.app.model.Expenses;
import com.app.model.Income;
import com.app.model.SearchByDate;
import com.app.model.Sections;
import com.app.model.Student;

import com.app.model.StudentReport;
import com.app.service.IExpensesService;
import com.app.service.IFeesCollectionService;
import com.app.service.IIncomeService;
import com.app.service.IStudentService;

@Controller
public class ReportsController 
{
	@Autowired
	private IFeesCollectionService service1;
	@Autowired
	private IExpensesService service2;
	@Autowired
	private IIncomeService service3;
	@Autowired
	private IStudentService service4;
	@RequestMapping("/showsearchTransactionsByDate")
	public String showTransactionsByDatePage()
	{
		return "TransactionReports";
	}
	
	@RequestMapping(value="/searchTransactionsByDate",method=RequestMethod.POST)
	public String searchExpensesByDate(@RequestParam("dateFrom")String dateFrom,
			@RequestParam("dateTo")String dateTo,ModelMap map) throws ParseException
	{
		SearchByDate searchByDate=new SearchByDate();
		searchByDate.setDateFrom(new SimpleDateFormat("dd/MM/yyyy").parse(dateFrom));
	
		searchByDate.setDateTo(new SimpleDateFormat("dd/MM/yyyy").parse(dateTo));
		
		
		List<Expenses> expenses1=service2.findAllByExpensesDatesBetween(searchByDate);
		map.addAttribute("expenses1",expenses1);
		
		List<Income> income1=service3.findAllByIncomeDatesBetweenDates(searchByDate);
		map.addAttribute("income1",income1);
		map.addAttribute("searchByDate",searchByDate);
		return "TransactionReportsByDate";
	}
	
	
	@RequestMapping("/showStudentReports")
	public String showStudentReportsPage(ModelMap map)
	{
		List<Category> categories=service4.getAllCategory();	
		map.addAttribute("categories", categories);
		List<Clas> Clas=service4.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Sections> Sections=service4.getAllSections();
		map.addAttribute("Sections",Sections);
		return "ShowStudentReport";
	}
	
	@RequestMapping(value="/searchStudentDetails",method=RequestMethod.POST)
	public String searchStudentDetails(@RequestParam("cls") String cls,
			                    @RequestParam("section") String section,
			                    @RequestParam("category") String category,
			                    @RequestParam("gender") String gender,
			                    @RequestParam("rte") String rte,ModelMap map){
		
		
		StudentReport studentReport=new StudentReport();
		studentReport.setCls(cls);;
		studentReport.setSection(section);;
		studentReport.setGender(gender);
		studentReport.setCategory(category);
		studentReport.setRte(rte);
		List<Student> students=service4.findAllstudents(studentReport);	
		map.addAttribute("students",students);
		return "StudentReport";
	}
	
}
