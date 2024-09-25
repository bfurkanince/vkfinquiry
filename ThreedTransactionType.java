
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThreedTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ThreedTransactionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NonSecure"/>
 *     <enumeration value="Secure"/>
 *     <enumeration value="HalfSecure"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ThreedTransactionType")
@XmlEnum
public enum ThreedTransactionType {

    @XmlEnumValue("NonSecure")
    NON_SECURE("NonSecure"),
    @XmlEnumValue("Secure")
    SECURE("Secure"),
    @XmlEnumValue("HalfSecure")
    HALF_SECURE("HalfSecure");
    private final String value;

    ThreedTransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ThreedTransactionType fromValue(String v) {
        for (ThreedTransactionType c: ThreedTransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
