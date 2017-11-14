
package com.bullhorn.apiservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emailSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailSearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiservice.bullhorn.com/}emailRequest">
 *       &lt;sequence>
 *         &lt;element name="allowSoftDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateForwarded" type="{http://apiservice.bullhorn.com/}dateRange" minOccurs="0"/>
 *         &lt;element name="dateReplied" type="{http://apiservice.bullhorn.com/}dateRange" minOccurs="0"/>
 *         &lt;element name="dateSent" type="{http://apiservice.bullhorn.com/}dateRange" minOccurs="0"/>
 *         &lt;element name="flagColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasAttachments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recipients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sortDescending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailSearchRequest", propOrder = {
    "allowSoftDeleted",
    "body",
    "dateForwarded",
    "dateReplied",
    "dateSent",
    "flagColor",
    "folderId",
    "folderName",
    "hasAttachments",
    "isRead",
    "priority",
    "recipients",
    "sender",
    "sortDescending",
    "sortField",
    "subject"
})
public class EmailSearchRequest
    extends EmailRequest
{

    protected Boolean allowSoftDeleted;
    protected String body;
    protected DateRange dateForwarded;
    protected DateRange dateReplied;
    protected DateRange dateSent;
    protected String flagColor;
    protected Integer folderId;
    protected String folderName;
    protected Boolean hasAttachments;
    protected Boolean isRead;
    protected Integer priority;
    protected String recipients;
    protected String sender;
    protected Boolean sortDescending;
    protected String sortField;
    protected String subject;

    /**
     * Gets the value of the allowSoftDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSoftDeleted() {
        return allowSoftDeleted;
    }

    /**
     * Sets the value of the allowSoftDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSoftDeleted(Boolean value) {
        this.allowSoftDeleted = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the dateForwarded property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateForwarded() {
        return dateForwarded;
    }

    /**
     * Sets the value of the dateForwarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateForwarded(DateRange value) {
        this.dateForwarded = value;
    }

    /**
     * Gets the value of the dateReplied property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateReplied() {
        return dateReplied;
    }

    /**
     * Sets the value of the dateReplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateReplied(DateRange value) {
        this.dateReplied = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateSent(DateRange value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the flagColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagColor() {
        return flagColor;
    }

    /**
     * Sets the value of the flagColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagColor(String value) {
        this.flagColor = value;
    }

    /**
     * Gets the value of the folderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolderId() {
        return folderId;
    }

    /**
     * Sets the value of the folderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolderId(Integer value) {
        this.folderId = value;
    }

    /**
     * Gets the value of the folderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderName() {
        return folderName;
    }

    /**
     * Sets the value of the folderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderName(String value) {
        this.folderName = value;
    }

    /**
     * Gets the value of the hasAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAttachments() {
        return hasAttachments;
    }

    /**
     * Sets the value of the hasAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAttachments(Boolean value) {
        this.hasAttachments = value;
    }

    /**
     * Gets the value of the isRead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRead() {
        return isRead;
    }

    /**
     * Sets the value of the isRead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRead(Boolean value) {
        this.isRead = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipients(String value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the sortDescending property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortDescending() {
        return sortDescending;
    }

    /**
     * Sets the value of the sortDescending property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortDescending(Boolean value) {
        this.sortDescending = value;
    }

    /**
     * Gets the value of the sortField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortField(String value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

}
