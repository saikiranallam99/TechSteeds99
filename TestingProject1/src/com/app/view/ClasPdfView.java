package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Clas;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ClasPdfView extends AbstractPdfView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=CS.pdf");
		List<Clas> css=(List<Clas>) map.get("css");
		Paragraph p=new Paragraph("Welcome to Clas PDF file");
		
		PdfPTable t=new PdfPTable(2);
		t.addCell("Class");
		t.addCell("Section");
		
		for(Clas cs:css){
			 t.addCell(cs.getClas());
			 t.addCell(cs.getSections());
	}
	
	doc.add(p);
	doc.add(t);
	 doc.add(new Paragraph(new Date(0).toString()));
	}
}

