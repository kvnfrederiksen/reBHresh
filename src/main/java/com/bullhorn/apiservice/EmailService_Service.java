
package com.bullhorn.apiservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-hudson-208-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EmailService", targetNamespace = "http://apiservice.bullhorn.com/", wsdlLocation = "https://api.bullhornstaffing.com/webservices-1.1/email?wsdl")
public class EmailService_Service
    extends Service
{

    private final static URL EMAILSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.bullhorn.apiservice.EmailService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.bullhorn.apiservice.EmailService_Service.class.getResource(".");
            url = new URL(baseUrl, "https://api.bullhornstaffing.com/webservices-1.1/email?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://api.bullhornstaffing.com/webservices-1.1/email?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        EMAILSERVICE_WSDL_LOCATION = url;
    }

    public EmailService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmailService_Service() {
        super(EMAILSERVICE_WSDL_LOCATION, new QName("http://apiservice.bullhorn.com/", "EmailService"));
    }

    /**
     * 
     * @return
     *     returns EmailService
     */
    @WebEndpoint(name = "EmailServicePort")
    public EmailService getEmailServicePort() {
        return super.getPort(new QName("http://apiservice.bullhorn.com/", "EmailServicePort"), EmailService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmailService
     */
    @WebEndpoint(name = "EmailServicePort")
    public EmailService getEmailServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://apiservice.bullhorn.com/", "EmailServicePort"), EmailService.class, features);
    }

}
