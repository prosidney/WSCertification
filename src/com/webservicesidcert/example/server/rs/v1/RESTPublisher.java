package com.webservicesidcert.example.server.rs.v1;

import javax.xml.ws.Endpoint;

/**
 * Created by Sidney on 16-12-17.
 */
public class RESTPublisher {
    public static void main(String[ ] args) {
        int port = 8888;
        String url = "http://localhost:" + port + "/";
        System.out.println("Restfully publishing on port " + port);
        Endpoint.publish(url, new HelloWorldRESTImpl());
    }
}
