
package com.bullhorn.apiservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="email">
 *   &lt;complexContent>
 *     &lt;extension base="{http://apiservice.bullhorn.com/}emailObject">
 *       &lt;sequence>
 *         &lt;element name="attachments" type="{http://apiservice.bullhorn.com/}emailAttachment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="bccRecipients" type="{http://apiservice.bullhorn.com/}emailUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bodyCharset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ccRecipients" type="{http://apiservice.bullhorn.com/}emailUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateForwarded" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateReplied" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emailHeaders" type="{http://apiservice.bullhorn.com/}nameValuePair" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="flagColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="folderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numberOfAttachments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://apiservice.bullhorn.com/}emailUser" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toRecipients" type="{http://apiservice.bullhorn.com/}emailUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "email", propOrder = {
    "attachments",
    "bccRecipients",
    "body",
    "bodyCharset",
    "ccRecipients",
    "dateForwarded",
    "dateReceived",
    "dateReplied",
    "dateSent",
    "emailHeaders",
    "flagColor",
    "folderId",
    "folderName",
    "guid",
    "isDeleted",
    "isPrivate",
    "isRead",
    "numberOfAttachments",
    "priority",
    "sender",
    "subject",
    "toRecipients"
})
public class Email
    extends EmailObject
{

    @XmlElement(nillable = true)
    protected List<EmailAttachment> attachments;
    @XmlElement(nillable = true)
    protected List<EmailUser> bccRecipients;
    protected String body;
    protected String bodyCharset;
    @XmlElement(nillable = true)
    protected List<EmailUser> ccRecipients;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateForwarded;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReceived;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReplied;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    @XmlElement(nillable = true)
    protected List<NameValuePair> emailHeaders;
    protected String flagColor;
    protected Integer folderId;
    protected String folderName;
    protected String guid;
    protected Boolean isDeleted;
    protected Boolean isPrivate;
    protected Boolean isRead;
    protected Integer numberOfAttachments;
    protected Integer priority;
    protected EmailUser sender;
    protected String subject;
    @XmlElement(nillable = true)
    protected List<EmailUser> toRecipients;

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAttachment }
     * 
     * 
     */
    public List<EmailAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<EmailAttachment>();
        }
        return this.attachments;
    }

    /**
     * Gets the value of the bccRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bccRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBccRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailUser }
     * 
     * 
     */
    public List<EmailUser> getBccRecipients() {
        if (bccRecipients == null) {
            bccRecipients = new ArrayList<EmailUser>();
        }
        return this.bccRecipients;
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
     * Gets the value of the bodyCharset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBodyCharset() {
        return bodyCharset;
    }

    /**
     * Sets the value of the bodyCharset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBodyCharset(String value) {
        this.bodyCharset = value;
    }

    /**
     * Gets the value of the ccRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailUser }
     * 
     * 
     */
    public List<EmailUser> getCcRecipients() {
        if (ccRecipients == null) {
            ccRecipients = new ArrayList<EmailUser>();
        }
        return this.ccRecipients;
    }

    /**
     * Gets the value of the dateForwarded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateForwarded() {
        return dateForwarded;
    }

    /**
     * Sets the value of the dateForwarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateForwarded(XMLGregorianCalendar value) {
        this.dateForwarded = value;
    }

    /**
     * Gets the value of the dateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReceived() {
        return dateReceived;
    }

    /**
     * Sets the value of the dateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReceived(XMLGregorianCalendar value) {
        this.dateReceived = value;
    }

    /**
     * Gets the value of the dateReplied property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReplied() {
        return dateReplied;
    }

    /**
     * Sets the value of the dateReplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReplied(XMLGregorianCalendar value) {
        this.dateReplied = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the emailHeaders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailHeaders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValuePair }
     * 
     * 
     */
    public List<NameValuePair> getEmailHeaders() {
        if (emailHeaders == null) {
            emailHeaders = new ArrayList<NameValuePair>();
        }
        return this.emailHeaders;
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
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
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
     * Gets the value of the numberOfAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAttachments() {
        return numberOfAttachments;
    }

    /**
     * Sets the value of the numberOfAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAttachments(Integer value) {
        this.numberOfAttachments = value;
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
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link EmailUser }
     *     
     */
    public EmailUser getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailUser }
     *     
     */
    public void setSender(EmailUser value) {
        this.sender = value;
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

    /**
     * Gets the value of the toRecipients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toRecipients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToRecipients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailUser }
     * 
     * 
     */
    public List<EmailUser> getToRecipients() {
        if (toRecipients == null) {
            toRecipients = new ArrayList<EmailUser>();
        }
        return this.toRecipients;
    }

}
