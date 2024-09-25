
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         <element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalItem", propOrder = {
    "totalCount",
    "totalAmount",
    "currencyCode"
})
public class TotalItem {

    @XmlElement(name = "TotalCount", required = true, type = Integer.class, nillable = true)
    protected Integer totalCount;
    @XmlElement(name = "TotalAmount", required = true, nillable = true)
    protected BigDecimal totalAmount;
    @XmlElement(name = "CurrencyCode", required = true, type = Integer.class, nillable = true)
    protected Integer currencyCode;

    /**
     * Gets the value of the totalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
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

}
