
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransactionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransactionInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BrandId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PanMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionType" type="{PayFlexVPosUIServerWebService}PaymentTransactionTypeInfo" minOccurs="0"/>
 *         <element name="Merchant" type="{PayFlexVPosUIServerWebService}MerchantInfo" minOccurs="0"/>
 *         <element name="Terminal" type="{PayFlexVPosUIServerWebService}TerminalInfo" minOccurs="0"/>
 *         <element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PlaceOfTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Ekstre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ExpSign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ValueList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MpiId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Device" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="AmountShare" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="AmountCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TotalRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CaptureAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="TotalRefundLAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ReferencedPaymentTransactionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ReferencedTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OnlyActiveBatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RequestInsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="InstallmentTable" type="{PayFlexVPosUIServerWebService}InstallmentTable" minOccurs="0"/>
 *         <element name="GIBInstallment" type="{PayFlexVPosUIServerWebService}GIBInstallments" minOccurs="0"/>
 *         <element name="TransactionDeviceSource" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IsReversed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsRefunded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsCaptured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsPendingToReverse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CardHolderIpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Rrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CardHolderEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BatchNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BatchId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransactionThreedSecureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsOnUs" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsDomestic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TransactionCampaignResult" type="{PayFlexVPosUIServerWebService}ArrayOfTransactionCampaignResult" minOccurs="0"/>
 *         <element name="CampaignResultInfoSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomItems" type="{PayFlexVPosUIServerWebService}ArrayOfCustomItem" minOccurs="0"/>
 *         <element name="ResponseInsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="VftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CancelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="OriginalTransactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="PointAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="PointCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="TLAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="GainedPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="TotalPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="Eci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Cavv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="OriginalBatchAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="BatchAmountTL" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CardInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="MerchantInstallmentCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IsRefundableTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsCancelableTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PointLosts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionDeviceSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsBatchClosed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="CustomItemsFormatted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MultipliedPoints" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalPointsIncludingMultiplied" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="DecryptedPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Is64" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="PanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CustomerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionInfo", propOrder = {
    "paymentTransactionId",
    "pan",
    "brandId",
    "panMasked",
    "transactionType",
    "merchant",
    "terminal",
    "transactionId",
    "orderId",
    "placeOfTransaction",
    "transactionSource",
    "transactionChannel",
    "userIp",
    "userName",
    "ekstre",
    "expSign",
    "valueList",
    "mpiId",
    "device",
    "installmentCount",
    "amount",
    "amountShare",
    "amountCode",
    "codeDescription",
    "totalRefundAmount",
    "captureAmount",
    "totalRefundLAmount",
    "referencedPaymentTransactionId",
    "referencedTransactionId",
    "onlyActiveBatch",
    "isCanceled",
    "requestInsertTime",
    "installmentTable",
    "gibInstallment",
    "transactionDeviceSource",
    "isReversed",
    "isRefunded",
    "isCaptured",
    "isPendingToReverse",
    "cardHolderIpAddress",
    "rrn",
    "resultCode",
    "hostMessage",
    "orderDescription",
    "authCode",
    "cardHolderEmail",
    "batchNumber",
    "batchId",
    "transactionThreedSecureType",
    "isOnUs",
    "isDomestic",
    "transactionCampaignResult",
    "campaignResultInfoSummary",
    "customItems",
    "responseInsertTime",
    "vftAmount",
    "surchargeAmount",
    "cancelDate",
    "originalTransactionTime",
    "pointAmount",
    "pointCode",
    "tlAmount",
    "gainedPoint",
    "totalPoint",
    "eci",
    "cavv",
    "userId",
    "originalBatchAmount",
    "batchAmountTL",
    "cardHolderName",
    "cardInstallmentCount",
    "merchantInstallmentCount",
    "isRefundableTransaction",
    "isCancelableTransaction",
    "pointLosts",
    "expireDate",
    "transactionDeviceSourceType",
    "hostDate",
    "hostTime",
    "responseMessage",
    "hostResultCode",
    "isBatchClosed",
    "customItemsFormatted",
    "multipliedPoints",
    "totalPointsIncludingMultiplied",
    "decryptedPan",
    "is64",
    "panCode",
    "customerId",
    "customerNumber"
})
public class PaymentTransactionInfo {

