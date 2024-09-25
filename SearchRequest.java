
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SearchRequest">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}PagedRequestBase">
 *       <sequence>
 *         <element name="MerchantCriteria" type="{PayFlexVPosUIServerWebService}MerchantCriteriaInfo" minOccurs="0"/>
 *         <element name="DateCriteria" type="{PayFlexVPosUIServerWebService}DateCriteriaInfo" minOccurs="0"/>
 *         <element name="TransactionCriteria" type="{PayFlexVPosUIServerWebService}TransactionCriteriaInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRequest", propOrder = {
    "merchantCriteria",
    "dateCriteria",
    "transactionCriteria"
})
public class SearchRequest
    extends PagedRequestBase
{

    @XmlElement(name = "MerchantCriteria")
    protected MerchantCriteriaInfo merchantCriteria;
    @XmlElement(name = "DateCriteria")
    protected DateCriteriaInfo dateCriteria;
    @XmlElement(name = "TransactionCriteria")
    protected TransactionCriteriaInfo transactionCriteria;

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
     * Gets the value of the dateCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public DateCriteriaInfo getDateCriteria() {
        return dateCriteria;
    }

    /**
     * Sets the value of the dateCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCriteriaInfo }
     *     
     */
    public void setDateCriteria(DateCriteriaInfo value) {
        this.dateCriteria = value;
    }

    /**
     * Gets the value of the transactionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCriteriaInfo }
     *     
     */
    public TransactionCriteriaInfo getTransactionCriteria() {
        return transactionCriteria;
    }

    /**
     * Sets the value of the transactionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCriteriaInfo }
     *     
     */
    public void setTransactionCriteria(TransactionCriteriaInfo value) {
        this.transactionCriteria = value;
    }

}
