package com.webservicesidcert.example.server.rs.v1;

import javax.annotation.Resource;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.*;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.http.HTTPBinding;
import javax.xml.ws.http.HTTPException;
import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@WebServiceProvider // generic service provider
@ServiceMode(Service.Mode.MESSAGE) // entire message available
@BindingType(HTTPBinding.HTTP_BINDING) // versus SOAP binding
public class HelloWorldRESTImpl implements Provider<Source> {
    @Resource
    protected WebServiceContext wctx; // dependency injection

    public HelloWorldRESTImpl() {
    }

    // Implement the Provider interface by defining invoke, which expects an XML
    // source (perhaps null) and returns an XML source (perhaps null).
    public Source invoke(Source request) {
        if (wctx == null) throw new RuntimeException("Injection failed on wctx.");

        MessageContext mctx = wctx.getMessageContext();
        String httpVerb = (String) mctx.get(MessageContext.HTTP_REQUEST_METHOD);
        httpVerb = httpVerb.trim().toUpperCase();

        List<String> retorno = new ArrayList<String>();
        retorno.add("Oi");
        retorno.add("AMOR");
        retorno.add("EU");
        retorno.add("TE");
        retorno.add("AMO");

        if (httpVerb.equals("GET")) return toSource(toXml(retorno.toArray()));
        else if (httpVerb.equals("POST")) return toSource("OI POST");
        else if (httpVerb.equals("PUT")) return toSource("OI PUT");
        else if (httpVerb.equals("DELETE")) return toSource("OI DELETE");
        else throw new HTTPException(405); // bad verb
    }

    private String toXml(Object obj) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XMLEncoder enc = new XMLEncoder(out);
        enc.writeObject(obj);
        enc.close();

        return out.toString();
    }

    private StreamSource toSource(String str) {
        return new StreamSource(new StringReader(str));
    }
}