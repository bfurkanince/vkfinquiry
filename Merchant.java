
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Merchant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Merchant">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Merchant", propOrder = {
    "merchantId",
    "hostMerchantId",
    "merchantName",
    "merchantType"
})
public class Merchant {

    @XmlElement(name = "MerchantId")
    protected int merchantId;
    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "MerchantName")
    protected String merchantName;
    @XmlElement(name = "MerchantType")
    protected int merchantType;

    /**
     * Gets the value of the merchantId property.
     * 
     */
    public int getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     */
    public void setMerchantId(int value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the hostMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMerchantId() {
        return hostMerchantId;
    }

    /**
     * Sets the value of the hostMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMerchantId(String value) {
        this.hostMerchantId = value;
    }

    /**
     * Gets the value of the merchantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Sets the value of the merchantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     */
    public int getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     */
    public void setMerchantType(int value) {
        this.merchantType = value;
    }

}
