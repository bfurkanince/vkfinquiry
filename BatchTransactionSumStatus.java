
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionSumStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BatchTransactionSumStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotStarted"/>
 *     <enumeration value="InProgress"/>
 *     <enumeration value="Finished"/>
 *     <enumeration value="PartiallyFinished"/>
 *     <enumeration value="Blocked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BatchTransactionSumStatus")
@XmlEnum
public enum BatchTransactionSumStatus {

    @XmlEnumValue("NotStarted")
    NOT_STARTED("NotStarted"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Finished")
    FINISHED("Finished"),
    @XmlEnumValue("PartiallyFinished")
    PARTIALLY_FINISHED("PartiallyFinished"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked");
    private final String value;

    BatchTransactionSumStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchTransactionSumStatus fromValue(String v) {
        for (BatchTransactionSumStatus c: BatchTransactionSumStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
