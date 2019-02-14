package com.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Notice;
import com.app.model.SendMail;
import com.app.service.ICommunicateService;
import com.app.util.CommonUtil;



@Controller
public class CommunicateController
{
	@Autowired
	private ICommunicateService service;
	@Autowired
	private CommonUtil commonUtil;
	@RequestMapping("/showMailSender")
	public String showMailSender()
	{
		return "SendEmail";
	}

	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public String sendEmail(@RequestParam("mailTitle")String mailTitle,
			@RequestParam("mailMessage")String mailMessage,
			@RequestParam("mailNoticeDate")String mailNoticeDate,
			@RequestParam("mailPublishOn")String mailPublishOn,
			@RequestParam("mailSendTo")String mailSendTo,
			@RequestParam("attachfile")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
		SendMail sendMail=new SendMail();
		sendMail.setMailTitle(mailTitle);
		sendMail.setMailMessage(mailMessage);
		sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
		sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
		sendMail.setMailSendTo(mailSendTo);
		sendMail.setFileName(cmf.getOriginalFilename());
		sendMail.setAttachfile(cmf.getBytes());
		System.out.println("hello");
		boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
		//message to UI
		String message="Email Sent";
		if(flag) message+=", successfully.";
		else message+=", email sending failed!";

		map.addAttribute("message",message);

		return "SendEmail";
	}

	@RequestMapping("/showmultipleMailSender")
	public String showmultipleMailSender(){
		return "SendEmailToMultiple";
	}


	@RequestMapping(value="/sendEmailToMultiple",method=RequestMethod.POST)
	public String sendEmailToMultiple(@RequestParam("mailTitle")String mailTitle,
			@RequestParam("mailMessage")String mailMessage,
			@RequestParam("mailNoticeDate")String mailNoticeDate,
			@RequestParam("mailPublishOn")String mailPublishOn,
			@RequestParam("mailSendTo")String mailSendTo,
			@RequestParam("attachfile")CommonsMultipartFile cmf ,ModelMap map) throws ParseException{
		String[] elements = mailSendTo.split(",");
		List<String> fixedLenghtList = Arrays.asList(elements);

		if(fixedLenghtList.contains("Student"))
		{
			List<String> studentEmails=service.getAllStudentEmails();
			for (String each : studentEmails) 
			{
				System.out.println(each);
				SendMail sendMail=new SendMail();
				sendMail.setMailTitle(mailTitle);
				sendMail.setMailMessage(mailMessage);
				sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
				sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
				sendMail.setMailSendTo(each);
				sendMail.setFileName(cmf.getOriginalFilename());
				sendMail.setAttachfile(cmf.getBytes());
				boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
				System.out.println("mail sent");
				//message to UI
				String message="Email Sent";
				if(flag) message+=", successfully.";
				else message+=", email sending failed!";

				map.addAttribute("message",message);
			}
		}
		if(fixedLenghtList.contains("Teacher"))
		{
			List<String> teacherEmails=service.getAllTeacherEmails();
			
			for (String each : teacherEmails) 
			{
			System.out.println(each);
			SendMail sendMail=new SendMail();
			sendMail.setMailTitle(mailTitle);
			sendMail.setMailMessage(mailMessage);
			sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
			sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
			sendMail.setMailSendTo(each);
			sendMail.setFileName(cmf.getOriginalFilename());
			sendMail.setAttachfile(cmf.getBytes());
			System.out.println("hello");
			boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
			System.out.println("mail sent");
			//message to UI
			String message="Email Sent";
			if(flag) message+=", successfully.";
			else message+=", email sending failed!";

			map.addAttribute("message",message);
			}
		}
		if(fixedLenghtList.contains("Guardians"))
		{
			List<String> guardianEmails=service.getAllGuardiansEmails();
			
			for (String each : guardianEmails) 
			{
			System.out.println(each);
			SendMail sendMail=new SendMail();
			sendMail.setMailTitle(mailTitle);
			sendMail.setMailMessage(mailMessage);
			sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
			sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
			sendMail.setMailSendTo(each);
			sendMail.setFileName(cmf.getOriginalFilename());
			sendMail.setAttachfile(cmf.getBytes());
			System.out.println("hello");
			boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
			System.out.println("mail sent");
			//message to UI
			String message="Email Sent";
			if(flag) message+=", successfully.";
			else message+=", email sending failed!";

			map.addAttribute("message",message);
			}
		}
		if(fixedLenghtList.contains("Accountants"))
		{
			List<String> accountantsEmails=service.getAllAccountantsEmails();
			
			for (String each : accountantsEmails) 
			{
			System.out.println(each);
			SendMail sendMail=new SendMail();
			sendMail.setMailTitle(mailTitle);
			sendMail.setMailMessage(mailMessage);
			sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
			sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
			sendMail.setMailSendTo(each);
			sendMail.setFileName(cmf.getOriginalFilename());
			sendMail.setAttachfile(cmf.getBytes());
	
			boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
			System.out.println("mail sent");
			//message to UI
			String message="Email Sent";
			if(flag) message+=", successfully.";
			else message+=", email sending failed!";

			map.addAttribute("message",message);
			}
		}
		if(fixedLenghtList.contains("Librarians"))
		{
			List<String> librarianEmails=service.getAllLibrariansEmails();
			
			for (String each : librarianEmails) 
			{
			System.out.println(each);
			SendMail sendMail=new SendMail();
			sendMail.setMailTitle(mailTitle);
			sendMail.setMailMessage(mailMessage);
			sendMail.setMailNoticeDate(new SimpleDateFormat("dd/MM/yyyy").parse(mailNoticeDate));
			sendMail.setMailPublishOn(new SimpleDateFormat("dd/MM/yyyy").parse(mailPublishOn));
			sendMail.setMailSendTo(each);
			sendMail.setFileName(cmf.getOriginalFilename());
			sendMail.setAttachfile(cmf.getBytes());
			
			boolean flag=commonUtil.sendEmail(sendMail.getMailSendTo(), sendMail.getMailTitle(), sendMail.getMailMessage(),cmf);
			System.out.println("mail sent");
			//message to UI
			String message="Email Sent";
			if(flag) message+=", successfully.";
			else message+=", email sending failed!";

			map.addAttribute("message",message);
			}
		}
		return "SendEmailToMultiple";
	}
	
