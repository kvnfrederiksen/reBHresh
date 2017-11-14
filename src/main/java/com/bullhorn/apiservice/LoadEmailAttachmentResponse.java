
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.result.LoadEmailAttachmentResult;


/**
 * <p>Java class for loadEmailAttachmentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadEmailAttachmentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://result.apiservice.bullhorn.com/}loadEmailAttachmentResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadEmailAttachmentResponse", propOrder = {
    "_return"
})
public class LoadEmailAttachmentResponse {

    @XmlElement(name = "return")
    protected LoadEmailAttachmentResult _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link LoadEmailAttachmentResult }
     *     
     */
    public LoadEmailAttachmentResult getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadEmailAttachmentResult }
     *     
     */
    public void setReturn(LoadEmailAttachmentResult value) {
        this._return = value;
    }

}
