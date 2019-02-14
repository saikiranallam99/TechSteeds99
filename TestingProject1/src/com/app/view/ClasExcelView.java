package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Clas;

public class ClasExcelView extends AbstractExcelView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment:filename=CLAS.xls");
		List<Clas> css=(List<Clas>) map.get("css");
		HSSFSheet sheet= book.createSheet("CSS");
		setHead(sheet);
		setBody(sheet,css);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Class");
		row.createCell(1).setCellValue("Section");
		
	}
	private void setBody(HSSFSheet sheet,List<Clas> css)
	{
		int rownum=1;
		for(Clas cs:css)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(cs.getClas());
			row.createCell(1).setCellValue(cs.getSections());

}
	}

}
