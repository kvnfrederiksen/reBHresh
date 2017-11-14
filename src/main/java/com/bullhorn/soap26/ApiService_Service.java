package com.bullhorn.soap26;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name="ApiService", targetNamespace="http://apiservice.bullhorn.com/", wsdlLocation="http://soap-test-backend:8182/webservices-2.6/?wsdl")
public class ApiService_Service
  extends Service
{
  private static final URL APISERVICE_WSDL_LOCATION;
  private static final Logger logger = Logger.getLogger(ApiService_Service.class.getName());
  
  static
  {
    URL url = null;
    try
    {
      URL baseUrl = ApiService_Service.class.getResource(".");
      url = new URL(baseUrl, "http://soap-test-backend:8182/webservices-2.6/?wsdl");
    }
    catch (MalformedURLException e)
    {
      logger.warning("Failed to create URL for the wsdl Location: 'http://soap-test-backend:8182/webservices-2.6/?wsdl', retrying as a local file");
      logger.warning(e.getMessage());
    }
    APISERVICE_WSDL_LOCATION = url;
  }
  
  public ApiService_Service(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }
  
  public ApiService_Service()
  {
    super(APISERVICE_WSDL_LOCATION, new QName("http://apiservice.bullhorn.com/", "ApiService"));
  }
  
  @WebEndpoint(name="ApiServicePort")
  public ApiService getApiServicePort()
  {
    return (ApiService)super.getPort(new QName("http://apiservice.bullhorn.com/", "ApiServicePort"), ApiService.class);
  }
  
  @WebEndpoint(name="ApiServicePort")
  public ApiService getApiServicePort(WebServiceFeature... features)
  {
    return (ApiService)super.getPort(new QName("http://apiservice.bullhorn.com/", "ApiServicePort"), ApiService.class, features);
  }
}
