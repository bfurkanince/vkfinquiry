
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCampaignResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCampaignResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ActionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CampaignDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ExtraCampaignDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCampaignResult", propOrder = {
    "campaignCode",
    "actionValue",
    "campaignDescription",
    "extraCampaignDescription"
})
public class TransactionCampaignResult {

    @XmlElement(name = "CampaignCode")
    protected String campaignCode;
    @XmlElement(name = "ActionValue")
    protected String actionValue;
    @XmlElement(name = "CampaignDescription")
    protected String campaignDescription;
    @XmlElement(name = "ExtraCampaignDescription")
    protected String extraCampaignDescription;

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCode(String value) {
        this.campaignCode = value;
    }

    /**
     * Gets the value of the actionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionValue() {
        return actionValue;
    }

    /**
     * Sets the value of the actionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionValue(String value) {
        this.actionValue = value;
    }

    /**
     * Gets the value of the campaignDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignDescription() {
        return campaignDescription;
    }

    /**
     * Sets the value of the campaignDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignDescription(String value) {
        this.campaignDescription = value;
    }

    /**
     * Gets the value of the extraCampaignDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraCampaignDescription() {
        return extraCampaignDescription;
    }

    /**
     * Sets the value of the extraCampaignDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraCampaignDescription(String value) {
        this.extraCampaignDescription = value;
    }

}
