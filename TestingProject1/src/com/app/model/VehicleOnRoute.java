package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VehicleOnRoute")
public class VehicleOnRoute {
	@Id
	@GeneratedValue
	int vehicleOnRouteId;
	String route;
	String vehicle;
	public VehicleOnRoute() {
		super();
	}
	public VehicleOnRoute(int vehicleOnRouteId) {
		super();
		this.vehicleOnRouteId = vehicleOnRouteId;
	}
	public VehicleOnRoute(int vehicleOnRouteId, String route, String vehicle) {
		super();
		this.vehicleOnRouteId = vehicleOnRouteId;
		this.route = route;
		this.vehicle = vehicle;
	}
	public int getVehicleOnRouteId() {
		return vehicleOnRouteId;
	}
	public void setVehicleOnRouteId(int vehicleOnRouteId) {
		this.vehicleOnRouteId = vehicleOnRouteId;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "VehicleOnRoute [vehicleOnRouteId=" + vehicleOnRouteId
				+ ", route=" + route + ", vehicle=" + vehicle + "]";
	}

}
