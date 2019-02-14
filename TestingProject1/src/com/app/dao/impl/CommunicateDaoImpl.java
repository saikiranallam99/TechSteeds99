package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ICommunicateDao;
import com.app.model.Notice;

@Repository
public class CommunicateDaoImpl implements ICommunicateDao {
	@Autowired
	private HibernateTemplate ht;
	public List<String> getAllStudentEmails() {
		String hql="select s.email from Student s ";
		@SuppressWarnings("unchecked")
		List<String> studentEmails=ht.find(hql);
		return studentEmails;
	}

	public List<String> getAllTeacherEmails() {
		String hql="select t.email from Teachers t ";
		@SuppressWarnings("unchecked")
		List<String> teachersEmails=ht.find(hql);
		return teachersEmails;
	}

	public List<String> getAllGuardiansEmails() {
		String hql="select s.gemail from Student s ";
		@SuppressWarnings("unchecked")
		List<String> guardianEmails=ht.find(hql);
		return guardianEmails;
	}

	public List<String> getAllLibrariansEmails() {
		String hql="select l.librarianEmail from Librarian l ";
		@SuppressWarnings("unchecked")
		List<String> librarianEmails=ht.find(hql);
		return librarianEmails;
	}

	public List<String> getAllAccountantsEmails() {
		String hql="select a.accountantEmail from Accountant a ";
		@SuppressWarnings("unchecked")
		List<String> accountantEmails=ht.find(hql);
		return accountantEmails;
	}

	public int addNotice(Notice notice) {
		int noticeId=(Integer) ht.save(notice);
		return noticeId;
	}

	public Notice getNoticeById(int noticeId) {
		Notice notice=ht.get(Notice.class, noticeId);
		return notice;
	}

	public List<Notice> getAllNotices() {
		
		return ht.loadAll(Notice.class);
	}

	public void updateNotice(Notice notice) {
		ht.update(notice);
		
	}

	public void deleteNotice(int noticeId) {
		ht.delete(new Notice(noticeId));
		
	}

}
