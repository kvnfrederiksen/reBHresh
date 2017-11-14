
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moveEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moveEmailRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiservice.bullhorn.com/}emailModificationRequest">
 *       &lt;sequence>
 *         &lt;element name="toFolderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="toFolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveEmailRequest", propOrder = {
    "toFolderId",
    "toFolderName"
})
public class MoveEmailRequest
    extends EmailModificationRequest
{

    protected Integer toFolderId;
    protected String toFolderName;

    /**
     * Gets the value of the toFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getToFolderId() {
        return toFolderId;
    }

    /**
     * Sets the value of the toFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setToFolderId(Integer value) {
        this.toFolderId = value;
    }

    /**
     * Gets the value of the toFolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToFolderName() {
        return toFolderName;
    }

    /**
     * Sets the value of the toFolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToFolderName(String value) {
        this.toFolderName = value;
    }

}
