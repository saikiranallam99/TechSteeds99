package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddHostel")
public class AddHostel 
{
	@Id
	@GeneratedValue
	int hostelId;
	
	String hostelName; 
	
	String hostelType;
	
	String hostelAddress; 
	
	String hostelIntake; 
	
	String description;

	public AddHostel() {
		super();
	}

	public AddHostel(int hostelId) {
		super();
		this.hostelId = hostelId;
	}

	public AddHostel(int hostelId, String hostelName, String hostelType,
			String hostelAddress, String hostelIntake, String description) {
		super();
		this.hostelId = hostelId;
		this.hostelName = hostelName;
		this.hostelType = hostelType;
		this.hostelAddress = hostelAddress;
		this.hostelIntake = hostelIntake;
		this.description = description;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public String getHostelType() {
		return hostelType;
	}

	public void setHostelType(String hostelType) {
		this.hostelType = hostelType;
	}

	public String getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}

	public String getHostelIntake() {
		return hostelIntake;
	}

	public void setHostelIntake(String hostelIntake) {
		this.hostelIntake = hostelIntake;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AddHostel [hostelId=" + hostelId + ", hostelName=" + hostelName
				+ ", hostelType=" + hostelType + ", hostelAddress="
				+ hostelAddress + ", hostelIntake=" + hostelIntake
				+ ", description=" + description + "]";
	}
	
}