	@RequestMapping("/showNoticeBoard")
	public String showNoticeBoard(ModelMap map)
	{
		List<Notice> notices=service.getAllNotices();
		map.addAttribute("notices",notices );
		return "ShowNoticeBoard";
	}
	
	@RequestMapping("/postNewMessage")
	public String postNewMessage()
	{
		return "PostNewMessage";
	}
	
	@RequestMapping(value="/sendMessageToNoticeBoard",method=RequestMethod.POST)
	public String saveNoticeBoard(@ModelAttribute("notice")Notice notice,ModelMap map){
		int noticeId=service.addNotice(notice);
		//Notice notice1=
				service.getNoticeById(noticeId);
		String message="message sent" ;
		map.addAttribute("msg",message);
		return "PostNewMessage";
	}

	@RequestMapping("/deleteNotice")
	public String deleteNoticeBoard(@RequestParam("noticeId")int noticeId){
		service.deleteNotice(noticeId);;
		return "redirect:showNoticeBoard";
	}

	@RequestMapping("/showEditNotice")
	public String showNoticeBoardEdit(@RequestParam("noticeId")int noticeId,ModelMap map){
		Notice notice=service.getNoticeById(noticeId);
		map.addAttribute("notice",notice);
		return "EditPostMessage";
	}

	@RequestMapping(value="/sendEditedMessageToNoticeBoard",method=RequestMethod.POST)
	public String editNoticeBoard(@ModelAttribute("notice")Notice notice){
		service.updateNotice(notice);
		return "redirect:showNoticeBoard";
	}
	
}
