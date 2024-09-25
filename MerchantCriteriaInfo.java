
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantCriteriaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MerchantCriteriaInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MerchantPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MerchantCriteriaInfo", propOrder = {
    "hostMerchantId",
    "merchantPassword",
    "identity",
    "merchantType"
})
public class MerchantCriteriaInfo {

    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "MerchantPassword")
    protected String merchantPassword;
    @XmlElement(name = "Identity")
    protected String identity;
    @XmlElement(name = "MerchantType", required = true, type = Integer.class, nillable = true)
    protected Integer merchantType;

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
     * Gets the value of the merchantPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantPassword() {
        return merchantPassword;
    }

    /**
     * Sets the value of the merchantPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantPassword(String value) {
        this.merchantPassword = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * Gets the value of the merchantType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMerchantType() {
        return merchantType;
    }

    /**
     * Sets the value of the merchantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMerchantType(Integer value) {
        this.merchantType = value;
    }

}
