package com.webservicesidcert.example.lowlevel;

import org.xml.sax.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Sidney on 16-12-28.
 */
public class SAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        spf.setValidating(true);

        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();

        xmlReader.setContentHandler(new MyHandler());
        xmlReader.parse("/Users/Sidney/Dev/repositories/JavaWSCertification/src/com/webservicesidcert/example/lowlevel/Example.xml");
    }

    public static class MyHandler implements ContentHandler {

        @Override
        public void setDocumentLocator(Locator locator) {
            System.out.println(locator);
        }

        @Override
        public void startDocument() throws SAXException {
            System.out.println("MyHandler.startDocument");
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("MyHandler.endDocument");
        }

        @Override
        public void startPrefixMapping(String prefix, String uri) throws SAXException {
            System.out.println("MyHandler.startPrefixMapping");
        }

        @Override
        public void endPrefixMapping(String prefix) throws SAXException {
            System.out.println("MyHandler.endPrefixMapping");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
            System.out.println("MyHandler.startElement ->" + localName + ":" +qName);
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            System.out.println("MyHandler.endElement ->" + localName + ":" +qName);
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String text="";
            for (int i=start;i<(start+length);i++){
                text = text.concat(String.valueOf(ch[i]));
            }
            System.out.println(text);
        }

        @Override
        public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
            System.out.println("MyHandler.ignorableWhitespace");
        }

        @Override
        public void processingInstruction(String target, String data) throws SAXException {
            System.out.println("MyHandler.processingInstruction");
        }

        @Override
        public void skippedEntity(String name) throws SAXException {
            System.out.println("MyHandler.skippedEntity");
        }
    }
}
