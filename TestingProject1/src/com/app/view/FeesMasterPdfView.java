package com.app.view;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.FeesMaster;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class FeesMasterPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		res.addHeader("Content-Disposition", "attachment;filename=FEEMASTERS.pdf");
		
		//1. read data from model map
		@SuppressWarnings("unchecked")
		List<FeesMaster> feesMasters=(List<FeesMaster>) map.get("feesMasters");
		
		//2. create elements
		//paragraph
		Paragraph p=new Paragraph("Welcome to feesMasters PDF File!!");
		
		
		//table with heading data
		PdfPTable table=new PdfPTable(2);
		table.addCell("Fees Group");
		table.addCell("Fees Type");
		
		//JDK 1.5
		for(FeesMaster feesMaster:feesMasters){
			table.addCell(feesMaster.getFeesGroupName()+"");
			table.addCell(feesMaster.getFeesTypeName());
			
		}
		
		
		//3. add elements to document
		doc.add(p);
		doc.add(table);
		doc.add(new Paragraph("-=-=-=-=-==--=-"));
		doc.add(new Paragraph(new Date().toString()));
		
		
	}

	
}
