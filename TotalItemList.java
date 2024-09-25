
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalItemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalItemList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Items" type="{PayFlexVPosUIServerWebService}ArrayOfTotalItem" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalItemList", propOrder = {
    "items"
})
public class TotalItemList {

    @XmlElement(name = "Items")
    protected ArrayOfTotalItem items;

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTotalItem }
     *     
     */
    public ArrayOfTotalItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTotalItem }
     *     
     */
    public void setItems(ArrayOfTotalItem value) {
        this.items = value;
    }

}
