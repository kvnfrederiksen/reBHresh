
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.session.ApiSession;


/**
 * <p>Java class for getUserTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *         &lt;element name="personEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserTypes", propOrder = {
    "session",
    "personEntityName"
})
public class GetUserTypes {

    protected ApiSession session;
    protected String personEntityName;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSession }
     *     
     */
    public ApiSession getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSession }
     *     
     */
    public void setSession(ApiSession value) {
        this.session = value;
    }

    /**
     * Gets the value of the personEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEntityName() {
        return personEntityName;
    }

    /**
     * Sets the value of the personEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEntityName(String value) {
        this.personEntityName = value;
    }

}
