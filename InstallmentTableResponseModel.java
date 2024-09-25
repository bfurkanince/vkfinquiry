
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstallmentTableResponseModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstallmentTableResponseModel">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstallmentItems" type="{PayFlexVPosUIServerWebService}ArrayOfInstallmentItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallmentTableResponseModel", propOrder = {
    "installmentItems"
})
public class InstallmentTableResponseModel {

    @XmlElement(name = "InstallmentItems")
    protected ArrayOfInstallmentItem installmentItems;

    /**
     * Gets the value of the installmentItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInstallmentItem }
     *     
     */
    public ArrayOfInstallmentItem getInstallmentItems() {
        return installmentItems;
    }

    /**
     * Sets the value of the installmentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInstallmentItem }
     *     
     */
    public void setInstallmentItems(ArrayOfInstallmentItem value) {
        this.installmentItems = value;
    }

}
