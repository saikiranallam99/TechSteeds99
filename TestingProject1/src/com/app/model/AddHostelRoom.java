package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddHostelRoom")
public class AddHostelRoom {
	@Id
	@GeneratedValue
	int roomId;
	int roomNumber;
	String hostelName; 
	String roomType ;
	int numberOfBed ;
	int nostPerBed ;
	String description;
	public AddHostelRoom() {
		super();
	}
	public AddHostelRoom(int roomId) {
		super();
		this.roomId = roomId;
	}
	public AddHostelRoom(int roomId, int roomNumber, String hostelName,
			String roomType, int numberOfBed, int nostPerBed, String description) {
		super();
		this.roomId = roomId;
		this.roomNumber = roomNumber;
		this.hostelName = hostelName;
		this.roomType = roomType;
		this.numberOfBed = numberOfBed;
		this.nostPerBed = nostPerBed;
		this.description = description;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getNumberOfBed() {
		return numberOfBed;
	}
	public void setNumberOfBed(int numberOfBed) {
		this.numberOfBed = numberOfBed;
	}
	public int getNostPerBed() {
		return nostPerBed;
	}
	public void setNostPerBed(int nostPerBed) {
		this.nostPerBed = nostPerBed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "AddHostelRoom [roomId=" + roomId + ", roomNumber=" + roomNumber
				+ ", hostelName=" + hostelName + ", roomType=" + roomType
				+ ", numberOfBed=" + numberOfBed + ", nostPerBed=" + nostPerBed
				+ ", description=" + description + "]";
	}
	
}
