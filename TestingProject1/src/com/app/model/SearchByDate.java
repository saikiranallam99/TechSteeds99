package com.app.model;

import java.util.Date;

public class SearchByDate 
{
     Date dateFrom;
     Date dateTo;
	public SearchByDate() {
		super();
	}
	public SearchByDate(Date dateFrom, Date dateTo) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}
	@Override
	public String toString() {
		return "SearchByDate [dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ "]";
	}
     
     
}
