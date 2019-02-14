package com.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Expenses;
import com.app.model.ExpensesHead;
import com.app.model.SearchByDate;
import com.app.service.IExpensesService;



@Controller
public class ExpensesController 
{
	@Autowired
	private IExpensesService service;

	@RequestMapping("/showExpenses")
	public String showExpensesPage(){
		return "Expenses";
	}
	//ExpensesHead
	@RequestMapping("/showExpensesHead")
	public String showExpensesHead(ModelMap map){
		List<ExpensesHead> expensesHeads=service.getAllExpensesHeads();
		map.addAttribute("expensesHeads",expensesHeads );
		return "ExpensesHead";
	}

	@RequestMapping(value="/insertExpensesHead",method=RequestMethod.POST)
	public String saveExpensesHead(@ModelAttribute("expensesHead")ExpensesHead expensesHead,ModelMap map){
		int expensesHeadId=service.addExpensesHead(expensesHead);
		ExpensesHead expensesHead1=service.getExpensesHeadById(expensesHeadId);
		String message="ExpensesHead saved with name:"+expensesHead1.getExpenseHeadName() ;
		map.addAttribute("msg",message);
		return "ExpensesHead";
	}

	@RequestMapping("/deleteExpensesHead")
	public String deleteExpensesHead(@RequestParam("expensesHeadId")int expensesHeadId){
		service.deleteExpensesHead(expensesHeadId);;
		return "redirect:showExpensesHead";
	}

	@RequestMapping("/showEditExpensesHead")
	public String showExpensesHeadEdit(@RequestParam("expensesHeadId")int expensesHeadId,ModelMap map){
		ExpensesHead expensesHead=service.getExpensesHeadById(expensesHeadId);
		map.addAttribute("expensesHead",expensesHead);
		return "ExpensesHeadDataEdit";
	}

	@RequestMapping(value="/editExpensesHead",method=RequestMethod.POST)
	public String editExpensesHead(@ModelAttribute("expensesHead")ExpensesHead expensesHead){
		service.updateExpensesHead(expensesHead);
		return "redirect:showExpensesHead";
	}
	
	//Expenses
	@RequestMapping("/showAddExpenses")
	public String showAddExpense(ModelMap map){
		List<ExpensesHead> expensesHeads=service.getAllExpensesHeads();
		map.addAttribute("expensesHeads",expensesHeads );
		List<Expenses> expenses=service.getAllExpenses();
		map.addAttribute("expenses",expenses );
		return "AddExpenses";
	}

	
	
	@RequestMapping(value="/insertExpenses",method=RequestMethod.POST)
	public String saveExpenses(
			@RequestParam("expensesHead")String expensesHead,
			@RequestParam("expensesName")String expensesName,
			@RequestParam("date")String date,
			@RequestParam("amount")int amount,
			@RequestParam("description")String description,
			@RequestParam("expensesDocument")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
		
        
		Expenses expenses = new Expenses();
		expenses.setExpensesHead(expensesHead);
		expenses.setExpensesName(expensesName);
		expenses.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		expenses.setAmount(amount);
		expenses.setDescription(description);
		expenses.setExpensesDocumentName(cmf.getOriginalFilename());
		expenses.setExpensesDocument(cmf.getBytes());
		//System.out.println(expenses.getExpensesDocumentName());
		
		//System.out.println(expenses.getExpensesHead());
		
		//int expensesId1=
		int expensesId1=		service.addExpenses(expenses);
				
			Expenses ex=service.getExpensesById(expensesId1);
		//Expenses expenses1=service.getExpensesById(expensesId);
		String message="Expenses saved with name:"+ex.getExpensesName() ;
		map.addAttribute("msg",message);
		return "redirect:showAddExpenses";
	}

	@RequestMapping("/deleteExpenses")
	public String deleteExpenses(@RequestParam("expenseId")int expenseId){
		service.deleteExpenses(expenseId);;
		return "redirect:showAddExpenses";
	}

	@RequestMapping("/showEditExpenses")
	public String showExpensesEdit(@RequestParam("expenseId")int expenseId,ModelMap map){
		List<ExpensesHead> expensesHeads=service.getAllExpensesHeads();
		map.addAttribute("expensesHeads",expensesHeads );
		Expenses expenses=service.getExpensesById(expenseId);
		map.addAttribute("expenses",expenses);
		return "AddExpensesDataEdit";
	}

	@RequestMapping(value="/editExpenses",method=RequestMethod.POST)
	public String editExpenses(@RequestParam("expenseId")int expenseId,
			@RequestParam("expensesHead")String expensesHead,
			@RequestParam("expensesName")String expensesName,
			@RequestParam("date")String date,
			@RequestParam("amount")int amount,
			@RequestParam("description")String description,
			@RequestParam("expensesDocument")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
		
        
		Expenses expenses = new Expenses();
		expenses.setExpenseId(expenseId);
		expenses.setExpensesHead(expensesHead);
		expenses.setExpensesName(expensesName);
		expenses.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		expenses.setAmount(amount);
		expenses.setDescription(description);
		expenses.setExpensesDocumentName(cmf.getOriginalFilename());
		expenses.setExpensesDocument(cmf.getBytes());
		service.updateExpenses(expenses);
		return "redirect:showAddExpenses";
	}
	
	@RequestMapping("/showSearchExpenses")
	public String showSearchExpenses(){
		return "SearchExpenses";
	}
	
	@RequestMapping(value="/searchExpensesByDate",method=RequestMethod.POST)
	public String searchExpensesByDate(@RequestParam("dateFrom")String dateFrom,
			@RequestParam("dateTo")String dateTo,ModelMap map) throws ParseException
	{
		SearchByDate searchByDate=new SearchByDate();
		searchByDate.setDateFrom(new SimpleDateFormat("dd/MM/yyyy").parse(dateFrom));
	
		searchByDate.setDateTo(new SimpleDateFormat("dd/MM/yyyy").parse(dateTo));
		List<Expenses> expenses1=service.findAllByExpensesDatesBetween(searchByDate);
		map.addAttribute("expenses1",expenses1);
		return "ExpensesByDate";
	}
	
	//3. Download Doc
		@RequestMapping("/downloadExpenses")
		public void downloadExpenses(@RequestParam("expenseId")int expenseId,HttpServletResponse res	)
		{
			//1. goto DB , get model class obj
			Expenses expenses1=service.getExpensesById(expenseId);
			//2. add Header in HttpServletRes
			res.addHeader("Content-Disposition", "attachment;filename="+expenses1.getExpensesDocumentName());
			
			try {
				//3. copy data to HttpServResp Body (OS)
				FileCopyUtils.copy(expenses1.getExpensesDocument(), res.getOutputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
