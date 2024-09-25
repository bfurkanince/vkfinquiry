
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionTotal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalAuthCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalAuthAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalSaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalSaleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalCancelCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalCancelAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalRefundCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalPointSaleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalPointSaleCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalPointCancelAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalPointCancelCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalPointRefundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalPointRefundCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalAuthPointAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="TotalAuthPointCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotal", propOrder = {
    "totalAuthCount",
    "totalAuthAmount",
    "totalSaleCount",
    "totalSaleAmount",
    "totalCancelCount",
    "totalCancelAmount",
    "totalRefundCount",
    "totalRefundAmount",
    "currencyCode",
    "totalPointSaleAmount",
    "totalPointSaleCount",
    "totalPointCancelAmount",
    "totalPointCancelCount",
    "totalPointRefundAmount",
    "totalPointRefundCount",
    "totalAuthPointAmount",
    "totalAuthPointCount"
})
public class TransactionTotal {

    @XmlElement(name = "TotalAuthCount")
    protected int totalAuthCount;
    @XmlElement(name = "TotalAuthAmount", required = true)
    protected BigDecimal totalAuthAmount;
    @XmlElement(name = "TotalSaleCount")
    protected int totalSaleCount;
    @XmlElement(name = "TotalSaleAmount", required = true)
    protected BigDecimal totalSaleAmount;
    @XmlElement(name = "TotalCancelCount")
    protected int totalCancelCount;
    @XmlElement(name = "TotalCancelAmount", required = true)
    protected BigDecimal totalCancelAmount;
    @XmlElement(name = "TotalRefundCount")
    protected int totalRefundCount;
    @XmlElement(name = "TotalRefundAmount", required = true)
    protected BigDecimal totalRefundAmount;
    @XmlElement(name = "CurrencyCode")
    protected int currencyCode;
    @XmlElement(name = "TotalPointSaleAmount", required = true)
    protected BigDecimal totalPointSaleAmount;
    @XmlElement(name = "TotalPointSaleCount")
    protected int totalPointSaleCount;
    @XmlElement(name = "TotalPointCancelAmount", required = true)
    protected BigDecimal totalPointCancelAmount;
    @XmlElement(name = "TotalPointCancelCount")
    protected int totalPointCancelCount;
    @XmlElement(name = "TotalPointRefundAmount", required = true)
    protected BigDecimal totalPointRefundAmount;
    @XmlElement(name = "TotalPointRefundCount")
    protected int totalPointRefundCount;
    @XmlElement(name = "TotalAuthPointAmount", required = true)
    protected BigDecimal totalAuthPointAmount;
    @XmlElement(name = "TotalAuthPointCount")
    protected int totalAuthPointCount;

    /**
     * Gets the value of the totalAuthCount property.
     * 
     */
    public int getTotalAuthCount() {
        return totalAuthCount;
    }

    /**
     * Sets the value of the totalAuthCount property.
     * 
     */
    public void setTotalAuthCount(int value) {
        this.totalAuthCount = value;
    }

    /**
     * Gets the value of the totalAuthAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAuthAmount() {
        return totalAuthAmount;
    }

    /**
     * Sets the value of the totalAuthAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAuthAmount(BigDecimal value) {
        this.totalAuthAmount = value;
    }

    /**
     * Gets the value of the totalSaleCount property.
     * 
     */
    public int getTotalSaleCount() {
        return totalSaleCount;
    }

    /**
     * Sets the value of the totalSaleCount property.
     * 
     */
    public void setTotalSaleCount(int value) {
        this.totalSaleCount = value;
    }

    /**
     * Gets the value of the totalSaleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSaleAmount() {
        return totalSaleAmount;
    }

    /**
     * Sets the value of the totalSaleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSaleAmount(BigDecimal value) {
        this.totalSaleAmount = value;
    }

    /**
     * Gets the value of the totalCancelCount property.
     * 
     */
    public int getTotalCancelCount() {
        return totalCancelCount;
    }

    /**
     * Sets the value of the totalCancelCount property.
     * 
     */
    public void setTotalCancelCount(int value) {
        this.totalCancelCount = value;
    }

    /**
     * Gets the value of the totalCancelAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCancelAmount() {
        return totalCancelAmount;
    }

    /**
     * Sets the value of the totalCancelAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCancelAmount(BigDecimal value) {
        this.totalCancelAmount = value;
    }

    /**
     * Gets the value of the totalRefundCount property.
     * 
     */
    public int getTotalRefundCount() {
        return totalRefundCount;
    }

    /**
     * Sets the value of the totalRefundCount property.
     * 
     */
    public void setTotalRefundCount(int value) {
        this.totalRefundCount = value;
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

    /**
     * Gets the value of the currencyCode property.
     * 
     */
    public int getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     */
    public void setCurrencyCode(int value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the totalPointSaleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointSaleAmount() {
        return totalPointSaleAmount;
    }

    /**
     * Sets the value of the totalPointSaleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointSaleAmount(BigDecimal value) {
        this.totalPointSaleAmount = value;
    }

    /**
     * Gets the value of the totalPointSaleCount property.
     * 
     */
    public int getTotalPointSaleCount() {
        return totalPointSaleCount;
    }

    /**
     * Sets the value of the totalPointSaleCount property.
     * 
     */
    public void setTotalPointSaleCount(int value) {
        this.totalPointSaleCount = value;
    }

    /**
     * Gets the value of the totalPointCancelAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointCancelAmount() {
        return totalPointCancelAmount;
    }

    /**
     * Sets the value of the totalPointCancelAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointCancelAmount(BigDecimal value) {
        this.totalPointCancelAmount = value;
    }

    /**
     * Gets the value of the totalPointCancelCount property.
     * 
     */
    public int getTotalPointCancelCount() {
        return totalPointCancelCount;
    }

    /**
     * Sets the value of the totalPointCancelCount property.
     * 
     */
    public void setTotalPointCancelCount(int value) {
        this.totalPointCancelCount = value;
    }

    /**
     * Gets the value of the totalPointRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPointRefundAmount() {
        return totalPointRefundAmount;
    }

    /**
     * Sets the value of the totalPointRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPointRefundAmount(BigDecimal value) {
        this.totalPointRefundAmount = value;
    }

    /**
     * Gets the value of the totalPointRefundCount property.
     * 
     */
    public int getTotalPointRefundCount() {
        return totalPointRefundCount;
    }

    /**
     * Sets the value of the totalPointRefundCount property.
     * 
     */
    public void setTotalPointRefundCount(int value) {
        this.totalPointRefundCount = value;
    }

    /**
     * Gets the value of the totalAuthPointAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAuthPointAmount() {
        return totalAuthPointAmount;
    }

    /**
     * Sets the value of the totalAuthPointAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAuthPointAmount(BigDecimal value) {
        this.totalAuthPointAmount = value;
    }

    /**
     * Gets the value of the totalAuthPointCount property.
     * 
     */
    public int getTotalAuthPointCount() {
        return totalAuthPointCount;
    }

    /**
     * Sets the value of the totalAuthPointCount property.
     * 
     */
    public void setTotalAuthPointCount(int value) {
        this.totalAuthPointCount = value;
    }

}
