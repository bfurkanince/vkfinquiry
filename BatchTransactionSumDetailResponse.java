
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionSumDetailResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BatchTransactionSumDetailResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}ResponseBase">
 *       <sequence>
 *         <element name="BatchTransactionSumId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BatchOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchTransactionType" type="{PayFlexVPosUIServerWebService}BatchTransactionType" minOccurs="0"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RecurringFrequencyType" type="{PayFlexVPosUIServerWebService}RecurringFrequencyType" minOccurs="0"/>
 *         <element name="RecurringFrequency" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="RecurringInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomItem" type="{PayFlexVPosUIServerWebService}CustomItem" minOccurs="0"/>
 *         <element name="InstallmentItemDetails" type="{PayFlexVPosUIServerWebService}ArrayOfInstallmentItemDetail" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchTransactionSumDetailResponse", propOrder = {
    "batchTransactionSumId",
    "batchOrderId",
    "hostMerchantId",
    "hostTerminalId",
    "batchTransactionType",
    "currencyCode",
    "totalAmount",
    "installmentCount",
    "recurringFrequencyType",
    "recurringFrequency",
    "recurringInstallmentCount",
    "customerNumber",
    "customerName",
    "customItem",
    "installmentItemDetails"
})
public class BatchTransactionSumDetailResponse
    extends ResponseBase
{

    @XmlElement(name = "BatchTransactionSumId")
    protected Integer batchTransactionSumId;
    @XmlElement(name = "BatchOrderId")
    protected String batchOrderId;
    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;
    @XmlElement(name = "BatchTransactionType")
    @XmlSchemaType(name = "string")
    protected BatchTransactionType batchTransactionType;
    @XmlElement(name = "CurrencyCode")
    protected Integer currencyCode;
    @XmlElement(name = "TotalAmount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "InstallmentCount")
    protected Integer installmentCount;
    @XmlElement(name = "RecurringFrequencyType")
    @XmlSchemaType(name = "string")
    protected RecurringFrequencyType recurringFrequencyType;
    @XmlElementRef(name = "RecurringFrequency", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> recurringFrequency;
    @XmlElementRef(name = "RecurringInstallmentCount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> recurringInstallmentCount;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomItem")
    protected CustomItem customItem;
    @XmlElement(name = "InstallmentItemDetails")
    protected ArrayOfInstallmentItemDetail installmentItemDetails;

    /**
     * Gets the value of the batchTransactionSumId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchTransactionSumId() {
        return batchTransactionSumId;
    }

    /**
     * Sets the value of the batchTransactionSumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchTransactionSumId(Integer value) {
        this.batchTransactionSumId = value;
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

    /**
     * Gets the value of the batchTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransactionType }
     *     
     */
    public BatchTransactionType getBatchTransactionType() {
        return batchTransactionType;
    }

    /**
     * Sets the value of the batchTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransactionType }
     *     
     */
    public void setBatchTransactionType(BatchTransactionType value) {
        this.batchTransactionType = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrencyCode(Integer value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
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
     * Gets the value of the recurringFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringFrequencyType }
     *     
     */
    public RecurringFrequencyType getRecurringFrequencyType() {
        return recurringFrequencyType;
    }

    /**
     * Sets the value of the recurringFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringFrequencyType }
     *     
     */
    public void setRecurringFrequencyType(RecurringFrequencyType value) {
        this.recurringFrequencyType = value;
    }

    /**
     * Gets the value of the recurringFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecurringFrequency() {
        return recurringFrequency;
    }

    /**
     * Sets the value of the recurringFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecurringFrequency(JAXBElement<Integer> value) {
        this.recurringFrequency = value;
    }

    /**
     * Gets the value of the recurringInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecurringInstallmentCount() {
        return recurringInstallmentCount;
    }

    /**
     * Sets the value of the recurringInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecurringInstallmentCount(JAXBElement<Integer> value) {
        this.recurringInstallmentCount = value;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNumber(String value) {
        this.customerNumber = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the customItem property.
     * 
     * @return
     *     possible object is
     *     {@link CustomItem }
     *     
     */
    public CustomItem getCustomItem() {
        return customItem;
    }

    /**
     * Sets the value of the customItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomItem }
     *     
     */
    public void setCustomItem(CustomItem value) {
        this.customItem = value;
    }

    /**
     * Gets the value of the installmentItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstallmentItemDetail }
     *     
     */
    public ArrayOfInstallmentItemDetail getInstallmentItemDetails() {
        return installmentItemDetails;
    }

    /**
     * Sets the value of the installmentItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstallmentItemDetail }
     *     
     */
    public void setInstallmentItemDetails(ArrayOfInstallmentItemDetail value) {
        this.installmentItemDetails = value;
    }

}
