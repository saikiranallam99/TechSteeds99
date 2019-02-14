package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Subjects;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class SubjectsPdfView extends AbstractPdfView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=SB.pdf");
		List<Subjects> sbs=(List<Subjects>) map.get("sbs");
		
		Paragraph p=new Paragraph("Welcome to Subjects PDF file");
		
		PdfPTable t=new PdfPTable(3);
		t.addCell("Subject Name");
		t.addCell("Subject Type");
		t.addCell("Subject Code");
		
		for(Subjects sb:sbs){
			 t.addCell(sb.getSubjectname());
			 t.addCell(sb.getSubject());
			 t.addCell(sb.getSubjectcode());
		
		
	}
		doc.add(p);
		 doc.add(t);
		 doc.add(new Paragraph(new Date(0).toString()));
	}
}
