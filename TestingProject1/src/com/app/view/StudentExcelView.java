package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Student;

public class StudentExcelView extends AbstractExcelView {

	
	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception 
	{
		res.addHeader("Content-Disposition", "attachment:filename=STUDENT.xls");
		List<Student> stus=(List<Student>) map.get("stus");
		HSSFSheet sheet= book.createSheet("STUS");
		setHead(sheet);
		setBody(sheet,stus);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Admission Number");
		row.createCell(1).setCellValue("Roll Number");
		row.createCell(2).setCellValue("Class");
		row.createCell(3).setCellValue("Section");
		row.createCell(5).setCellValue("First Name");
		row.createCell(6).setCellValue("Last Name");
		row.createCell(7).setCellValue("Gender");
		row.createCell(8).setCellValue("Date Of Birth");
		row.createCell(9).setCellValue("Category");
		row.createCell(10).setCellValue("Religion");
		row.createCell(11).setCellValue("Cast");
		row.createCell(12).setCellValue("Mobile Number");
		row.createCell(13).setCellValue("Email");
		row.createCell(14).setCellValue("RTE");
	}	
	private void setBody(HSSFSheet sheet,List<Student> stus)
	{
		int rownum=1;
		for(Student stu:stus)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(stu.getStudentId());
			row.createCell(1).setCellValue(stu.getRlnm());
			row.createCell(2).setCellValue(stu.getClas());
			row.createCell(3).setCellValue(stu.getSections());
			row.createCell(4).setCellValue(stu.getFsnm());
			row.createCell(5).setCellValue(stu.getLsnm());
			row.createCell(6).setCellValue(stu.getGen());
			row.createCell(7).setCellValue(stu.getDob());
			row.createCell(8).setCellValue(stu.getCategory());
			row.createCell(9).setCellValue(stu.getRgn());
			row.createCell(10).setCellValue(stu.getCast());
            row.createCell(11).setCellValue(stu.getMbnm());
			row.createCell(12).setCellValue(stu.getEmail());
			row.createCell(13).setCellValue(stu.getRte());
			
		}
	}

}
