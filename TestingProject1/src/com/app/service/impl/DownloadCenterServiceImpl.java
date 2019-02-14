package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDownloadCenterDao;
import com.app.model.Content;
import com.app.service.IDownloadCenterService;
@Service
public class DownloadCenterServiceImpl implements IDownloadCenterService {
	@Autowired
	private IDownloadCenterDao dao;
	public int addContent(Content content) {
		
		return dao.addContent(content);
	}

	public Content getContentById(int contentId) {
		
		return dao.getContentById(contentId);
	}

	public List<Content> getAllContents() {
		
		return dao.getAllContents();
	}

	public void deleteContent(int contentId) {
		dao.deleteContent(contentId);
		
	}

	public List<Content> findAllAssignments() {
	
		return dao.findAllAssignments();
	}

	public List<Content> findAllStudyMaterials() {
		
		return dao.findAllStudyMaterials();
	}

	public List<Content> findAllSyllabuss() {
	
		return dao.findAllSyllabuss();
	}

	public List<Content> findAllOtherDownloads() {
	
		return dao.findAllOtherDownloads();
	}

}
