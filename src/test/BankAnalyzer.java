package test;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankAnalyzer {
	private static final String ELEMENT_BANK = "bank";
	private static final String ELEMENT_COUNTRY = "country";
	private static final String ELEMENT_BANK_NAME = "name-Bank";
	private static final String ELEMENT_DEPOSIT = "deposit";
	private static final String ELEMENT_DEPOSITOR = "depositor";
	private static final String ELEMENT_ACCOUNT = "account-Id";
	private static final String ELEMENT_AMOUNT = "amount-On-Deposit";
	private static final String ELEMENT_PROFITABILITY = "profitability";
	private static final String ELEMENT_TIME = "time-Constraints";
	
	private static final String ATTRIBUTE_DEPOSIT = "typeDeposit";
	
	public static List<Bank> listBuilder(Element root)
			throws SAXException, IOException {

		ArrayList<Bank> banks = new ArrayList<>();
		NodeList banksNodes = root.getElementsByTagName(ELEMENT_BANK);
		Bank tempBank = null;

		for (int i = 0; i < banksNodes.getLength(); i++) {
			Element bankNode = (Element) banksNodes.item(i);
			tempBank = new Bank();
			tempBank.setCountry(getChildValue(bankNode, ELEMENT_COUNTRY));
			tempBank.setNameBank(getChildValue(bankNode, ELEMENT_BANK_NAME));
			tempBank.getDeposit().setDeposit(getChildElement(bankNode, ELEMENT_DEPOSIT).getAttribute(ATTRIBUTE_DEPOSIT));
			tempBank.getDeposit().setDepositor(
					getChildValue(bankNode, ELEMENT_DEPOSITOR));
			tempBank.getDeposit().setAccountId(
					getChildValue(bankNode, ELEMENT_ACCOUNT));
			tempBank.getDeposit().setAmountOnDeposit(
							Integer.valueOf(getChildValue(bankNode,
									ELEMENT_AMOUNT)));
			tempBank.getDeposit().setProfitability(
					Double.valueOf(getChildValue(bankNode, ELEMENT_PROFITABILITY)));
			tempBank.getDeposit().setTimeConstraints(
					getChildValue(bankNode, ELEMENT_TIME));

			banks.add(tempBank);
		}
		return banks;
	}

	private static Element getChildElement(Element parent, String childName) {
		NodeList nodes = parent.getElementsByTagName(childName);
		Element child = (Element) nodes.item(0);
		return child;
	}

	private static String getChildValue(Element parent, String childElement) {
		Element child = getChildElement(parent, childElement);
		Node node = child.getFirstChild();
		String value = node.getNodeValue().trim();
		return value;
	}
}