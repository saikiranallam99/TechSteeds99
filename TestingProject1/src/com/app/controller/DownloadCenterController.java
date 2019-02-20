package com.app.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Clas;
import com.app.model.Content;
import com.app.service.IDownloadCenterService;
import com.app.service.IStudentService;

//Download center controller

@Controller
public class DownloadCenterController {
	@Autowired
	private IDownloadCenterService service;
	@Autowired
	private IStudentService service1;
	//DownloadCenter
	@RequestMapping("/showDownloadCenter")
	public String showDownloadCenterPage(){
		return "DownloadCenter";
	}
	
	
	
	//UploadContent
	@RequestMapping("/showUploadContent")
	public String showUploadContentPage(ModelMap map){
		List<Clas> Clas=service1.getAllClas();
		map.addAttribute("Clas",Clas);
		List<Content> contents=service.getAllContents();
		map.addAttribute("contents",contents );
		return "UploadContent";
	}
	
	//HELLO 
	@RequestMapping(value="/uploadContent",method=RequestMethod.POST)
	public String saveIncome(
			@RequestParam("contentTitle")String contentTitle,
			@RequestParam("contentType")String contentType,
			@RequestParam("availabileFor")String availabileFor,
			@RequestParam("date")String date,
			@RequestParam("description")String description,
			@RequestParam("contentFile")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
		
        
		Content content = new Content();
		content.setContentTitle(contentTitle);;
		content.setContentType(contentType);;
		content.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(date));
		content.setAvailabileFor(availabileFor);;
		content.setDescription(description);
		content.setContentFileName(cmf.getOriginalFilename());
		content.setContentFile(cmf.getBytes());
		service.addContent(content);
		String message="Content saved with title:"+content.getContentTitle() ;
		map.addAttribute("msg",message);
		return "redirect:showUploadContent";
	}
	
	@RequestMapping("/deleteContent")
	public String deleteContent(@RequestParam("contentId")int contentId){
		service.deleteContent(contentId);;
		return "redirect:showUploadContent";
	}
	
	//Assignment
	@RequestMapping("/showAssignment")
	public String showAssignmentPage(ModelMap map){
		List<Content> contents=service.findAllAssignments();
		map.addAttribute("contents",contents );
		return "Assignment";
	}
	//StudyMaterial
	@RequestMapping("/showStudyMaterial")
	public String showStudyMaterialPage(ModelMap map){
		List<Content> contents=service.findAllStudyMaterials();
		map.addAttribute("contents",contents );
		return "StudyMaterial";
	}
	//Syllabus
	@RequestMapping("/showSyllabus")
	public String showSyllabusPage(ModelMap map){
		List<Content> contents=service.findAllSyllabuss();
		map.addAttribute("contents",contents );
		return "Syllabus";
	}
	//OtherDownload
	@RequestMapping("/showOtherDownload")
	public String showOtherDownloadPage(ModelMap map){
		List<Content> contents=service.findAllOtherDownloads();
		map.addAttribute("contents",contents );
		return "OtherDownload";
	}
	

	//3. Download Doc
	@RequestMapping("/downloadContent")
	public void downloadDocument(@RequestParam("contentId")int contentId,HttpServletResponse res	)
	{
		//1. goto DB , get model class obj
		Content content =service.getContentById(contentId);
		//2. add Header in HttpServletRes
		res.addHeader("Content-Disposition", "attachment;filename="+content.getContentFileName());
		
		try {
			//3. copy data to HttpServResp Body (OS)
			FileCopyUtils.copy(content.getContentFile(), res.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
