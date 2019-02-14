package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.AddHostel;
import com.app.model.AddHostelRoom;
import com.app.model.RoomType;
import com.app.service.IHostelService;



@Controller
public class HostelController 
{
	@Autowired
	private IHostelService service;

	@RequestMapping("/showHostel")
	public String showHostelPage(){
		return "Hostel";
	}


	//ROOMTYPE

	@RequestMapping("/showAddRoomType")
	public String showROOMTYPE(ModelMap map){
		List<RoomType> roomTypes=service.getAllRoomTypes();
		map.addAttribute("roomTypes",roomTypes );
		return "HostelRoomType";
	}

	@RequestMapping(value="/insertRoomType",method=RequestMethod.POST)
	public String saveRoomType(@ModelAttribute("roomType")RoomType roomType,ModelMap map){
		int roomTypeId=service.addRoomType(roomType);
		RoomType roomType1=service.getRoomTypeById(roomTypeId);
		String message="RoomType saved with name:"+roomType1.getRoomType() ;
		map.addAttribute("msg",message);
		return "HostelRoomType";
	}

	@RequestMapping("/deleteRoomType")
	public String deleteRoomType(@RequestParam("roomTypeId")int roomTypeId){
		service.deleteRoomType(roomTypeId);
		return "redirect:showAddRoomType";
	}

	@RequestMapping("/showEditRoomType")
	public String showRoomTypeEdit(@RequestParam("roomTypeId")int roomTypeId,ModelMap map){
		RoomType roomType=service.getRoomTypeById(roomTypeId);
		map.addAttribute("roomType",roomType);
		return "HostelRoomTypeDataEdit";
	}

	@RequestMapping(value="/editRoomType",method=RequestMethod.POST)
	public String editRoomType(@ModelAttribute("roomType")RoomType roomType){
		service.updateRoomType(roomType);
		return "redirect:showAddRoomType";
	}


	//ADDHOSTEL

	@RequestMapping("/showAddHostel")
	public String showAddHostelPage(ModelMap map){
		List<AddHostel> addHostels=service.getAllAddHostels();
		map.addAttribute("addHostels",addHostels );
		return "AddHostel";
	}

	@RequestMapping(value="/insertAddHostel",method=RequestMethod.POST)
	public String saveItemSupplier(@ModelAttribute("addHostel")AddHostel addHostel,ModelMap map){
		int hostelId=service.addHostel(addHostel);
		AddHostel addHostel1=service.getAddHostelById(hostelId);
		String message="Hostel saved with name:"+addHostel1.getHostelName() ;
		map.addAttribute("msg",message);
		return "AddHostel";
	}

	@RequestMapping("/deleteAddHostel")
	public String deleteAddHostel(@RequestParam("hostelId")int hostelId){
		service.deleteAddHostel(hostelId);
		return "redirect:showAddHostel";
	}

	
	@RequestMapping("/showEditAddHostel")
	public String showAddHostelEdit(@RequestParam("hostelId")int hostelId,ModelMap map){
		AddHostel addHostel=service.getAddHostelById(hostelId);
		map.addAttribute("addHostel",addHostel);
		return "AddHostelDataEdit";
	}

	@RequestMapping(value="/editAddHostel",method=RequestMethod.POST)
	public String AddHostelEdit(@ModelAttribute("addHostel")AddHostel addHostel){
		service.updateAddHostel(addHostel);
		return "redirect:showAddHostel";
	}





	//ADD_HOSTEL_ROOM
	
	@RequestMapping("/showAddHostelRoom")
	public String showHostelRoom(ModelMap map){
		List<AddHostelRoom> addHostelRooms=service.getAllAddHostelRooms();
		map.addAttribute("addHostelRooms",addHostelRooms );
		List<AddHostel> addHostels=service.getAllAddHostels();
		map.addAttribute("addHostels",addHostels );
		List<RoomType> roomTypes=service.getAllRoomTypes();
		map.addAttribute("roomTypes",roomTypes );
		return "HostelRoom";
	}
	
	@RequestMapping(value="/insertHostelRoom",method=RequestMethod.POST)
	public String saveHostelRoom(@ModelAttribute("addHostelRoom")AddHostelRoom addHostelRoom,ModelMap map){
		int roomId=service.addHostelRoom(addHostelRoom);
		AddHostelRoom addHostelRoom1=service.getAddHostelRoomById(roomId);
		String message="HostelRoom saved with name:"+addHostelRoom1.getRoomNumber();
		map.addAttribute("msg",message);
		return "HostelRoom";
	}
	
	@RequestMapping("/deleteHostelRoom")
	public String deleteHostelRoom(@RequestParam("roomId")int roomId){
		service.deleteAddHostelRoom(roomId);
		return "redirect:showAddHostelRoom";
	}


	@RequestMapping("/showEditHostelRoom")
	public String showHostelRoomEdit(@RequestParam("roomId")int roomId,ModelMap map){
		AddHostelRoom addHostelRoom=service.getAddHostelRoomById(roomId);
		map.addAttribute("addHostelRoom",addHostelRoom);
		List<AddHostel> addHostels=service.getAllAddHostels();
		map.addAttribute("addHostels",addHostels );
		List<RoomType> roomTypes=service.getAllRoomTypes();
		map.addAttribute("roomTypes",roomTypes );
		return "HostelRoomDataEdit";
	}
	
	@RequestMapping(value="/editHostelRoom",method=RequestMethod.POST)
	public String hostelRoomEdit(@ModelAttribute("addHostelRoom")AddHostelRoom addHostelRoom){
		service.updateAddHostelRoom(addHostelRoom);;
		return "redirect:showAddHostelRoom";
	}

}
