
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetailResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedResponseBase">
 *       <sequence>
 *         <element name="TransactionSearchResultInfo" type="{PayFlexVPosUIServerWebService}ArrayOfPaymentTransactionInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetailResponse", propOrder = {
    "transactionSearchResultInfo"
})
public class SettlementDetailResponse2
    extends PagedResponseBase
{

    @XmlElement(name = "TransactionSearchResultInfo")
    protected ArrayOfPaymentTransactionInfo transactionSearchResultInfo;

    /**
     * Gets the value of the transactionSearchResultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentTransactionInfo }
     *     
     */
    public ArrayOfPaymentTransactionInfo getTransactionSearchResultInfo() {
        return transactionSearchResultInfo;
    }

    /**
     * Sets the value of the transactionSearchResultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentTransactionInfo }
     *     
     */
    public void setTransactionSearchResultInfo(ArrayOfPaymentTransactionInfo value) {
        this.transactionSearchResultInfo = value;
    }

}
