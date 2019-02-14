package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="IssueItem")
public class IssueItem 
{
	@Id
	@GeneratedValue
	@Column(name="itemIssueId")
	int itemIssueId;
	@Column(name="userType")
	String userType;
	@Column(name="issueTo")
    String issueTo; 
	@Column(name="issueBy")
    String issueBy;
	@Column(name="issueDate")
    String issueDate;
	@Column(name="returnDate")
    String returnDate; 
	@Column(name="note")
    String note;
    @Column(name="itemcategory")
	String itemcategory;
    @Column(name="item")
	String item;
    @Column(name="quantity")
	int quantity;
	public IssueItem() {
		super();
	}
	public IssueItem(int itemIssueId) {
		super();
		this.itemIssueId = itemIssueId;
	}
	public IssueItem(int itemIssueId, String userType, String issueTo,
			String issueBy, String issueDate, String returnDate, String note,
			String itemcategory, String item, int quantity) {
		super();
		this.itemIssueId = itemIssueId;
		this.userType = userType;
		this.issueTo = issueTo;
		this.issueBy = issueBy;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
		this.note = note;
		this.itemcategory = itemcategory;
		this.item = item;
		this.quantity = quantity;
	}
	public int getItemIssueId() {
		return itemIssueId;
	}
	public void setItemIssueId(int itemIssueId) {
		this.itemIssueId = itemIssueId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getIssueTo() {
		return issueTo;
	}
	public void setIssueTo(String issueTo) {
		this.issueTo = issueTo;
	}
	public String getIssueBy() {
		return issueBy;
	}
	public void setIssueBy(String issueBy) {
		this.issueBy = issueBy;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "IssueItem [itemIssueId=" + itemIssueId + ", userType="
				+ userType + ", issueTo=" + issueTo + ", issueBy=" + issueBy
				+ ", issueDate=" + issueDate + ", returnDate=" + returnDate
				+ ", note=" + note + ", itemcategory=" + itemcategory
				+ ", item=" + item + ", quantity=" + quantity + "]";
	}
    
    
}
