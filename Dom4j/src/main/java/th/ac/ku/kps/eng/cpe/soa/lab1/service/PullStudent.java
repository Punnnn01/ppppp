package th.ac.ku.kps.eng.cpe.soa.lab1.service;

import java.io.*;
import java.util.Iterator;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class PullStudent {
	public static void main(String[] args) {
		 try {
		 File inputFile = new File("student.xml");
		 SAXReader reader = new SAXReader();
		 Document document = reader.read( inputFile );
		 System.out.println("Root element :" +
		document.getRootElement().getName());
		 Element classElement = document.getRootElement();
		 java.util.List<org.dom4j.Node> nodes =
		document.selectNodes("/class/student[@rollno = '493']" );
		 System.out.println("----------------------------");
		 for (org.dom4j.Node node : nodes) {
		 System.out.println("\nCurrent Element :"
		 + node.getName());
		 System.out.println("Student roll no : "
		 + node.valueOf("@rollno") );
		 System.out.println("First Name : "
		 +
		node.selectSingleNode("firstname").getText());
		 System.out.println("Last Name : "
		 +
		node.selectSingleNode("lastname").getText());
		 System.out.println("First Name : "
		 +
		node.selectSingleNode("nickname").getText());
		 System.out.println("Marks : "
		 +
		node.selectSingleNode("marks").getText());
		 }
		 } catch (DocumentException e) {
		 e.printStackTrace();
		 }
		}
}
