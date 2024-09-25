
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantCurrencyCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MerchantCurrencyCodeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="CurrencyTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantCurrencyCodeResponse", propOrder = {
    "code",
    "currencyTypeDescription"
})
public class MerchantCurrencyCodeResponse {

    @XmlElement(name = "Code")
    protected int code;
    @XmlElement(name = "CurrencyTypeDescription")
    protected String currencyTypeDescription;

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the currencyTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyTypeDescription() {
        return currencyTypeDescription;
    }

    /**
     * Sets the value of the currencyTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyTypeDescription(String value) {
        this.currencyTypeDescription = value;
    }

}
