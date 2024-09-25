
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransactionTotal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTransactionTotal">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransactionTotal" type="{PayFlexVPosUIServerWebService}TransactionTotal" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransactionTotal", propOrder = {
    "transactionTotal"
})
public class ArrayOfTransactionTotal {

    @XmlElement(name = "TransactionTotal", nillable = true)
    protected List<TransactionTotal> transactionTotal;

    /**
     * Gets the value of the transactionTotal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the transactionTotal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionTotal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotal }
     * 
     * 
     * @return
     *     The value of the transactionTotal property.
     */
    public List<TransactionTotal> getTransactionTotal() {
        if (transactionTotal == null) {
            transactionTotal = new ArrayList<>();
        }
        return this.transactionTotal;
    }

}
