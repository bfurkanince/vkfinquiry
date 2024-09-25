
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResponseInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Status" type="{PayFlexVPosUIServerWebService}ResponseStatus"/>
 *         <element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResponseMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="IsIdempotent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseInfo", propOrder = {
    "status",
    "responseCode",
    "responseMessage",
    "responseDateTime",
    "isIdempotent"
})
public class ResponseInfo {

    @XmlElement(name = "Status", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseStatus status;
    @XmlElement(name = "ResponseCode")
    protected String responseCode;
    @XmlElement(name = "ResponseMessage")
    protected String responseMessage;
    @XmlElement(name = "ResponseDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDateTime;
    @XmlElement(name = "IsIdempotent")
    protected boolean isIdempotent;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatus }
     *     
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatus }
     *     
     */
    public void setStatus(ResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * Sets the value of the responseMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDateTime(XMLGregorianCalendar value) {
        this.responseDateTime = value;
    }

    /**
     * Gets the value of the isIdempotent property.
     * 
     */
    public boolean isIsIdempotent() {
        return isIdempotent;
    }

    /**
     * Sets the value of the isIdempotent property.
     * 
     */
    public void setIsIdempotent(boolean value) {
        this.isIdempotent = value;
    }

}
