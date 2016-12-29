package com.webservicesidcert.example.client.ws.port;

import com.sun.xml.ws.api.addressing.WSEndpointReference;
import com.webservicesidcert.example.client.ws.port.handler.ClientHandler;
import com.webservicesidcert.example.client.ws.port.handler.EchoHandlerClient;
import com.webservicesidcert.example.server.ws.impl.HelloWorldSOAP;

import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sidney on 16-12-16.
 */
public class HelloWorldClient {
    public static void main(String[] argv) throws MalformedURLException {
        QName serviceName = new QName("http://impl.ws.server.example.webservicesidcert.com/", "HelloWorldSOAPImplService");
        URL url = new URL("http://localhost:9000/HelloWorld?wsdl");

        Service s = Service.create(url, serviceName);
        QName portname = s.getPorts().next();
        HelloWorldSOAP port = s.getPort(portname, HelloWorldSOAP.class, new AddressingFeature(true, false, AddressingFeature.Responses.NON_ANONYMOUS));


        List<Handler> hchain = new LinkedList<Handler>();
        hchain.add(new EchoHandlerClient());
        hchain.add(new ClientHandler());

        //Pegando Bindings da porta
        Binding binding = ((BindingProvider) port).getBinding();
        binding.setHandlerChain(hchain);


        System.out.println(port.sayHelloWorldFrom("Opa"));
        /*
        System.out.println(port.iExist("Sidney"));
        System.out.println(port.getImage(null));
        System.out.println(port.getPerson().getName());
        */
    }
}
