package com.webservicesidcert.example.server.ws.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.awt.*;

/**
 * Created by Sidney on 16-12-16.
 */
@WebService
public interface HelloWorldSOAP {
    @WebMethod
    public String sayHelloWorldFrom(String from);

    @WebMethod
    public String iExist(String from);

    @WebMethod
    public com.webservicesidcert.example.wsimport.Person getPerson();

    @WebMethod
    public Image getImage(String name);
}
