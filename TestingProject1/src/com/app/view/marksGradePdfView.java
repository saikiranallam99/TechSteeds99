package com.app.view;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.marksGrade;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class marksGradePdfView extends AbstractPdfView{

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment;filename=MGS.pdf");
		List<marksGrade> mgs=(List<marksGrade>) map.get("mgs");
		Paragraph p=new Paragraph("Welcome to marksGrade PDF file");
		
		PdfPTable t=new PdfPTable(4);
		
		t.addCell("Grade Name");
		t.addCell("Percent From");
		t.addCell("Percent Upto");
		t.addCell("Description");
		
		
		
		for(marksGrade mg:mgs){
			 t.addCell(mg.getGradename());
			// t.addCell(mg.getPercentfrom());
			// t.addCell(mg.getPercentupto());
			 t.addCell(mg.getDescription());
			 
		
	}
		doc.add(p);
		 doc.add(t);
		 doc.add(new Paragraph(new Date(0).toString()));

}
}

