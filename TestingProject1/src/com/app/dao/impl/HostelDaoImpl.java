package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IHostelDao;
import com.app.model.AddHostel;
import com.app.model.AddHostelRoom;
import com.app.model.RoomType;
@Repository
public class HostelDaoImpl implements IHostelDao {

	@Autowired
	private HibernateTemplate ht;
	public int addRoomType(RoomType roomType) {
		int roomTypeId=(Integer) ht.save(roomType);
		return roomTypeId;
	}

	public RoomType getRoomTypeById(int roomTypeId) {
		RoomType roomType=ht.get(RoomType.class, roomTypeId);
		return roomType;
	}

	public List<RoomType> getAllRoomTypes() {
		return ht.loadAll(RoomType.class);
	}

	public void updateRoomType(RoomType roomType) {
		ht.update(roomType);
		
	}

	public void deleteRoomType(int roomTypeId) {
		ht.delete(new RoomType(roomTypeId));
		
	}

	public int addHostel(AddHostel addHostel) {
		int hostelId=(Integer) ht.save(addHostel);
		return hostelId;
	}

	public AddHostel getAddHostelById(int hostelId) {
		AddHostel addHostel=ht.get(AddHostel.class, hostelId);
		return addHostel;
	}

	public List<AddHostel> getAllAddHostels() {
		return ht.loadAll(AddHostel.class);
	}

	public void updateAddHostel(AddHostel addHostel) {
		ht.update(addHostel);
		
	}

	public void deleteAddHostel(int hostelId) {
		ht.delete(new AddHostel(hostelId));
		
	}

	public int addHostelRoom(AddHostelRoom addHostelRoom) {
		int roomId=(Integer) ht.save(addHostelRoom);
		return roomId;
	}

	public AddHostelRoom getAddHostelRoomById(int roomId) {
		AddHostelRoom addHostelRoom=ht.get(AddHostelRoom.class, roomId);
		return addHostelRoom;
	}

	public List<AddHostelRoom> getAllAddHostelRooms() {
		return ht.loadAll(AddHostelRoom.class);
	}

	public void updateAddHostelRoom(AddHostelRoom addHostelRoom) {
		ht.update(addHostelRoom);
		
	}

	public void deleteAddHostelRoom(int roomId) {
		ht.delete(new AddHostelRoom(roomId));
		
	}

}
