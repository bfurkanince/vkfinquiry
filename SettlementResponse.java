
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
 *         <element name="SettlementResult" type="{PayFlexVPosUIServerWebService}SettlementResponse" minOccurs="0"/>
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
    "settlementResult"
})
@XmlRootElement(name = "SettlementResponse")
public class SettlementResponse {

    @XmlElement(name = "SettlementResult")
    protected SettlementResponse2 settlementResult;

    /**
     * Gets the value of the settlementResult property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementResponse2 }
     *     
     */
    public SettlementResponse2 getSettlementResult() {
        return settlementResult;
    }

    /**
     * Sets the value of the settlementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementResponse2 }
     *     
     */
    public void setSettlementResult(SettlementResponse2 value) {
        this.settlementResult = value;
    }

}
