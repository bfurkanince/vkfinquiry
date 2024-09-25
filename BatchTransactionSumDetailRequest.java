
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionSumDetailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BatchTransactionSumDetailRequest">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedRequestBase">
 *       <sequence>
 *         <element name="MerchantCriteria" type="{PayFlexVPosUIServerWebService}MerchantCriteriaInfo" minOccurs="0"/>
 *         <element name="BatchTransactionSumId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ProcessStartDateRange" type="{PayFlexVPosUIServerWebService}DateCriteriaInfo" minOccurs="0"/>
 *         <element name="RecordTimeRange" type="{PayFlexVPosUIServerWebService}DateCriteriaInfo" minOccurs="0"/>
 *         <element name="BatchTransactionSumStatus" type="{PayFlexVPosUIServerWebService}BatchTransactionSumStatus"/>
 *         <element name="BatchOrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SearchedCustomItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SearchedCustomItemValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="IsFromUploadedFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalAmountOlder" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalAmountOldest" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchTransactionSumDetailRequest", propOrder = {
    "merchantCriteria",
    "batchTransactionSumId",
    "hostTerminalId",
    "processStartDateRange",
    "recordTimeRange",
    "batchTransactionSumStatus",
    "batchOrderId",
    "batchOrderDescription",
    "searchedCustomItemName",
    "searchedCustomItemValue",
    "customerId",
    "isFromUploadedFile",
    "languageCode",
    "totalAmount",
    "totalAmountOlder",
    "totalAmountOldest"
})
public class BatchTransactionSumDetailRequest
    extends PagedRequestBase
{

    @XmlElement(name = "MerchantCriteria")
    protected MerchantCriteriaInfo merchantCriteria;
    @XmlElement(name = "BatchTransactionSumId", required = true, type = Integer.class, nillable = true)
    protected Integer batchTransactionSumId;
    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;
    @XmlElement(name = "ProcessStartDateRange")
    protected DateCriteriaInfo processStartDateRange;
    @XmlElement(name = "RecordTimeRange")
    protected DateCriteriaInfo recordTimeRange;
    @XmlElement(name = "BatchTransactionSumStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected BatchTransactionSumStatus batchTransactionSumStatus;
    @XmlElement(name = "BatchOrderId")
    protected String batchOrderId;
    @XmlElement(name = "BatchOrderDescription")
    protected String batchOrderDescription;
    @XmlElement(name = "SearchedCustomItemName")
    protected String searchedCustomItemName;
    @XmlElement(name = "SearchedCustomItemValue")
    protected String searchedCustomItemValue;
    @XmlElement(name = "CustomerId", required = true, type = Integer.class, nillable = true)
    protected Integer customerId;
    @XmlElement(name = "IsFromUploadedFile", required = true, type = Boolean.class, nillable = true)
    protected Boolean isFromUploadedFile;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "TotalAmount", required = true, nillable = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "TotalAmountOlder", required = true, nillable = true)
    protected BigDecimal totalAmountOlder;
    @XmlElement(name = "TotalAmountOldest", required = true, nillable = true)
    protected BigDecimal totalAmountOldest;

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
     * Gets the value of the processStartDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public DateCriteriaInfo getProcessStartDateRange() {
        return processStartDateRange;
    }

    /**
     * Sets the value of the processStartDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public void setProcessStartDateRange(DateCriteriaInfo value) {
        this.processStartDateRange = value;
    }

    /**
     * Gets the value of the recordTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public DateCriteriaInfo getRecordTimeRange() {
        return recordTimeRange;
    }

    /**
     * Sets the value of the recordTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public void setRecordTimeRange(DateCriteriaInfo value) {
        this.recordTimeRange = value;
    }

    /**
     * Gets the value of the batchTransactionSumStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransactionSumStatus }
     *     
     */
    public BatchTransactionSumStatus getBatchTransactionSumStatus() {
        return batchTransactionSumStatus;
    }

    /**
     * Sets the value of the batchTransactionSumStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransactionSumStatus }
     *     
     */
    public void setBatchTransactionSumStatus(BatchTransactionSumStatus value) {
        this.batchTransactionSumStatus = value;
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
     * Gets the value of the batchOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchOrderDescription() {
        return batchOrderDescription;
    }

    /**
     * Sets the value of the batchOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchOrderDescription(String value) {
        this.batchOrderDescription = value;
    }

    /**
     * Gets the value of the searchedCustomItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchedCustomItemName() {
        return searchedCustomItemName;
    }

    /**
     * Sets the value of the searchedCustomItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchedCustomItemName(String value) {
        this.searchedCustomItemName = value;
    }

    /**
     * Gets the value of the searchedCustomItemValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchedCustomItemValue() {
        return searchedCustomItemValue;
    }

    /**
     * Sets the value of the searchedCustomItemValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchedCustomItemValue(String value) {
        this.searchedCustomItemValue = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerId(Integer value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the isFromUploadedFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFromUploadedFile() {
        return isFromUploadedFile;
    }

    /**
     * Sets the value of the isFromUploadedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFromUploadedFile(Boolean value) {
        this.isFromUploadedFile = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
     * Gets the value of the totalAmountOlder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountOlder() {
        return totalAmountOlder;
    }

    /**
     * Sets the value of the totalAmountOlder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountOlder(BigDecimal value) {
        this.totalAmountOlder = value;
    }

    /**
     * Gets the value of the totalAmountOldest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmountOldest() {
        return totalAmountOldest;
    }

    /**
     * Sets the value of the totalAmountOldest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmountOldest(BigDecimal value) {
        this.totalAmountOldest = value;
    }

}
