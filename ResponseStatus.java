
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResponseStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Warning"/>
 *     <enumeration value="Success"/>
 *     <enumeration value="Error"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResponseStatus")
@XmlEnum
public enum ResponseStatus {

    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    ResponseStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseStatus fromValue(String v) {
        for (ResponseStatus c: ResponseStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
