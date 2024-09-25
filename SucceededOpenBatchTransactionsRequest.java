
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SucceededOpenBatchTransactionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SucceededOpenBatchTransactionsRequest">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}RequestBase">
 *       <sequence>
 *         <element name="MerchantCriteria" type="{PayFlexVPosUIServerWebService}MerchantCriteriaInfo" minOccurs="0"/>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SucceededOpenBatchTransactionsRequest", propOrder = {
    "merchantCriteria",
    "hostTerminalId"
})
public class SucceededOpenBatchTransactionsRequest
    extends RequestBase
{

    @XmlElement(name = "MerchantCriteria")
    protected MerchantCriteriaInfo merchantCriteria;
    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;

    /**
     * Gets the value of the merchantCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantCriteriaInfo }
     *     
     */
    public MerchantCriteriaInfo getMerchantCriteria() {
        return merchantCriteria;
    }

    /**
     * Sets the value of the merchantCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantCriteriaInfo }
     *     
     */
    public void setMerchantCriteria(MerchantCriteriaInfo value) {
        this.merchantCriteria = value;
    }

    /**
     * Gets the value of the hostTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTerminalId() {
        return hostTerminalId;
    }

    /**
     * Sets the value of the hostTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTerminalId(String value) {
        this.hostTerminalId = value;
    }

}
