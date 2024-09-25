
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMerchantBatchTransactionSumResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EditMerchantBatchTransactionSumResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}ResponseBase">
 *       <sequence>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RecurringInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMerchantBatchTransactionSumResponse", propOrder = {
    "hostMerchantId",
    "batchOrderId",
    "recurringInstallmentCount"
})
public class EditMerchantBatchTransactionSumResponse2
    extends ResponseBase
{

    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "BatchOrderId")
    protected String batchOrderId;
    @XmlElement(name = "RecurringInstallmentCount")
    protected Integer recurringInstallmentCount;

    /**
     * Gets the value of the hostMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMerchantId() {
        return hostMerchantId;
    }

    /**
     * Sets the value of the hostMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMerchantId(String value) {
        this.hostMerchantId = value;
    }

    /**
     * Gets the value of the batchOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchOrderId() {
        return batchOrderId;
    }

    /**
     * Sets the value of the batchOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchOrderId(String value) {
        this.batchOrderId = value;
    }

    /**
     * Gets the value of the recurringInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecurringInstallmentCount() {
        return recurringInstallmentCount;
    }

    /**
     * Sets the value of the recurringInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecurringInstallmentCount(Integer value) {
        this.recurringInstallmentCount = value;
    }

}
