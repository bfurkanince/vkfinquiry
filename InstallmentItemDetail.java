
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstallmentItemDetail">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="BatchTransactionStatus" type="{PayFlexVPosUIServerWebService}BatchFileTransactionStatus"/>
 *         <element name="ResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResultDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PanMasked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PaymentTransactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentItemDetail", propOrder = {
    "transactionId",
    "date",
    "amount",
    "batchTransactionStatus",
    "resultCode",
    "resultDetail",
    "panMasked",
    "authCode",
    "paymentTransactionStatus"
})
public class InstallmentItemDetail {

    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Amount", required = true, nillable = true)
    protected BigDecimal amount;
    @XmlElement(name = "BatchTransactionStatus", required = true)
    @XmlSchemaType(name = "string")
    protected BatchFileTransactionStatus batchTransactionStatus;
    @XmlElement(name = "ResultCode")
    protected String resultCode;
    @XmlElement(name = "ResultDetail")
    protected String resultDetail;
    @XmlElement(name = "PanMasked")
    protected String panMasked;
    @XmlElement(name = "AuthCode")
    protected String authCode;
    @XmlElement(name = "PaymentTransactionStatus")
    protected String paymentTransactionStatus;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the batchTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BatchFileTransactionStatus }
     *     
     */
    public BatchFileTransactionStatus getBatchTransactionStatus() {
        return batchTransactionStatus;
    }

    /**
     * Sets the value of the batchTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchFileTransactionStatus }
     *     
     */
    public void setBatchTransactionStatus(BatchFileTransactionStatus value) {
        this.batchTransactionStatus = value;
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
     * Gets the value of the resultDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDetail() {
        return resultDetail;
    }

    /**
     * Sets the value of the resultDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDetail(String value) {
        this.resultDetail = value;
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
     * Gets the value of the paymentTransactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTransactionStatus() {
        return paymentTransactionStatus;
    }

    /**
     * Sets the value of the paymentTransactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTransactionStatus(String value) {
        this.paymentTransactionStatus = value;
    }

}
