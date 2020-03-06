package xml.day01;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author shkstart
 * @date 8/20/2019 - 12:56 PM
 */
public class DomParseDemo {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        Document document = null;
            try {
                documentBuilder = factory.newDocumentBuilder();
            } catch (ParserConfigurationException e) {
                e.printStackTrace();
            }
        try {
            document = documentBuilder.parse("f:\\01_Program\\java\\java教程\\sispark\\KIEF\\01课件\\xml\\01_xml_概述与解析\\课堂代码"+ File.separator+"transport.xml");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Element rootElement = document.getDocumentElement();
        System.out.println(rootElement.getTagName());
        NodeList nodeList = document.getElementsByTagName("resultcode");

    }
}
