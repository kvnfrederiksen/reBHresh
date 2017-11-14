package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="apiResult", namespace="http://result.apiservice.bullhorn.com/", propOrder={"session"})
@XmlSeeAlso({ApiStartSessionResult.class})
public class ApiResult
{
  protected String session;
  
  public String getSession()
  {
    return this.session;
  }
  
  public void setSession(String value)
  {
    this.session = value;
  }
}
