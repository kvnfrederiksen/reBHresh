
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEmailRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiservice.bullhorn.com/}emailRequest">
 *       &lt;sequence>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEmailRequest", propOrder = {
    "emailId"
})
public class FindEmailRequest
    extends EmailRequest
{

    protected Integer emailId;

    /**
     * Gets the value of the emailId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailId() {
        return emailId;
    }

    /**
     * Sets the value of the emailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailId(Integer value) {
        this.emailId = value;
    }

}
