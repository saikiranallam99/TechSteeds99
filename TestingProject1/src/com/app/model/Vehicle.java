package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicletable")
public class Vehicle 
{
	@Id
	@GeneratedValue
	@Column(name="vehicleId")
	int vehicleId;
	@Column(name="vehicleNumber")
    String vehicleNumber ;
	@Column(name="vehicleModel")
    String vehicleModel ;
	
	@Column(name="yearMade")
    int yearMade ;
	@Column(name="driverName")
    String driverName ;
	@Column(name="driverLicense")
    String driverLicense ;
	@Column(name="driverContact")
    String driverContact ;
	@Column(name="note")
    String note;
	public Vehicle() {
		super();
	}
	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}
	public Vehicle(int vehicleId, String vehicleNumber, String vehicleModel,
			int yearMade, String driverName, String driverLicense,
			String driverContact, String note) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNumber = vehicleNumber;
		this.vehicleModel = vehicleModel;
		this.yearMade = yearMade;
		this.driverName = driverName;
		this.driverLicense = driverLicense;
		this.driverContact = driverContact;
		this.note = note;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getDriverContact() {
		return driverContact;
	}
	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleNumber="
				+ vehicleNumber + ", vehicleModel=" + vehicleModel
				+ ", yearMade=" + yearMade + ", driverName=" + driverName
				+ ", driverLicense=" + driverLicense + ", driverContact="
				+ driverContact + ", note=" + note + "]";
	}
	
	
}
