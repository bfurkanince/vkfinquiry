
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaymentTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfPaymentTransaction">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PaymentTransaction" type="{PayFlexVPosUIServerWebService}PaymentTransaction" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaymentTransaction", propOrder = {
    "paymentTransaction"
})
public class ArrayOfPaymentTransaction {

    @XmlElement(name = "PaymentTransaction", nillable = true)
    protected List<PaymentTransaction> paymentTransaction;

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the paymentTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction }
     * 
     * 
     * @return
     *     The value of the paymentTransaction property.
     */
    public List<PaymentTransaction> getPaymentTransaction() {
        if (paymentTransaction == null) {
            paymentTransaction = new ArrayList<>();
        }
        return this.paymentTransaction;
    }

}
