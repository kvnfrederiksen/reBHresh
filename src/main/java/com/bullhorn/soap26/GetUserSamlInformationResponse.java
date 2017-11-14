package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="getUserSamlInformationResponse", propOrder={"_return"})
public class GetUserSamlInformationResponse
{
  @XmlElement(name="return")
  protected ApiGetUserSamlInformationResult _return;
  
  public ApiGetUserSamlInformationResult getReturn()
  {
    return this._return;
  }
  
  public void setReturn(ApiGetUserSamlInformationResult value)
  {
    this._return = value;
  }
}
