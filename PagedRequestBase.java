
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedRequestBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PagedRequestBase">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}RequestBase">
 *       <sequence>
 *         <element name="PagedRequestInfo" type="{PayFlexVPosUIServerWebService}PagedRequestInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedRequestBase", propOrder = {
    "pagedRequestInfo"
})
@XmlSeeAlso({
    TransactionSearchRequest.class,
    SearchRequest.class,
    SettlementDetailRequest.class,
    BatchTransactionSumDetailRequest.class
})
public class PagedRequestBase
    extends RequestBase
{

    @XmlElement(name = "PagedRequestInfo")
    protected PagedRequestInfo pagedRequestInfo;

    /**
     * Gets the value of the pagedRequestInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagedRequestInfo }
     *     
     */
    public PagedRequestInfo getPagedRequestInfo() {
        return pagedRequestInfo;
    }

    /**
     * Sets the value of the pagedRequestInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedRequestInfo }
     *     
     */
    public void setPagedRequestInfo(PagedRequestInfo value) {
        this.pagedRequestInfo = value;
    }

}
