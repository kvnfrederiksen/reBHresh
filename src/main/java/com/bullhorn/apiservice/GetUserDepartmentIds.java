
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.session.ApiSession;


/**
 * <p>Java class for getUserDepartmentIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserDepartmentIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *         &lt;element name="corporateUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserDepartmentIds", propOrder = {
    "session",
    "corporateUserId"
})
public class GetUserDepartmentIds {

    protected ApiSession session;
    protected Integer corporateUserId;

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
     * Gets the value of the corporateUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorporateUserId() {
        return corporateUserId;
    }

    /**
     * Sets the value of the corporateUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorporateUserId(Integer value) {
        this.corporateUserId = value;
    }

}
