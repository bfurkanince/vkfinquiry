
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="editMerchantBatchTransactionSumRequest" type="{PayFlexVPosUIServerWebService}EditMerchantBatchTransactionSumRequest" minOccurs="0"/>
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
    "editMerchantBatchTransactionSumRequest"
})
@XmlRootElement(name = "EditMerchantBatchTransactionSum")
public class EditMerchantBatchTransactionSum {

    protected EditMerchantBatchTransactionSumRequest editMerchantBatchTransactionSumRequest;

    /**
     * Gets the value of the editMerchantBatchTransactionSumRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EditMerchantBatchTransactionSumRequest }
     *     
     */
    public EditMerchantBatchTransactionSumRequest getEditMerchantBatchTransactionSumRequest() {
        return editMerchantBatchTransactionSumRequest;
    }

    /**
     * Sets the value of the editMerchantBatchTransactionSumRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EditMerchantBatchTransactionSumRequest }
     *     
     */
    public void setEditMerchantBatchTransactionSumRequest(EditMerchantBatchTransactionSumRequest value) {
        this.editMerchantBatchTransactionSumRequest = value;
    }

}
