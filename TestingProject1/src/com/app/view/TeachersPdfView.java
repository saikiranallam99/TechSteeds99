package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Teachers;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class TeachersPdfView extends AbstractPdfView{

	@SuppressWarnings({ "unchecked" })
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=TS.pdf");
		List<Teachers> ts=(List<Teachers>) map.get("ts");
		Paragraph p=new Paragraph("Welcome to Teachers PDF file");
		
		PdfPTable t1=new PdfPTable(6);
		
		t1.addCell("Teacher Name");
		t1.addCell("Email");
		t1.addCell("Gender");
		t1.addCell("Date Of Birth");
		t1.addCell("ADDRESS");
		t1.addCell("Phone");
		
		
		for(Teachers t:ts){
			 t1.addCell(t.getTeachername());
			 t1.addCell(t.getEmail());
			 t1.addCell(t.getGen());
			 t1.addCell(t.getDob());
			 t1.addCell(t.getTeacherAddr());
			 t1.addCell(t.getPhone());
		
	}
		doc.add(p);
		 doc.add(t1);
		 doc.add(new Paragraph(new Date(0).toString()));

}
}
