
package com.bullhorn.dataevent.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.JobMatchSearchEvent;


/**
 * <p>Java class for dataEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventType" type="{http://event.dataevent.bullhorn.com/}dataEventType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataEvent", propOrder = {
    "eventId",
    "eventTimestamp",
    "eventType"
})
@XmlSeeAlso({
    FieldMapChangeEvent.class,
    EntityEvent.class,
    JobMatchSearchEvent.class
})
public abstract class DataEvent {

    protected String eventId;
    protected long eventTimestamp;
    protected DataEventType eventType;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the eventTimestamp property.
     * 
     */
    public long getEventTimestamp() {
        return eventTimestamp;
    }

    /**
     * Sets the value of the eventTimestamp property.
     * 
     */
    public void setEventTimestamp(long value) {
        this.eventTimestamp = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link DataEventType }
     *     
     */
    public DataEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataEventType }
     *     
     */
    public void setEventType(DataEventType value) {
        this.eventType = value;
    }

}
