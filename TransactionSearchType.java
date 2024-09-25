
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionSearchType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VposTransactionSearch"/>
 *     <enumeration value="BatchCloseSearch"/>
 *     <enumeration value="KMHInstallmentSearch"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionSearchType")
@XmlEnum
public enum TransactionSearchType {

    @XmlEnumValue("VposTransactionSearch")
    VPOS_TRANSACTION_SEARCH("VposTransactionSearch"),
    @XmlEnumValue("BatchCloseSearch")
    BATCH_CLOSE_SEARCH("BatchCloseSearch"),
    @XmlEnumValue("KMHInstallmentSearch")
    KMH_INSTALLMENT_SEARCH("KMHInstallmentSearch");
    private final String value;

    TransactionSearchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionSearchType fromValue(String v) {
        for (TransactionSearchType c: TransactionSearchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
