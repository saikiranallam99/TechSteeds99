package com.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Itemsuppliertable")
public class ItemSupplier 
{
	@Id
	@GeneratedValue
	@Column(name="sid")
	int supplierId;
	@Column(name="sname")
    String name;
	@Column(name="sphone")
	String phone;
	
	@Column(name="semail")
	String email;
	@Column(name="saddress")
	String address;
	@Column(name="contact_person_name")
	String contact_person_name;
	@Column(name="contact_person_phone")
	String contact_person_phone;
	@Column(name="contact_person_email")
	String contact_person_email;
	@Column(name="description")
	String description;
	public ItemSupplier() {
		super();
	}
	public ItemSupplier(int supplierId) {
		super();
		this.supplierId = supplierId;
	}
	public ItemSupplier(int supplierId, String name, String phone,
			String email, String address, String contact_person_name,
			String contact_person_phone, String contact_person_email,
			String description) {
		super();
		this.supplierId = supplierId;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.contact_person_name = contact_person_name;
		this.contact_person_phone = contact_person_phone;
		this.contact_person_email = contact_person_email;
		this.description = description;
	}
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact_person_name() {
		return contact_person_name;
	}
	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}
	public String getContact_person_phone() {
		return contact_person_phone;
	}
	public void setContact_person_phone(String contact_person_phone) {
		this.contact_person_phone = contact_person_phone;
	}
	public String getContact_person_email() {
		return contact_person_email;
	}
	public void setContact_person_email(String contact_person_email) {
		this.contact_person_email = contact_person_email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ItemSupplier [supplierId=" + supplierId + ", name=" + name
				+ ", phone=" + phone + ", email=" + email + ", address="
				+ address + ", contact_person_name=" + contact_person_name
				+ ", contact_person_phone=" + contact_person_phone
				+ ", contact_person_email=" + contact_person_email
				+ ", description=" + description + "]";
	}
	
}
