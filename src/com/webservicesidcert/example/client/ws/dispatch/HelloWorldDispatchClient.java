package com.webservicesidcert.example.client.ws.dispatch;


import com.webservicesidcert.example.client.ws.dispatch.handler.DispatchHandler;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Binding;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sidney on 16-12-16.
 */
public class HelloWorldDispatchClient {
    public static void main(String[] argv) throws MalformedURLException {
        URL url = new URL("http://localhost:9000/HelloWorld?wsdl");
        try{
            QName serviceName = new QName("http://ws.server.example.webservicesidcert.com/", "HelloWorldSOAPImplService");
            QName port = new QName("http://ws.server.example.webservicesidcert.com/", "HelloWorldSOAPImplPort");

            Service service = Service.create(url, serviceName);
            Dispatch<Source> dispatch = service.createDispatch(port, Source.class, Service.Mode.PAYLOAD);


            List<Handler> hchain = new LinkedList<Handler>();
            hchain.add(new DispatchHandler());

            //Pegando Bindings do Dispatch
            Binding binding = dispatch.getBinding();
            binding.setHandlerChain(hchain);

            String payload =
                    "<ns2:sayHelloWorldFrom xmlns:ns2=\"http://ws.server.example.webservicesidcert.com/\">\n" +
                    "<arg0>Sidney</arg0>\n" +
                    "</ns2:sayHelloWorldFrom>\n";
            Source source = createStreamSource(payload);
            Source result = dispatch.invoke(source);
            System.out.println(DOMToString(result));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private static StreamSource createStreamSource(String request){
        return new StreamSource(new ByteArrayInputStream(request.getBytes()));
    }

    private static String DOMToString(Source source) throws TransformerException {
        StringWriter sw = new StringWriter();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();


        transformer.transform(source, new StreamResult(sw));

        return sw.toString();
    }
}
