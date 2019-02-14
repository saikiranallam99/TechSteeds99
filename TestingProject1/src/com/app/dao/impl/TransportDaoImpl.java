package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.ITransportDao;
import com.app.model.Route;
import com.app.model.Vehicle;
import com.app.model.VehicleOnRoute;
@Repository
public class TransportDaoImpl implements ITransportDao {
	@Autowired
	private HibernateTemplate ht;
	
	
	public int addRoute(Route route) {
	
		int routeId=(Integer) ht.save(route);
		return routeId;
	}

	public Route getRouteById(int routeId) {
		Route route=ht.get(Route.class, routeId);
		return route;
	}

	public List<Route> getAllRoutes() {
		return ht.loadAll(Route.class);
	}

	public void updateRoute(Route route) {
		ht.update(route);
		
	}

	public void deleteRoute(int routeId) {
		ht.delete(new Route(routeId));
		
	}

	public int addVehicle(Vehicle vehicle) {
		int vehicleId=(Integer) ht.save(vehicle);
		return vehicleId;
	}

	public Vehicle getVehicleById(int vehicleId) {
		Vehicle vehicle=ht.get(Vehicle.class, vehicleId);
		return vehicle;
	}

	public List<Vehicle> getAllVehicles() {
		return ht.loadAll(Vehicle.class);
	}

	public void updateVehicle(Vehicle vehicle) {
		ht.update(vehicle);
		
	}

	public void deleteVehicle(int vehicleId) {
		ht.delete(new Vehicle(vehicleId));
		
	}

	public int addVehicleOnRoute(VehicleOnRoute vehicleOnRoute) {
		
		int vehicleOnRouteId=(Integer) ht.save(vehicleOnRoute);
		return vehicleOnRouteId;
	}

	public VehicleOnRoute getVehicleOnRouteById(int vehicleOnRouteId) {
		VehicleOnRoute vehicleOnRoute=ht.get(VehicleOnRoute.class, vehicleOnRouteId);
		return vehicleOnRoute;
	}

	public List<VehicleOnRoute> getAllVehiclesOnRoutes() {
		
		return ht.loadAll(VehicleOnRoute.class);
	}

	public void updateVehicleOnRoute(VehicleOnRoute vehicleOnRoute) {
		
		ht.update(vehicleOnRoute);
	}

	public void deleteVehicleOnRoute(int vehicleOnRouteId) {
		ht.delete(new VehicleOnRoute(vehicleOnRouteId));
		
	}

	

}
