package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="apiGetUserSamlInformationResult", namespace="http://result.apiservice.bullhorn.com/", propOrder={"atsIssuer", "atsNameID", "mobileIssuer", "mobileNameID"})
public class ApiGetUserSamlInformationResult
  extends ApiResult
{
  protected String atsIssuer;
  protected String atsNameID;
  protected String mobileIssuer;
  protected String mobileNameID;
  
  public String getAtsIssuer()
  {
    return this.atsIssuer;
  }
  
  public void setAtsIssuer(String value)
  {
    this.atsIssuer = value;
  }
  
  public String getAtsNameID()
  {
    return this.atsNameID;
  }
  
  public void setAtsNameID(String value)
  {
    this.atsNameID = value;
  }
  
  public String getMobileIssuer()
  {
    return this.mobileIssuer;
  }
  
  public void setMobileIssuer(String value)
  {
    this.mobileIssuer = value;
  }
  
  public String getMobileNameID()
  {
    return this.mobileNameID;
  }
  
  public void setMobileNameID(String value)
  {
    this.mobileNameID = value;
  }
}
