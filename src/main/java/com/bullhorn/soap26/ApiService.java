package com.bullhorn.soap26;

import java.util.List;
import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name="ApiService", targetNamespace="http://apiservice.bullhorn.com/")
@XmlSeeAlso({ObjectFactory.class})
public abstract interface ApiService
{
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getApplicationServerHost", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.GetApplicationServerHost")
  @ResponseWrapper(localName="getApplicationServerHostResponse", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.GetApplicationServerHostResponse")
  public abstract String getApplicationServerHost(@WebParam(name="username", targetNamespace="") String paramString1, @WebParam(name="source", targetNamespace="") String paramString2);

  @WebMethod(operationName="_exportApiEnums")
  @RequestWrapper(localName="_exportApiEnums", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.ExportApiEnums")
  @ResponseWrapper(localName="_exportApiEnumsResponse", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.ExportApiEnumsResponse")
  public abstract void exportApiEnums(@WebParam(name="arg0", targetNamespace="") String paramString);
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="getUserSamlInformation", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.GetUserSamlInformation")
  @ResponseWrapper(localName="getUserSamlInformationResponse", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.GetUserSamlInformationResponse")
  public abstract ApiGetUserSamlInformationResult getUserSamlInformation(@WebParam(name="session", targetNamespace="") String paramString, @WebParam(name="corporateUserId", targetNamespace="") int paramInt);
  
  @WebMethod
  @WebResult(targetNamespace="")
  @RequestWrapper(localName="startSession", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.StartSession")
  @ResponseWrapper(localName="startSessionResponse", targetNamespace="http://apiservice.bullhorn.com/", className="com.bullhorn.soap26.StartSessionResponse")
  public abstract ApiStartSessionResult startSession(@WebParam(name="username", targetNamespace="") String paramString1, @WebParam(name="password", targetNamespace="") String paramString2, @WebParam(name="apiKey", targetNamespace="") String paramString3);
  
  }
