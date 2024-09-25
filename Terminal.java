
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Terminal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Terminal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HostTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TerminalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Merchant" type="{PayFlexVPosUIServerWebService}Merchant" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal", propOrder = {
    "hostTerminalId",
    "terminalName",
    "terminalId",
    "merchant"
})
public class Terminal {

    @XmlElement(name = "HostTerminalId")
    protected String hostTerminalId;
    @XmlElement(name = "TerminalName")
    protected String terminalName;
    @XmlElement(name = "TerminalId")
    protected int terminalId;
    @XmlElement(name = "Merchant")
    protected Merchant merchant;

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
     *     {@link Merchant }
     *     
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Sets the value of the merchant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Merchant }
     *     
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

}
