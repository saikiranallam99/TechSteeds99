package com.app.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Sections;

public class SectionsExcelView extends AbstractExcelView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> map,
			HSSFWorkbook book, HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		res.addHeader("Content-Disposition", "attachment:filename=SECTIONS.xls");
		List<Sections> scs=(List<Sections>) map.get("scs");
		HSSFSheet sheet= book.createSheet("SCS");
		setHead(sheet);
		setBody(sheet,scs);
		
	}
	private void setHead(HSSFSheet sheet)
	{
		int rownum=0;
		HSSFRow row =sheet.createRow(rownum);
		row.createCell(0).setCellValue("Section Name");
		
	}
	private void setBody(HSSFSheet sheet,List<Sections> scs)
	{
		int rownum=1;
		for(Sections sc:scs)
		{
			HSSFRow row =sheet.createRow(rownum++);
			row.createCell(0).setCellValue(sc.getSections());

}
	}
}
