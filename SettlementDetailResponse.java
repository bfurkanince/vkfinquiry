
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
 *         <element name="SettlementDetailResult" type="{PayFlexVPosUIServerWebService}SettlementDetailResponse" minOccurs="0"/>
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
    "settlementDetailResult"
})
@XmlRootElement(name = "SettlementDetailResponse")
public class SettlementDetailResponse {

    @XmlElement(name = "SettlementDetailResult")
    protected SettlementDetailResponse2 settlementDetailResult;

    /**
     * Gets the value of the settlementDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDetailResponse2 }
     *     
     */
    public SettlementDetailResponse2 getSettlementDetailResult() {
        return settlementDetailResult;
    }

    /**
     * Sets the value of the settlementDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDetailResponse2 }
     *     
     */
    public void setSettlementDetailResult(SettlementDetailResponse2 value) {
        this.settlementDetailResult = value;
    }

}
