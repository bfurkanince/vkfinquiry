
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="MerchantType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Standard"/>
 *     <enumeration value="HeadDealer"/>
 *     <enumeration value="SubDealer"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MerchantType")
@XmlEnum
public enum MerchantType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("HeadDealer")
    HEAD_DEALER("HeadDealer"),
    @XmlEnumValue("SubDealer")
    SUB_DEALER("SubDealer");
    private final String value;

    MerchantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MerchantType fromValue(String v) {
        for (MerchantType c: MerchantType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
