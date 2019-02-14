package com.app.dao;

import java.util.List;

import com.app.model.Content;

public interface IDownloadCenterDao {
	public int  addContent(Content content);
	public Content  getContentById(int contentId);
	public List<Content> getAllContents();
	public void deleteContent(int contentId);
	
	List<Content> findAllAssignments();
	
	List<Content> findAllStudyMaterials();
	
	List<Content> findAllSyllabuss();
	
	List<Content> findAllOtherDownloads();
}
