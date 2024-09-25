
package com.gateway.payment_be.service.paymentproviderclient.vakifbank.dto.inquiry;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "TransactionSearchOperations", targetNamespace = "PayFlexVPosUIServerWebService", wsdlLocation = "file:/Users/furkanince/Desktop/ets-tur-yedek/generatewsdl/src/main/resources/hopi.wsdl")
public class TransactionSearchOperations
    extends Service
{

    private static final URL TRANSACTIONSEARCHOPERATIONS_WSDL_LOCATION;
    private static final WebServiceException TRANSACTIONSEARCHOPERATIONS_EXCEPTION;
    private static final QName TRANSACTIONSEARCHOPERATIONS_QNAME = new QName("PayFlexVPosUIServerWebService", "TransactionSearchOperations");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/furkanince/Desktop/ets-tur-yedek/generatewsdl/src/main/resources/hopi.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSACTIONSEARCHOPERATIONS_WSDL_LOCATION = url;
        TRANSACTIONSEARCHOPERATIONS_EXCEPTION = e;
    }

    public TransactionSearchOperations() {
        super(__getWsdlLocation(), TRANSACTIONSEARCHOPERATIONS_QNAME);
    }

    public TransactionSearchOperations(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSACTIONSEARCHOPERATIONS_QNAME, features);
    }

    public TransactionSearchOperations(URL wsdlLocation) {
        super(wsdlLocation, TRANSACTIONSEARCHOPERATIONS_QNAME);
    }

    public TransactionSearchOperations(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSACTIONSEARCHOPERATIONS_QNAME, features);
    }

    public TransactionSearchOperations(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransactionSearchOperations(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransactionSearchOperationsSoap
     */
    @WebEndpoint(name = "TransactionSearchOperationsSoap")
    public TransactionSearchOperationsSoap getTransactionSearchOperationsSoap() {
        return super.getPort(new QName("PayFlexVPosUIServerWebService", "TransactionSearchOperationsSoap"), TransactionSearchOperationsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransactionSearchOperationsSoap
     */
    @WebEndpoint(name = "TransactionSearchOperationsSoap")
    public TransactionSearchOperationsSoap getTransactionSearchOperationsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("PayFlexVPosUIServerWebService", "TransactionSearchOperationsSoap"), TransactionSearchOperationsSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSACTIONSEARCHOPERATIONS_EXCEPTION!= null) {
            throw TRANSACTIONSEARCHOPERATIONS_EXCEPTION;
        }
        return TRANSACTIONSEARCHOPERATIONS_WSDL_LOCATION;
    }

}
