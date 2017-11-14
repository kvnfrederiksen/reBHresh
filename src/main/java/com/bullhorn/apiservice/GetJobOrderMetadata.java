
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.session.ApiSession;


/**
 * <p>Java class for getJobOrderMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getJobOrderMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="privateLabelId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getJobOrderMetadata", propOrder = {
    "session",
    "typeId",
    "privateLabelId"
})
public class GetJobOrderMetadata {

    protected ApiSession session;
    protected Object typeId;
    protected Object privateLabelId;

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
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTypeId(Object value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the privateLabelId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrivateLabelId() {
        return privateLabelId;
    }

    /**
     * Sets the value of the privateLabelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrivateLabelId(Object value) {
        this.privateLabelId = value;
    }

}
