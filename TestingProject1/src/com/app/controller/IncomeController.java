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
import com.app.model.Income;
import com.app.model.IncomeHead;
import com.app.model.SearchByDate;
import com.app.service.IIncomeService;



@Controller
public class IncomeController {
	@Autowired
	private IIncomeService service;

	

	
	//Select Criteria
	@RequestMapping("/showSelectCriteria")
	public String showSelectCriteriaPage(){
		return "SelectCriteria";
	}
	
	//Income Head
	
	
	//ExpensesHead
	@RequestMapping("/showIncomeHead")
	public String showIncomeHeadPage(ModelMap map){
		List<IncomeHead> incomeHeads=service.getAllIncomeHeads();
		map.addAttribute("incomeHeads",incomeHeads );
		
		return "IncomeHead";
	}

		@RequestMapping(value="/insertIncomeHead",method=RequestMethod.POST)
		public String saveIncomeHead(@ModelAttribute("incomeHead")IncomeHead incomeHead,ModelMap map){
			int incomeHeadId=service.addIncomeHead(incomeHead);
			IncomeHead incomeHead1=service.getIncomeHeadById(incomeHeadId);
			String message="IncomeHead saved with name:"+incomeHead1.getIncomeHeadName() ;
			map.addAttribute("msg",message);
			return "IncomeHead";
		}

		@RequestMapping("/deleteIncomeHead")
		public String deleteIncomeHead(@RequestParam("incomeHeadId")int incomeHeadId){
			service.deleteIncomeHead(incomeHeadId);;
			return "redirect:showIncomeHead";
		}

		@RequestMapping("/showEditIncomeHead")
		public String showIncomeHeadEdit(@RequestParam("incomeHeadId")int incomeHeadId,ModelMap map){
			IncomeHead incomeHead=service.getIncomeHeadById(incomeHeadId);
			map.addAttribute("incomeHead",incomeHead);
			return "IncomeHeadDataEdit";
		}

		@RequestMapping(value="/editIncomeHead",method=RequestMethod.POST)
		public String editIncomeHead(@ModelAttribute("incomeHead")IncomeHead incomeHead){
			service.updateIncomeHead(incomeHead);;
			return "redirect:showIncomeHead";
		}
		//Add Income
		@RequestMapping("/showAddIncome")
		public String showAddIncome(ModelMap map){
			List<IncomeHead> incomeHeads=service.getAllIncomeHeads();
			map.addAttribute("incomeHeads",incomeHeads );
			List<Income> income=service.getAllIncome();
			map.addAttribute("income",income );
			return "AddIncome";
		}

		
		
		@RequestMapping(value="/insertIncome",method=RequestMethod.POST)
		public String saveIncome(
				@RequestParam("incomeHead")String incomeHead,
				@RequestParam("incomeName")String incomeName,
				@RequestParam("date")String date,
				@RequestParam("amount")int amount,
				@RequestParam("description")String description,
				@RequestParam("incomeDocument")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
			
	        
			Income income = new Income();
			income.setIncomeHead(incomeHead);
			income.setIncomeName(incomeName);
			income.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
			income.setAmount(amount);
			income.setDescription(description);
			income.setIncomeDocumentName(cmf.getOriginalFilename());
			income.setIncomeDocument(cmf.getBytes());
			service.addIncome(income);
			String message="Income saved with name:"+income.getIncomeName() ;
			map.addAttribute("msg",message);
			return "redirect:showAddIncome";
		}

		@RequestMapping("/deleteIncome")
		public String deleteIncome(@RequestParam("incomeId")int incomeId){
			service.deleteIncome(incomeId);;
			return "redirect:showAddIncome";
		}

		@RequestMapping("/showEditIncome")
		public String showIncomeEdit(@RequestParam("incomeId")int incomeId,ModelMap map){
			List<IncomeHead> incomeHeads=service.getAllIncomeHeads();
			map.addAttribute("incomeHeads",incomeHeads );
			Income income=service.getIncomeById(incomeId);
			map.addAttribute("income",income);
			return "IncomeDataEdit";
		}

		@RequestMapping(value="/editIncome",method=RequestMethod.POST)
		public String editIncome(@RequestParam("incomeId")int incomeId,
				@RequestParam("incomeHead")String incomeHead,
				@RequestParam("incomeName")String incomeName,
				@RequestParam("date")String date,
				@RequestParam("amount")int amount,
				@RequestParam("description")String description,
				@RequestParam("incomeDocument")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
			
	        
			Income income = new Income();
			income.setIncomeId(incomeId);
			income.setIncomeHead(incomeHead);
			income.setIncomeName(incomeName);
			income.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
			income.setAmount(amount);
			income.setDescription(description);
			income.setIncomeDocumentName(cmf.getOriginalFilename());
			income.setIncomeDocument(cmf.getBytes());
			service.updateIncome(income);
			return "redirect:showAddIncome";
		}
		
		@RequestMapping("/showSearchIncome")
		public String showSearchIncome(){
			return "SelectCriteria";
		}
		
		@RequestMapping(value="/searchIncomeByDate",method=RequestMethod.POST)
		public String searchIncomeByDate(@RequestParam("dateFrom")String dateFrom,
				@RequestParam("dateTo")String dateTo,ModelMap map) throws ParseException
		{
			SearchByDate searchByDate=new SearchByDate();
			searchByDate.setDateFrom(new SimpleDateFormat("dd/MM/yyyy").parse(dateFrom));
		
			searchByDate.setDateTo(new SimpleDateFormat("dd/MM/yyyy").parse(dateTo));
			List<Income> income1=service.findAllByIncomeDatesBetweenDates(searchByDate);
			map.addAttribute("income1",income1);
			return "IncomeByDate";
		}
		//3. Download Doc
				@RequestMapping("/downloadIncome")
				public void downloadIncome(@RequestParam("incomeId")int incomeId,HttpServletResponse res	)
				{
					//1. goto DB , get model class obj
					Income income=service.getIncomeById(incomeId);
					//2. add Header in HttpServletRes
					res.addHeader("Content-Disposition", "attachment;filename="+income.getIncomeDocumentName());
					
					try {
						//3. copy data to HttpServResp Body (OS)
						FileCopyUtils.copy(income.getIncomeDocument(), res.getOutputStream());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
}
