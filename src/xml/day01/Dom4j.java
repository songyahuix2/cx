package xml.day01;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.omg.SendingContext.RunTime;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


/**
 * @author shkstart
 * @date 8/20/2019 - 2:38 PM
 */
public class Dom4j extends DefaultHandler {
    public static void create(){
        Runtime r = Runtime.getRuntime();
        File file = new File("F:\\xml");
        Document doc = DocumentHelper.createDocument();
        doc.addComment("这里是注释");
        Element root = doc.addElement("students");
        Element stuEle = root.addElement("student");
        stuEle.addAttribute("id","101");
        Element nameEle = stuEle.addElement("name");
        nameEle.setText("张三");
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setEncoding("utf-8");
        Writer out;
        try {
            out = new FileWriter(file.getAbsolutePath()+"new.xml");
            XMLWriter writer = new XMLWriter(out,format);
            writer.write(doc);
            writer.close();
            System.out.println("生成xml文件成功");
        } catch (IOException e) {
            System.out.println("生成xml文件失败");
            e.printStackTrace();
        }

    }
    public void parse(){
        String xmlFilePath = "src/GoodsMapper.xml";
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = null;
        try {
            saxParser = parserFactory.newSAXParser();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        try {
            saxParser.parse(xmlFilePath,this);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

    }

}
