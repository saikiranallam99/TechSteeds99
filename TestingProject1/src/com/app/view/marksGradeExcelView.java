package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.marksGrade;

public class marksGradeExcelView extends AbstractExcelView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment:filename=MARKSGRADE.xls");
		List<marksGrade> mgs=(List<marksGrade>) map.get("mgs");
		HSSFSheet sheet= book.createSheet("MGS");
		setHead(sheet);
		setBody(sheet,mgs);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Grade Name");
		row.createCell(1).setCellValue("Percent From");
		row.createCell(2).setCellValue("Percent Upto");
		row.createCell(3).setCellValue("Description");
		
	}
	private void setBody(HSSFSheet sheet,List<marksGrade> mgs)
	{
		int rownum=1;
		for(marksGrade mg:mgs)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(mg.getGradename());
			row.createCell(1).setCellValue(mg.getPercentfrom());
			row.createCell(2).setCellValue(mg.getPercentupto());
			row.createCell(3).setCellValue(mg.getDescription());
		}
	}


}
