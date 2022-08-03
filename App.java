package com.jaxb;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                                                 ("beans.xml");
        ObjXMLMapper objXMLMapper = context.getBean("objXmlmapper", ObjXMLMapper.class);

        try {
         objXMLMapper.objToXML();
         objXMLMapper.XMLToObj();
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        } catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        context.close();
    }
}
