
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringFrequencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RecurringFrequencyType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Day"/>
 *     <enumeration value="Month"/>
 *     <enumeration value="Year"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RecurringFrequencyType")
@XmlEnum
public enum RecurringFrequencyType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Day")
    DAY("Day"),
    @XmlEnumValue("Month")
    MONTH("Month"),
    @XmlEnumValue("Year")
    YEAR("Year");
    private final String value;

    RecurringFrequencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecurringFrequencyType fromValue(String v) {
        for (RecurringFrequencyType c: RecurringFrequencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
