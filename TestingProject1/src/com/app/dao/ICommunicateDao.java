package com.app.dao;

import java.util.List;

import com.app.model.Notice;

public interface ICommunicateDao {
	public List<String> getAllStudentEmails();
	public List<String> getAllTeacherEmails();
	public List<String> getAllGuardiansEmails();
	public List<String> getAllLibrariansEmails();
	public List<String> getAllAccountantsEmails();
	
	public int  addNotice(Notice notice);
	public Notice  getNoticeById(int noticeId);
	public List<Notice> getAllNotices();
	public void updateNotice(Notice notice);
	public void deleteNotice(int noticeId);
}
