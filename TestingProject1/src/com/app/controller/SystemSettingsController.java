package com.app.controller;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.FileHeader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Accountant;
import com.app.model.Admin;
import com.app.model.GeneralSetting;
import com.app.model.Language;
import com.app.model.Librarian;
import com.app.model.ParentDetails;
import com.app.model.Session;
import com.app.model.Student;
import com.app.model.Teachers;
import com.app.model.UserLog;
import com.app.service.IAcademicsService;
import com.app.service.IFeesCollectionService;
import com.app.service.ILibraryService;
import com.app.service.IStudentService;
import com.app.service.ISystemSettingsService;
import com.smattme.MysqlExportService;


@Controller
public class SystemSettingsController {
	@Autowired
	private ISystemSettingsService service;
	@Autowired
	private ILibraryService service1;
	@Autowired
	private IFeesCollectionService service2;
	@Autowired
	private IAcademicsService service3;
	@Autowired
	private IStudentService service4;
	@RequestMapping("/showAdmin")
	public String showLogin(ModelMap map){
		List<Admin> admins=service.getAllAdmins();
		map.addAttribute("admins",admins );
		return "Admin";
	}

	@RequestMapping(value="/doLogin",method=RequestMethod.POST)
	public String doLoginCheck(
			@RequestParam("adminEmail")String adminEmail,
			@RequestParam("adminPassword")String adminPassword,
			ModelMap map,
			HttpServletRequest req
			) throws UnknownHostException 
	{

		String page=null;
		//call service method for verification
		Admin admin=service.getAdminByNameAndPwd(adminEmail, adminPassword);
		if(admin==null)
		{ 
			//user not exist
			page="Login";
			map.addAttribute("message", "Username/password is invalid!!");
		}
		else
		{  
			//user exist
			//req.getSession();-creates new session
			//req.getSession(true);-creates new session
			//req.getSession(false); reads existed session
			GeneralSetting generalSetting=service.getGeneralSettingById(111);
			
			long studentsCount=service.getAllStudentsCount();
			long teachersCount=service.getAllTeachersCount();
			HttpSession ses=req.getSession();
			ses.setAttribute("studentsCount", studentsCount);
			ses.setAttribute("teachersCount", teachersCount);
			ses.setAttribute("un", admin.getAdminName());
			ses.setAttribute("schoolName", generalSetting.getSchoolName());
			ses.setAttribute("session", generalSetting.getSession());
			ses.setAttribute("language", generalSetting.getLanguage());

			//For getting current time
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy,HH:mm:ss");
			//For Ip Address
			InetAddress IP = InetAddress.getLocalHost();
			//For Browser Details
			String  browserDetails  =   req.getHeader("User-Agent");

			String  userAgent       =   browserDetails;
			String  user            =   userAgent.toLowerCase();
			String browser = "";
			if (user.contains("msie"))
			{
				String substring=userAgent.substring(userAgent.indexOf("MSIE")).split(";")[0];
				browser=substring.split(" ")[0].replace("MSIE", "IE")+"-"+substring.split(" ")[1];
			} else if (user.contains("safari") && user.contains("version"))
			{
				browser=(userAgent.substring(userAgent.indexOf("Safari")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
			} else if ( user.contains("opr") || user.contains("opera"))
			{
				if(user.contains("opera"))
					browser=(userAgent.substring(userAgent.indexOf("Opera")).split(" ")[0]).split("/")[0]+"-"+(userAgent.substring(userAgent.indexOf("Version")).split(" ")[0]).split("/")[1];
				else if(user.contains("opr"))
					browser=((userAgent.substring(userAgent.indexOf("OPR")).split(" ")[0]).replace("/", "-")).replace("OPR", "Opera");
			} else if (user.contains("chrome"))
			{
				browser=(userAgent.substring(userAgent.indexOf("Chrome")).split(" ")[0]).replace("/", "-");
			} else if ((user.indexOf("mozilla/7.0") > -1) || (user.indexOf("netscape6") != -1)  || (user.indexOf("mozilla/4.7") != -1) || (user.indexOf("mozilla/4.78") != -1) || (user.indexOf("mozilla/4.08") != -1) || (user.indexOf("mozilla/3") != -1) )
			{
				//browser=(userAgent.substring(userAgent.indexOf("MSIE")).split(" ")[0]).replace("/", "-");
				browser = "Netscape-?";

			} else if (user.contains("firefox"))
			{
				browser=(userAgent.substring(userAgent.indexOf("Firefox")).split(" ")[0]).replace("/", "-");
			} else if(user.contains("rv"))
			{
				browser="IE-" + user.substring(user.indexOf("rv") + 3, user.indexOf(")"));
			} else
			{
				browser = "UnKnown, More-Info: "+userAgent;
			}

			UserLog userLog = new UserLog();
			userLog.setRole("Admin");
			userLog.setLoginTime(sdf.format(cal.getTime()));
			userLog.setIpAddress(IP.getHostAddress());
			userLog.setUsers(admin.getAdminName());
			userLog.setUserAgent(browser);
			System.out.println(userLog);
			service.saveUserLog(userLog);

			page="Income";
		}
		//goto page
		return page;
	}

	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/insertAdmin",method=RequestMethod.POST)
	public String saveAdmin(@ModelAttribute("admin")Admin admin,ModelMap map){
		//int adminId=
		service.addAdmin(admin);
		String message="Admin saved with name:"+admin.getAdminName() ;
		map.addAttribute("msg",message);
		return "Admin";
	}


	//Language
	@RequestMapping("/showLanguageList")
	public String showLanguage(ModelMap map){
		List<Language> languages=service.getAllLanguages();
		map.addAttribute("languages",languages );
		return "LanguageList";
	}
	@RequestMapping("/showAddLanguage")
	public String showAddLanguage(){
		return "AddLanguage";
	}
	@RequestMapping(value="/insertLanguage",method=RequestMethod.POST)
	public String saveLanguage(@ModelAttribute("language")Language language,ModelMap map){
		//int languageId=
		service.addLanguage(language);
		String message="Language saved " ;
		map.addAttribute("msg",message);
		return "AddLanguage";
	}
	//Session
	@RequestMapping("/showSession")
	public String showSession(ModelMap map){
		List<Session> sessions=service.getAllSessions();
		map.addAttribute("sessions",sessions );
		return "AddSession";
	}

	@RequestMapping(value="/insertSession",method=RequestMethod.POST)
	public String saveSession(@ModelAttribute("session")Session session,ModelMap map){
		int sessionId=service.addSession(session);
		Session session1=service.getSessionById(sessionId);
		String message="Session saved with name:"+session1.getSessionTimePediod() ;
		map.addAttribute("msg",message);
		return "AddSession";
	}

	@RequestMapping("/deleteSession")
	public String deleteSession(@RequestParam("sessionId")int sessionId){
		service.deleteSession(sessionId);;
		return "redirect:showSession";
	}

	@RequestMapping("/showSessionDataEdit")
	public String showSessionEdit(@RequestParam("sessionId")int sessionId,ModelMap map){
		Session session=service.getSessionById(sessionId);
		map.addAttribute("session",session);
		return "SessionDataEdit";
	}

	@RequestMapping(value="/updateSession",method=RequestMethod.POST)
	public String editSession(@ModelAttribute("session")Session session){
		service.updateSession(session);
		return "redirect:showSession";
	}

	@RequestMapping("/showGeneralSetting")
	public String showGeneralSetting(ModelMap map){
		GeneralSetting generalSetting=service.getGeneralSettingById(111);
		map.addAttribute("generalSetting",generalSetting);
		return "GeneralSettings";
	}

	@RequestMapping("/showupdateGeneralSettings")
	public String showGeneralSetting(@RequestParam("generalSettingId")int generalSettingId,ModelMap map){
		GeneralSetting generalSetting=service.getGeneralSettingById(generalSettingId);
		map.addAttribute("generalSetting",generalSetting);
		List<Session> sessions=service.getAllSessions();
		map.addAttribute("sessions",sessions );
		List<Language> languages=service.getAllLanguages();
		map.addAttribute("languages",languages );
		return "EditGeneralSettings";
	}

	@RequestMapping(value="/updateGeneralSetting",method=RequestMethod.POST)
	public String editSession(@ModelAttribute("generalSetting")GeneralSetting generalSetting ,ModelMap map,HttpServletRequest req){
		HttpSession ses=req.getSession();
		
		service.updateGeneralSetting(generalSetting);
		return "redirect:showGeneralSetting";
	}

	//Users
	@RequestMapping("/showUsers")
	public String showUsers(ModelMap map){
		return "Users";
	}

	@RequestMapping("/showAllAccountants")
	public String showAccountants(ModelMap map){
		List<Accountant> accountants=service2.getAllAccountants();
		map.addAttribute("accountants",accountants );
		return "AllAccountants";
	}
	@RequestMapping("/showAllStudents")
	public String showStudents(ModelMap map){
		List<Student> stus=service4.getAllStudents();
		map.addAttribute("Students",stus);
		return "AllStudents";
	}
	@RequestMapping("/showAllParents")
	public String showParents(ModelMap map){
		List<ParentDetails> pds=service4.getAllParentDetails();
		map.addAttribute("ParentDetails",pds);
		return "AllParents";
	}

	@RequestMapping("/showAllTeachers")
	public String showTeachers(ModelMap map){
		List<Teachers> t=service3.getAllTeachers();
		map.addAttribute("Teachers",t);
		return "AllTeachers";
	}

	@RequestMapping("/showAllLibrarians")
	public String showLibrarians(ModelMap map){
		List<Librarian> librarians=service1.getAllLibrarians();
		map.addAttribute("librarians",librarians );
		return "AllLibrarians";
	}

	@RequestMapping("/showAllUSerLogs")
	public String showAllUSerLogs(ModelMap map){
		List<UserLog> userLogs=service.getAllUserLogs();
		map.addAttribute("userLogs",userLogs );
		return "UserLog";
	}
	@RequestMapping("/showDbBackUp")
	public String showDbBackUp(ModelMap map){
		return "DbBackUp";
	}
	@RequestMapping(value="/backUpDB")
	public String backUpDB(
			ModelMap map,
			HttpServletRequest req) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException, ZipException 

	{
		Properties properties = new Properties();
		properties.setProperty(MysqlExportService.DB_NAME, "dbtesting");
		properties.setProperty(MysqlExportService.DB_USERNAME, "root");
		properties.setProperty(MysqlExportService.DB_PASSWORD, "root");
		
		properties.setProperty(MysqlExportService.TEMP_DIR, new File("E:\\TECHSTEEDS").getPath());
		MysqlExportService mysqlExportService = new MysqlExportService(properties);
		properties.setProperty(MysqlExportService.PRESERVE_GENERATED_ZIP, "true");
		
		mysqlExportService.export();
		File file = mysqlExportService.getGeneratedZipFile();
		
		String file1=file.toString();
	    String file2=file1.replace("zip","sql");
	    String DestinationFolderPath="E:\\TECHSTEEDS";
	
            ZipFile zipFile = new ZipFile(file);
            List fileHeaders = zipFile.getFileHeaders();
            for(int i=0;i<fileHeaders.size();i++) {
                FileHeader  fileHeader=(FileHeader) fileHeaders.get(i);
                String fileName = fileHeader.getFileName();
                if (fileName.contains("\\")) {
                    fileName=fileName.replace("\\","\\\\");
                    String[] Folders=fileName.split("\\\\");
                    StringBuilder newFilepath=new StringBuilder();
                    newFilepath.append(DestinationFolderPath);
                    for (int j=0;j<Folders.length-1;j++){
                        newFilepath.append(File.separator);
                        newFilepath.append(Folders[j]);
                    }
                    zipFile.extractFile(fileHeader, newFilepath.toString(),null,Folders[Folders.length-1]);
            
                }else {
                    zipFile.extractFile(fileHeader,DestinationFolderPath);
                }
            }
          File file3=new File(file2);
         // CommonsMultipartFile cmf=;
		return "DbBackUp";

	}
}











