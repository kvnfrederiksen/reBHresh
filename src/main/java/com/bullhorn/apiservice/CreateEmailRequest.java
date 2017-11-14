
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createEmailRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiservice.bullhorn.com/}emailRequest">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://apiservice.bullhorn.com/}email" minOccurs="0"/>
 *         &lt;element name="resolveRecipsForSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEmailRequest", propOrder = {
    "email",
    "resolveRecipsForSend"
})
public class CreateEmailRequest
    extends EmailRequest
{

    protected Email email;
    protected Boolean resolveRecipsForSend;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the resolveRecipsForSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResolveRecipsForSend() {
        return resolveRecipsForSend;
    }

    /**
     * Sets the value of the resolveRecipsForSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResolveRecipsForSend(Boolean value) {
        this.resolveRecipsForSend = value;
    }

}
