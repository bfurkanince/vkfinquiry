
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GIBInstallments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GIBInstallments">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GIBInstallmentList" type="{PayFlexVPosUIServerWebService}ArrayOfGIBInstallment" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GIBInstallments", propOrder = {
    "gibInstallmentList"
})
public class GIBInstallments {

    @XmlElement(name = "GIBInstallmentList")
    protected ArrayOfGIBInstallment gibInstallmentList;

    /**
     * Gets the value of the gibInstallmentList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGIBInstallment }
     *     
     */
    public ArrayOfGIBInstallment getGIBInstallmentList() {
        return gibInstallmentList;
    }

    /**
     * Sets the value of the gibInstallmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGIBInstallment }
     *     
     */
    public void setGIBInstallmentList(ArrayOfGIBInstallment value) {
        this.gibInstallmentList = value;
    }

}