    @XmlElement(name = "PaymentTransactionId")
    protected int paymentTransactionId;
    @XmlElement(name = "Pan")
    protected String pan;
    @XmlElement(name = "BrandId")
    protected String brandId;
    @XmlElement(name = "PanMasked")
    protected String panMasked;
    @XmlElement(name = "TransactionType")
    protected PaymentTransactionTypeInfo transactionType;
    @XmlElement(name = "Merchant")
    protected MerchantInfo merchant;
    @XmlElement(name = "Terminal")
    protected TerminalInfo terminal;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "PlaceOfTransaction")
    protected String placeOfTransaction;
    @XmlElement(name = "TransactionSource")
    protected String transactionSource;
    @XmlElement(name = "TransactionChannel")
    protected String transactionChannel;
    @XmlElement(name = "UserIp")
    protected String userIp;
    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "Ekstre")
    protected String ekstre;
    @XmlElement(name = "ExpSign")
    protected String expSign;
    @XmlElement(name = "ValueList")
    protected String valueList;
    @XmlElement(name = "MpiId")
    protected String mpiId;
    @XmlElement(name = "Device")
    protected String device;
    @XmlElementRef(name = "InstallmentCount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> installmentCount;
    @XmlElementRef(name = "Amount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amount;
    @XmlElementRef(name = "AmountShare", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amountShare;
    @XmlElementRef(name = "AmountCode", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> amountCode;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;
    @XmlElementRef(name = "TotalRefundAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalRefundAmount;
    @XmlElementRef(name = "CaptureAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> captureAmount;
    @XmlElementRef(name = "TotalRefundLAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalRefundLAmount;
    @XmlElementRef(name = "ReferencedPaymentTransactionId", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> referencedPaymentTransactionId;
    @XmlElement(name = "ReferencedTransactionId")
    protected String referencedTransactionId;
    @XmlElement(name = "OnlyActiveBatch")
    protected boolean onlyActiveBatch;
    @XmlElementRef(name = "IsCanceled", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCanceled;
    @XmlElement(name = "RequestInsertTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestInsertTime;
    @XmlElement(name = "InstallmentTable")
    protected InstallmentTable installmentTable;
    @XmlElement(name = "GIBInstallment")
    protected GIBInstallments gibInstallment;
    @XmlElementRef(name = "TransactionDeviceSource", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> transactionDeviceSource;
    @XmlElementRef(name = "IsReversed", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isReversed;
    @XmlElement(name = "IsRefunded")
    protected boolean isRefunded;
    @XmlElementRef(name = "IsCaptured", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCaptured;
    @XmlElementRef(name = "IsPendingToReverse", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPendingToReverse;
    @XmlElement(name = "CardHolderIpAddress")
    protected String cardHolderIpAddress;
    @XmlElement(name = "Rrn")
    protected String rrn;
    @XmlElement(name = "ResultCode")
    protected String resultCode;
    @XmlElement(name = "HostMessage")
    protected String hostMessage;
    @XmlElement(name = "OrderDescription")
    protected String orderDescription;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "CardHolderEmail")
    protected String cardHolderEmail;
    @XmlElementRef(name = "BatchNumber", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> batchNumber;
    @XmlElement(name = "BatchId", required = true, type = Integer.class, nillable = true)
    protected Integer batchId;
    @XmlElement(name = "TransactionThreedSecureType")
    protected String transactionThreedSecureType;
    @XmlElement(name = "IsOnUs")
    protected boolean isOnUs;
    @XmlElement(name = "IsDomestic")
    protected boolean isDomestic;
    @XmlElement(name = "TransactionCampaignResult")
    protected ArrayOfTransactionCampaignResult transactionCampaignResult;
    @XmlElement(name = "CampaignResultInfoSummary")
    protected String campaignResultInfoSummary;
    @XmlElement(name = "CustomItems")
    protected ArrayOfCustomItem customItems;
    @XmlElementRef(name = "ResponseInsertTime", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> responseInsertTime;
    @XmlElementRef(name = "VftAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vftAmount;
    @XmlElementRef(name = "SurchargeAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> surchargeAmount;
    @XmlElementRef(name = "CancelDate", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> cancelDate;
    @XmlElement(name = "OriginalTransactionTime", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalTransactionTime;
    @XmlElementRef(name = "PointAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pointAmount;
    @XmlElementRef(name = "PointCode", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pointCode;
    @XmlElementRef(name = "TLAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tlAmount;
    @XmlElementRef(name = "GainedPoint", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> gainedPoint;
    @XmlElementRef(name = "TotalPoint", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalPoint;
    @XmlElement(name = "Eci")
    protected String eci;
    @XmlElement(name = "Cavv")
    protected String cavv;
    @XmlElementRef(name = "UserId", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> userId;
    @XmlElementRef(name = "OriginalBatchAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> originalBatchAmount;
    @XmlElementRef(name = "BatchAmountTL", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> batchAmountTL;
    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElementRef(name = "CardInstallmentCount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cardInstallmentCount;
    @XmlElementRef(name = "MerchantInstallmentCount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> merchantInstallmentCount;
    @XmlElement(name = "IsRefundableTransaction")
    protected boolean isRefundableTransaction;
    @XmlElement(name = "IsCancelableTransaction")
    protected boolean isCancelableTransaction;
    @XmlElementRef(name = "PointLosts", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pointLosts;
    @XmlElement(name = "ExpireDate")
    protected String expireDate;
    @XmlElement(name = "TransactionDeviceSourceType")
    protected String transactionDeviceSourceType;
    @XmlElement(name = "HostDate")
    protected String hostDate;
    @XmlElement(name = "HostTime")
    protected String hostTime;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "HostResultCode")
    protected String hostResultCode;
    @XmlElement(name = "IsBatchClosed")
    protected boolean isBatchClosed;
    @XmlElement(name = "CustomItemsFormatted")
    protected String customItemsFormatted;
    @XmlElement(name = "MultipliedPoints", required = true, nillable = true)
    protected BigDecimal multipliedPoints;
    @XmlElement(name = "TotalPointsIncludingMultiplied", required = true, nillable = true)
    protected BigDecimal totalPointsIncludingMultiplied;
    @XmlElement(name = "DecryptedPan")
    protected String decryptedPan;
    @XmlElement(name = "Is64")
    protected boolean is64;
    @XmlElement(name = "PanCode")
    protected String panCode;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "CustomerNumber")
    protected String customerNumber;

    /**
     * Gets the value of the paymentTransactionId property.
     * 
     */
    public int getPaymentTransactionId() {
        return paymentTransactionId;
    }

    /**
     * Sets the value of the paymentTransactionId property.
     * 
     */
    public void setPaymentTransactionId(int value) {
        this.paymentTransactionId = value;
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
     * Gets the value of the brandId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets the value of the brandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandId(String value) {
        this.brandId = value;
    }

    /**
     * Gets the value of the panMasked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanMasked() {
        return panMasked;
    }

    /**
     * Sets the value of the panMasked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanMasked(String value) {
        this.panMasked = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionTypeInfo }
     *     
     */
    public PaymentTransactionTypeInfo getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionTypeInfo }
     *     
     */
    public void setTransactionType(PaymentTransactionTypeInfo value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantInfo }
     *     
     */
    public MerchantInfo getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantInfo }
     *     
     */
    public void setMerchant(MerchantInfo value) {
        this.merchant = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalInfo }
     *     
     */
    public TerminalInfo getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalInfo }
     *     
     */
    public void setTerminal(TerminalInfo value) {
        this.terminal = value;
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
     * Gets the value of the placeOfTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfTransaction() {
        return placeOfTransaction;
    }

    /**
     * Sets the value of the placeOfTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfTransaction(String value) {
        this.placeOfTransaction = value;
    }

    /**
     * Gets the value of the transactionSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSource() {
        return transactionSource;
    }

    /**
     * Sets the value of the transactionSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSource(String value) {
        this.transactionSource = value;
    }

    /**
     * Gets the value of the transactionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionChannel() {
        return transactionChannel;
    }

    /**
     * Sets the value of the transactionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionChannel(String value) {
        this.transactionChannel = value;
    }

    /**
     * Gets the value of the userIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * Sets the value of the userIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIp(String value) {
        this.userIp = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the ekstre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkstre() {
        return ekstre;
    }

    /**
     * Sets the value of the ekstre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkstre(String value) {
        this.ekstre = value;
    }

    /**
     * Gets the value of the expSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpSign() {
        return expSign;
    }

    /**
     * Sets the value of the expSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpSign(String value) {
        this.expSign = value;
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
     * Gets the value of the mpiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiId() {
        return mpiId;
    }

    /**
     * Sets the value of the mpiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiId(String value) {
        this.mpiId = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevice(String value) {
        this.device = value;
    }

    /**
     * Gets the value of the installmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInstallmentCount() {
        return installmentCount;
    }

    /**
     * Sets the value of the installmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInstallmentCount(JAXBElement<Integer> value) {
        this.installmentCount = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmount(JAXBElement<BigDecimal> value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountShare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmountShare() {
        return amountShare;
    }

    /**
     * Sets the value of the amountShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmountShare(JAXBElement<BigDecimal> value) {
        this.amountShare = value;
    }

    /**
     * Gets the value of the amountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAmountCode() {
        return amountCode;
    }

    /**
     * Sets the value of the amountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAmountCode(JAXBElement<Integer> value) {
        this.amountCode = value;
    }

    /**
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

    /**
     * Gets the value of the totalRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalRefundAmount() {
        return totalRefundAmount;
    }

    /**
     * Sets the value of the totalRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalRefundAmount(JAXBElement<BigDecimal> value) {
        this.totalRefundAmount = value;
    }

    /**
     * Gets the value of the captureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCaptureAmount() {
        return captureAmount;
    }

    /**
     * Sets the value of the captureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCaptureAmount(JAXBElement<BigDecimal> value) {
        this.captureAmount = value;
    }

    /**
     * Gets the value of the totalRefundLAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalRefundLAmount() {
        return totalRefundLAmount;
    }

    /**
     * Sets the value of the totalRefundLAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalRefundLAmount(JAXBElement<BigDecimal> value) {
        this.totalRefundLAmount = value;
    }

    /**
     * Gets the value of the referencedPaymentTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReferencedPaymentTransactionId() {
        return referencedPaymentTransactionId;
    }

    /**
     * Sets the value of the referencedPaymentTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReferencedPaymentTransactionId(JAXBElement<Integer> value) {
        this.referencedPaymentTransactionId = value;
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
     * Gets the value of the isCanceled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCanceled() {
        return isCanceled;
    }

    /**
     * Sets the value of the isCanceled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCanceled(JAXBElement<Boolean> value) {
        this.isCanceled = value;
    }

    /**
     * Gets the value of the requestInsertTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestInsertTime() {
        return requestInsertTime;
    }

    /**
     * Sets the value of the requestInsertTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestInsertTime(XMLGregorianCalendar value) {
        this.requestInsertTime = value;
    }

    /**
     * Gets the value of the installmentTable property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentTable }
     *     
     */
    public InstallmentTable getInstallmentTable() {
        return installmentTable;
    }

    /**
     * Sets the value of the installmentTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentTable }
     *     
     */
    public void setInstallmentTable(InstallmentTable value) {
        this.installmentTable = value;
    }

    /**
     * Gets the value of the gibInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link GIBInstallments }
     *     
     */
    public GIBInstallments getGIBInstallment() {
        return gibInstallment;
    }

    /**
     * Sets the value of the gibInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link GIBInstallments }
     *     
     */
    public void setGIBInstallment(GIBInstallments value) {
        this.gibInstallment = value;
    }

    /**
     * Gets the value of the transactionDeviceSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTransactionDeviceSource() {
        return transactionDeviceSource;
    }

    /**
     * Sets the value of the transactionDeviceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTransactionDeviceSource(JAXBElement<Integer> value) {
        this.transactionDeviceSource = value;
    }

    /**
     * Gets the value of the isReversed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsReversed() {
        return isReversed;
    }

    /**
     * Sets the value of the isReversed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsReversed(JAXBElement<Boolean> value) {
        this.isReversed = value;
    }

    /**
     * Gets the value of the isRefunded property.
     * 
     */
    public boolean isIsRefunded() {
        return isRefunded;
    }

    /**
     * Sets the value of the isRefunded property.
     * 
     */
    public void setIsRefunded(boolean value) {
        this.isRefunded = value;
    }

    /**
     * Gets the value of the isCaptured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsCaptured() {
        return isCaptured;
    }

    /**
     * Sets the value of the isCaptured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsCaptured(JAXBElement<Boolean> value) {
        this.isCaptured = value;
    }

    /**
     * Gets the value of the isPendingToReverse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPendingToReverse() {
        return isPendingToReverse;
    }

    /**
     * Sets the value of the isPendingToReverse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPendingToReverse(JAXBElement<Boolean> value) {
        this.isPendingToReverse = value;
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
     * Gets the value of the rrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRrn() {
        return rrn;
    }

    /**
     * Sets the value of the rrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRrn(String value) {
        this.rrn = value;
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
     * Gets the value of the hostMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMessage() {
        return hostMessage;
    }

    /**
     * Sets the value of the hostMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMessage(String value) {
        this.hostMessage = value;
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
     * Gets the value of the cardHolderEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderEmail() {
        return cardHolderEmail;
    }

    /**
     * Sets the value of the cardHolderEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderEmail(String value) {
        this.cardHolderEmail = value;
    }

    /**
     * Gets the value of the batchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBatchNumber() {
        return batchNumber;
    }

    /**
     * Sets the value of the batchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBatchNumber(JAXBElement<Integer> value) {
        this.batchNumber = value;
    }

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchId(Integer value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the transactionThreedSecureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionThreedSecureType() {
        return transactionThreedSecureType;
    }

    /**
     * Sets the value of the transactionThreedSecureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionThreedSecureType(String value) {
        this.transactionThreedSecureType = value;
    }

    /**
     * Gets the value of the isOnUs property.
     * 
     */
    public boolean isIsOnUs() {
        return isOnUs;
    }

    /**
     * Sets the value of the isOnUs property.
     * 
     */
    public void setIsOnUs(boolean value) {
        this.isOnUs = value;
    }

    /**
     * Gets the value of the isDomestic property.
     * 
     */
    public boolean isIsDomestic() {
        return isDomestic;
    }

    /**
     * Sets the value of the isDomestic property.
     * 
     */
    public void setIsDomestic(boolean value) {
        this.isDomestic = value;
    }

    /**
     * Gets the value of the transactionCampaignResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionCampaignResult }
     *     
     */
    public ArrayOfTransactionCampaignResult getTransactionCampaignResult() {
        return transactionCampaignResult;
    }

    /**
     * Sets the value of the transactionCampaignResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionCampaignResult }
     *     
     */
    public void setTransactionCampaignResult(ArrayOfTransactionCampaignResult value) {
        this.transactionCampaignResult = value;
    }

    /**
     * Gets the value of the campaignResultInfoSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignResultInfoSummary() {
        return campaignResultInfoSummary;
    }

    /**
     * Sets the value of the campaignResultInfoSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignResultInfoSummary(String value) {
        this.campaignResultInfoSummary = value;
    }

    /**
     * Gets the value of the customItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomItem }
     *     
     */
    public ArrayOfCustomItem getCustomItems() {
        return customItems;
    }

    /**
     * Sets the value of the customItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomItem }
     *     
     */
    public void setCustomItems(ArrayOfCustomItem value) {
        this.customItems = value;
    }

    /**
     * Gets the value of the responseInsertTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getResponseInsertTime() {
        return responseInsertTime;
    }

    /**
     * Sets the value of the responseInsertTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setResponseInsertTime(JAXBElement<XMLGregorianCalendar> value) {
        this.responseInsertTime = value;
    }

    /**
     * Gets the value of the vftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVftAmount() {
        return vftAmount;
    }

    /**
     * Sets the value of the vftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVftAmount(JAXBElement<BigDecimal> value) {
        this.vftAmount = value;
    }

    /**
     * Gets the value of the surchargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSurchargeAmount() {
        return surchargeAmount;
    }

    /**
     * Sets the value of the surchargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSurchargeAmount(JAXBElement<BigDecimal> value) {
        this.surchargeAmount = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCancelDate(JAXBElement<XMLGregorianCalendar> value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the originalTransactionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalTransactionTime() {
        return originalTransactionTime;
    }

    /**
     * Sets the value of the originalTransactionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalTransactionTime(XMLGregorianCalendar value) {
        this.originalTransactionTime = value;
    }

    /**
     * Gets the value of the pointAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPointAmount() {
        return pointAmount;
    }

    /**
     * Sets the value of the pointAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPointAmount(JAXBElement<BigDecimal> value) {
        this.pointAmount = value;
    }

    /**
     * Gets the value of the pointCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPointCode() {
        return pointCode;
    }

    /**
     * Sets the value of the pointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPointCode(JAXBElement<Integer> value) {
        this.pointCode = value;
    }

    /**
     * Gets the value of the tlAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTLAmount() {
        return tlAmount;
    }

    /**
     * Sets the value of the tlAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTLAmount(JAXBElement<BigDecimal> value) {
        this.tlAmount = value;
    }

    /**
     * Gets the value of the gainedPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGainedPoint() {
        return gainedPoint;
    }

    /**
     * Sets the value of the gainedPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGainedPoint(JAXBElement<BigDecimal> value) {
        this.gainedPoint = value;
    }

    /**
     * Gets the value of the totalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalPoint() {
        return totalPoint;
    }

    /**
     * Sets the value of the totalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalPoint(JAXBElement<BigDecimal> value) {
        this.totalPoint = value;
    }

    /**
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEci() {
        return eci;
    }

    /**
     * Sets the value of the eci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * Gets the value of the cavv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * Sets the value of the cavv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setUserId(JAXBElement<Integer> value) {
        this.userId = value;
    }

    /**
     * Gets the value of the originalBatchAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOriginalBatchAmount() {
        return originalBatchAmount;
    }

    /**
     * Sets the value of the originalBatchAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOriginalBatchAmount(JAXBElement<BigDecimal> value) {
        this.originalBatchAmount = value;
    }

    /**
     * Gets the value of the batchAmountTL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBatchAmountTL() {
        return batchAmountTL;
    }

    /**
     * Sets the value of the batchAmountTL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBatchAmountTL(JAXBElement<BigDecimal> value) {
        this.batchAmountTL = value;
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
     * Gets the value of the cardInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCardInstallmentCount() {
        return cardInstallmentCount;
    }

    /**
     * Sets the value of the cardInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCardInstallmentCount(JAXBElement<Integer> value) {
        this.cardInstallmentCount = value;
    }

    /**
     * Gets the value of the merchantInstallmentCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMerchantInstallmentCount() {
        return merchantInstallmentCount;
    }

    /**
     * Sets the value of the merchantInstallmentCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMerchantInstallmentCount(JAXBElement<Integer> value) {
        this.merchantInstallmentCount = value;
    }

    /**
     * Gets the value of the isRefundableTransaction property.
     * 
     */
    public boolean isIsRefundableTransaction() {
        return isRefundableTransaction;
    }

    /**
     * Sets the value of the isRefundableTransaction property.
     * 
     */
    public void setIsRefundableTransaction(boolean value) {
        this.isRefundableTransaction = value;
    }

    /**
     * Gets the value of the isCancelableTransaction property.
     * 
     */
    public boolean isIsCancelableTransaction() {
        return isCancelableTransaction;
    }

    /**
     * Sets the value of the isCancelableTransaction property.
     * 
     */
    public void setIsCancelableTransaction(boolean value) {
        this.isCancelableTransaction = value;
    }

    /**
     * Gets the value of the pointLosts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPointLosts() {
        return pointLosts;
    }

    /**
     * Sets the value of the pointLosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPointLosts(JAXBElement<BigDecimal> value) {
        this.pointLosts = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the transactionDeviceSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDeviceSourceType() {
        return transactionDeviceSourceType;
    }

    /**
     * Sets the value of the transactionDeviceSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDeviceSourceType(String value) {
        this.transactionDeviceSourceType = value;
    }

    /**
     * Gets the value of the hostDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostDate() {
        return hostDate;
    }

    /**
     * Sets the value of the hostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostDate(String value) {
        this.hostDate = value;
    }

    /**
     * Gets the value of the hostTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTime() {
        return hostTime;
    }

    /**
     * Sets the value of the hostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTime(String value) {
        this.hostTime = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the hostResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostResultCode() {
        return hostResultCode;
    }

    /**
     * Sets the value of the hostResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostResultCode(String value) {
        this.hostResultCode = value;
    }

    /**
     * Gets the value of the isBatchClosed property.
     * 
     */
    public boolean isIsBatchClosed() {
        return isBatchClosed;
    }

    /**
     * Sets the value of the isBatchClosed property.
     * 
     */
    public void setIsBatchClosed(boolean value) {
        this.isBatchClosed = value;
    }

    /**
     * Gets the value of the customItemsFormatted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomItemsFormatted() {
        return customItemsFormatted;
    }

    /**
     * Sets the value of the customItemsFormatted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomItemsFormatted(String value) {
        this.customItemsFormatted = value;
    }

    /**
     * Gets the value of the multipliedPoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultipliedPoints() {
        return multipliedPoints;
    }

    /**
     * Sets the value of the multipliedPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultipliedPoints(BigDecimal value) {
        this.multipliedPoints = value;
    }

    /**
     * Gets the value of the totalPointsIncludingMultiplied property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointsIncludingMultiplied() {
        return totalPointsIncludingMultiplied;
    }

    /**
     * Sets the value of the totalPointsIncludingMultiplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointsIncludingMultiplied(BigDecimal value) {
        this.totalPointsIncludingMultiplied = value;
    }

    /**
     * Gets the value of the decryptedPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecryptedPan() {
        return decryptedPan;
    }

    /**
     * Sets the value of the decryptedPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecryptedPan(String value) {
        this.decryptedPan = value;
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

    /**
     * Gets the value of the panCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPanCode() {
        return panCode;
    }

    /**
     * Sets the value of the panCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPanCode(String value) {
        this.panCode = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
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

}
