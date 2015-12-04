package test;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BankService {

    private static final BankService instance = new BankService();

    private static final String FILE_PATH = "Banks.xml";

    public InputStream getInputSource(){
        return this.getClass().getClassLoader().getResourceAsStream(FILE_PATH);
    }
    private BankService(){}

    public static BankService getInstance() {
        return instance;
    }

    public static void main(String [] args){
        BankService bankService = new BankService();
        InputStream inputStream = bankService.getInputSource();
        InputSource inputSource = new InputSource(inputStream);

        List<Bank> listResult = null;
        try {
            listResult = BankObjectList.banks(inputSource);
            System.out.println(listResult);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
