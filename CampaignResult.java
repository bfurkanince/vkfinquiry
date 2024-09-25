
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CampaignResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CampaignInfo" type="{PayFlexVPosUIServerWebService}ArrayOfCampaignInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignResult", propOrder = {
    "campaignInfo"
})
public class CampaignResult {

    @XmlElement(name = "CampaignInfo")
    protected ArrayOfCampaignInfo campaignInfo;

    /**
     * Gets the value of the campaignInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCampaignInfo }
     *     
     */
    public ArrayOfCampaignInfo getCampaignInfo() {
        return campaignInfo;
    }

    /**
     * Sets the value of the campaignInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCampaignInfo }
     *     
     */
    public void setCampaignInfo(ArrayOfCampaignInfo value) {
        this.campaignInfo = value;
    }

}
