package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class FeesType {
	@Id
	@GeneratedValue
	int feesTypeId;
	String feesTypeName; 
	String feesTypeCode; 
	String feesTypeDescription;
	
	public FeesType() {
		super();
	}

	public FeesType(int feesTypeId) {
		super();
		this.feesTypeId = feesTypeId;
	}

	public FeesType(int feesTypeId, String feesTypeName, String feesTypeCode,
			String feesTypeDescription) {
		super();
		this.feesTypeId = feesTypeId;
		this.feesTypeName = feesTypeName;
		this.feesTypeCode = feesTypeCode;
		this.feesTypeDescription = feesTypeDescription;
	}

	public int getFeesTypeId() {
		return feesTypeId;
	}

	public void setFeesTypeId(int feesTypeId) {
		this.feesTypeId = feesTypeId;
	}

	public String getFeesTypeName() {
		return feesTypeName;
	}

	public void setFeesTypeName(String feesTypeName) {
		this.feesTypeName = feesTypeName;
	}

	public String getFeesTypeCode() {
		return feesTypeCode;
	}

	public void setFeesTypeCode(String feesTypeCode) {
		this.feesTypeCode = feesTypeCode;
	}

	public String getFeesTypeDescription() {
		return feesTypeDescription;
	}

	public void setFeesTypeDescription(String feesTypeDescription) {
		this.feesTypeDescription = feesTypeDescription;
	}

	@Override
	public String toString() {
		return "FeesType [feesTypeId=" + feesTypeId + ", feesTypeName="
				+ feesTypeName + ", feesTypeCode=" + feesTypeCode
				+ ", feesTypeDescription=" + feesTypeDescription + "]";
	}
	
	
 
}
