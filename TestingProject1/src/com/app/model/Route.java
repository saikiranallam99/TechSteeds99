package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Routetable")
public class Route 
{
	@Id
	@GeneratedValue
	@Column(name="routeId")
    int routeId;
	@Column(name="routeTitle")
    String routeTitle;
	@Column(name="routeFare")
    int routeFare;
	public Route() {
		super();
	}
	public Route(int routeId) {
		super();
		this.routeId = routeId;
	}
	public Route(int routeId, String routeTitle, int routeFare) {
		super();
		this.routeId = routeId;
		this.routeTitle = routeTitle;
		this.routeFare = routeFare;
	}
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteTitle() {
		return routeTitle;
	}
	public void setRouteTitle(String routeTitle) {
		this.routeTitle = routeTitle;
	}
	public int getRouteFare() {
		return routeFare;
	}
	public void setRouteFare(int routeFare) {
		this.routeFare = routeFare;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeTitle=" + routeTitle
				+ ", routeFare=" + routeFare + "]";
	}
	
	
}
