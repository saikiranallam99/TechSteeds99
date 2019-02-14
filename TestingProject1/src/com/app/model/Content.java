package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Content {
	@Id
	@GeneratedValue	
    int contentId;
	String contentTitle;
    String contentType;
    String availabileFor;
    Date date;
    String contentFileName;
	@Lob
	byte[] contentFile;
	String description;
	public Content() {
		super();
	}
	public Content(int contentId) {
		super();
		this.contentId = contentId;
	}
	public Content(int contentId, String contentTitle, String contentType,
			String availabileFor, Date date, String contentFileName,
			byte[] contentFile, String description) {
		super();
		this.contentId = contentId;
		this.contentTitle = contentTitle;
		this.contentType = contentType;
		this.availabileFor = availabileFor;
		this.date = date;
		this.contentFileName = contentFileName;
		this.contentFile = contentFile;
		this.description = description;
	}
	public int getContentId() {
		return contentId;
	}
	public void setContentId(int contentId) {
		this.contentId = contentId;
	}
	public String getContentTitle() {
		return contentTitle;
	}
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getAvailabileFor() {
		return availabileFor;
	}
	public void setAvailabileFor(String availabileFor) {
		this.availabileFor = availabileFor;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContentFileName() {
		return contentFileName;
	}
	public void setContentFileName(String contentFileName) {
		this.contentFileName = contentFileName;
	}
	public byte[] getContentFile() {
		return contentFile;
	}
	public void setContentFile(byte[] contentFile) {
		this.contentFile = contentFile;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Content [contentId=" + contentId + ", contentTitle="
				+ contentTitle + ", contentType=" + contentType
				+ ", availabileFor=" + availabileFor + ", date=" + date
				+ ", contentFileName=" + contentFileName + ", contentFile="
				+ Arrays.toString(contentFile) + ", description=" + description
				+ "]";
	}
	
	
}
