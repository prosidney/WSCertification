
package by.boot.java;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;
import com.webservicesidcert.example.server.ws.impl.GetImageResponse;
import com.webservicesidcert.example.server.ws.impl.GetPersonResponse;
import com.webservicesidcert.example.server.ws.impl.IExistResponse;
import com.webservicesidcert.example.server.ws.impl.ObjectFactory;
import com.webservicesidcert.example.server.ws.impl.Person;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldSOAPImpl", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldSOAPImplCustomized {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorldFrom", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.SayHelloWorldFrom")
    @ResponseWrapper(localName = "sayHelloWorldFromResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.SayHelloWorldFromResponse")
    @Action(input = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/sayHelloWorldFromRequest", output = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/sayHelloWorldFromResponse")
    public String sayHelloWorldFrom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<com.webservicesidcert.example.server.ws.impl.IExistResponse>
     */
    @WebMethod(operationName = "iExist")
    @RequestWrapper(localName = "iExist", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExist")
    @ResponseWrapper(localName = "iExistResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExistResponse")
    public Response<IExistResponse> iExistAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "iExist")
    @RequestWrapper(localName = "iExist", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExist")
    @ResponseWrapper(localName = "iExistResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExistResponse")
    public Future<?> iExistAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<IExistResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iExist", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExist")
    @ResponseWrapper(localName = "iExistResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.IExistResponse")
    @Action(input = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/iExistRequest", output = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/iExistResponse")
    public String iExist(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns javax.xml.ws.Response<com.webservicesidcert.example.server.ws.impl.GetPersonResponse>
     */
    @WebMethod(operationName = "getPerson")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPersonResponse")
    public Response<GetPersonResponse> getPersonAsync();

    /**
     * 
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getPerson")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPersonResponse")
    public Future<?> getPersonAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetPersonResponse> asyncHandler);

    /**
     * 
     * @return
     *     returns com.webservicesidcert.example.server.ws.impl.Person
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPerson")
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetPersonResponse")
    @Action(input = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/getPersonRequest", output = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/getPersonResponse")
    public Person getPerson();

    /**
     * 
     * @param arg0
     * @return
     *     returns javax.xml.ws.Response<com.webservicesidcert.example.server.ws.impl.GetImageResponse>
     */
    @WebMethod(operationName = "getImage")
    @RequestWrapper(localName = "getImage", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImage")
    @ResponseWrapper(localName = "getImageResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImageResponse")
    public Response<GetImageResponse> getImageAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @param asyncHandler
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getImage")
    @RequestWrapper(localName = "getImage", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImage")
    @ResponseWrapper(localName = "getImageResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImageResponse")
    public Future<?> getImageAsync(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetImageResponse> asyncHandler);

    /**
     * 
     * @param arg0
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImage", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImage")
    @ResponseWrapper(localName = "getImageResponse", targetNamespace = "http://impl.ws.server.example.webservicesidcert.com/", className = "com.webservicesidcert.example.server.ws.impl.GetImageResponse")
    @Action(input = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/getImageRequest", output = "http://impl.ws.server.example.webservicesidcert.com/HelloWorldSOAPImpl/getImageResponse")
    public byte[] getImage(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}