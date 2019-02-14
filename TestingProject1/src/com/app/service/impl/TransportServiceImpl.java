package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ITransportDao;
import com.app.model.Route;
import com.app.model.Vehicle;
import com.app.model.VehicleOnRoute;
import com.app.service.ITransportService;
@Service
public class TransportServiceImpl implements ITransportService {
	@Autowired
	private ITransportDao dao;

	public int addRoute(Route route) {
		
		return dao.addRoute(route);
	}

	public Route getRouteById(int routeId) {
		
		return dao.getRouteById(routeId);
	}

	public List<Route> getAllRoutes() {
	
		return dao.getAllRoutes();
	}

	public void updateRoute(Route route) {
		
		dao.updateRoute(route);
	}

	public void deleteRoute(int routeId) {
		
		dao.deleteRoute(routeId);
	}

	public int addVehicle(Vehicle vehicle) {
	
		return dao.addVehicle(vehicle);
	}

	public Vehicle getVehicleById(int vehicleId) {
		
		return dao.getVehicleById(vehicleId);
	}

	public List<Vehicle> getAllVehicles() {
		
		return dao.getAllVehicles();
	}

	public void updateVehicle(Vehicle vehicle) {
		
		dao.updateVehicle(vehicle);
	}

	public void deleteVehicle(int vehicleId) {
	
		dao.deleteVehicle(vehicleId);
	}

	public int addVehicleOnRoute(VehicleOnRoute vehicleOnRoute) {
		
		return dao.addVehicleOnRoute(vehicleOnRoute);
	}

	public VehicleOnRoute getVehicleOnRouteById(int vehicleOnRouteId) {
		
		return dao.getVehicleOnRouteById(vehicleOnRouteId);
	}

	public List<VehicleOnRoute> getAllVehiclesOnRoutes() {
		
		return dao.getAllVehiclesOnRoutes();
	}

	public void updateVehicleOnRoute(VehicleOnRoute vehicleOnRoute) {
		
		dao.updateVehicleOnRoute(vehicleOnRoute);
	}

	public void deleteVehicleOnRoute(int vehicleOnRouteId) {
		
		dao.deleteVehicleOnRoute(vehicleOnRouteId);
	}

	
}
