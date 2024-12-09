package th.ac.ku.kps.eng.cpe.soa.lab1.service;

import java.io.*;
import java.util.Iterator;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class TestDom {

	public static void main(String[] args) throws Exception{
		
//		Document doc = DocumentFactory.getInstance().createDocument();
//		Element root  = doc.addElement("root");
//		root.addAttribute("myAttribute","myValue");
//		Element elem = root.addElement("myElem");
//		elem.addText("Hello World");
//		
//		FileOutputStream fos = new FileOutputStream("simple.xml");
//		OutputFormat format = OutputFormat.createPrettyPrint();
//		XMLWriter writer = new XMLWriter(fos,format);
//		writer.write(doc);
//		writer.flush();
//		writer.close();
//		fos.close();
		
		File xml = new File("simple.xml");
		SAXReader reader = new SAXReader();
		Document doc = reader.read(xml);
		Element root = doc.getRootElement();
		
		Iterator i = root.elements().iterator();
		
		while(i.hasNext()) {
			Element e = (Element)i.next();
			System.out.println(e.getPath());
			System.out.println(e.getName());
			System.out.println(e.getData());
		}
	}

}