
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionSource">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Api"/>
 *     <enumeration value="UserInterface"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionSource")
@XmlEnum
public enum TransactionSource {

    @XmlEnumValue("Api")
    API("Api"),
    @XmlEnumValue("UserInterface")
    USER_INTERFACE("UserInterface");
    private final String value;

    TransactionSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionSource fromValue(String v) {
        for (TransactionSource c: TransactionSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
