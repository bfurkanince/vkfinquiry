
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementResponse">
 *   <complexContent>
 *     <extension base="{PayFlexVPosUIServerWebService}ResponseBase">
 *       <sequence>
 *         <element name="HostMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TerminalNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Sale" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="Capture" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="Cancel" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="Refund" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="Auth" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="PointSale" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="VFTSale" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="Credit" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="SaledCustomInstallment" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="TKSale" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *         <element name="TKFlexSale" type="{PayFlexVPosUIServerWebService}TotalItemList" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementResponse", propOrder = {
    "hostMerchantId",
    "terminalNo",
    "totalCount",
    "sale",
    "capture",
    "cancel",
    "refund",
    "auth",
    "pointSale",
    "vftSale",
    "credit",
    "saledCustomInstallment",
    "tkSale",
    "tkFlexSale"
})
public class SettlementResponse2
    extends ResponseBase
{

    @XmlElement(name = "HostMerchantId")
    protected String hostMerchantId;
    @XmlElement(name = "TerminalNo")
    protected String terminalNo;
    @XmlElement(name = "TotalCount")
    protected int totalCount;
    @XmlElement(name = "Sale")
    protected TotalItemList sale;
    @XmlElement(name = "Capture")
    protected TotalItemList capture;
    @XmlElement(name = "Cancel")
    protected TotalItemList cancel;
    @XmlElement(name = "Refund")
    protected TotalItemList refund;
    @XmlElement(name = "Auth")
    protected TotalItemList auth;
    @XmlElement(name = "PointSale")
    protected TotalItemList pointSale;
    @XmlElement(name = "VFTSale")
    protected TotalItemList vftSale;
    @XmlElement(name = "Credit")
    protected TotalItemList credit;
    @XmlElement(name = "SaledCustomInstallment")
    protected TotalItemList saledCustomInstallment;
    @XmlElement(name = "TKSale")
    protected TotalItemList tkSale;
    @XmlElement(name = "TKFlexSale")
    protected TotalItemList tkFlexSale;

    /**
     * Gets the value of the hostMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostMerchantId() {
        return hostMerchantId;
    }

    /**
     * Sets the value of the hostMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostMerchantId(String value) {
        this.hostMerchantId = value;
    }

    /**
     * Gets the value of the terminalNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalNo() {
        return terminalNo;
    }

    /**
     * Sets the value of the terminalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalNo(String value) {
        this.terminalNo = value;
    }

    /**
     * Gets the value of the totalCount property.
     * 
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets the value of the totalCount property.
     * 
     */
    public void setTotalCount(int value) {
        this.totalCount = value;
    }

    /**
     * Gets the value of the sale property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getSale() {
        return sale;
    }

    /**
     * Sets the value of the sale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setSale(TotalItemList value) {
        this.sale = value;
    }

    /**
     * Gets the value of the capture property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getCapture() {
        return capture;
    }

    /**
     * Sets the value of the capture property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setCapture(TotalItemList value) {
        this.capture = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setCancel(TotalItemList value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the refund property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getRefund() {
        return refund;
    }

    /**
     * Sets the value of the refund property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setRefund(TotalItemList value) {
        this.refund = value;
    }

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setAuth(TotalItemList value) {
        this.auth = value;
    }

    /**
     * Gets the value of the pointSale property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getPointSale() {
        return pointSale;
    }

    /**
     * Sets the value of the pointSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setPointSale(TotalItemList value) {
        this.pointSale = value;
    }

    /**
     * Gets the value of the vftSale property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getVFTSale() {
        return vftSale;
    }

    /**
     * Sets the value of the vftSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setVFTSale(TotalItemList value) {
        this.vftSale = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setCredit(TotalItemList value) {
        this.credit = value;
    }

    /**
     * Gets the value of the saledCustomInstallment property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getSaledCustomInstallment() {
        return saledCustomInstallment;
    }

    /**
     * Sets the value of the saledCustomInstallment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setSaledCustomInstallment(TotalItemList value) {
        this.saledCustomInstallment = value;
    }

    /**
     * Gets the value of the tkSale property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getTKSale() {
        return tkSale;
    }

    /**
     * Sets the value of the tkSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setTKSale(TotalItemList value) {
        this.tkSale = value;
    }

    /**
     * Gets the value of the tkFlexSale property.
     * 
     * @return
     *     possible object is
     *     {@link TotalItemList }
     *     
     */
    public TotalItemList getTKFlexSale() {
        return tkFlexSale;
    }

    /**
     * Sets the value of the tkFlexSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalItemList }
     *     
     */
    public void setTKFlexSale(TotalItemList value) {
        this.tkFlexSale = value;
    }

}
