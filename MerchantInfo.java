
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MerchantInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AvaliableInstallmentCounts" type="{PayFlexVPosUIServerWebService}ArrayOfInt" minOccurs="0"/>
 *         <element name="ControlMerchantIp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AvailableVftInstallments" type="{PayFlexVPosUIServerWebService}ArrayOfInt" minOccurs="0"/>
 *         <element name="MerchantPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsUseDonationPage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsUseCommonPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PaymentFacilitator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsUseManuelBatchClose" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ThreedSecureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Recurring" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Control3dTrnx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Control3dCavvTrnx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RecurringMerchant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TKMerchant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Mcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StoreNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="StoreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TCKN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="VKN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CanReachSubMerchantData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="HasApprovalMechanism" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MerchantType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ParentMerchant" type="{PayFlexVPosUIServerWebService}MerchantInfo" minOccurs="0"/>
 *         <element name="ParentHostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TaxAdministrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantCreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="FirstTransactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="IsGIBReconciliationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsTcknVknEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Is64PayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="EncryptRequiredFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MerchantCurrencyCodes" type="{PayFlexVPosUIServerWebService}ArrayOfMerchantCurrencyCodeResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantInfo", propOrder = {
    "merchantId",
    "hostMerchantId",
    "merchantName",
    "contactName",
    "isActive",
    "avaliableInstallmentCounts",
    "controlMerchantIp",
    "availableVftInstallments",
    "merchantPassword",
    "isUseDonationPage",
    "isUseCommonPayment",
    "paymentFacilitator",
    "isUseManuelBatchClose",
    "threedSecureType",
    "recurring",
    "control3DTrnx",
    "control3DCavvTrnx",
    "recurringMerchant",
    "tkMerchant",
    "mcc",
    "storeNo",
    "storeName",
    "tckn",
    "vkn",
    "canReachSubMerchantData",
    "hasApprovalMechanism",
    "merchantType",
    "parentMerchant",
    "parentHostMerchantId",
    "taxAdministrationCode",
    "merchantCreateDate",
    "firstTransactionDate",
    "isGIBReconciliationEnabled",
    "isTcknVknEnabled",
    "is64PayEnabled",
    "encryptRequiredFields",
    "merchantCurrencyCodes"
})
public class MerchantInfo {

