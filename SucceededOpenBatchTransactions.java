
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
 *         <element name="request" type="{PayFlexVPosUIServerWebService}SucceededOpenBatchTransactionsRequest" minOccurs="0"/>
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
    "request"
})
@XmlRootElement(name = "SucceededOpenBatchTransactions")
public class SucceededOpenBatchTransactions {

    protected SucceededOpenBatchTransactionsRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link SucceededOpenBatchTransactionsRequest }
     *     
     */
    public SucceededOpenBatchTransactionsRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link SucceededOpenBatchTransactionsRequest }
     *     
     */
    public void setRequest(SucceededOpenBatchTransactionsRequest value) {
        this.request = value;
    }

}
