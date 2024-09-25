
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
 *         <element name="batchTransactionSumDetailRequest" type="{PayFlexVPosUIServerWebService}BatchTransactionSumDetailRequest" minOccurs="0"/>
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
    "batchTransactionSumDetailRequest"
})
@XmlRootElement(name = "SearchBatchTransactionSum")
public class SearchBatchTransactionSum {

    protected BatchTransactionSumDetailRequest batchTransactionSumDetailRequest;

    /**
     * Gets the value of the batchTransactionSumDetailRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransactionSumDetailRequest }
     *     
     */
    public BatchTransactionSumDetailRequest getBatchTransactionSumDetailRequest() {
        return batchTransactionSumDetailRequest;
    }

    /**
     * Sets the value of the batchTransactionSumDetailRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransactionSumDetailRequest }
     *     
     */
    public void setBatchTransactionSumDetailRequest(BatchTransactionSumDetailRequest value) {
        this.batchTransactionSumDetailRequest = value;
    }

}
