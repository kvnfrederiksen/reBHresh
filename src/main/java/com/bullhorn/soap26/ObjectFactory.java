package com.bullhorn.soap26;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.bullhorn.soap26.StartSessionResponse;
import com.bullhorn.soap26.ExportApiEnumsResponse;

@XmlRegistry
public class ObjectFactory
{
	private static final QName _GetUserSamlInformation_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserSamlInformation");
	private static final QName _GetUserSamlInformationResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getUserSamlInformationResponse");
    private static final QName _GetApplicationServerHostResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "getApplicationServerHostResponse");
  private static final QName _ExportApiEnums_QNAME = new QName("http://apiservice.bullhorn.com/", "_exportApiEnums");
  private static final QName _StartSession_QNAME = new QName("http://apiservice.bullhorn.com/", "startSession");
  private static final QName _StartSessionResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "startSessionResponse");
  private static final QName _ExportApiEnumsResponse_QNAME = new QName("http://apiservice.bullhorn.com/", "_exportApiEnumsResponse");
  private static final QName _GetApplicationServerHost_QNAME = new QName("http://apiservice.bullhorn.com/", "getApplicationServerHost");

  public GetApplicationServerHostResponse createGetApplicationServerHostResponse()
  {
    return new GetApplicationServerHostResponse();
  }
  
  public GetApplicationServerHost createGetApplicationServerHost()
  {
    return new GetApplicationServerHost();
  }
  
  public StartSessionResponse createStartSessionResponse()
  {
    return new StartSessionResponse();
  }
  
  public StartSession createStartSession()
  {
    return new StartSession();
  }
  
  public ApiResult createApiResult()
  {
    return new ApiResult();
  }
  
  public ApiStartSessionResult createApiStartSessionResult()
  {
    return new ApiStartSessionResult();
  }
  
  public ExportApiEnumsResponse createExportApiEnumsResponse()
  {
    return new ExportApiEnumsResponse();
  }
  
  @XmlElementDecl(namespace="http://apiservice.bullhorn.com/", name="getUserSamlInformationResponse")
  public JAXBElement<GetUserSamlInformationResponse> createGetUserSamlInformationResponse(GetUserSamlInformationResponse value)
  {
    return new JAXBElement(_GetUserSamlInformationResponse_QNAME, GetUserSamlInformationResponse.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://apiservice.bullhorn.com/", name="getApplicationServerHostResponse")
  public JAXBElement<GetApplicationServerHostResponse> createGetApplicationServerHostResponse(GetApplicationServerHostResponse value)
  {
    return new JAXBElement(_GetApplicationServerHostResponse_QNAME, GetApplicationServerHostResponse.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://apiservice.bullhorn.com/", name="startSession")
  public JAXBElement<StartSession> createStartSession(StartSession value)
  {
    return new JAXBElement(_StartSession_QNAME, StartSession.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://apiservice.bullhorn.com/", name="startSessionResponse")
  public JAXBElement<StartSessionResponse> createStartSessionResponse(StartSessionResponse value)
  {
    return new JAXBElement(_StartSessionResponse_QNAME, StartSessionResponse.class, null, value);
  }
  
  @XmlElementDecl(namespace="http://apiservice.bullhorn.com/", name="getApplicationServerHost")
  public JAXBElement<GetApplicationServerHost> createGetApplicationServerHost(GetApplicationServerHost value)
  {
    return new JAXBElement(_GetApplicationServerHost_QNAME, GetApplicationServerHost.class, null, value);
  }
}
