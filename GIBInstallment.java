
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GIBInstallment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GIBInstallment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="PaymentTransaction" type="{PayFlexVPosUIServerWebService}PaymentTransactionInfo" minOccurs="0"/>
 *         <element name="GIBInstallmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="RefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GIBInstallment", propOrder = {
    "date",
    "amount",
    "paymentTransaction",
    "gibInstallmentId",
    "refundAmount",
    "totalRefundAmount"
})
public class GIBInstallment {

    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "PaymentTransaction")
    protected PaymentTransactionInfo paymentTransaction;
    @XmlElement(name = "GIBInstallmentId")
    protected int gibInstallmentId;
    @XmlElement(name = "RefundAmount", required = true)
    protected BigDecimal refundAmount;
    @XmlElement(name = "TotalRefundAmount", required = true)
    protected BigDecimal totalRefundAmount;

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
     * Gets the value of the paymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionInfo }
     *     
     */
    public PaymentTransactionInfo getPaymentTransaction() {
        return paymentTransaction;
    }

    /**
     * Sets the value of the paymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionInfo }
     *     
     */
    public void setPaymentTransaction(PaymentTransactionInfo value) {
        this.paymentTransaction = value;
    }

    /**
     * Gets the value of the gibInstallmentId property.
     * 
     */
    public int getGIBInstallmentId() {
        return gibInstallmentId;
    }

    /**
     * Sets the value of the gibInstallmentId property.
     * 
     */
    public void setGIBInstallmentId(int value) {
        this.gibInstallmentId = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmount(BigDecimal value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the totalRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRefundAmount() {
        return totalRefundAmount;
    }

    /**
     * Sets the value of the totalRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRefundAmount(BigDecimal value) {
        this.totalRefundAmount = value;
    }

}
