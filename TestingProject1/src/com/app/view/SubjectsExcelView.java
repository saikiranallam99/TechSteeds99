package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Subjects;

public class SubjectsExcelView extends AbstractExcelView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		res.addHeader("Content-Disposition", "attachment:filename=SUBJECTS.xls");
		List<Subjects> sbs=(List<Subjects>) map.get("sbs");
		HSSFSheet sheet= book.createSheet("SBS");
		setHead(sheet);
		setBody(sheet,sbs);
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Subject Name");
		row.createCell(1).setCellValue("Subject Type");
		row.createCell(2).setCellValue("Subject Code");

}
	private void setBody(HSSFSheet sheet,List<Subjects> sbs)
	{
		int rownum=1;
		for(Subjects sb:sbs)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(sb.getSubjectname());
			row.createCell(1).setCellValue(sb.getSubject());
			row.createCell(2).setCellValue(sb.getSubjectcode());
			
		}
	}
}
