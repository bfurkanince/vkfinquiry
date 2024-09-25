
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSuccessStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionSuccessStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Successfull"/>
 *     <enumeration value="UnSuccessfull"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionSuccessStatus")
@XmlEnum
public enum TransactionSuccessStatus {

    @XmlEnumValue("Successfull")
    SUCCESSFULL("Successfull"),
    @XmlEnumValue("UnSuccessfull")
    UN_SUCCESSFULL("UnSuccessfull");
    private final String value;

    TransactionSuccessStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionSuccessStatus fromValue(String v) {
        for (TransactionSuccessStatus c: TransactionSuccessStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
