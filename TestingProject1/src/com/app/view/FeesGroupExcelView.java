package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.FeesGroup;



public class FeesGroupExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		res.addHeader("Content-Disposition", "attachment;filename=FEEGROUPS.xls");
		
		//data
		@SuppressWarnings("unchecked")
		List<FeesGroup> feesGroups=(List<FeesGroup>) map.get("feesGroups");
		//create a sheet
		HSSFSheet sheet=book.createSheet("FEEGROUPS");
		//set head
		setHead(sheet);
		//set body
		setBody(sheet, feesGroups);
	}
	
	private void setHead(HSSFSheet sheet){
		int rownum=0;
		HSSFRow row=sheet.createRow(rownum);
		row.createCell(0).setCellValue("Name");
		
		
		
	}
	private void setBody(HSSFSheet sheet,List<FeesGroup> feesGroups){
		int rownum=1;
		for(FeesGroup group:feesGroups){
			HSSFRow row=sheet.createRow(rownum++);
			row.createCell(0).setCellValue(group.getFeesGroupName());
			
		
		}
	}
	
}	
	
	
	