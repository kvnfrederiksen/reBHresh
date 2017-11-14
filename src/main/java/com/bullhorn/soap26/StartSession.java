package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="startSession", propOrder={"username", "password", "apiKey"})
public class StartSession
{
  protected String username;
  protected String password;
  protected String apiKey;
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String value)
  {
    this.username = value;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String value)
  {
    this.password = value;
  }
  
  public String getApiKey()
  {
    return this.apiKey;
  }
  
  public void setApiKey(String value)
  {
    this.apiKey = value;
  }
}