    @XmlElement(name = "MerchantId")
    protected int merchantId;
    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "AvaliableInstallmentCounts")
    protected ArrayOfInt avaliableInstallmentCounts;
    @XmlElement(name = "ControlMerchantIp")
    protected boolean controlMerchantIp;
    @XmlElement(name = "AvailableVftInstallments")
    protected ArrayOfInt availableVftInstallments;
    @XmlElement(name = "MerchantPassword")
    protected String merchantPassword;
    @XmlElement(name = "IsUseDonationPage", required = true, type = Boolean.class, nillable = true)
    protected Boolean isUseDonationPage;
    @XmlElement(name = "IsUseCommonPayment", required = true, type = Boolean.class, nillable = true)
    protected Boolean isUseCommonPayment;
    @XmlElement(name = "PaymentFacilitator", required = true, type = Boolean.class, nillable = true)
    protected Boolean paymentFacilitator;
    @XmlElement(name = "IsUseManuelBatchClose")
    protected boolean isUseManuelBatchClose;
    @XmlElement(name = "ThreedSecureType")
    protected String threedSecureType;
    @XmlElement(name = "Recurring")
    protected boolean recurring;
    @XmlElement(name = "Control3dTrnx")
    protected boolean control3DTrnx;
    @XmlElement(name = "Control3dCavvTrnx")
    protected boolean control3DCavvTrnx;
    @XmlElement(name = "RecurringMerchant")
    protected boolean recurringMerchant;
    @XmlElement(name = "TKMerchant")
    protected boolean tkMerchant;
    @XmlElement(name = "Mcc")
    protected String mcc;
    @XmlElement(name = "StoreNo")
    protected String storeNo;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "TCKN")
    protected String tckn;
    @XmlElement(name = "VKN")
    protected String vkn;
    @XmlElement(name = "CanReachSubMerchantData")
    protected boolean canReachSubMerchantData;
    @XmlElement(name = "HasApprovalMechanism")
    protected boolean hasApprovalMechanism;
    @XmlElement(name = "MerchantType")
    protected int merchantType;
    @XmlElement(name = "ParentMerchant")
    protected MerchantInfo parentMerchant;
    @XmlElement(name = "ParentHostMerchantId")
    protected String parentHostMerchantId;
    @XmlElement(name = "TaxAdministrationCode")
    protected String taxAdministrationCode;
    @XmlElement(name = "MerchantCreateDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar merchantCreateDate;
    @XmlElement(name = "FirstTransactionDate", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstTransactionDate;
    @XmlElement(name = "IsGIBReconciliationEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isGIBReconciliationEnabled;
    @XmlElement(name = "IsTcknVknEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean isTcknVknEnabled;
    @XmlElement(name = "Is64PayEnabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean is64PayEnabled;
    @XmlElement(name = "EncryptRequiredFields")
    protected boolean encryptRequiredFields;
    @XmlElement(name = "MerchantCurrencyCodes")
    protected ArrayOfMerchantCurrencyCodeResponse merchantCurrencyCodes;

    /**
     * Gets the value of the merchantId property.
     * 
     */
    public int getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     */
    public void setMerchantId(int value) {
        this.merchantId = value;
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
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the avaliableInstallmentCounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAvaliableInstallmentCounts() {
        return avaliableInstallmentCounts;
    }

    /**
     * Sets the value of the avaliableInstallmentCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAvaliableInstallmentCounts(ArrayOfInt value) {
        this.avaliableInstallmentCounts = value;
    }

    /**
     * Gets the value of the controlMerchantIp property.
     * 
     */
    public boolean isControlMerchantIp() {
        return controlMerchantIp;
    }

    /**
     * Sets the value of the controlMerchantIp property.
     * 
     */
    public void setControlMerchantIp(boolean value) {
        this.controlMerchantIp = value;
    }

    /**
     * Gets the value of the availableVftInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getAvailableVftInstallments() {
        return availableVftInstallments;
    }

    /**
     * Sets the value of the availableVftInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setAvailableVftInstallments(ArrayOfInt value) {
        this.availableVftInstallments = value;
    }

    /**
     * Gets the value of the merchantPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPassword() {
        return merchantPassword;
    }

    /**
     * Sets the value of the merchantPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPassword(String value) {
        this.merchantPassword = value;
    }

    /**
     * Gets the value of the isUseDonationPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUseDonationPage() {
        return isUseDonationPage;
    }

    /**
     * Sets the value of the isUseDonationPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseDonationPage(Boolean value) {
        this.isUseDonationPage = value;
    }

    /**
     * Gets the value of the isUseCommonPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUseCommonPayment() {
        return isUseCommonPayment;
    }

    /**
     * Sets the value of the isUseCommonPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUseCommonPayment(Boolean value) {
        this.isUseCommonPayment = value;
    }

    /**
     * Gets the value of the paymentFacilitator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentFacilitator() {
        return paymentFacilitator;
    }

    /**
     * Sets the value of the paymentFacilitator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentFacilitator(Boolean value) {
        this.paymentFacilitator = value;
    }

    /**
     * Gets the value of the isUseManuelBatchClose property.
     * 
     */
    public boolean isIsUseManuelBatchClose() {
        return isUseManuelBatchClose;
    }

    /**
     * Sets the value of the isUseManuelBatchClose property.
     * 
     */
    public void setIsUseManuelBatchClose(boolean value) {
        this.isUseManuelBatchClose = value;
    }

    /**
     * Gets the value of the threedSecureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreedSecureType() {
        return threedSecureType;
    }

    /**
     * Sets the value of the threedSecureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreedSecureType(String value) {
        this.threedSecureType = value;
    }

    /**
     * Gets the value of the recurring property.
     * 
     */
    public boolean isRecurring() {
        return recurring;
    }

    /**
     * Sets the value of the recurring property.
     * 
     */
    public void setRecurring(boolean value) {
        this.recurring = value;
    }

    /**
     * Gets the value of the control3DTrnx property.
     * 
     */
    public boolean isControl3DTrnx() {
        return control3DTrnx;
    }

    /**
     * Sets the value of the control3DTrnx property.
     * 
     */
    public void setControl3DTrnx(boolean value) {
        this.control3DTrnx = value;
    }

    /**
     * Gets the value of the control3DCavvTrnx property.
     * 
     */
    public boolean isControl3DCavvTrnx() {
        return control3DCavvTrnx;
    }

    /**
     * Sets the value of the control3DCavvTrnx property.
     * 
     */
    public void setControl3DCavvTrnx(boolean value) {
        this.control3DCavvTrnx = value;
    }

    /**
     * Gets the value of the recurringMerchant property.
     * 
     */
    public boolean isRecurringMerchant() {
        return recurringMerchant;
    }

    /**
     * Sets the value of the recurringMerchant property.
     * 
     */
    public void setRecurringMerchant(boolean value) {
        this.recurringMerchant = value;
    }

    /**
     * Gets the value of the tkMerchant property.
     * 
     */
    public boolean isTKMerchant() {
        return tkMerchant;
    }

    /**
     * Sets the value of the tkMerchant property.
     * 
     */
    public void setTKMerchant(boolean value) {
        this.tkMerchant = value;
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcc(String value) {
        this.mcc = value;
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

    /**
     * Gets the value of the storeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Sets the value of the storeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreName(String value) {
        this.storeName = value;
    }

    /**
     * Gets the value of the tckn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCKN() {
        return tckn;
    }

    /**
     * Sets the value of the tckn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCKN(String value) {
        this.tckn = value;
    }

    /**
     * Gets the value of the vkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVKN() {
        return vkn;
    }

    /**
     * Sets the value of the vkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVKN(String value) {
        this.vkn = value;
    }

    /**
     * Gets the value of the canReachSubMerchantData property.
     * 
     */
    public boolean isCanReachSubMerchantData() {
        return canReachSubMerchantData;
    }

    /**
     * Sets the value of the canReachSubMerchantData property.
     * 
     */
    public void setCanReachSubMerchantData(boolean value) {
        this.canReachSubMerchantData = value;
    }

    /**
     * Gets the value of the hasApprovalMechanism property.
     * 
     */
    public boolean isHasApprovalMechanism() {
        return hasApprovalMechanism;
    }

    /**
     * Sets the value of the hasApprovalMechanism property.
     * 
     */
    public void setHasApprovalMechanism(boolean value) {
        this.hasApprovalMechanism = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     */
    public int getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     */
    public void setMerchantType(int value) {
        this.merchantType = value;
    }

    /**
     * Gets the value of the parentMerchant property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantInfo }
     *     
     */
    public MerchantInfo getParentMerchant() {
        return parentMerchant;
    }

    /**
     * Sets the value of the parentMerchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantInfo }
     *     
     */
    public void setParentMerchant(MerchantInfo value) {
        this.parentMerchant = value;
    }

    /**
     * Gets the value of the parentHostMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentHostMerchantId() {
        return parentHostMerchantId;
    }

    /**
     * Sets the value of the parentHostMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentHostMerchantId(String value) {
        this.parentHostMerchantId = value;
    }

    /**
     * Gets the value of the taxAdministrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAdministrationCode() {
        return taxAdministrationCode;
    }

    /**
     * Sets the value of the taxAdministrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAdministrationCode(String value) {
        this.taxAdministrationCode = value;
    }

    /**
     * Gets the value of the merchantCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMerchantCreateDate() {
        return merchantCreateDate;
    }

    /**
     * Sets the value of the merchantCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMerchantCreateDate(XMLGregorianCalendar value) {
        this.merchantCreateDate = value;
    }

    /**
     * Gets the value of the firstTransactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstTransactionDate() {
        return firstTransactionDate;
    }

    /**
     * Sets the value of the firstTransactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstTransactionDate(XMLGregorianCalendar value) {
        this.firstTransactionDate = value;
    }

    /**
     * Gets the value of the isGIBReconciliationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGIBReconciliationEnabled() {
        return isGIBReconciliationEnabled;
    }

    /**
     * Sets the value of the isGIBReconciliationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGIBReconciliationEnabled(Boolean value) {
        this.isGIBReconciliationEnabled = value;
    }

    /**
     * Gets the value of the isTcknVknEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTcknVknEnabled() {
        return isTcknVknEnabled;
    }

    /**
     * Sets the value of the isTcknVknEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTcknVknEnabled(Boolean value) {
        this.isTcknVknEnabled = value;
    }

    /**
     * Gets the value of the is64PayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIs64PayEnabled() {
        return is64PayEnabled;
    }

    /**
     * Sets the value of the is64PayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIs64PayEnabled(Boolean value) {
        this.is64PayEnabled = value;
    }

    /**
     * Gets the value of the encryptRequiredFields property.
     * 
     */
    public boolean isEncryptRequiredFields() {
        return encryptRequiredFields;
    }

    /**
     * Sets the value of the encryptRequiredFields property.
     * 
     */
    public void setEncryptRequiredFields(boolean value) {
        this.encryptRequiredFields = value;
    }

    /**
     * Gets the value of the merchantCurrencyCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMerchantCurrencyCodeResponse }
     *     
     */
    public ArrayOfMerchantCurrencyCodeResponse getMerchantCurrencyCodes() {
        return merchantCurrencyCodes;
    }

    /**
     * Sets the value of the merchantCurrencyCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMerchantCurrencyCodeResponse }
     *     
     */
    public void setMerchantCurrencyCodes(ArrayOfMerchantCurrencyCodeResponse value) {
        this.merchantCurrencyCodes = value;
    }

}
