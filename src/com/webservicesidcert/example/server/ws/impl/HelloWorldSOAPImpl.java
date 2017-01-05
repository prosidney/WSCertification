package com.webservicesidcert.example.server.ws.impl;

import com.webservicesidcert.example.server.ws.model.Person;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.Addressing;
import javax.xml.ws.soap.AddressingFeature;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Iterator;

/**
 * Created by Sidney on 16-12-10.
 */
@WebService
//@BindingType(value = javax.xml.ws.ws.SOAPBinding.SOAP11HTTP_MTOM_BINDING)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@Addressing(enabled = true, required = false, responses = AddressingFeature.Responses.ANONYMOUS)
public class HelloWorldSOAPImpl{

  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }

  @WebMethod
  public String iExist(String from) {
    String result = "I Exist, " + from;
    System.out.println(result);
    return result;
  }

    @WebMethod
    public Person getPerson() {
        Person p = new Person();
        p.setName("Sidney");
        p.setAge(28);

        return p;
    }

    @WebMethod
    public Image getImage(String name) {
        return createImage(name);
    }

    private Image createImage(String name) {
        byte[ ] bytes = getRawBytes(name);
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        Iterator iterators = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader iterator = (ImageReader) iterators.next();
        Image image = null;
        try {
            ImageInputStream iis = ImageIO.createImageInputStream(in);
            iterator.setInput(iis, true);
            image = iterator.read(0);
        }
        catch(Exception e) { throw new RuntimeException(e);} return image;
    }

    private byte[ ] getRawBytes(String fileName) {
        if (fileName == null) fileName = "//Users//Sidney//Desktop//patinho_feio.jpeg";
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            FileInputStream in = new FileInputStream(fileName);
            if (in == null) in = new FileInputStream("nordic.jpg");
            byte[] buffer = new byte[2048];
            int n = 0;
            while ((n = in.read(buffer)) != -1)
                out.write(buffer, 0, n); // append to array
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return out.toByteArray();
    }
}
