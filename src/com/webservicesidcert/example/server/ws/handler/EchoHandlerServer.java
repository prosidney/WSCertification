package com.webservicesidcert.example.server.ws.handler;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Set;

/**
 * Created by Sidney on 16-12-16.
 */
public class EchoHandlerServer implements SOAPHandler<SOAPMessageContext> {
    public boolean handleMessage(SOAPMessageContext ctx) {

        Boolean isResponse = (Boolean) ctx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        System.out.println("MESSAGE_OUTBOUND_PROPERTY[" + isResponse + "]");

        return true; // continue down the chain
    }
    public boolean handleFault(SOAPMessageContext ctx) {
        return true;
    }
    public Set<QName> getHeaders() {
        return null;
    }
    public void close(MessageContext messageContext) {
    }
}