package com.app.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.FeesGroup;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class FeesGroupPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc,
			PdfWriter pw, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		
		res.addHeader("Content-Disposition", "attachment;filename=FEEGROUPS.pdf");
		
		//1. read data from model map
		@SuppressWarnings("unchecked")
		List<FeesGroup> feesGroups=(List<FeesGroup>) map.get("feesGroups");
		
		//2. create elements
		//paragraph
		Paragraph p=new Paragraph("Welcome to feesGroups PDF File!!");
		
		
		//table with heading data
		PdfPTable table=new PdfPTable(1);
		table.addCell("Name");
	
		
		//JDK 1.5
		for(FeesGroup feesGroup:feesGroups){
			table.addCell(feesGroup.getFeesGroupName()+"");
			
			
		}
		
		
		//3. add elements to document
		doc.add(p);
		doc.add(table);
		doc.add(new Paragraph("-=-=-=-=-==--=-"));
		doc.add(new Paragraph(new Date().toString()));
		
		
	}

	
}
