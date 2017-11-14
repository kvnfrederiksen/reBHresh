
package com.bullhorn.apiservice.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.bullhorn.apiservice.EmailAttachment;


/**
 * <p>Java class for loadEmailAttachmentResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loadEmailAttachmentResult">
 *   &lt;complexContent>
 *     &lt;extension base="{http://result.apiservice.bullhorn.com/}apiResult">
 *       &lt;sequence>
 *         &lt;element name="attachment" type="{http://apiservice.bullhorn.com/}emailAttachment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loadEmailAttachmentResult", propOrder = {
    "attachment"
})
public class LoadEmailAttachmentResult
    extends ApiResult
{

    protected EmailAttachment attachment;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAttachment }
     *     
     */
    public EmailAttachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAttachment }
     *     
     */
    public void setAttachment(EmailAttachment value) {
        this.attachment = value;
    }

}
