
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionSearchResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedResponseBase">
 *       <sequence>
 *         <element name="PaymentTransactionList" type="{PayFlexVPosUIServerWebService}ArrayOfPaymentTransaction" minOccurs="0"/>
 *         <element name="TransactionTotalList" type="{PayFlexVPosUIServerWebService}ArrayOfTransactionTotal" minOccurs="0"/>
 *         <element name="CustomItemTotalList" type="{PayFlexVPosUIServerWebService}ArrayOfCustomItemTotals" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearchResponse", propOrder = {
    "paymentTransactionList",
    "transactionTotalList",
    "customItemTotalList"
})
public class TransactionSearchResponse
    extends PagedResponseBase
{

    @XmlElement(name = "PaymentTransactionList")
    protected ArrayOfPaymentTransaction paymentTransactionList;
    @XmlElement(name = "TransactionTotalList")
    protected ArrayOfTransactionTotal transactionTotalList;
    @XmlElement(name = "CustomItemTotalList")
    protected ArrayOfCustomItemTotals customItemTotalList;

    /**
     * Gets the value of the paymentTransactionList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPaymentTransaction }
     *     
     */
    public ArrayOfPaymentTransaction getPaymentTransactionList() {
        return paymentTransactionList;
    }

    /**
     * Sets the value of the paymentTransactionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPaymentTransaction }
     *     
     */
    public void setPaymentTransactionList(ArrayOfPaymentTransaction value) {
        this.paymentTransactionList = value;
    }

    /**
     * Gets the value of the transactionTotalList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionTotal }
     *     
     */
    public ArrayOfTransactionTotal getTransactionTotalList() {
        return transactionTotalList;
    }

    /**
     * Sets the value of the transactionTotalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionTotal }
     *     
     */
    public void setTransactionTotalList(ArrayOfTransactionTotal value) {
        this.transactionTotalList = value;
    }

    /**
     * Gets the value of the customItemTotalList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomItemTotals }
     *     
     */
    public ArrayOfCustomItemTotals getCustomItemTotalList() {
        return customItemTotalList;
    }

    /**
     * Sets the value of the customItemTotalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomItemTotals }
     *     
     */
    public void setCustomItemTotalList(ArrayOfCustomItemTotals value) {
        this.customItemTotalList = value;
    }

}
