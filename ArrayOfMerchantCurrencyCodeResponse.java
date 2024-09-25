
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMerchantCurrencyCodeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfMerchantCurrencyCodeResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MerchantCurrencyCodeResponse" type="{PayFlexVPosUIServerWebService}MerchantCurrencyCodeResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMerchantCurrencyCodeResponse", propOrder = {
    "merchantCurrencyCodeResponse"
})
public class ArrayOfMerchantCurrencyCodeResponse {

    @XmlElement(name = "MerchantCurrencyCodeResponse", nillable = true)
    protected List<MerchantCurrencyCodeResponse> merchantCurrencyCodeResponse;

    /**
     * Gets the value of the merchantCurrencyCodeResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the merchantCurrencyCodeResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMerchantCurrencyCodeResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MerchantCurrencyCodeResponse }
     * 
     * 
     * @return
     *     The value of the merchantCurrencyCodeResponse property.
     */
    public List<MerchantCurrencyCodeResponse> getMerchantCurrencyCodeResponse() {
        if (merchantCurrencyCodeResponse == null) {
            merchantCurrencyCodeResponse = new ArrayList<>();
        }
        return this.merchantCurrencyCodeResponse;
    }

}
