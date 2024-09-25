
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionDeviceSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionDeviceSource">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ECommerce"/>
 *     <enumeration value="MailOrder"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionDeviceSource")
@XmlEnum
public enum TransactionDeviceSource {

    @XmlEnumValue("ECommerce")
    E_COMMERCE("ECommerce"),
    @XmlEnumValue("MailOrder")
    MAIL_ORDER("MailOrder");
    private final String value;

    TransactionDeviceSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionDeviceSource fromValue(String v) {
        for (TransactionDeviceSource c: TransactionDeviceSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
