package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="markkstable")
public class marksGrade {

	@Id
	@GeneratedValue
	@Column(name="marksId")
	int marksId;
	@Column(name="gradename")
	String gradename;
	@Column(name="percentFrom")
	double percentfrom;
	@Column(name="percentupto")
	double percentupto;
	@Column(name="description")
	String description;
	public marksGrade() {
		super();
	}
	public marksGrade(int marksId) {
		super();
		this.marksId = marksId;
	}
	public marksGrade(int marksId, String gradename, double percentfrom,
			double percentupto, String description) {
		super();
		this.marksId = marksId;
		this.gradename = gradename;
		this.percentfrom = percentfrom;
		this.percentupto = percentupto;
		this.description = description;
	}
	public int getMarksId() {
		return marksId;
	}
	public void setMarksId(int marksId) {
		this.marksId = marksId;
	}
	public String getGradename() {
		return gradename;
	}
	public void setGradename(String gradename) {
		this.gradename = gradename;
	}
	public double getPercentfrom() {
		return percentfrom;
	}
	public void setPercentfrom(double percentfrom) {
		this.percentfrom = percentfrom;
	}
	public double getPercentupto() {
		return percentupto;
	}
	public void setPercentupto(double percentupto) {
		this.percentupto = percentupto;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "marksGrade [marksId=" + marksId + ", gradename=" + gradename
				+ ", percentfrom=" + percentfrom + ", percentupto="
				+ percentupto + ", description=" + description + "]";
	}
	
}
