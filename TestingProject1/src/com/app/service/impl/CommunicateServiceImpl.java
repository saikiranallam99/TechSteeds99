package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ICommunicateDao;
import com.app.model.Notice;
import com.app.service.ICommunicateService;
@Service
public class CommunicateServiceImpl implements ICommunicateService 
{
	@Autowired
	private ICommunicateDao dao;
public List<String> getAllStudentEmails(){
	return dao.getAllStudentEmails();
}

public List<String> getAllTeacherEmails() {
	
	return dao.getAllTeacherEmails();
}

public List<String> getAllGuardiansEmails() {
	
	return dao.getAllGuardiansEmails();
}

public List<String> getAllLibrariansEmails() {

	return dao.getAllLibrariansEmails();
}

public List<String> getAllAccountantsEmails() {
	
	return dao.getAllAccountantsEmails();
}

public int addNotice(Notice notice) {
	
	return dao.addNotice(notice);
}

public Notice getNoticeById(int noticeId) {
	
	return dao.getNoticeById(noticeId);
}

public List<Notice> getAllNotices() {
	
	return dao.getAllNotices();
}

public void updateNotice(Notice notice) {
	
	dao.updateNotice(notice);
}

public void deleteNotice(int noticeId) {
	
	dao.deleteNotice(noticeId);
}
}
