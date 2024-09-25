
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EditMerchantBatchTransactionSumRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EditMerchantBatchTransactionSumRequest">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}RequestBase">
 *       <sequence>
 *         <element name="MerchantCriteriaInfo" type="{PayFlexVPosUIServerWebService}MerchantCriteriaInfo" minOccurs="0"/>
 *         <element name="BatchOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HasNewPanInformation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="NewPanInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="NewExpiryInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionSumStatus" type="{PayFlexVPosUIServerWebService}BatchFileTransactionStatus"/>
 *         <element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Is64" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EditMerchantBatchTransactionSumRequest", propOrder = {
    "merchantCriteriaInfo",
    "batchOrderId",
    "hasNewPanInformation",
    "newPanInformation",
    "newExpiryInformation",
    "orderDescription",
    "transactionSumStatus",
    "installmentCount",
    "is64"
})
public class EditMerchantBatchTransactionSumRequest
    extends RequestBase
{

    @XmlElement(name = "MerchantCriteriaInfo")
    protected MerchantCriteriaInfo merchantCriteriaInfo;
    @XmlElement(name = "BatchOrderId")
    protected String batchOrderId;
    @XmlElement(name = "HasNewPanInformation")
    protected boolean hasNewPanInformation;
    @XmlElement(name = "NewPanInformation")
    protected String newPanInformation;
    @XmlElement(name = "NewExpiryInformation")
    protected String newExpiryInformation;
    @XmlElement(name = "OrderDescription")
    protected String orderDescription;
    @XmlElement(name = "TransactionSumStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BatchFileTransactionStatus transactionSumStatus;
    @XmlElement(name = "InstallmentCount", required = true, type = Integer.class, nillable = true)
    protected Integer installmentCount;
    @XmlElement(name = "Is64")
    protected boolean is64;

    /**
     * Gets the value of the merchantCriteriaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantCriteriaInfo }
     *     
     */
    public MerchantCriteriaInfo getMerchantCriteriaInfo() {
        return merchantCriteriaInfo;
    }

    /**
     * Sets the value of the merchantCriteriaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantCriteriaInfo }
     *     
     */
    public void setMerchantCriteriaInfo(MerchantCriteriaInfo value) {
        this.merchantCriteriaInfo = value;
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
     * Gets the value of the hasNewPanInformation property.
     * 
     */
    public boolean isHasNewPanInformation() {
        return hasNewPanInformation;
    }

    /**
     * Sets the value of the hasNewPanInformation property.
     * 
     */
    public void setHasNewPanInformation(boolean value) {
        this.hasNewPanInformation = value;
    }

    /**
     * Gets the value of the newPanInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPanInformation() {
        return newPanInformation;
    }

    /**
     * Sets the value of the newPanInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPanInformation(String value) {
        this.newPanInformation = value;
    }

    /**
     * Gets the value of the newExpiryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewExpiryInformation() {
        return newExpiryInformation;
    }

    /**
     * Sets the value of the newExpiryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewExpiryInformation(String value) {
        this.newExpiryInformation = value;
    }

    /**
     * Gets the value of the orderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDescription() {
        return orderDescription;
    }

    /**
     * Sets the value of the orderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDescription(String value) {
        this.orderDescription = value;
    }

    /**
     * Gets the value of the transactionSumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BatchFileTransactionStatus }
     *     
     */
    public BatchFileTransactionStatus getTransactionSumStatus() {
        return transactionSumStatus;
    }

    /**
     * Sets the value of the transactionSumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchFileTransactionStatus }
     *     
     */
    public void setTransactionSumStatus(BatchFileTransactionStatus value) {
        this.transactionSumStatus = value;
    }

    /**
     * Gets the value of the installmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstallmentCount(Integer value) {
        this.installmentCount = value;
    }

    /**
     * Gets the value of the is64 property.
     * 
     */
    public boolean isIs64() {
        return is64;
    }

    /**
     * Sets the value of the is64 property.
     * 
     */
    public void setIs64(boolean value) {
        this.is64 = value;
    }

}
