package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.FeesMaster;

public class FeesMasterExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		res.addHeader("Content-Disposition", "attachment;filename=FEEMASTERS.xls");
		
		//data
		@SuppressWarnings("unchecked")
		List<FeesMaster> feesMasters=(List<FeesMaster>) map.get("feesMasters");
		//create a sheet
		HSSFSheet sheet=book.createSheet("FEEMASTERS");
		//set head
		setHead(sheet);
		//set body
		setBody(sheet, feesMasters);
	}
	
	private void setHead(HSSFSheet sheet){
		int rownum=0;
		HSSFRow row=sheet.createRow(rownum);
		row.createCell(0).setCellValue("Fees Group");
		row.createCell(1).setCellValue("Fees Type");
		
		
	}
	private void setBody(HSSFSheet sheet,List<FeesMaster> feesMasters){
		int rownum=1;
		for(FeesMaster master:feesMasters){
			HSSFRow row=sheet.createRow(rownum++);
			row.createCell(0).setCellValue(master.getFeesGroupName());
			row.createCell(1).setCellValue(master.getFeesTypeName());
		
		}
	}
	
}	
	
	
	
	
	
	