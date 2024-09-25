
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BatchTransactionType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Auth"/>
 *     <enumeration value="AuthCancel"/>
 *     <enumeration value="Capture"/>
 *     <enumeration value="CaptureCancel"/>
 *     <enumeration value="CaptureRefund"/>
 *     <enumeration value="Sale"/>
 *     <enumeration value="SaleRefund"/>
 *     <enumeration value="SaleCancel"/>
 *     <enumeration value="RefundCancel"/>
 *     <enumeration value="VFTSale"/>
 *     <enumeration value="VFTSearch"/>
 *     <enumeration value="VFTCancel"/>
 *     <enumeration value="VFTRefund"/>
 *     <enumeration value="PointSearch"/>
 *     <enumeration value="CampaignSearch"/>
 *     <enumeration value="CardTest"/>
 *     <enumeration value="SaveCard"/>
 *     <enumeration value="Credit"/>
 *     <enumeration value="PointSale"/>
 *     <enumeration value="PointCancel"/>
 *     <enumeration value="PointRefund"/>
 *     <enumeration value="SurchargeSearch"/>
 *     <enumeration value="Reversal"/>
 *     <enumeration value="BatchClose"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BatchTransactionType")
@XmlEnum
public enum BatchTransactionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Auth")
    AUTH("Auth"),
    @XmlEnumValue("AuthCancel")
    AUTH_CANCEL("AuthCancel"),
    @XmlEnumValue("Capture")
    CAPTURE("Capture"),
    @XmlEnumValue("CaptureCancel")
    CAPTURE_CANCEL("CaptureCancel"),
    @XmlEnumValue("CaptureRefund")
    CAPTURE_REFUND("CaptureRefund"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("SaleRefund")
    SALE_REFUND("SaleRefund"),
    @XmlEnumValue("SaleCancel")
    SALE_CANCEL("SaleCancel"),
    @XmlEnumValue("RefundCancel")
    REFUND_CANCEL("RefundCancel"),
    @XmlEnumValue("VFTSale")
    VFT_SALE("VFTSale"),
    @XmlEnumValue("VFTSearch")
    VFT_SEARCH("VFTSearch"),
    @XmlEnumValue("VFTCancel")
    VFT_CANCEL("VFTCancel"),
    @XmlEnumValue("VFTRefund")
    VFT_REFUND("VFTRefund"),
    @XmlEnumValue("PointSearch")
    POINT_SEARCH("PointSearch"),
    @XmlEnumValue("CampaignSearch")
    CAMPAIGN_SEARCH("CampaignSearch"),
    @XmlEnumValue("CardTest")
    CARD_TEST("CardTest"),
    @XmlEnumValue("SaveCard")
    SAVE_CARD("SaveCard"),
    @XmlEnumValue("Credit")
    CREDIT("Credit"),
    @XmlEnumValue("PointSale")
    POINT_SALE("PointSale"),
    @XmlEnumValue("PointCancel")
    POINT_CANCEL("PointCancel"),
    @XmlEnumValue("PointRefund")
    POINT_REFUND("PointRefund"),
    @XmlEnumValue("SurchargeSearch")
    SURCHARGE_SEARCH("SurchargeSearch"),
    @XmlEnumValue("Reversal")
    REVERSAL("Reversal"),
    @XmlEnumValue("BatchClose")
    BATCH_CLOSE("BatchClose");
    private final String value;

    BatchTransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BatchTransactionType fromValue(String v) {
        for (BatchTransactionType c: BatchTransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
