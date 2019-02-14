package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	@GeneratedValue
	int languageId;
	String languageName;
	public Language() {
		super();
	}
	public Language(int languageId) {
		super();
		this.languageId = languageId;
	}
	public Language(int languageId, String languageName) {
		super();
		this.languageId = languageId;
		this.languageName = languageName;
	}
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", languageName="
				+ languageName + "]";
	}
	
}
