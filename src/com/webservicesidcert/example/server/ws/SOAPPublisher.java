package com.webservicesidcert.example.server.ws;

import com.webservicesidcert.example.server.ws.handler.EchoHandlerServer;
import com.webservicesidcert.example.server.ws.handler.ServiceHandler;
import com.webservicesidcert.example.server.ws.impl.HelloWorldSOAPImpl;

import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;
import java.util.ArrayList;

/**
 * Created by Sidney on 16-12-17.
 */
public class SOAPPublisher {

    public static void main(String[] argv) {
        Object implementor = new HelloWorldSOAPImpl();
        String address = "http://localhost:9000/HelloWorld";

        final Endpoint endpoint = Endpoint.create(implementor);

        final Binding binding = endpoint.getBinding();
        final ArrayList<Handler> handlerChain = new ArrayList<Handler>();
        handlerChain.add(new EchoHandlerServer());
        handlerChain.add(new ServiceHandler());
        binding.setHandlerChain(handlerChain);

        //SOAPBinding soapBinding = (SOAPBinding) endpoint.getBinding();
        //soapBinding.setMTOMEnabled(true);

        endpoint.publish(address);
    }
}
