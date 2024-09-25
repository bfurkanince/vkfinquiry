
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchFileTransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BatchFileTransactionStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Pending"/>
 *     <enumeration value="Success"/>
 *     <enumeration value="Failed"/>
 *     <enumeration value="CollectedManually"/>
 *     <enumeration value="LawProcess"/>
 *     <enumeration value="Other"/>
 *     <enumeration value="Blocked"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BatchFileTransactionStatus")
@XmlEnum
public enum BatchFileTransactionStatus {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("CollectedManually")
    COLLECTED_MANUALLY("CollectedManually"),
    @XmlEnumValue("LawProcess")
    LAW_PROCESS("LawProcess"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Blocked")
    BLOCKED("Blocked");
    private final String value;

    BatchFileTransactionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchFileTransactionStatus fromValue(String v) {
        for (BatchFileTransactionStatus c: BatchFileTransactionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
