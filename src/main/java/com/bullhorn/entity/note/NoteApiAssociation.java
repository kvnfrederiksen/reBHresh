
package com.bullhorn.entity.note;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for noteApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="noteApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="entities"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "noteApiAssociation")
@XmlEnum
public enum NoteApiAssociation {

    @XmlEnumValue("entities")
    ENTITIES("entities");
    private final String value;

    NoteApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteApiAssociation fromValue(String v) {
        for (NoteApiAssociation c: NoteApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
