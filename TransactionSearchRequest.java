
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionSearchRequest">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedRequestBase">
 *       <sequence>
 *         <element name="SearchOnArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MerchantCriteria" type="{PayFlexVPosUIServerWebService}MerchantCriteriaInfo" minOccurs="0"/>
 *         <element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionType" type="{PayFlexVPosUIServerWebService}TransactionType"/>
 *         <element name="CardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransactionSuccessStatus" type="{PayFlexVPosUIServerWebService}TransactionSuccessStatus"/>
 *         <element name="AmountCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MinimumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="MaximumAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="TransactionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="ThreedTransactionType" type="{PayFlexVPosUIServerWebService}ThreedTransactionType"/>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="BinNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="OnlyActiveBatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MerchantIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CardHolderIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LastFourDigitOfCreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ValueList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionSource" type="{PayFlexVPosUIServerWebService}TransactionSource"/>
 *         <element name="TransactionDeviceSource" type="{PayFlexVPosUIServerWebService}TransactionDeviceSource"/>
 *         <element name="ReferencedTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantCustomItems" type="{PayFlexVPosUIServerWebService}ArrayOfString" minOccurs="0"/>
 *         <element name="MerchantType" type="{PayFlexVPosUIServerWebService}MerchantType"/>
 *         <element name="TransactionSearchType" type="{PayFlexVPosUIServerWebService}TransactionSearchType"/>
 *         <element name="StoreNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchRequest", propOrder = {
    "searchOnArchive",
    "merchantCriteria",
    "transactionId",
    "transactionType",
    "cardType",
    "transactionSuccessStatus",
    "amountCode",
    "minimumAmount",
    "maximumAmount",
    "pan",
    "transactionStartDate",
    "transactionEndDate",
    "threedTransactionType",
    "hostTerminalId",
    "languageCode",
    "authCode",
    "batchNumber",
    "binNumber",
    "isDomestic",
    "onlyActiveBatch",
    "cardHolderName",
    "installmentCount",
    "merchantIp",
    "cardHolderIpAddress",
    "lastFourDigitOfCreditCardNumber",
    "orderId",
    "resultCode",
    "valueList",
    "transactionSource",
    "transactionDeviceSource",
    "referencedTransactionId",
    "merchantCustomItems",
    "merchantType",
    "transactionSearchType",
    "storeNo"
})
public class TransactionSearchRequest
    extends PagedRequestBase
{

    @XmlElement(name = "SearchOnArchive")
    protected boolean searchOnArchive;
    @XmlElement(name = "MerchantCriteria")
    protected MerchantCriteriaInfo merchantCriteria;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "TransactionType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    @XmlElement(name = "CardType", required = true, type = Integer.class, nillable = true)
    protected Integer cardType;
    @XmlElement(name = "TransactionSuccessStatus", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionSuccessStatus transactionSuccessStatus;
    @XmlElement(name = "AmountCode", required = true, type = Integer.class, nillable = true)
    protected Integer amountCode;
    @XmlElement(name = "MinimumAmount", required = true, nillable = true)
    protected BigDecimal minimumAmount;
    @XmlElement(name = "MaximumAmount", required = true, nillable = true)
    protected BigDecimal maximumAmount;
    @XmlElement(name = "Pan")
    protected String pan;
    @XmlElement(name = "TransactionStartDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionStartDate;
    @XmlElement(name = "TransactionEndDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionEndDate;
    @XmlElement(name = "ThreedTransactionType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected ThreedTransactionType threedTransactionType;
    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "BatchNumber", required = true, type = Integer.class, nillable = true)
    protected Integer batchNumber;
    @XmlElement(name = "BinNumber")
    protected String binNumber;
    @XmlElement(name = "IsDomestic", required = true, type = Boolean.class, nillable = true)
    protected Boolean isDomestic;
    @XmlElement(name = "OnlyActiveBatch")
    protected boolean onlyActiveBatch;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "InstallmentCount", required = true, type = Integer.class, nillable = true)
    protected Integer installmentCount;
    @XmlElement(name = "MerchantIp")
    protected String merchantIp;
    @XmlElement(name = "CardHolderIpAddress")
    protected String cardHolderIpAddress;
    @XmlElement(name = "LastFourDigitOfCreditCardNumber")
    protected String lastFourDigitOfCreditCardNumber;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "ResultCode")
    protected String resultCode;
    @XmlElement(name = "ValueList")
    protected String valueList;
    @XmlElement(name = "TransactionSource", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionSource transactionSource;
    @XmlElement(name = "TransactionDeviceSource", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionDeviceSource transactionDeviceSource;
    @XmlElement(name = "ReferencedTransactionId")
    protected String referencedTransactionId;
    @XmlElement(name = "MerchantCustomItems")
    protected ArrayOfString merchantCustomItems;
    @XmlElement(name = "MerchantType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected MerchantType merchantType;
    @XmlElement(name = "TransactionSearchType", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected TransactionSearchType transactionSearchType;
    @XmlElement(name = "StoreNo")
    protected String storeNo;

    /**
     * Gets the value of the searchOnArchive property.
     * 
     */
    public boolean isSearchOnArchive() {
        return searchOnArchive;
    }

    /**
     * Sets the value of the searchOnArchive property.
     * 
     */
    public void setSearchOnArchive(boolean value) {
        this.searchOnArchive = value;
    }

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
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardType(Integer value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the transactionSuccessStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSuccessStatus }
     *     
     */
    public TransactionSuccessStatus getTransactionSuccessStatus() {
        return transactionSuccessStatus;
    }

    /**
     * Sets the value of the transactionSuccessStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSuccessStatus }
     *     
     */
    public void setTransactionSuccessStatus(TransactionSuccessStatus value) {
        this.transactionSuccessStatus = value;
    }

    /**
     * Gets the value of the amountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmountCode() {
        return amountCode;
    }

    /**
     * Sets the value of the amountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmountCode(Integer value) {
        this.amountCode = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumAmount(BigDecimal value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumAmount(BigDecimal value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the transactionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionStartDate() {
        return transactionStartDate;
    }

    /**
     * Sets the value of the transactionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionStartDate(XMLGregorianCalendar value) {
        this.transactionStartDate = value;
    }

    /**
     * Gets the value of the transactionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionEndDate() {
        return transactionEndDate;
    }

    /**
     * Sets the value of the transactionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionEndDate(XMLGregorianCalendar value) {
        this.transactionEndDate = value;
    }

    /**
     * Gets the value of the threedTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link ThreedTransactionType }
     *     
     */
    public ThreedTransactionType getThreedTransactionType() {
        return threedTransactionType;
    }

    /**
     * Sets the value of the threedTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreedTransactionType }
     *     
     */
    public void setThreedTransactionType(ThreedTransactionType value) {
        this.threedTransactionType = value;
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
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchNumber(Integer value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the binNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinNumber(String value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the isDomestic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDomestic(Boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the onlyActiveBatch property.
     * 
     */
    public boolean isOnlyActiveBatch() {
        return onlyActiveBatch;
    }

    /**
     * Sets the value of the onlyActiveBatch property.
     * 
     */
    public void setOnlyActiveBatch(boolean value) {
        this.onlyActiveBatch = value;
    }

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
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
     * Gets the value of the merchantIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantIp() {
        return merchantIp;
    }

    /**
     * Sets the value of the merchantIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantIp(String value) {
        this.merchantIp = value;
    }

    /**
     * Gets the value of the cardHolderIpAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderIpAddress() {
        return cardHolderIpAddress;
    }

    /**
     * Sets the value of the cardHolderIpAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderIpAddress(String value) {
        this.cardHolderIpAddress = value;
    }

    /**
     * Gets the value of the lastFourDigitOfCreditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastFourDigitOfCreditCardNumber() {
        return lastFourDigitOfCreditCardNumber;
    }

    /**
     * Sets the value of the lastFourDigitOfCreditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastFourDigitOfCreditCardNumber(String value) {
        this.lastFourDigitOfCreditCardNumber = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueList(String value) {
        this.valueList = value;
    }

    /**
     * Gets the value of the transactionSource property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSource }
     *     
     */
    public TransactionSource getTransactionSource() {
        return transactionSource;
    }

    /**
     * Sets the value of the transactionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSource }
     *     
     */
    public void setTransactionSource(TransactionSource value) {
        this.transactionSource = value;
    }

    /**
     * Gets the value of the transactionDeviceSource property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDeviceSource }
     *     
     */
    public TransactionDeviceSource getTransactionDeviceSource() {
        return transactionDeviceSource;
    }

    /**
     * Sets the value of the transactionDeviceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDeviceSource }
     *     
     */
    public void setTransactionDeviceSource(TransactionDeviceSource value) {
        this.transactionDeviceSource = value;
    }

    /**
     * Gets the value of the referencedTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencedTransactionId() {
        return referencedTransactionId;
    }

    /**
     * Sets the value of the referencedTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencedTransactionId(String value) {
        this.referencedTransactionId = value;
    }

    /**
     * Gets the value of the merchantCustomItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getMerchantCustomItems() {
        return merchantCustomItems;
    }

    /**
     * Sets the value of the merchantCustomItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setMerchantCustomItems(ArrayOfString value) {
        this.merchantCustomItems = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantType }
     *     
     */
    public MerchantType getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantType }
     *     
     */
    public void setMerchantType(MerchantType value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the transactionSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchType }
     *     
     */
    public TransactionSearchType getTransactionSearchType() {
        return transactionSearchType;
    }

    /**
     * Sets the value of the transactionSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchType }
     *     
     */
    public void setTransactionSearchType(TransactionSearchType value) {
        this.transactionSearchType = value;
    }

    /**
     * Gets the value of the storeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreNo() {
        return storeNo;
    }

    /**
     * Sets the value of the storeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreNo(String value) {
        this.storeNo = value;
    }

}
