package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Teachers;

public class TeachersExcelView extends AbstractExcelView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment:filename=TEACHERS.xls");
		List<Teachers> ts=(List<Teachers>) map.get("ts");
		HSSFSheet sheet= book.createSheet("TS");
		setHead(sheet);
		setBody(sheet,ts);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Teacher Name");
		row.createCell(1).setCellValue("Email");
		row.createCell(2).setCellValue("Gender");
		row.createCell(3).setCellValue("Date Of Birth");
		row.createCell(5).setCellValue("ADDRESS");
		row.createCell(6).setCellValue("Phone");
	}
	private void setBody(HSSFSheet sheet,List<Teachers> ts)
	{
		int rownum=1;
		for(Teachers t:ts)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(t.getTeachername());
			row.createCell(1).setCellValue(t.getEmail());
			row.createCell(2).setCellValue(t.getGen());
			row.createCell(3).setCellValue(t.getDob());
			row.createCell(4).setCellValue(t.getTeacherAddr());
			row.createCell(5).setCellValue(t.getPhone());
}
	}
}