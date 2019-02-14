package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Student;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPdfView extends AbstractPdfView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=STU.pdf");
		List<Student> stus=(List<Student>) map.get("stus");
		Paragraph p=new Paragraph("Welcome to Student PDF file");
		
		PdfPTable t=new PdfPTable(15);
		t.addCell("Admission Number");
		t.addCell("Roll Number");
		t.addCell("Class");
		t.addCell("Section");
		t.addCell("First Name");
		t.addCell("Last Name");
		t.addCell("Gender");
		t.addCell("Date Of Birth");
		t.addCell("Category");
		t.addCell("Religion");
		t.addCell("Cast");
		t.addCell("Mobile Number");
		t.addCell("Email");
		t.addCell("Admission Date");
		t.addCell("RTE");
		
		
		 for(Student stu:stus){
			 t.addCell(stu.getStudentId()+" ");
			 t.addCell(stu.getRlnm());
			 t.addCell(stu.getClas());
			 t.addCell(stu.getSections());
			 t.addCell(stu.getFsnm());
			 t.addCell(stu.getLsnm());
			 t.addCell(stu.getGen());
			 t.addCell(stu.getDob());
			 t.addCell(stu.getCategory());
			 t.addCell(stu.getRgn());
			 t.addCell(stu.getCast());
			 t.addCell(stu.getMbnm());
			 t.addCell(stu.getEmail());
			 t.addCell(stu.getAddt());
			 t.addCell(stu.getRte());
			 
			
		 }
		 
		 doc.add(p);
		 doc.add(t);
		 doc.add(new Paragraph(new Date(0).toString()));
	
	}
	
	

}
