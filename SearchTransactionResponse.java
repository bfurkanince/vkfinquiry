
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
 *         <element name="SearchTransactionResult" type="{PayFlexVPosUIServerWebService}TransactionSearchResponse" minOccurs="0"/>
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
    "searchTransactionResult"
})
@XmlRootElement(name = "SearchTransactionResponse")
public class SearchTransactionResponse {

    @XmlElement(name = "SearchTransactionResult")
    protected TransactionSearchResponse searchTransactionResult;

    /**
     * Gets the value of the searchTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchResponse }
     *     
     */
    public TransactionSearchResponse getSearchTransactionResult() {
        return searchTransactionResult;
    }

    /**
     * Sets the value of the searchTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchResponse }
     *     
     */
    public void setSearchTransactionResult(TransactionSearchResponse value) {
        this.searchTransactionResult = value;
    }

}
