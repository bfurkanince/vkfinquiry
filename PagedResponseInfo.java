
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagedResponseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PagedResponseInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="TotalItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagedResponseInfo", propOrder = {
    "pageIndex",
    "pageSize",
    "totalItemCount"
})
public class PagedResponseInfo {

    @XmlElement(name = "PageIndex")
    protected int pageIndex;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "TotalItemCount")
    protected int totalItemCount;

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the totalItemCount property.
     * 
     */
    public int getTotalItemCount() {
        return totalItemCount;
    }

    /**
     * Sets the value of the totalItemCount property.
     * 
     */
    public void setTotalItemCount(int value) {
        this.totalItemCount = value;
    }

}
