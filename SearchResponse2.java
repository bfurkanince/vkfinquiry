
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedResponseBase">
 *       <sequence>
 *         <element name="TransactionSearchResultInfo" type="{PayFlexVPosUIServerWebService}ArrayOfTransactionSearchResultInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResponse", propOrder = {
    "transactionSearchResultInfo"
})
public class SearchResponse2
    extends PagedResponseBase
{

    @XmlElement(name = "TransactionSearchResultInfo")
    protected ArrayOfTransactionSearchResultInfo transactionSearchResultInfo;

    /**
     * Gets the value of the transactionSearchResultInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionSearchResultInfo }
     *     
     */
    public ArrayOfTransactionSearchResultInfo getTransactionSearchResultInfo() {
        return transactionSearchResultInfo;
    }

    /**
     * Sets the value of the transactionSearchResultInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionSearchResultInfo }
     *     
     */
    public void setTransactionSearchResultInfo(ArrayOfTransactionSearchResultInfo value) {
        this.transactionSearchResultInfo = value;
    }

}
