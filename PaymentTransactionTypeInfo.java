
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransactionTypeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransactionTypeInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransactionTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TransactionTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsTKType" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransactionTypeInfo", propOrder = {
    "transactionTypeId",
    "transactionTypeName",
    "isTKType"
})
public class PaymentTransactionTypeInfo {

    @XmlElement(name = "TransactionTypeId")
    protected int transactionTypeId;
    @XmlElement(name = "TransactionTypeName")
    protected String transactionTypeName;
    @XmlElement(name = "IsTKType")
    protected boolean isTKType;

    /**
     * Gets the value of the transactionTypeId property.
     * 
     */
    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    /**
     * Sets the value of the transactionTypeId property.
     * 
     */
    public void setTransactionTypeId(int value) {
        this.transactionTypeId = value;
    }

    /**
     * Gets the value of the transactionTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeName() {
        return transactionTypeName;
    }

    /**
     * Sets the value of the transactionTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeName(String value) {
        this.transactionTypeName = value;
    }

    /**
     * Gets the value of the isTKType property.
     * 
     */
    public boolean isIsTKType() {
        return isTKType;
    }

    /**
     * Sets the value of the isTKType property.
     * 
     */
    public void setIsTKType(boolean value) {
        this.isTKType = value;
    }

}
