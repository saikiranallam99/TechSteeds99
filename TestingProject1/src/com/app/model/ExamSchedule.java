package com.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ExamSchedule {
	@Id
	@GeneratedValue
	int examscheduleid;
	String examName;
	String cls;
	String sec;
	String date;
	String startTime;
	String endTime;
	String room;
	int fullMarks;
	int passingMarks;
	public ExamSchedule() {
		super();
	}
	public ExamSchedule(int examscheduleid) {
		super();
		this.examscheduleid = examscheduleid;
	}
	public ExamSchedule(int examscheduleid, String examName, String cls,
			String sec, String date, String startTime, String endTime,
			String room, int fullMarks, int passingMarks) {
		super();
		this.examscheduleid = examscheduleid;
		this.examName = examName;
		this.cls = cls;
		this.sec = sec;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.room = room;
		this.fullMarks = fullMarks;
		this.passingMarks = passingMarks;
	}
	public int getExamscheduleid() {
		return examscheduleid;
	}
	public void setExamscheduleid(int examscheduleid) {
		this.examscheduleid = examscheduleid;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	public String getSec() {
		return sec;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public int getFullMarks() {
		return fullMarks;
	}
	public void setFullMarks(int fullMarks) {
		this.fullMarks = fullMarks;
	}
	public int getPassingMarks() {
		return passingMarks;
	}
	public void setPassingMarks(int passingMarks) {
		this.passingMarks = passingMarks;
	}
	@Override
	public String toString() {
		return "ExamSchedule [examscheduleid=" + examscheduleid + ", examName="
				+ examName + ", cls=" + cls + ", sec=" + sec + ", date=" + date
				+ ", startTime=" + startTime + ", endTime=" + endTime
				+ ", room=" + room + ", fullMarks=" + fullMarks
				+ ", passingMarks=" + passingMarks + "]";
	}
	
	
}
