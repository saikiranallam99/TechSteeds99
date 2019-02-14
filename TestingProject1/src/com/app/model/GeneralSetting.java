package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GeneralSetting {
	@Id
	@GeneratedValue
	int generalSettingId;
	String schoolName;
	String schoolAddress;
	String schoolPhone;
	String schoolEmail;
	String schoolCode;
	String session;
	String sessionStartMonth;
	String language;
	String languageRTLTextMode;
	String timezone;
	String dateFormat;
	String currency;
	String currencySymbol;
	public GeneralSetting() {
		super();
	}
	public GeneralSetting(int generalSettingId) {
		super();
		this.generalSettingId = generalSettingId;
	}
	public GeneralSetting(int generalSettingId, String schoolName,
			String schoolAddress, String schoolPhone, String schoolEmail,
			String schoolCode, String session, String sessionStartMonth,
			String language, String languageRTLTextMode, String timezone,
			String dateFormat, String currency, String currencySymbol) {
		super();
		this.generalSettingId = generalSettingId;
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolPhone = schoolPhone;
		this.schoolEmail = schoolEmail;
		this.schoolCode = schoolCode;
		this.session = session;
		this.sessionStartMonth = sessionStartMonth;
		this.language = language;
		this.languageRTLTextMode = languageRTLTextMode;
		this.timezone = timezone;
		this.dateFormat = dateFormat;
		this.currency = currency;
		this.currencySymbol = currencySymbol;
	}
	public int getGeneralSettingId() {
		return generalSettingId;
	}
	public void setGeneralSettingId(int generalSettingId) {
		this.generalSettingId = generalSettingId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolPhone() {
		return schoolPhone;
	}
	public void setSchoolPhone(String schoolPhone) {
		this.schoolPhone = schoolPhone;
	}
	public String getSchoolEmail() {
		return schoolEmail;
	}
	public void setSchoolEmail(String schoolEmail) {
		this.schoolEmail = schoolEmail;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getSessionStartMonth() {
		return sessionStartMonth;
	}
	public void setSessionStartMonth(String sessionStartMonth) {
		this.sessionStartMonth = sessionStartMonth;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguageRTLTextMode() {
		return languageRTLTextMode;
	}
	public void setLanguageRTLTextMode(String languageRTLTextMode) {
		this.languageRTLTextMode = languageRTLTextMode;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrencySymbol() {
		return currencySymbol;
	}
	public void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}
	@Override
	public String toString() {
		return "GeneralSetting [generalSettingId=" + generalSettingId
				+ ", schoolName=" + schoolName + ", schoolAddress="
				+ schoolAddress + ", schoolPhone=" + schoolPhone
				+ ", schoolEmail=" + schoolEmail + ", schoolCode=" + schoolCode
				+ ", session=" + session + ", sessionStartMonth="
				+ sessionStartMonth + ", language=" + language
				+ ", languageRTLTextMode=" + languageRTLTextMode
				+ ", timezone=" + timezone + ", dateFormat=" + dateFormat
				+ ", currency=" + currency + ", currencySymbol="
				+ currencySymbol + "]";
	}
	
	
}
