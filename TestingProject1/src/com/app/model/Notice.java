package com.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Notice_Board")
public class Notice 
{
	@Id
	@GeneratedValue
	int noticeId;
	String  noticeTitle;
	String  noticeMessage;
	Date noticeDate;
	Date noticePublishOn;
	String noticeSendTo;
	public Notice() {
		super();
	}
	public Notice(int noticeId) {
		super();
		this.noticeId = noticeId;
	}
	public Notice(int noticeId, String noticeTitle, String noticeMessage,
			Date noticeDate, Date noticePublishOn, String noticeSendTo) {
		super();
		this.noticeId = noticeId;
		this.noticeTitle = noticeTitle;
		this.noticeMessage = noticeMessage;
		this.noticeDate = noticeDate;
		this.noticePublishOn = noticePublishOn;
		this.noticeSendTo = noticeSendTo;
	}
	public int getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeMessage() {
		return noticeMessage;
	}
	public void setNoticeMessage(String noticeMessage) {
		this.noticeMessage = noticeMessage;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public Date getNoticePublishOn() {
		return noticePublishOn;
	}
	public void setNoticePublishOn(Date noticePublishOn) {
		this.noticePublishOn = noticePublishOn;
	}
	public String getNoticeSendTo() {
		return noticeSendTo;
	}
	public void setNoticeSendTo(String noticeSendTo) {
		this.noticeSendTo = noticeSendTo;
	}
	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle
				+ ", noticeMessage=" + noticeMessage + ", noticeDate="
				+ noticeDate + ", noticePublishOn=" + noticePublishOn
				+ ", noticeSendTo=" + noticeSendTo + "]";
	}
	
}
