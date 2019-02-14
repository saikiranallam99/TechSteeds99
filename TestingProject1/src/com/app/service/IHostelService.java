package com.app.service;

import java.util.List;

import com.app.model.AddHostel;
import com.app.model.AddHostelRoom;
import com.app.model.RoomType;

public interface IHostelService 
{
	//ROOMTYPE
		public int  addRoomType(RoomType roomType);
		public RoomType  getRoomTypeById(int roomTypeId);
		public List<RoomType> getAllRoomTypes();
		public void updateRoomType(RoomType roomType);
		public void deleteRoomType(int roomTypeId);
		
		
		//ADDHOSTEL
		public int  addHostel(AddHostel addHostel);
		public AddHostel  getAddHostelById(int hostelId);
		public List<AddHostel> getAllAddHostels();
		public void updateAddHostel(AddHostel addHostel);
		public void deleteAddHostel(int hostelId);
		
		//ADDHOSTELROOM
		public int  addHostelRoom(AddHostelRoom addHostelRoom);
		public AddHostelRoom  getAddHostelRoomById(int roomId);
		public List<AddHostelRoom> getAllAddHostelRooms();
		public void updateAddHostelRoom(AddHostelRoom addHostelRoom);
		public void deleteAddHostelRoom(int roomId);
}
