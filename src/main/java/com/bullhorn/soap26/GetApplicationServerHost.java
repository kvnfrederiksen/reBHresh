package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getApplicationServerHost", propOrder={"username", "source"})
public class GetApplicationServerHost
{
  protected String username;
  protected String source;
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String value)
  {
    this.username = value;
  }
  
  public String getSource()
  {
    return this.source;
  }
  
  public void setSource(String value)
  {
    this.source = value;
  }
}
