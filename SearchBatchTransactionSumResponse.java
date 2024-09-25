
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
 *         <element name="SearchBatchTransactionSumResult" type="{PayFlexVPosUIServerWebService}BatchTransactionSumDetailResponse" minOccurs="0"/>
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
    "searchBatchTransactionSumResult"
})
@XmlRootElement(name = "SearchBatchTransactionSumResponse")
public class SearchBatchTransactionSumResponse {

    @XmlElement(name = "SearchBatchTransactionSumResult")
    protected BatchTransactionSumDetailResponse searchBatchTransactionSumResult;

    /**
     * Gets the value of the searchBatchTransactionSumResult property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransactionSumDetailResponse }
     *     
     */
    public BatchTransactionSumDetailResponse getSearchBatchTransactionSumResult() {
        return searchBatchTransactionSumResult;
    }

    /**
     * Sets the value of the searchBatchTransactionSumResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransactionSumDetailResponse }
     *     
     */
    public void setSearchBatchTransactionSumResult(BatchTransactionSumDetailResponse value) {
        this.searchBatchTransactionSumResult = value;
    }

}
