package com.bullhorn.soap26;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="apiStartSessionResult", namespace="http://result.apiservice.bullhorn.com/", propOrder={"corporationId", "userId"})
public class ApiStartSessionResult
  extends ApiResult
{
  protected int corporationId;
  protected int userId;
  
  public int getCorporationId()
  {
    return this.corporationId;
  }
  
  public void setCorporationId(int value)
  {
    this.corporationId = value;
  }
  
  public int getUserId()
  {
    return this.userId;
  }
  
  public void setUserId(int value)
  {
    this.userId = value;
  }
}
