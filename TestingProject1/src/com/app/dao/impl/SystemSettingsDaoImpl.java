package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ISystemSettingsDao;
import com.app.model.Admin;
import com.app.model.GeneralSetting;
import com.app.model.Language;
import com.app.model.Session;
import com.app.model.Student;
import com.app.model.UserLog;


@Repository
public class SystemSettingsDaoImpl implements ISystemSettingsDao {
	@Autowired
	private HibernateTemplate ht;
	public String addAdmin(Admin admin) {
		String adminEmail= (String) ht.save(admin);
		return adminEmail;
	}

	public List<Admin> getAllAdmins() {

		return ht.loadAll(Admin.class);
	}

	public Admin getAdminByEmail(String adminEmail) {
		Admin admin=ht.get(Admin.class, adminEmail);
		return admin;
	}

	public Admin getAdminByNameAndPwd(String adminEmail, String adminPassword) {
		Admin admin=null;
		String hql=" from "+Admin.class.getName()
				+" where adminEmail=?  "
				+" and adminPassword=? ";
		
		@SuppressWarnings("unchecked")
		List<Admin> adminList=ht.find(hql, adminEmail,adminPassword);
		if(adminList != null && !adminList.isEmpty()){
			admin=adminList.get(0);
		}
		return admin;
	}
    //session
	public int addSession(Session session) {
		int sessionId=(Integer) ht.save(session);
		return sessionId;
	}

	public Session getSessionById(int sessionId) {
		Session session=ht.get(Session.class, sessionId);
		return session;
	}

	public List<Session> getAllSessions() {
		return ht.loadAll(Session.class);
	}

	public void updateSession(Session session) {
		ht.update(session);
		
	}

	public void deleteSession(int sessionId) {
		ht.delete(new Session(sessionId));
		
	}
    //language
	public int addLanguage(Language language) {
		int languageId=(Integer) ht.save(language);
		return languageId;
	}

	public List<Language> getAllLanguages() {
		return ht.loadAll(Language.class);
	}

	public GeneralSetting getGeneralSettingById(int generalSettingId) {
		GeneralSetting generalSetting=ht.get(GeneralSetting.class, generalSettingId);
		return generalSetting;
	}

	public void updateGeneralSetting(GeneralSetting generalSetting) {
		ht.update(generalSetting);
		
	}

	public int saveUserLog(UserLog userLog) {
		int userLogId=(Integer) ht.save(userLog);
		return  userLogId;
	}
	
	public List<UserLog> getAllUserLogs() {
		return ht.loadAll(UserLog.class);
	}

	public long getAllStudentsCount() {
		String hql="select count(st.studentId) from Student st";
		List students=ht.find(hql);
	    long studentsCount =(Long) students.get(0);
		return studentsCount;
	}

	public long getAllTeachersCount() {
		String hql="select count(t.teacherId) from Teachers t";
		List teachers=ht.find(hql);
	    long teachersCount = (Long) teachers.get(0);
	    return teachersCount;
	}

}
