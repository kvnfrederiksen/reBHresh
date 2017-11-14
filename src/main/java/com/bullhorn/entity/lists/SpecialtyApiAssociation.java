
package com.bullhorn.entity.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialtyApiAssociation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specialtyApiAssociation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="privateLabels"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "specialtyApiAssociation")
@XmlEnum
public enum SpecialtyApiAssociation {

    @XmlEnumValue("privateLabels")
    PRIVATE_LABELS("privateLabels");
    private final String value;

    SpecialtyApiAssociation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialtyApiAssociation fromValue(String v) {
        for (SpecialtyApiAssociation c: SpecialtyApiAssociation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
