
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.session.ApiSession;


/**
 * <p>Java class for loadEmailAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadEmailAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *         &lt;element name="request" type="{http://apiservice.bullhorn.com/}loadEmailAttachmetRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadEmailAttachment", propOrder = {
    "session",
    "request"
})
public class LoadEmailAttachment {

    protected ApiSession session;
    protected LoadEmailAttachmetRequest request;

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
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link LoadEmailAttachmetRequest }
     *     
     */
    public LoadEmailAttachmetRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadEmailAttachmetRequest }
     *     
     */
    public void setRequest(LoadEmailAttachmetRequest value) {
        this.request = value;
    }

}
