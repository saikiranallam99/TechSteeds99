package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FeesGroup {
	@Id
	@GeneratedValue
	int feesGroupId;
	String feesGroupName; 
	String feesGroupDescription;
	public FeesGroup() {
		super();
	}
	public FeesGroup(int feesGroupId) {
		super();
		this.feesGroupId = feesGroupId;
	}
	public FeesGroup(int feesGroupId, String feesGroupName,
			String feesGroupDescription) {
		super();
		this.feesGroupId = feesGroupId;
		this.feesGroupName = feesGroupName;
		this.feesGroupDescription = feesGroupDescription;
	}
	public int getFeesGroupId() {
		return feesGroupId;
	}
	public void setFeesGroupId(int feesGroupId) {
		this.feesGroupId = feesGroupId;
	}
	public String getFeesGroupName() {
		return feesGroupName;
	}
	public void setFeesGroupName(String feesGroupName) {
		this.feesGroupName = feesGroupName;
	}
	public String getFeesGroupDescription() {
		return feesGroupDescription;
	}
	public void setFeesGroupDescription(String feesGroupDescription) {
		this.feesGroupDescription = feesGroupDescription;
	}
	@Override
	public String toString() {
		return "FeesGroup [feesGroupId=" + feesGroupId + ", feesGroupName="
				+ feesGroupName + ", feesGroupDescription="
				+ feesGroupDescription + "]";
	}

}
