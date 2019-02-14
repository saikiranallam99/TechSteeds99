package com.app.model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class SendMail {
@Id
@GeneratedValue
int sendMailId;
String  mailTitle;
String  mailMessage;
Date mailNoticeDate;
Date mailPublishOn;
String fileName;
@Lob
byte[] attachfile;
String mailSendTo;
String mailSendFrom;
public SendMail() {
	super();
}
public SendMail(int sendMailId) {
	super();
	this.sendMailId = sendMailId;
}
public SendMail(int sendMailId, String mailTitle, String mailMessage,
		Date mailNoticeDate, Date mailPublishOn, String fileName,
		byte[] attachfile, String mailSendTo, String mailSendFrom) {
	super();
	this.sendMailId = sendMailId;
	this.mailTitle = mailTitle;
	this.mailMessage = mailMessage;
	this.mailNoticeDate = mailNoticeDate;
	this.mailPublishOn = mailPublishOn;
	this.fileName = fileName;
	this.attachfile = attachfile;
	this.mailSendTo = mailSendTo;
	this.mailSendFrom = mailSendFrom;
}
public int getSendMailId() {
	return sendMailId;
}
public void setSendMailId(int sendMailId) {
	this.sendMailId = sendMailId;
}
public String getMailTitle() {
	return mailTitle;
}
public void setMailTitle(String mailTitle) {
	this.mailTitle = mailTitle;
}
public String getMailMessage() {
	return mailMessage;
}
public void setMailMessage(String mailMessage) {
	this.mailMessage = mailMessage;
}
public Date getMailNoticeDate() {
	return mailNoticeDate;
}
public void setMailNoticeDate(Date mailNoticeDate) {
	this.mailNoticeDate = mailNoticeDate;
}
public Date getMailPublishOn() {
	return mailPublishOn;
}
public void setMailPublishOn(Date mailPublishOn) {
	this.mailPublishOn = mailPublishOn;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public byte[] getAttachfile() {
	return attachfile;
}
public void setAttachfile(byte[] attachfile) {
	this.attachfile = attachfile;
}
public String getMailSendTo() {
	return mailSendTo;
}
public void setMailSendTo(String mailSendTo) {
	this.mailSendTo = mailSendTo;
}
public String getMailSendFrom() {
	return mailSendFrom;
}
public void setMailSendFrom(String mailSendFrom) {
	this.mailSendFrom = mailSendFrom;
}
@Override
public String toString() {
	return "SendMail [sendMailId=" + sendMailId + ", mailTitle=" + mailTitle
			+ ", mailMessage=" + mailMessage + ", mailNoticeDate="
			+ mailNoticeDate + ", mailPublishOn=" + mailPublishOn
			+ ", fileName=" + fileName + ", attachfile="
			+ Arrays.toString(attachfile) + ", mailSendTo=" + mailSendTo
			+ ", mailSendFrom=" + mailSendFrom + "]";
}

}