package com.mit.service;

import java.io.FileOutputStream;

import org.springframework.stereotype.Service;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.layout.font.FontProvider;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

@Service
public class PdfService {
	
	public void makePdf(Document document, FileOutputStream os, String html) throws Exception {
		PdfWriter writer = PdfWriter.getInstance(document, os);
		
		document.open();
		
		XMLWorkerHelper helper = XMLWorkerHelper.getInstance();
		
		FontProvider fp = new FontProvider();
		fp.addFont("C:\\Users\\ABC\\git\\PurchaseOrder\\src\\main\\webapp\\resources\\fonts\\MALGUN.TTF");
		
		ConverterProperties cp = new ConverterProperties();
		cp.setCharset("utf-8");
		cp.setFontProvider(fp);
		
		html = "<html><head><link href=\"C:\\Users\\ABC\\git\\PurchaseOrder\\src\\main\\webapp\\resources\\css\\printpo.css\" rel=\"stylesheet\"></head><body>" + html;
		html += "</body></html>";
		
		HtmlConverter.convertToPdf(html, os, cp);
	}
}
