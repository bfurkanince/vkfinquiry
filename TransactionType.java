
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransactionType">
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
 *     <enumeration value="Credit"/>
 *     <enumeration value="PointSale"/>
 *     <enumeration value="PointCancel"/>
 *     <enumeration value="PointRefund"/>
 *     <enumeration value="SurchargeSearch"/>
 *     <enumeration value="TKSale"/>
 *     <enumeration value="TKFlexSale"/>
 *     <enumeration value="TKSaleRefund"/>
 *     <enumeration value="TKFlexSaleRefund"/>
 *     <enumeration value="TKSaleCancel"/>
 *     <enumeration value="TKFlexSaleCancel"/>
 *     <enumeration value="TKLimitSearch"/>
 *     <enumeration value="TKPlanSearch"/>
 *     <enumeration value="Reversal"/>
 *     <enumeration value="BatchClose"/>
 *     <enumeration value="Cancel"/>
 *     <enumeration value="Refund"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransactionType")
@XmlEnum
public enum TransactionType {

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
    @XmlEnumValue("TKSale")
    TK_SALE("TKSale"),
    @XmlEnumValue("TKFlexSale")
    TK_FLEX_SALE("TKFlexSale"),
    @XmlEnumValue("TKSaleRefund")
    TK_SALE_REFUND("TKSaleRefund"),
    @XmlEnumValue("TKFlexSaleRefund")
    TK_FLEX_SALE_REFUND("TKFlexSaleRefund"),
    @XmlEnumValue("TKSaleCancel")
    TK_SALE_CANCEL("TKSaleCancel"),
    @XmlEnumValue("TKFlexSaleCancel")
    TK_FLEX_SALE_CANCEL("TKFlexSaleCancel"),
    @XmlEnumValue("TKLimitSearch")
    TK_LIMIT_SEARCH("TKLimitSearch"),
    @XmlEnumValue("TKPlanSearch")
    TK_PLAN_SEARCH("TKPlanSearch"),
    @XmlEnumValue("Reversal")
    REVERSAL("Reversal"),
    @XmlEnumValue("BatchClose")
    BATCH_CLOSE("BatchClose"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
