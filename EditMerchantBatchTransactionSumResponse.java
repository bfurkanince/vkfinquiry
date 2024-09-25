
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EditMerchantBatchTransactionSumResult" type="{PayFlexVPosUIServerWebService}EditMerchantBatchTransactionSumResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "editMerchantBatchTransactionSumResult"
})
@XmlRootElement(name = "EditMerchantBatchTransactionSumResponse")
public class EditMerchantBatchTransactionSumResponse {

    @XmlElement(name = "EditMerchantBatchTransactionSumResult")
    protected EditMerchantBatchTransactionSumResponse2 editMerchantBatchTransactionSumResult;

    /**
     * Gets the value of the editMerchantBatchTransactionSumResult property.
     * 
     * @return
     *     possible object is
     *     {@link EditMerchantBatchTransactionSumResponse2 }
     *     
     */
    public EditMerchantBatchTransactionSumResponse2 getEditMerchantBatchTransactionSumResult() {
        return editMerchantBatchTransactionSumResult;
    }

    /**
     * Sets the value of the editMerchantBatchTransactionSumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMerchantBatchTransactionSumResponse2 }
     *     
     */
    public void setEditMerchantBatchTransactionSumResult(EditMerchantBatchTransactionSumResponse2 value) {
        this.editMerchantBatchTransactionSumResult = value;
    }

}
