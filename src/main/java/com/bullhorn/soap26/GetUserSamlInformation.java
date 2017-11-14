package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getUserSamlInformation", propOrder={"session", "corporateUserId"})
public class GetUserSamlInformation
{
  protected String session;
  protected int corporateUserId;
  
  public String getSession()
  {
    return this.session;
  }
  
  public void setSession(String value)
  {
    this.session = value;
  }
  
  public int getCorporateUserId()
  {
    return this.corporateUserId;
  }
  
  public void setCorporateUserId(int value)
  {
    this.corporateUserId = value;
  }
}
