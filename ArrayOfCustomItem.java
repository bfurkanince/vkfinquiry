
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfCustomItem">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CustomItem" type="{PayFlexVPosUIServerWebService}CustomItem" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomItem", propOrder = {
    "customItem"
})
public class ArrayOfCustomItem {

    @XmlElement(name = "CustomItem", nillable = true)
    protected List<CustomItem> customItem;

    /**
     * Gets the value of the customItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the customItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomItem }
     * 
     * 
     * @return
     *     The value of the customItem property.
     */
    public List<CustomItem> getCustomItem() {
        if (customItem == null) {
            customItem = new ArrayList<>();
        }
        return this.customItem;
    }

}
