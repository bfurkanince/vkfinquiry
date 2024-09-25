
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TerminalInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TerminalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Merchant" type="{PayFlexVPosUIServerWebService}MerchantInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalInfo", propOrder = {
    "hostTerminalId",
    "terminalName",
    "isActive",
    "terminalId",
    "merchant"
})
public class TerminalInfo {

    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;
    @XmlElement(name = "TerminalName")
    protected String terminalName;
    @XmlElement(name = "IsActive")
    protected boolean isActive;
    @XmlElement(name = "TerminalId")
    protected int terminalId;
    @XmlElement(name = "Merchant")
    protected MerchantInfo merchant;

    /**
     * Gets the value of the hostTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostTerminalId() {
        return hostTerminalId;
    }

    /**
     * Sets the value of the hostTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostTerminalId(String value) {
        this.hostTerminalId = value;
    }

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     */
    public int getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     */
    public void setTerminalId(int value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the merchant property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantInfo }
     *     
     */
    public MerchantInfo getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantInfo }
     *     
     */
    public void setMerchant(MerchantInfo value) {
        this.merchant = value;
    }

}
