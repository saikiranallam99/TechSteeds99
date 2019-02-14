package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.ExamList;

public class ExamListExcelView extends AbstractExcelView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment:filename=EXAMLIST.xls");
		List<ExamList> ets=(List<ExamList>) map.get("ets");
		HSSFSheet sheet= book.createSheet("ETS");
		setHead(sheet);
		setBody(sheet,ets);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Name");
		row.createCell(1).setCellValue("Note");
		
	}
	private void setBody(HSSFSheet sheet,List<ExamList> ets)
	{
		int rownum=1;
		for(ExamList et:ets)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(et.getName());
			row.createCell(1).setCellValue(et.getNote());
		}
	}

}
