
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RequestInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ClientPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClientRequestDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="ClientRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuditableRequest" type="{PayFlexVPosUIServerWebService}AuditableRequest" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInfo", propOrder = {
    "clientId",
    "clientPassword",
    "clientRequestDateTime",
    "clientRequestId",
    "auditableRequest"
})
public class RequestInfo {

    @XmlElement(name = "ClientId")
    protected int clientId;
    @XmlElement(name = "ClientPassword")
    protected String clientPassword;
    @XmlElement(name = "ClientRequestDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientRequestDateTime;
    @XmlElement(name = "ClientRequestId")
    protected String clientRequestId;
    @XmlElement(name = "AuditableRequest")
    protected AuditableRequest auditableRequest;

    /**
     * Gets the value of the clientId property.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the clientPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientPassword() {
        return clientPassword;
    }

    /**
     * Sets the value of the clientPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientPassword(String value) {
        this.clientPassword = value;
    }

    /**
     * Gets the value of the clientRequestDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientRequestDateTime() {
        return clientRequestDateTime;
    }

    /**
     * Sets the value of the clientRequestDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientRequestDateTime(XMLGregorianCalendar value) {
        this.clientRequestDateTime = value;
    }

    /**
     * Gets the value of the clientRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRequestId() {
        return clientRequestId;
    }

    /**
     * Sets the value of the clientRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRequestId(String value) {
        this.clientRequestId = value;
    }

    /**
     * Gets the value of the auditableRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AuditableRequest }
     *     
     */
    public AuditableRequest getAuditableRequest() {
        return auditableRequest;
    }

    /**
     * Sets the value of the auditableRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditableRequest }
     *     
     */
    public void setAuditableRequest(AuditableRequest value) {
        this.auditableRequest = value;
    }

}
