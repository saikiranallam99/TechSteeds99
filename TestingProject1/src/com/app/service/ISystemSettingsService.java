package com.app.service;

import java.util.List;

import com.app.model.Admin;
import com.app.model.GeneralSetting;
import com.app.model.Language;
import com.app.model.Session;
import com.app.model.UserLog;

public interface ISystemSettingsService {
	//Admin
		public String  addAdmin(Admin admin);
		public Admin  getAdminByEmail(String adminEmail);
		public Admin  getAdminByNameAndPwd(String adminEmail, String adminPassword);
		public List<Admin> getAllAdmins();
		
		
		public int  addSession(Session session);
		public Session  getSessionById(int sessionId);
		public List<Session> getAllSessions();
		public void updateSession(Session session);
		public void deleteSession(int sessionId);
		
		public int  addLanguage(Language language);
		public List<Language> getAllLanguages();
		
		public GeneralSetting  getGeneralSettingById(int generalSettingId);
		public void updateGeneralSetting(GeneralSetting generalSetting);
		
		//UserLog
		public int  saveUserLog(UserLog userLog);
		public List<UserLog> getAllUserLogs();
		
		public long getAllStudentsCount();
		public long getAllTeachersCount();
}
