package com.app.service;

import java.util.List;

import com.app.model.Route;
import com.app.model.Vehicle;
import com.app.model.VehicleOnRoute;

public interface ITransportService {
	public int  addRoute(Route route);
	public Route  getRouteById(int routeId);
	public List<Route> getAllRoutes();
	public void updateRoute(Route route);
	public void deleteRoute(int routeId);
	
	public int  addVehicle(Vehicle vehicle);
	public Vehicle  getVehicleById(int vehicleId);
	public List<Vehicle> getAllVehicles();
	public void updateVehicle(Vehicle vehicle);
	public void deleteVehicle(int vehicleId);

	public int  addVehicleOnRoute(VehicleOnRoute vehicleOnRoute);
	public VehicleOnRoute  getVehicleOnRouteById(int vehicleOnRouteId);
	public List<VehicleOnRoute> getAllVehiclesOnRoutes();
	public void updateVehicleOnRoute(VehicleOnRoute vehicleOnRoute);
	public void deleteVehicleOnRoute(int vehicleOnRouteId);

	
}
