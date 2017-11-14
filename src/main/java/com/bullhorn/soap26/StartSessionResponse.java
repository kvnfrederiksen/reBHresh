package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="startSessionResponse", propOrder={"_return"})
public class StartSessionResponse
{
  @XmlElement(name="return")
  protected ApiStartSessionResult _return;
  
  public ApiStartSessionResult getReturn()
  {
    return this._return;
  }
  
  public void setReturn(ApiStartSessionResult value)
  {
    this._return = value;
  }
}
