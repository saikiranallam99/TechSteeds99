package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ISystemSettingsDao;
import com.app.model.Admin;
import com.app.model.GeneralSetting;
import com.app.model.Language;
import com.app.model.Session;
import com.app.model.UserLog;
import com.app.service.ISystemSettingsService;


@Service
public class SystemSettingsServiceImpl implements ISystemSettingsService{
	@Autowired
	private ISystemSettingsDao dao;
	public String addAdmin(Admin admin) {
	
		return dao.addAdmin(admin);
	}

	public Admin  getAdminByEmail(String adminEmail) {
		
		return dao.getAdminByEmail(adminEmail);
	}

	public List<Admin> getAllAdmins() {
		
		return dao.getAllAdmins();
	}

	public Admin getAdminByNameAndPwd(String adminEmail, String adminPassword) {
		
		return dao.getAdminByNameAndPwd(adminEmail, adminPassword);
	}

	public int addSession(Session session) {
		
		return dao.addSession(session);
	}

	public Session getSessionById(int sessionId) {
		
		return dao.getSessionById(sessionId);
	}

	public List<Session> getAllSessions() {
		
		return dao.getAllSessions();
	}

	public void updateSession(Session session) {
	
		dao.updateSession(session);
	}

	public void deleteSession(int sessionId) {
		
		dao.deleteSession(sessionId);
		
	}

	public int addLanguage(Language language) {
		
		return dao.addLanguage(language);
	}

	public List<Language> getAllLanguages() {
		
		return dao.getAllLanguages();
	}

	public GeneralSetting getGeneralSettingById(int generalSettingId) {
	
		return dao.getGeneralSettingById(generalSettingId);
	}

	public void updateGeneralSetting(GeneralSetting generalSetting) {
		
		dao.updateGeneralSetting(generalSetting);
	}

	public int saveUserLog(UserLog userLog) {
		
		return dao.saveUserLog(userLog);
	}

	public List<UserLog> getAllUserLogs()
	{
		return dao.getAllUserLogs(); 
	}

	public long getAllStudentsCount() {
		
		return dao.getAllStudentsCount();
	}

	public long getAllTeachersCount() {
		
		return dao.getAllTeachersCount();
	}
}
