
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.session.ApiSession;


/**
 * <p>Java class for addNoteReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNoteReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="session" type="{http://session.apiservice.bullhorn.com/}apiSession" minOccurs="0"/>
 *         &lt;element name="noteId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entityId" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNoteReference", propOrder = {
    "session",
    "noteId",
    "entityName",
    "entityId"
})
public class AddNoteReference {

    protected ApiSession session;
    protected Object noteId;
    protected String entityName;
    protected Object entityId;

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
     * Gets the value of the noteId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNoteId() {
        return noteId;
    }

    /**
     * Sets the value of the noteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNoteId(Object value) {
        this.noteId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEntityId() {
        return entityId;
    }

    /**
     * Sets the value of the entityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEntityId(Object value) {
        this.entityId = value;
    }

}
