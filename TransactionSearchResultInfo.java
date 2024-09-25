
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionSearchResultInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="AmountCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ReferenceTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsCanceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsReversed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="IsCaptured" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsRefunded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TotalRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="ECI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Rrn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TerminalNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PointAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="PointCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="GainedPoint" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="VftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="SurchargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="NumberOfInstallments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="HostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HostResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsBatchClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="TransactionThreedSecureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PanMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RequestInsertTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="InstallmentResponse" type="{PayFlexVPosUIServerWebService}InstallmentTableResponseModel" minOccurs="0"/>
 *         <element name="CustomItems" type="{PayFlexVPosUIServerWebService}ArrayOfCustomItem" minOccurs="0"/>
 *         <element name="CampaignResult" type="{PayFlexVPosUIServerWebService}CampaignResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchResultInfo", propOrder = {
    "paymentTransactionId",
    "transactionType",
    "transactionId",
    "orderId",
    "orderDescription",
    "amount",
    "amountCode",
    "authCode",
    "referenceTransactionId",
    "isCanceled",
    "isReversed",
    "isCaptured",
    "isRefunded",
    "totalRefundAmount",
    "eci",
    "cavv",
    "resultCode",
    "rrn",
    "terminalNo",
    "pointAmount",
    "pointCode",
    "gainedPoint",
    "vftAmount",
    "surchargeAmount",
    "numberOfInstallments",
    "hostDate",
    "responseMessage",
    "hostResultCode",
    "isBatchClosed",
    "transactionThreedSecureType",
    "panMasked",
    "requestInsertTime",
    "installmentResponse",
    "customItems",
    "campaignResult"
})
public class TransactionSearchResultInfo {

    @XmlElement(name = "PaymentTransactionId")
    protected int paymentTransactionId;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "OrderId")
    protected String orderId;
    @XmlElement(name = "OrderDescription")
    protected String orderDescription;
    @XmlElementRef(name = "Amount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amount;
    @XmlElementRef(name = "AmountCode", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> amountCode;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "ReferenceTransactionId")
    protected String referenceTransactionId;
    @XmlElement(name = "IsCanceled")
    protected boolean isCanceled;
    @XmlElement(name = "IsReversed")
    protected boolean isReversed;
    @XmlElementRef(name = "IsCaptured", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isCaptured;
    @XmlElement(name = "IsRefunded")
    protected boolean isRefunded;
    @XmlElementRef(name = "TotalRefundAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalRefundAmount;
    @XmlElement(name = "ECI")
    protected String eci;
    @XmlElement(name = "CAVV")
    protected String cavv;
    @XmlElement(name = "ResultCode")
    protected String resultCode;
    @XmlElement(name = "Rrn")
    protected String rrn;
    @XmlElement(name = "TerminalNo")
    protected String terminalNo;
    @XmlElementRef(name = "PointAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pointAmount;
    @XmlElementRef(name = "PointCode", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> pointCode;
    @XmlElementRef(name = "GainedPoint", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> gainedPoint;
    @XmlElementRef(name = "VftAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> vftAmount;
    @XmlElementRef(name = "SurchargeAmount", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> surchargeAmount;
    @XmlElementRef(name = "NumberOfInstallments", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numberOfInstallments;
    @XmlElement(name = "HostDate")
    protected String hostDate;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "HostResultCode")
    protected String hostResultCode;
    @XmlElementRef(name = "IsBatchClosed", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isBatchClosed;
    @XmlElement(name = "TransactionThreedSecureType")
    protected String transactionThreedSecureType;
    @XmlElement(name = "PanMasked")
    protected String panMasked;
    @XmlElementRef(name = "RequestInsertTime", namespace = "PayFlexVPosUIServerWebService", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> requestInsertTime;
    @XmlElement(name = "InstallmentResponse")
    protected InstallmentTableResponseModel installmentResponse;
    @XmlElement(name = "CustomItems")
    protected ArrayOfCustomItem customItems;
    @XmlElement(name = "CampaignResult")
    protected CampaignResult campaignResult;

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
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
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
     * Gets the value of the referenceTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceTransactionId() {
        return referenceTransactionId;
    }

    /**
     * Sets the value of the referenceTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceTransactionId(String value) {
        this.referenceTransactionId = value;
    }

    /**
     * Gets the value of the isCanceled property.
     * 
     */
    public boolean isIsCanceled() {
        return isCanceled;
    }

    /**
     * Sets the value of the isCanceled property.
     * 
     */
    public void setIsCanceled(boolean value) {
        this.isCanceled = value;
    }

    /**
     * Gets the value of the isReversed property.
     * 
     */
    public boolean isIsReversed() {
        return isReversed;
    }

    /**
     * Sets the value of the isReversed property.
     * 
     */
    public void setIsReversed(boolean value) {
        this.isReversed = value;
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
     * Gets the value of the eci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECI() {
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
    public void setECI(String value) {
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
    public String getCAVV() {
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
    public void setCAVV(String value) {
        this.cavv = value;
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
     * Gets the value of the terminalNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * Sets the value of the terminalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalNo(String value) {
        this.terminalNo = value;
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
     * Gets the value of the numberOfInstallments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumberOfInstallments() {
        return numberOfInstallments;
    }

    /**
     * Sets the value of the numberOfInstallments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumberOfInstallments(JAXBElement<Integer> value) {
        this.numberOfInstallments = value;
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
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsBatchClosed() {
        return isBatchClosed;
    }

    /**
     * Sets the value of the isBatchClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsBatchClosed(JAXBElement<Boolean> value) {
        this.isBatchClosed = value;
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
     * Gets the value of the requestInsertTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRequestInsertTime() {
        return requestInsertTime;
    }

    /**
     * Sets the value of the requestInsertTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRequestInsertTime(JAXBElement<XMLGregorianCalendar> value) {
        this.requestInsertTime = value;
    }

    /**
     * Gets the value of the installmentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InstallmentTableResponseModel }
     *     
     */
    public InstallmentTableResponseModel getInstallmentResponse() {
        return installmentResponse;
    }

    /**
     * Sets the value of the installmentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallmentTableResponseModel }
     *     
     */
    public void setInstallmentResponse(InstallmentTableResponseModel value) {
        this.installmentResponse = value;
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
     * Gets the value of the campaignResult property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignResult }
     *     
     */
    public CampaignResult getCampaignResult() {
        return campaignResult;
    }

    /**
     * Sets the value of the campaignResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignResult }
     *     
     */
    public void setCampaignResult(CampaignResult value) {
        this.campaignResult = value;
    }

}
