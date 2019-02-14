package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Route;
import com.app.model.Vehicle;
import com.app.model.VehicleOnRoute;
import com.app.service.ITransportService;
@Controller
public class TransportController 
{
	@Autowired
	private ITransportService service;
	
	@RequestMapping("/showTransport")
	public String showTransportPage(){
		return "Transport";
	}

	
	//Route
	
	@RequestMapping("/showCreateRoute")
	public String showCreateRoute(ModelMap map){
		List<Route> routes=service.getAllRoutes();
		map.addAttribute("routes",routes );
		return "Route";
	}

	@RequestMapping(value="/insertRoute",method=RequestMethod.POST)
	public String saveRoute(@ModelAttribute("route")Route route,ModelMap map){
		System.out.println("hi");
		int routeId=service.addRoute(route);
	
		Route route1=service.getRouteById(routeId);
		String message="Route  saved with name:"+route1.getRouteTitle();
		map.addAttribute("msg",message);
		return "Route";
	}

	@RequestMapping("/deleteRoute")
	public String deleteRoute(@RequestParam("routeId")int routeId){
		service.deleteRoute(routeId);;
		return "redirect:showCreateRoute";
	}

	
	@RequestMapping("/showEditRoute")
	public String showRouteEdit(@RequestParam("routeId")int routeId,ModelMap map){
		Route route=service.getRouteById(routeId);
		map.addAttribute("route",route);
		return "RouteDataEdit";
	}

	@RequestMapping(value="/editRoute",method=RequestMethod.POST)
	public String routeEdit(@ModelAttribute("route")Route route){
		service.updateRoute(route);
		return "redirect:showCreateRoute";
	}

  //Vehicle
	@RequestMapping("/showAddVehicle")
	public String showAddVehicle(ModelMap map){
		List<Vehicle> vehicles=service.getAllVehicles();
		map.addAttribute("vehicles",vehicles );
		return "AddVehicle";
	}
	
	@RequestMapping(value="/insertVehicle",method=RequestMethod.POST)
	public String saveVehicle(@ModelAttribute("vehicle")Vehicle vehicle,ModelMap map){
		int vehicleId=service.addVehicle(vehicle);
		Vehicle vehicle1=service.getVehicleById(vehicleId);
		String message="vehicle  added with number:"+vehicle1.getVehicleNumber();
		map.addAttribute("msg",message);
		return "AddVehicle";
	}
	
	@RequestMapping("/deleteVehicle")
	public String deleteVehicle(@RequestParam("vehicleId")int vehicleId){
		service.deleteVehicle(vehicleId);
		return "redirect:showAddVehicle";
	}
	
	@RequestMapping("/showEditVehicle")
	public String showVehicleEdit(@RequestParam("vehicleId")int vehicleId,ModelMap map){
		Vehicle vehicle=service.getVehicleById(vehicleId);
		map.addAttribute("vehicle",vehicle);
		return "VehicleDataEdit";
	}
	@RequestMapping(value="/editVehicle",method=RequestMethod.POST)
	public String vehicleEdit(@ModelAttribute("vehicle")Vehicle vehicle){
		service.updateVehicle(vehicle);
		return "redirect:showAddVehicle";
	}
	
	
	//VEHICLEONROUTE
	@RequestMapping("/showVehicleOnRoute")
	public String showVehicleOnRoute(ModelMap map){
		List<VehicleOnRoute> vehiclesOnRoutes=service.getAllVehiclesOnRoutes();
		map.addAttribute("vehiclesOnRoutes",vehiclesOnRoutes );
		List<Vehicle> vehicles=service.getAllVehicles();
		map.addAttribute("vehicles",vehicles );
		List<Route> routes=service.getAllRoutes();
		map.addAttribute("routes",routes );
		return "VehicleOnRoute";
	}
	
	@RequestMapping(value="/insertVehicleOnRoute",method=RequestMethod.POST)
	public String saveVehicleOnRoute(@ModelAttribute("vehicleOnRoute")VehicleOnRoute vehicleOnRoute,ModelMap map){
		int vehicleOnRouteId=service.addVehicleOnRoute(vehicleOnRoute);
		VehicleOnRoute vehicleOnRoute1=service.getVehicleOnRouteById(vehicleOnRouteId);
		String message="vehicle  :"+vehicleOnRoute1.getVehicle() +" saved on route  :"+vehicleOnRoute1.getRoute() ;
		map.addAttribute("msg",message);
		return "VehicleOnRoute";
	}

	@RequestMapping("/deleteVehicleOnRoute")
	public String deleteVehicleOnRoute(@RequestParam("vehicleOnRouteId")int vehicleOnRouteId){
		service.deleteVehicleOnRoute(vehicleOnRouteId);;
		return "redirect:showVehicleOnRoute";
	}
	
	@RequestMapping("/showEditVehicleOnRoute")
	public String showVehicleOnRouteEdit(@RequestParam("vehicleOnRouteId")int vehicleOnRouteId,ModelMap map){
		List<Vehicle> vehicles=service.getAllVehicles();
		map.addAttribute("vehicles",vehicles );
		List<Route> routes=service.getAllRoutes();
		map.addAttribute("routes",routes );
		VehicleOnRoute vehicleOnRoute=service.getVehicleOnRouteById(vehicleOnRouteId);
		map.addAttribute("vehicleOnRoute",vehicleOnRoute);
		return "VehicleOnRouteDataEdit";
	}
	@RequestMapping(value="/editVehicleOnRoute",method=RequestMethod.POST)
	public String VehicleOnRouteEdit(@ModelAttribute("vehicleOnRoute")VehicleOnRoute vehicleOnRoute){
		service.updateVehicleOnRoute(vehicleOnRoute);
		return "redirect:showVehicleOnRoute";
	}

}
