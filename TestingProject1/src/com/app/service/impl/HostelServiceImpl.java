package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IHostelDao;
import com.app.model.AddHostel;
import com.app.model.AddHostelRoom;
import com.app.model.RoomType;
import com.app.service.IHostelService;
@Service
public class HostelServiceImpl implements IHostelService {
	@Autowired
	private IHostelDao dao;
	public int addRoomType(RoomType roomType) {
		
		return dao.addRoomType(roomType);
	}

	public RoomType getRoomTypeById(int roomTypeId) {
		
		return dao.getRoomTypeById(roomTypeId);
	}

	public List<RoomType> getAllRoomTypes() {
		
		return dao.getAllRoomTypes();
	}

	public void updateRoomType(RoomType roomType) {
		
		dao.updateRoomType(roomType);
	}

	public void deleteRoomType(int roomTypeId) {
	   dao.deleteRoomType(roomTypeId);
	}

	public int addHostel(AddHostel addHostel) {
		
		return dao.addHostel(addHostel);
	}

	public AddHostel getAddHostelById(int hostelId) {
	
		return dao.getAddHostelById(hostelId);
	}

	public List<AddHostel> getAllAddHostels() {
		
		return dao.getAllAddHostels();
	}

	public void updateAddHostel(AddHostel addHostel) {
	    
		dao.updateAddHostel(addHostel);
		
	}

	public void deleteAddHostel(int hostelId) {
		dao.deleteAddHostel(hostelId);
		
	}

	public int addHostelRoom(AddHostelRoom addHostelRoom) {
		
		return dao.addHostelRoom(addHostelRoom);
	}

	public AddHostelRoom getAddHostelRoomById(int roomId) {
		
		return dao.getAddHostelRoomById(roomId);
	}

	public List<AddHostelRoom> getAllAddHostelRooms() {
		
		return dao.getAllAddHostelRooms();
	}

	public void updateAddHostelRoom(AddHostelRoom addHostelRoom) {
	
		dao.updateAddHostelRoom(addHostelRoom);
		
	}

	public void deleteAddHostelRoom(int roomId) {
		dao.deleteAddHostelRoom(roomId);
	}

}
