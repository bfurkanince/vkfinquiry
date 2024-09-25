
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PagedResponseBase">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}ResponseBase">
 *       <sequence>
 *         <element name="PagedResponseInfo" type="{PayFlexVPosUIServerWebService}PagedResponseInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedResponseBase", propOrder = {
    "pagedResponseInfo"
})
@XmlSeeAlso({
    TransactionSearchResponse.class,
    SearchResponse2 .class,
    SettlementDetailResponse2 .class
})
public class PagedResponseBase
    extends ResponseBase
{

    @XmlElement(name = "PagedResponseInfo")
    protected PagedResponseInfo pagedResponseInfo;

    /**
     * Gets the value of the pagedResponseInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PagedResponseInfo }
     *     
     */
    public PagedResponseInfo getPagedResponseInfo() {
        return pagedResponseInfo;
    }

    /**
     * Sets the value of the pagedResponseInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagedResponseInfo }
     *     
     */
    public void setPagedResponseInfo(PagedResponseInfo value) {
        this.pagedResponseInfo = value;
    }

}
