
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTransactionCampaignResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTransactionCampaignResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TransactionCampaignResult" type="{PayFlexVPosUIServerWebService}TransactionCampaignResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransactionCampaignResult", propOrder = {
    "transactionCampaignResult"
})
public class ArrayOfTransactionCampaignResult {

    @XmlElement(name = "TransactionCampaignResult", nillable = true)
    protected List<TransactionCampaignResult> transactionCampaignResult;

    /**
     * Gets the value of the transactionCampaignResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the transactionCampaignResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionCampaignResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCampaignResult }
     * 
     * 
     * @return
     *     The value of the transactionCampaignResult property.
     */
    public List<TransactionCampaignResult> getTransactionCampaignResult() {
        if (transactionCampaignResult == null) {
            transactionCampaignResult = new ArrayList<>();
        }
        return this.transactionCampaignResult;
    }

}
