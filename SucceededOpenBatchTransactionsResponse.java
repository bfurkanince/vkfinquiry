
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
 *         <element name="SucceededOpenBatchTransactionsResult" type="{PayFlexVPosUIServerWebService}SucceededOpenBatchTransactionsResponse" minOccurs="0"/>
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
    "succeededOpenBatchTransactionsResult"
})
@XmlRootElement(name = "SucceededOpenBatchTransactionsResponse")
public class SucceededOpenBatchTransactionsResponse {

    @XmlElement(name = "SucceededOpenBatchTransactionsResult")
    protected SucceededOpenBatchTransactionsResponse2 succeededOpenBatchTransactionsResult;

    /**
     * Gets the value of the succeededOpenBatchTransactionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link SucceededOpenBatchTransactionsResponse2 }
     *     
     */
    public SucceededOpenBatchTransactionsResponse2 getSucceededOpenBatchTransactionsResult() {
        return succeededOpenBatchTransactionsResult;
    }

    /**
     * Sets the value of the succeededOpenBatchTransactionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SucceededOpenBatchTransactionsResponse2 }
     *     
     */
    public void setSucceededOpenBatchTransactionsResult(SucceededOpenBatchTransactionsResponse2 value) {
        this.succeededOpenBatchTransactionsResult = value;
    }

}
