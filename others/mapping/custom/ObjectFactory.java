
package mapping.custom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mapping.custom package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetImage_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "getImage");
    private final static QName _SayHelloWorldFrom_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "sayHelloWorldFrom");
    private final static QName _IExist_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "iExist");
    private final static QName _SayHelloWorldFromResponse_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "sayHelloWorldFromResponse");
    private final static QName _GetPersonResponse_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "getPersonResponse");
    private final static QName _GetPerson_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "getPerson");
    private final static QName _GetImageResponse_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "getImageResponse");
    private final static QName _IExistResponse_QNAME = new QName("http://impl.ws.server.example.webservicesidcert.com/", "iExistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mapping.custom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImageResponse }
     * 
     */
    public GetImageResponse createGetImageResponse() {
        return new GetImageResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link IExistResponse }
     * 
     */
    public IExistResponse createIExistResponse() {
        return new IExistResponse();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFromResponse }
     * 
     */
    public SayHelloWorldFromResponse createSayHelloWorldFromResponse() {
        return new SayHelloWorldFromResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorldFrom }
     * 
     */
    public SayHelloWorldFrom createSayHelloWorldFrom() {
        return new SayHelloWorldFrom();
    }

    /**
     * Create an instance of {@link GetImage }
     * 
     */
    public GetImage createGetImage() {
        return new GetImage();
    }

    /**
     * Create an instance of {@link IExist }
     * 
     */
    public IExist createIExist() {
        return new IExist();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "getImage")
    public JAXBElement<GetImage> createGetImage(GetImage value) {
        return new JAXBElement<GetImage>(_GetImage_QNAME, GetImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "sayHelloWorldFrom")
    public JAXBElement<SayHelloWorldFrom> createSayHelloWorldFrom(SayHelloWorldFrom value) {
        return new JAXBElement<SayHelloWorldFrom>(_SayHelloWorldFrom_QNAME, SayHelloWorldFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IExist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "iExist")
    public JAXBElement<IExist> createIExist(IExist value) {
        return new JAXBElement<IExist>(_IExist_QNAME, IExist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldFromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "sayHelloWorldFromResponse")
    public JAXBElement<SayHelloWorldFromResponse> createSayHelloWorldFromResponse(SayHelloWorldFromResponse value) {
        return new JAXBElement<SayHelloWorldFromResponse>(_SayHelloWorldFromResponse_QNAME, SayHelloWorldFromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "getImageResponse")
    public JAXBElement<GetImageResponse> createGetImageResponse(GetImageResponse value) {
        return new JAXBElement<GetImageResponse>(_GetImageResponse_QNAME, GetImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IExistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.ws.server.example.webservicesidcert.com/", name = "iExistResponse")
    public JAXBElement<IExistResponse> createIExistResponse(IExistResponse value) {
        return new JAXBElement<IExistResponse>(_IExistResponse_QNAME, IExistResponse.class, null, value);
    }

}
