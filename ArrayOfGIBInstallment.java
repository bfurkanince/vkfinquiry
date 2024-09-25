
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGIBInstallment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfGIBInstallment">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="GIBInstallment" type="{PayFlexVPosUIServerWebService}GIBInstallment" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGIBInstallment", propOrder = {
    "gibInstallment"
})
public class ArrayOfGIBInstallment {

    @XmlElement(name = "GIBInstallment", nillable = true)
    protected List<GIBInstallment> gibInstallment;

    /**
     * Gets the value of the gibInstallment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gibInstallment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGIBInstallment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GIBInstallment }
     * 
     * 
     * @return
     *     The value of the gibInstallment property.
     */
    public List<GIBInstallment> getGIBInstallment() {
        if (gibInstallment == null) {
            gibInstallment = new ArrayList<>();
        }
        return this.gibInstallment;
    }

}
