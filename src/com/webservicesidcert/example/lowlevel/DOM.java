package com.webservicesidcert.example.lowlevel;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by Sidney on 16-12-28.
 */
public class DOM {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("DOM.main");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        dbf.setValidating(false);

        DocumentBuilder db = dbf.newDocumentBuilder();

        final Document document =
                db.parse(new File("/Users/Sidney/Dev/repositories/JavaWSCertification/src/com/webservicesidcert/example/lowlevel/Example.xml"));


        final NodeList childNodes = document.getChildNodes();

        for (int i=0 ; i< childNodes.getLength() ; i++){
            printlnCommon(childNodes.item(0));
        }
    }

    private static void printlnCommon(Node n) {
        System.out.print(" nodeName=\"" + n.getNodeName() + "\"");

        String val = n.getNamespaceURI();
        if (val != null) {
            //System.out.print(" uri=\"" + val + "\"");
        }

        val = n.getPrefix();

        if (val != null) {
            //System.out.print(" pre=\"" + val + "\"");
        }

        val = n.getLocalName();
        if (val != null) {
            //System.out.print(" local=\"" + val + "\"");
        }

        val = n.getNodeValue();
        if (val != null) {
            System.out.print(" nodeValue=");
            if (val.trim().equals("")) {
                // Whitespace
                //System.out.print("[WS]");
            } else {
                System.out.print("\"" + n.getNodeValue() + "\"");
            }
        }

        for (int i=0 ; i< n.getChildNodes().getLength() ; i++){
            printlnCommon(n.getChildNodes().item(i));
        }


        System.out.println();
    }
}
