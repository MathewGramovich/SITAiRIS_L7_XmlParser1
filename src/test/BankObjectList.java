package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class BankObjectList {
	public static List<Bank> banks(InputSource inputSource) throws SAXException, ParserConfigurationException, IOException {
		List<Bank> banks = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document document = db.parse("Banks.xml");
		
		Element root = document.getDocumentElement();
		banks = BankAnalyzer.listBuilder(root);
		
		return banks;
	}
}