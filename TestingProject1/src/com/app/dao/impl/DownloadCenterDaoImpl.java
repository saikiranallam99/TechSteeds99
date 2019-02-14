package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDownloadCenterDao;
import com.app.model.Content;


@Repository
public class DownloadCenterDaoImpl implements IDownloadCenterDao {
	@Autowired
	private HibernateTemplate ht;
	public int addContent(Content content) {
		int contentId=(Integer) ht.save(content);
		return contentId;
	}

	public Content getContentById(int contentId) {
		Content content=ht.get(Content.class, contentId);
		return content;
	}

	public List<Content> getAllContents() {
		
		return ht.loadAll(Content.class);
	}

	public void deleteContent(int contentId) {
		
		ht.delete(new Content(contentId));
	}

	public List<Content> findAllAssignments() {
	String hql="from Content c where c.contentType = 'Assignment' ";
	    @SuppressWarnings("unchecked")
		List<Content> contents=ht.find(hql);
		return contents;
	}

	public List<Content> findAllStudyMaterials() {
		String hql="from Content c where c.contentType = 'StudyMaterial' ";
	    @SuppressWarnings("unchecked")
		List<Content> contents=ht.find(hql);
		return contents;
	}

	public List<Content> findAllSyllabuss() {
		String hql="from Content c where c.contentType = 'Syllabus' ";
	    @SuppressWarnings("unchecked")
		List<Content> contents=ht.find(hql);
		return contents;
	}

	public List<Content> findAllOtherDownloads() {
		String hql="from Content c where c.contentType = 'OtherDownload'";
	    @SuppressWarnings("unchecked")
		List<Content> contents=ht.find(hql);
		return contents;
	}
	
	

}
