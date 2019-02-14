package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RoomType")
public class RoomType 
{
	@Id
	@GeneratedValue
	int roomTypeId;
	
	String roomType; 
	
	String description;

	public RoomType() {
		super();
	}

	public RoomType(int roomTypeId) {
		super();
		this.roomTypeId = roomTypeId;
	}

	public RoomType(int roomTypeId, String roomType, String description) {
		super();
		this.roomTypeId = roomTypeId;
		this.roomType = roomType;
		this.description = description;
	}

	public int getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(int roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RoomType [roomTypeId=" + roomTypeId + ", roomType=" + roomType
				+ ", description=" + description + "]";
	}
	
}
