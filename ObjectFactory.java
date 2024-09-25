
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _PaymentTransactionInfoInstallmentCount_QNAME = new QName("PayFlexVPosUIServerWebService", "InstallmentCount");
    private static final QName _PaymentTransactionInfoAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "Amount");
    private static final QName _PaymentTransactionInfoAmountShare_QNAME = new QName("PayFlexVPosUIServerWebService", "AmountShare");
    private static final QName _PaymentTransactionInfoAmountCode_QNAME = new QName("PayFlexVPosUIServerWebService", "AmountCode");
    private static final QName _PaymentTransactionInfoTotalRefundAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "TotalRefundAmount");
    private static final QName _PaymentTransactionInfoCaptureAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "CaptureAmount");
    private static final QName _PaymentTransactionInfoTotalRefundLAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "TotalRefundLAmount");
    private static final QName _PaymentTransactionInfoReferencedPaymentTransactionId_QNAME = new QName("PayFlexVPosUIServerWebService", "ReferencedPaymentTransactionId");
    private static final QName _PaymentTransactionInfoIsCanceled_QNAME = new QName("PayFlexVPosUIServerWebService", "IsCanceled");
    private static final QName _PaymentTransactionInfoTransactionDeviceSource_QNAME = new QName("PayFlexVPosUIServerWebService", "TransactionDeviceSource");
    private static final QName _PaymentTransactionInfoIsReversed_QNAME = new QName("PayFlexVPosUIServerWebService", "IsReversed");
    private static final QName _PaymentTransactionInfoIsCaptured_QNAME = new QName("PayFlexVPosUIServerWebService", "IsCaptured");
    private static final QName _PaymentTransactionInfoIsPendingToReverse_QNAME = new QName("PayFlexVPosUIServerWebService", "IsPendingToReverse");
    private static final QName _PaymentTransactionInfoBatchNumber_QNAME = new QName("PayFlexVPosUIServerWebService", "BatchNumber");
    private static final QName _PaymentTransactionInfoResponseInsertTime_QNAME = new QName("PayFlexVPosUIServerWebService", "ResponseInsertTime");
    private static final QName _PaymentTransactionInfoVftAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "VftAmount");
    private static final QName _PaymentTransactionInfoSurchargeAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "SurchargeAmount");
    private static final QName _PaymentTransactionInfoCancelDate_QNAME = new QName("PayFlexVPosUIServerWebService", "CancelDate");
    private static final QName _PaymentTransactionInfoPointAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "PointAmount");
    private static final QName _PaymentTransactionInfoPointCode_QNAME = new QName("PayFlexVPosUIServerWebService", "PointCode");
    private static final QName _PaymentTransactionInfoTLAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "TLAmount");
    private static final QName _PaymentTransactionInfoGainedPoint_QNAME = new QName("PayFlexVPosUIServerWebService", "GainedPoint");
    private static final QName _PaymentTransactionInfoTotalPoint_QNAME = new QName("PayFlexVPosUIServerWebService", "TotalPoint");
    private static final QName _PaymentTransactionInfoUserId_QNAME = new QName("PayFlexVPosUIServerWebService", "UserId");
    private static final QName _PaymentTransactionInfoOriginalBatchAmount_QNAME = new QName("PayFlexVPosUIServerWebService", "OriginalBatchAmount");
    private static final QName _PaymentTransactionInfoBatchAmountTL_QNAME = new QName("PayFlexVPosUIServerWebService", "BatchAmountTL");
    private static final QName _PaymentTransactionInfoCardInstallmentCount_QNAME = new QName("PayFlexVPosUIServerWebService", "CardInstallmentCount");
    private static final QName _PaymentTransactionInfoMerchantInstallmentCount_QNAME = new QName("PayFlexVPosUIServerWebService", "MerchantInstallmentCount");
    private static final QName _PaymentTransactionInfoPointLosts_QNAME = new QName("PayFlexVPosUIServerWebService", "PointLosts");
    private static final QName _TransactionSearchResultInfoNumberOfInstallments_QNAME = new QName("PayFlexVPosUIServerWebService", "NumberOfInstallments");
    private static final QName _TransactionSearchResultInfoIsBatchClosed_QNAME = new QName("PayFlexVPosUIServerWebService", "IsBatchClosed");
    private static final QName _TransactionSearchResultInfoRequestInsertTime_QNAME = new QName("PayFlexVPosUIServerWebService", "RequestInsertTime");
    private static final QName _BatchTransactionSumDetailResponseRecurringFrequency_QNAME = new QName("PayFlexVPosUIServerWebService", "RecurringFrequency");
    private static final QName _BatchTransactionSumDetailResponseRecurringInstallmentCount_QNAME = new QName("PayFlexVPosUIServerWebService", "RecurringInstallmentCount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchTransaction }
     * 
     * @return
     *     the new instance of {@link SearchTransaction }
     */
    public SearchTransaction createSearchTransaction() {
        return new SearchTransaction();
    }

    /**
     * Create an instance of {@link TransactionSearchRequest }
     * 
     * @return
     *     the new instance of {@link TransactionSearchRequest }
     */
    public TransactionSearchRequest createTransactionSearchRequest() {
        return new TransactionSearchRequest();
    }

    /**
     * Create an instance of {@link SearchTransactionResponse }
     * 
     * @return
     *     the new instance of {@link SearchTransactionResponse }
     */
    public SearchTransactionResponse createSearchTransactionResponse() {
        return new SearchTransactionResponse();
    }

    /**
     * Create an instance of {@link TransactionSearchResponse }
     * 
     * @return
     *     the new instance of {@link TransactionSearchResponse }
     */
    public TransactionSearchResponse createTransactionSearchResponse() {
        return new TransactionSearchResponse();
    }

    /**
     * Create an instance of {@link Search }
     * 
     * @return
     *     the new instance of {@link Search }
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     * @return
     *     the new instance of {@link SearchRequest }
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     * @return
     *     the new instance of {@link SearchResponse }
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchResponse2 }
     * 
     * @return
     *     the new instance of {@link SearchResponse2 }
     */
    public SearchResponse2 createSearchResponse2() {
        return new SearchResponse2();
    }

    /**
     * Create an instance of {@link Settlement }
     * 
     * @return
     *     the new instance of {@link Settlement }
     */
    public Settlement createSettlement() {
        return new Settlement();
    }

    /**
     * Create an instance of {@link SettlementRequest }
     * 
     * @return
     *     the new instance of {@link SettlementRequest }
     */
    public SettlementRequest createSettlementRequest() {
        return new SettlementRequest();
    }

    /**
     * Create an instance of {@link SettlementResponse }
     * 
     * @return
     *     the new instance of {@link SettlementResponse }
     */
    public SettlementResponse createSettlementResponse() {
        return new SettlementResponse();
    }

    /**
     * Create an instance of {@link SettlementResponse2 }
     * 
     * @return
     *     the new instance of {@link SettlementResponse2 }
     */
    public SettlementResponse2 createSettlementResponse2() {
        return new SettlementResponse2();
    }

    /**
     * Create an instance of {@link SettlementDetail }
     * 
     * @return
     *     the new instance of {@link SettlementDetail }
     */
    public SettlementDetail createSettlementDetail() {
        return new SettlementDetail();
    }

    /**
     * Create an instance of {@link SettlementDetailRequest }
     * 
     * @return
     *     the new instance of {@link SettlementDetailRequest }
     */
    public SettlementDetailRequest createSettlementDetailRequest() {
        return new SettlementDetailRequest();
    }

    /**
     * Create an instance of {@link SettlementDetailResponse }
     * 
     * @return
     *     the new instance of {@link SettlementDetailResponse }
     */
    public SettlementDetailResponse createSettlementDetailResponse() {
        return new SettlementDetailResponse();
    }

    /**
     * Create an instance of {@link SettlementDetailResponse2 }
     * 
     * @return
     *     the new instance of {@link SettlementDetailResponse2 }
     */
    public SettlementDetailResponse2 createSettlementDetailResponse2() {
        return new SettlementDetailResponse2();
    }

    /**
     * Create an instance of {@link SucceededOpenBatchTransactions }
     * 
     * @return
     *     the new instance of {@link SucceededOpenBatchTransactions }
     */
    public SucceededOpenBatchTransactions createSucceededOpenBatchTransactions() {
        return new SucceededOpenBatchTransactions();
    }

    /**
     * Create an instance of {@link SucceededOpenBatchTransactionsRequest }
     * 
     * @return
     *     the new instance of {@link SucceededOpenBatchTransactionsRequest }
     */
    public SucceededOpenBatchTransactionsRequest createSucceededOpenBatchTransactionsRequest() {
        return new SucceededOpenBatchTransactionsRequest();
    }

    /**
     * Create an instance of {@link SucceededOpenBatchTransactionsResponse }
     * 
     * @return
     *     the new instance of {@link SucceededOpenBatchTransactionsResponse }
     */
    public SucceededOpenBatchTransactionsResponse createSucceededOpenBatchTransactionsResponse() {
        return new SucceededOpenBatchTransactionsResponse();
    }

    /**
     * Create an instance of {@link SucceededOpenBatchTransactionsResponse2 }
     * 
     * @return
     *     the new instance of {@link SucceededOpenBatchTransactionsResponse2 }
     */
    public SucceededOpenBatchTransactionsResponse2 createSucceededOpenBatchTransactionsResponse2() {
        return new SucceededOpenBatchTransactionsResponse2();
    }

    /**
     * Create an instance of {@link SearchBatchTransactionSum }
     * 
     * @return
     *     the new instance of {@link SearchBatchTransactionSum }
     */
    public SearchBatchTransactionSum createSearchBatchTransactionSum() {
        return new SearchBatchTransactionSum();
    }

    /**
     * Create an instance of {@link BatchTransactionSumDetailRequest }
     * 
     * @return
     *     the new instance of {@link BatchTransactionSumDetailRequest }
     */
    public BatchTransactionSumDetailRequest createBatchTransactionSumDetailRequest() {
        return new BatchTransactionSumDetailRequest();
    }

    /**
     * Create an instance of {@link SearchBatchTransactionSumResponse }
     * 
     * @return
     *     the new instance of {@link SearchBatchTransactionSumResponse }
     */
    public SearchBatchTransactionSumResponse createSearchBatchTransactionSumResponse() {
        return new SearchBatchTransactionSumResponse();
    }

    /**
     * Create an instance of {@link BatchTransactionSumDetailResponse }
     * 
     * @return
     *     the new instance of {@link BatchTransactionSumDetailResponse }
     */
    public BatchTransactionSumDetailResponse createBatchTransactionSumDetailResponse() {
        return new BatchTransactionSumDetailResponse();
    }

    /**
     * Create an instance of {@link EditMerchantBatchTransactionSum }
     * 
     * @return
     *     the new instance of {@link EditMerchantBatchTransactionSum }
     */
    public EditMerchantBatchTransactionSum createEditMerchantBatchTransactionSum() {
        return new EditMerchantBatchTransactionSum();
    }

    /**
     * Create an instance of {@link EditMerchantBatchTransactionSumRequest }
     * 
     * @return
     *     the new instance of {@link EditMerchantBatchTransactionSumRequest }
     */
    public EditMerchantBatchTransactionSumRequest createEditMerchantBatchTransactionSumRequest() {
        return new EditMerchantBatchTransactionSumRequest();
    }

    /**
     * Create an instance of {@link EditMerchantBatchTransactionSumResponse }
     * 
     * @return
     *     the new instance of {@link EditMerchantBatchTransactionSumResponse }
     */
    public EditMerchantBatchTransactionSumResponse createEditMerchantBatchTransactionSumResponse() {
        return new EditMerchantBatchTransactionSumResponse();
    }

    /**
     * Create an instance of {@link EditMerchantBatchTransactionSumResponse2 }
     * 
     * @return
     *     the new instance of {@link EditMerchantBatchTransactionSumResponse2 }
     */
    public EditMerchantBatchTransactionSumResponse2 createEditMerchantBatchTransactionSumResponse2() {
        return new EditMerchantBatchTransactionSumResponse2();
    }

    /**
     * Create an instance of {@link PagedRequestBase }
     * 
     * @return
     *     the new instance of {@link PagedRequestBase }
     */
    public PagedRequestBase createPagedRequestBase() {
        return new PagedRequestBase();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     * @return
     *     the new instance of {@link RequestBase }
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link RequestInfo }
     * 
     * @return
     *     the new instance of {@link RequestInfo }
     */
    public RequestInfo createRequestInfo() {
        return new RequestInfo();
    }

    /**
     * Create an instance of {@link AuditableRequest }
     * 
     * @return
     *     the new instance of {@link AuditableRequest }
     */
    public AuditableRequest createAuditableRequest() {
        return new AuditableRequest();
    }

    /**
     * Create an instance of {@link PagedRequestInfo }
     * 
     * @return
     *     the new instance of {@link PagedRequestInfo }
     */
    public PagedRequestInfo createPagedRequestInfo() {
        return new PagedRequestInfo();
    }

    /**
     * Create an instance of {@link MerchantCriteriaInfo }
     * 
     * @return
     *     the new instance of {@link MerchantCriteriaInfo }
     */
    public MerchantCriteriaInfo createMerchantCriteriaInfo() {
        return new MerchantCriteriaInfo();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     * @return
     *     the new instance of {@link ArrayOfString }
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link PagedResponseBase }
     * 
     * @return
     *     the new instance of {@link PagedResponseBase }
     */
    public PagedResponseBase createPagedResponseBase() {
        return new PagedResponseBase();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     * @return
     *     the new instance of {@link ResponseBase }
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link ResponseInfo }
     * 
     * @return
     *     the new instance of {@link ResponseInfo }
     */
    public ResponseInfo createResponseInfo() {
        return new ResponseInfo();
    }

    /**
     * Create an instance of {@link PagedResponseInfo }
     * 
     * @return
     *     the new instance of {@link PagedResponseInfo }
     */
    public PagedResponseInfo createPagedResponseInfo() {
        return new PagedResponseInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTransaction }
     * 
     * @return
     *     the new instance of {@link ArrayOfPaymentTransaction }
     */
    public ArrayOfPaymentTransaction createArrayOfPaymentTransaction() {
        return new ArrayOfPaymentTransaction();
    }

    /**
     * Create an instance of {@link PaymentTransaction }
     * 
     * @return
     *     the new instance of {@link PaymentTransaction }
     */
    public PaymentTransaction createPaymentTransaction() {
        return new PaymentTransaction();
    }

    /**
     * Create an instance of {@link PaymentTransactionTypeInfo }
     * 
     * @return
     *     the new instance of {@link PaymentTransactionTypeInfo }
     */
    public PaymentTransactionTypeInfo createPaymentTransactionTypeInfo() {
        return new PaymentTransactionTypeInfo();
    }

    /**
     * Create an instance of {@link Merchant }
     * 
     * @return
     *     the new instance of {@link Merchant }
     */
    public Merchant createMerchant() {
        return new Merchant();
    }

    /**
     * Create an instance of {@link Terminal }
     * 
     * @return
     *     the new instance of {@link Terminal }
     */
    public Terminal createTerminal() {
        return new Terminal();
    }

    /**
     * Create an instance of {@link InstallmentTable }
     * 
     * @return
     *     the new instance of {@link InstallmentTable }
     */
    public InstallmentTable createInstallmentTable() {
        return new InstallmentTable();
    }

    /**
     * Create an instance of {@link ArrayOfInstallmentItem }
     * 
     * @return
     *     the new instance of {@link ArrayOfInstallmentItem }
     */
    public ArrayOfInstallmentItem createArrayOfInstallmentItem() {
        return new ArrayOfInstallmentItem();
    }

    /**
     * Create an instance of {@link InstallmentItem }
     * 
     * @return
     *     the new instance of {@link InstallmentItem }
     */
    public InstallmentItem createInstallmentItem() {
        return new InstallmentItem();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionCampaignResult }
     * 
     * @return
     *     the new instance of {@link ArrayOfTransactionCampaignResult }
     */
    public ArrayOfTransactionCampaignResult createArrayOfTransactionCampaignResult() {
        return new ArrayOfTransactionCampaignResult();
    }

    /**
     * Create an instance of {@link TransactionCampaignResult }
     * 
     * @return
     *     the new instance of {@link TransactionCampaignResult }
     */
    public TransactionCampaignResult createTransactionCampaignResult() {
        return new TransactionCampaignResult();
    }

    /**
     * Create an instance of {@link ArrayOfCustomItem }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomItem }
     */
    public ArrayOfCustomItem createArrayOfCustomItem() {
        return new ArrayOfCustomItem();
    }

    /**
     * Create an instance of {@link CustomItem }
     * 
     * @return
     *     the new instance of {@link CustomItem }
     */
    public CustomItem createCustomItem() {
        return new CustomItem();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionTotal }
     * 
     * @return
     *     the new instance of {@link ArrayOfTransactionTotal }
     */
    public ArrayOfTransactionTotal createArrayOfTransactionTotal() {
        return new ArrayOfTransactionTotal();
    }

    /**
     * Create an instance of {@link TransactionTotal }
     * 
     * @return
     *     the new instance of {@link TransactionTotal }
     */
    public TransactionTotal createTransactionTotal() {
        return new TransactionTotal();
    }

    /**
     * Create an instance of {@link ArrayOfCustomItemTotals }
     * 
     * @return
     *     the new instance of {@link ArrayOfCustomItemTotals }
     */
    public ArrayOfCustomItemTotals createArrayOfCustomItemTotals() {
        return new ArrayOfCustomItemTotals();
    }

    /**
     * Create an instance of {@link CustomItemTotals }
     * 
     * @return
     *     the new instance of {@link CustomItemTotals }
     */
    public CustomItemTotals createCustomItemTotals() {
        return new CustomItemTotals();
    }

    /**
     * Create an instance of {@link DateCriteriaInfo }
     * 
     * @return
     *     the new instance of {@link DateCriteriaInfo }
     */
    public DateCriteriaInfo createDateCriteriaInfo() {
        return new DateCriteriaInfo();
    }

    /**
     * Create an instance of {@link TransactionCriteriaInfo }
     * 
     * @return
     *     the new instance of {@link TransactionCriteriaInfo }
     */
    public TransactionCriteriaInfo createTransactionCriteriaInfo() {
        return new TransactionCriteriaInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTransactionSearchResultInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfTransactionSearchResultInfo }
     */
    public ArrayOfTransactionSearchResultInfo createArrayOfTransactionSearchResultInfo() {
        return new ArrayOfTransactionSearchResultInfo();
    }

    /**
     * Create an instance of {@link TransactionSearchResultInfo }
     * 
     * @return
     *     the new instance of {@link TransactionSearchResultInfo }
     */
    public TransactionSearchResultInfo createTransactionSearchResultInfo() {
        return new TransactionSearchResultInfo();
    }

    /**
     * Create an instance of {@link InstallmentTableResponseModel }
     * 
     * @return
     *     the new instance of {@link InstallmentTableResponseModel }
     */
    public InstallmentTableResponseModel createInstallmentTableResponseModel() {
        return new InstallmentTableResponseModel();
    }

    /**
     * Create an instance of {@link CampaignResult }
     * 
     * @return
     *     the new instance of {@link CampaignResult }
     */
    public CampaignResult createCampaignResult() {
        return new CampaignResult();
    }

    /**
     * Create an instance of {@link ArrayOfCampaignInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfCampaignInfo }
     */
    public ArrayOfCampaignInfo createArrayOfCampaignInfo() {
        return new ArrayOfCampaignInfo();
    }

    /**
     * Create an instance of {@link CampaignInfo }
     * 
     * @return
     *     the new instance of {@link CampaignInfo }
     */
    public CampaignInfo createCampaignInfo() {
        return new CampaignInfo();
    }

    /**
     * Create an instance of {@link TotalItemList }
     * 
     * @return
     *     the new instance of {@link TotalItemList }
     */
    public TotalItemList createTotalItemList() {
        return new TotalItemList();
    }

    /**
     * Create an instance of {@link ArrayOfTotalItem }
     * 
     * @return
     *     the new instance of {@link ArrayOfTotalItem }
     */
    public ArrayOfTotalItem createArrayOfTotalItem() {
        return new ArrayOfTotalItem();
    }

    /**
     * Create an instance of {@link TotalItem }
     * 
     * @return
     *     the new instance of {@link TotalItem }
     */
    public TotalItem createTotalItem() {
        return new TotalItem();
    }

    /**
     * Create an instance of {@link ArrayOfPaymentTransactionInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfPaymentTransactionInfo }
     */
    public ArrayOfPaymentTransactionInfo createArrayOfPaymentTransactionInfo() {
        return new ArrayOfPaymentTransactionInfo();
    }

    /**
     * Create an instance of {@link PaymentTransactionInfo }
     * 
     * @return
     *     the new instance of {@link PaymentTransactionInfo }
     */
    public PaymentTransactionInfo createPaymentTransactionInfo() {
        return new PaymentTransactionInfo();
    }

    /**
     * Create an instance of {@link MerchantInfo }
     * 
     * @return
     *     the new instance of {@link MerchantInfo }
     */
    public MerchantInfo createMerchantInfo() {
        return new MerchantInfo();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     * @return
     *     the new instance of {@link ArrayOfInt }
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link ArrayOfMerchantCurrencyCodeResponse }
     * 
     * @return
     *     the new instance of {@link ArrayOfMerchantCurrencyCodeResponse }
     */
    public ArrayOfMerchantCurrencyCodeResponse createArrayOfMerchantCurrencyCodeResponse() {
        return new ArrayOfMerchantCurrencyCodeResponse();
    }

    /**
     * Create an instance of {@link MerchantCurrencyCodeResponse }
     * 
     * @return
     *     the new instance of {@link MerchantCurrencyCodeResponse }
     */
    public MerchantCurrencyCodeResponse createMerchantCurrencyCodeResponse() {
        return new MerchantCurrencyCodeResponse();
    }

    /**
     * Create an instance of {@link TerminalInfo }
     * 
     * @return
     *     the new instance of {@link TerminalInfo }
     */
    public TerminalInfo createTerminalInfo() {
        return new TerminalInfo();
    }

    /**
     * Create an instance of {@link GIBInstallments }
     * 
     * @return
     *     the new instance of {@link GIBInstallments }
     */
    public GIBInstallments createGIBInstallments() {
        return new GIBInstallments();
    }

    /**
     * Create an instance of {@link ArrayOfGIBInstallment }
     * 
     * @return
     *     the new instance of {@link ArrayOfGIBInstallment }
     */
    public ArrayOfGIBInstallment createArrayOfGIBInstallment() {
        return new ArrayOfGIBInstallment();
    }

    /**
     * Create an instance of {@link GIBInstallment }
     * 
     * @return
     *     the new instance of {@link GIBInstallment }
     */
    public GIBInstallment createGIBInstallment() {
        return new GIBInstallment();
    }

    /**
     * Create an instance of {@link ArrayOfInstallmentItemDetail }
     * 
     * @return
     *     the new instance of {@link ArrayOfInstallmentItemDetail }
     */
    public ArrayOfInstallmentItemDetail createArrayOfInstallmentItemDetail() {
        return new ArrayOfInstallmentItemDetail();
    }

    /**
     * Create an instance of {@link InstallmentItemDetail }
     * 
     * @return
     *     the new instance of {@link InstallmentItemDetail }
     */
    public InstallmentItemDetail createInstallmentItemDetail() {
        return new InstallmentItemDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "InstallmentCount", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoInstallmentCount_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "Amount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "AmountShare", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoAmountShare(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmountShare_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "AmountCode", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoAmountCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmountCode_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalRefundAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoTotalRefundAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalRefundAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CaptureAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoCaptureAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoCaptureAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalRefundLAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoTotalRefundLAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalRefundLAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "ReferencedPaymentTransactionId", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoReferencedPaymentTransactionId(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoReferencedPaymentTransactionId_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsCanceled", scope = PaymentTransactionInfo.class)
    public JAXBElement<Boolean> createPaymentTransactionInfoIsCanceled(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsCanceled_QNAME, Boolean.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TransactionDeviceSource", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoTransactionDeviceSource(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoTransactionDeviceSource_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsReversed", scope = PaymentTransactionInfo.class)
    public JAXBElement<Boolean> createPaymentTransactionInfoIsReversed(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsReversed_QNAME, Boolean.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsCaptured", scope = PaymentTransactionInfo.class)
    public JAXBElement<Boolean> createPaymentTransactionInfoIsCaptured(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsCaptured_QNAME, Boolean.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsPendingToReverse", scope = PaymentTransactionInfo.class)
    public JAXBElement<Boolean> createPaymentTransactionInfoIsPendingToReverse(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsPendingToReverse_QNAME, Boolean.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "BatchNumber", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoBatchNumber(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoBatchNumber_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "ResponseInsertTime", scope = PaymentTransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentTransactionInfoResponseInsertTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_PaymentTransactionInfoResponseInsertTime_QNAME, XMLGregorianCalendar.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "VftAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoVftAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoVftAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "SurchargeAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoSurchargeAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoSurchargeAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CancelDate", scope = PaymentTransactionInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentTransactionInfoCancelDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_PaymentTransactionInfoCancelDate_QNAME, XMLGregorianCalendar.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoPointAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointCode", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoPointCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointCode_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TLAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoTLAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTLAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "GainedPoint", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoGainedPoint(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoGainedPoint_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalPoint", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoTotalPoint(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalPoint_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "UserId", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoUserId(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoUserId_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "OriginalBatchAmount", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoOriginalBatchAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoOriginalBatchAmount_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "BatchAmountTL", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoBatchAmountTL(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoBatchAmountTL_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CardInstallmentCount", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoCardInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoCardInstallmentCount_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "MerchantInstallmentCount", scope = PaymentTransactionInfo.class)
    public JAXBElement<Integer> createPaymentTransactionInfoMerchantInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoMerchantInstallmentCount_QNAME, Integer.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointLosts", scope = PaymentTransactionInfo.class)
    public JAXBElement<BigDecimal> createPaymentTransactionInfoPointLosts(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointLosts_QNAME, BigDecimal.class, PaymentTransactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "Amount", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmount_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "AmountCode", scope = TransactionSearchResultInfo.class)
    public JAXBElement<Integer> createTransactionSearchResultInfoAmountCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmountCode_QNAME, Integer.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsCaptured", scope = TransactionSearchResultInfo.class)
    public JAXBElement<Boolean> createTransactionSearchResultInfoIsCaptured(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsCaptured_QNAME, Boolean.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalRefundAmount", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoTotalRefundAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalRefundAmount_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointAmount", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoPointAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointAmount_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointCode", scope = TransactionSearchResultInfo.class)
    public JAXBElement<Integer> createTransactionSearchResultInfoPointCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointCode_QNAME, Integer.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "GainedPoint", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoGainedPoint(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoGainedPoint_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "VftAmount", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoVftAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoVftAmount_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "SurchargeAmount", scope = TransactionSearchResultInfo.class)
    public JAXBElement<BigDecimal> createTransactionSearchResultInfoSurchargeAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoSurchargeAmount_QNAME, BigDecimal.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "NumberOfInstallments", scope = TransactionSearchResultInfo.class)
    public JAXBElement<Integer> createTransactionSearchResultInfoNumberOfInstallments(Integer value) {
        return new JAXBElement<>(_TransactionSearchResultInfoNumberOfInstallments_QNAME, Integer.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsBatchClosed", scope = TransactionSearchResultInfo.class)
    public JAXBElement<Boolean> createTransactionSearchResultInfoIsBatchClosed(Boolean value) {
        return new JAXBElement<>(_TransactionSearchResultInfoIsBatchClosed_QNAME, Boolean.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "RequestInsertTime", scope = TransactionSearchResultInfo.class)
    public JAXBElement<XMLGregorianCalendar> createTransactionSearchResultInfoRequestInsertTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_TransactionSearchResultInfoRequestInsertTime_QNAME, XMLGregorianCalendar.class, TransactionSearchResultInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "InstallmentCount", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoInstallmentCount_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "Amount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "AmountCode", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionAmountCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoAmountCode_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalRefundAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionTotalRefundAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalRefundAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CaptureAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionCaptureAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoCaptureAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalRefundLAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionTotalRefundLAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalRefundLAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "ReferencedPaymentTransactionId", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionReferencedPaymentTransactionId(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoReferencedPaymentTransactionId_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsCanceled", scope = PaymentTransaction.class)
    public JAXBElement<Boolean> createPaymentTransactionIsCanceled(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsCanceled_QNAME, Boolean.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TransactionDeviceSource", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionTransactionDeviceSource(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoTransactionDeviceSource_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsReversed", scope = PaymentTransaction.class)
    public JAXBElement<Boolean> createPaymentTransactionIsReversed(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsReversed_QNAME, Boolean.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsCaptured", scope = PaymentTransaction.class)
    public JAXBElement<Boolean> createPaymentTransactionIsCaptured(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsCaptured_QNAME, Boolean.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "IsPendingToReverse", scope = PaymentTransaction.class)
    public JAXBElement<Boolean> createPaymentTransactionIsPendingToReverse(Boolean value) {
        return new JAXBElement<>(_PaymentTransactionInfoIsPendingToReverse_QNAME, Boolean.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "BatchNumber", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionBatchNumber(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoBatchNumber_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "ResponseInsertTime", scope = PaymentTransaction.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentTransactionResponseInsertTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_PaymentTransactionInfoResponseInsertTime_QNAME, XMLGregorianCalendar.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "VftAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionVftAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoVftAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "SurchargeAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionSurchargeAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoSurchargeAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CancelDate", scope = PaymentTransaction.class)
    public JAXBElement<XMLGregorianCalendar> createPaymentTransactionCancelDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_PaymentTransactionInfoCancelDate_QNAME, XMLGregorianCalendar.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionPointAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointCode", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionPointCode(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointCode_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TLAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionTLAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTLAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "GainedPoint", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionGainedPoint(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoGainedPoint_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "TotalPoint", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionTotalPoint(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoTotalPoint_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "UserId", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionUserId(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoUserId_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "OriginalBatchAmount", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionOriginalBatchAmount(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoOriginalBatchAmount_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "BatchAmountTL", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionBatchAmountTL(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoBatchAmountTL_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "CardInstallmentCount", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionCardInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoCardInstallmentCount_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "MerchantInstallmentCount", scope = PaymentTransaction.class)
    public JAXBElement<Integer> createPaymentTransactionMerchantInstallmentCount(Integer value) {
        return new JAXBElement<>(_PaymentTransactionInfoMerchantInstallmentCount_QNAME, Integer.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "PointLosts", scope = PaymentTransaction.class)
    public JAXBElement<BigDecimal> createPaymentTransactionPointLosts(BigDecimal value) {
        return new JAXBElement<>(_PaymentTransactionInfoPointLosts_QNAME, BigDecimal.class, PaymentTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "RecurringFrequency", scope = BatchTransactionSumDetailResponse.class)
    public JAXBElement<Integer> createBatchTransactionSumDetailResponseRecurringFrequency(Integer value) {
        return new JAXBElement<>(_BatchTransactionSumDetailResponseRecurringFrequency_QNAME, Integer.class, BatchTransactionSumDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "PayFlexVPosUIServerWebService", name = "RecurringInstallmentCount", scope = BatchTransactionSumDetailResponse.class)
    public JAXBElement<Integer> createBatchTransactionSumDetailResponseRecurringInstallmentCount(Integer value) {
        return new JAXBElement<>(_BatchTransactionSumDetailResponseRecurringInstallmentCount_QNAME, Integer.class, BatchTransactionSumDetailResponse.class, value);
    }

}
