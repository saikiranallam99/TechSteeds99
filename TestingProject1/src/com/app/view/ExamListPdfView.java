package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.ExamList;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ExamListPdfView extends AbstractPdfView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=ET.pdf");
		List<ExamList> ets=(List<ExamList>) map.get("ets");
		Paragraph p=new Paragraph("Welcome to ExamList PDF file");
		
		PdfPTable t=new PdfPTable(1);
		t.addCell("Name");
		t.addCell("Note");
		
		for(ExamList et:ets){
			 t.addCell(et.getName());
			 t.addCell(et.getNote());
	}
		doc.add(p);
		 doc.add(t);
		 doc.add(new Paragraph(new Date(0).toString()));

}
}