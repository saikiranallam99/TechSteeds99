package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/showLogin")
	public String showLogInPage(){
		return "Login";
	}

	@RequestMapping("/showIncome")
	public String showIncomePage(){
		return "Income";
	}
	@RequestMapping("/showTrail")
	public String showTrailPage(){
		return "Trial";
	}
	@RequestMapping("/homepage")
	public String showHomePage(ModelMap map) 
	{
		return "HomePage";
	}
	//do User Logout 
	@RequestMapping("/userLogout")
	public String doUserLogout(
			HttpServletRequest req,ModelMap map)
	{
		//read current session
		HttpSession ses=req.getSession(false);
		//set username as null in session
		ses.setAttribute("un",null);
		//invalidate session
		ses.invalidate();
		//goto Login Page with Success messgae
		map.addAttribute("message", "Logout successful!!");

		return "Login";
	}

}
