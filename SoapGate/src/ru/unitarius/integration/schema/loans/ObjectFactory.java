
package ru.unitarius.integration.schema.loans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.unitarius.integration.schema.loans package. 
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

    private final static QName _LoanAccountList_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanAccountList");
    private final static QName _LoanBasicInfo_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanBasicInfo");
    private final static QName _LoanFindByIDReq_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanFindByIDReq");
    private final static QName _LoanFindListReq_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanFindListReq");
    private final static QName _LoanFullInfo_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanFullInfo");
    private final static QName _LoanRes_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoanRes");
    private final static QName _LoansFindListRes_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "LoansFindListRes");
    private final static QName _PaymentScheduleReq_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "PaymentScheduleReq");
    private final static QName _PaymentScheduleRes_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "PaymentScheduleRes");
    private final static QName _StatementReq_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "StatementReq");
    private final static QName _StatementRes_QNAME = new QName("http://unitarius.ru/integration/schema/loans", "StatementRes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.unitarius.integration.schema.loans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoansListFindByProductType }
     * 
     */
    public LoansListFindByProductType createLoansListFindByProductType() {
        return new LoansListFindByProductType();
    }

    /**
     * Create an instance of {@link LoanAccountType }
     * 
     */
    public LoanAccountType createLoanAccountType() {
        return new LoanAccountType();
    }

    /**
     * Create an instance of {@link LoanBasicInfoType }
     * 
     */
    public LoanBasicInfoType createLoanBasicInfoType() {
        return new LoanBasicInfoType();
    }

    /**
     * Create an instance of {@link LoanFindByIDReqType }
     * 
     */
    public LoanFindByIDReqType createLoanFindByIDReqType() {
        return new LoanFindByIDReqType();
    }

    /**
     * Create an instance of {@link LoanFindListReqType }
     * 
     */
    public LoanFindListReqType createLoanFindListReqType() {
        return new LoanFindListReqType();
    }

    /**
     * Create an instance of {@link LoanFullInfoType }
     * 
     */
    public LoanFullInfoType createLoanFullInfoType() {
        return new LoanFullInfoType();
    }

    /**
     * Create an instance of {@link LoanType }
     * 
     */
    public LoanType createLoanType() {
        return new LoanType();
    }

    /**
     * Create an instance of {@link LoansFindListResType }
     * 
     */
    public LoansFindListResType createLoansFindListResType() {
        return new LoansFindListResType();
    }

    /**
     * Create an instance of {@link PaymentScheduleReqType }
     * 
     */
    public PaymentScheduleReqType createPaymentScheduleReqType() {
        return new PaymentScheduleReqType();
    }

    /**
     * Create an instance of {@link PaymentScheduleResType }
     * 
     */
    public PaymentScheduleResType createPaymentScheduleResType() {
        return new PaymentScheduleResType();
    }

    /**
     * Create an instance of {@link StatementReqType }
     * 
     */
    public StatementReqType createStatementReqType() {
        return new StatementReqType();
    }

    /**
     * Create an instance of {@link StatementResType }
     * 
     */
    public StatementResType createStatementResType() {
        return new StatementResType();
    }

    /**
     * Create an instance of {@link LoansListFindByClientType }
     * 
     */
    public LoansListFindByClientType createLoansListFindByClientType() {
        return new LoansListFindByClientType();
    }

    /**
     * Create an instance of {@link LoansListFindByApplicationType }
     * 
     */
    public LoansListFindByApplicationType createLoansListFindByApplicationType() {
        return new LoansListFindByApplicationType();
    }

    /**
     * Create an instance of {@link LoansListFindByContractNumberType }
     * 
     */
    public LoansListFindByContractNumberType createLoansListFindByContractNumberType() {
        return new LoansListFindByContractNumberType();
    }

    /**
     * Create an instance of {@link InterestRateType }
     * 
     */
    public InterestRateType createInterestRateType() {
        return new InterestRateType();
    }

    /**
     * Create an instance of {@link CalcParamType }
     * 
     */
    public CalcParamType createCalcParamType() {
        return new CalcParamType();
    }

    /**
     * Create an instance of {@link GracePeriodType }
     * 
     */
    public GracePeriodType createGracePeriodType() {
        return new GracePeriodType();
    }

    /**
     * Create an instance of {@link FactPaymentScheduleEntryType }
     * 
     */
    public FactPaymentScheduleEntryType createFactPaymentScheduleEntryType() {
        return new FactPaymentScheduleEntryType();
    }

    /**
     * Create an instance of {@link PlanPaymentScheduleEntryType }
     * 
     */
    public PlanPaymentScheduleEntryType createPlanPaymentScheduleEntryType() {
        return new PlanPaymentScheduleEntryType();
    }

    /**
     * Create an instance of {@link AccountStatementType }
     * 
     */
    public AccountStatementType createAccountStatementType() {
        return new AccountStatementType();
    }

    /**
     * Create an instance of {@link StatementEntryType }
     * 
     */
    public StatementEntryType createStatementEntryType() {
        return new StatementEntryType();
    }

    /**
     * Create an instance of {@link LoansListFindByProductType.Product }
     * 
     */
    public LoansListFindByProductType.Product createLoansListFindByProductTypeProduct() {
        return new LoansListFindByProductType.Product();
    }

    /**
     * Create an instance of {@link LoansListFindByProductType.ProductType }
     * 
     */
    public LoansListFindByProductType.ProductType createLoansListFindByProductTypeProductType() {
        return new LoansListFindByProductType.ProductType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanAccountList")
    public JAXBElement<LoanAccountType> createLoanAccountList(LoanAccountType value) {
        return new JAXBElement<LoanAccountType>(_LoanAccountList_QNAME, LoanAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanBasicInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanBasicInfo")
    public JAXBElement<LoanBasicInfoType> createLoanBasicInfo(LoanBasicInfoType value) {
        return new JAXBElement<LoanBasicInfoType>(_LoanBasicInfo_QNAME, LoanBasicInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanFindByIDReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanFindByIDReq")
    public JAXBElement<LoanFindByIDReqType> createLoanFindByIDReq(LoanFindByIDReqType value) {
        return new JAXBElement<LoanFindByIDReqType>(_LoanFindByIDReq_QNAME, LoanFindByIDReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanFindListReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanFindListReq")
    public JAXBElement<LoanFindListReqType> createLoanFindListReq(LoanFindListReqType value) {
        return new JAXBElement<LoanFindListReqType>(_LoanFindListReq_QNAME, LoanFindListReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanFullInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanFullInfo")
    public JAXBElement<LoanFullInfoType> createLoanFullInfo(LoanFullInfoType value) {
        return new JAXBElement<LoanFullInfoType>(_LoanFullInfo_QNAME, LoanFullInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoanRes")
    public JAXBElement<LoanType> createLoanRes(LoanType value) {
        return new JAXBElement<LoanType>(_LoanRes_QNAME, LoanType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoansFindListResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "LoansFindListRes")
    public JAXBElement<LoansFindListResType> createLoansFindListRes(LoansFindListResType value) {
        return new JAXBElement<LoansFindListResType>(_LoansFindListRes_QNAME, LoansFindListResType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentScheduleReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "PaymentScheduleReq")
    public JAXBElement<PaymentScheduleReqType> createPaymentScheduleReq(PaymentScheduleReqType value) {
        return new JAXBElement<PaymentScheduleReqType>(_PaymentScheduleReq_QNAME, PaymentScheduleReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentScheduleResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "PaymentScheduleRes")
    public JAXBElement<PaymentScheduleResType> createPaymentScheduleRes(PaymentScheduleResType value) {
        return new JAXBElement<PaymentScheduleResType>(_PaymentScheduleRes_QNAME, PaymentScheduleResType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementReqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "StatementReq")
    public JAXBElement<StatementReqType> createStatementReq(StatementReqType value) {
        return new JAXBElement<StatementReqType>(_StatementReq_QNAME, StatementReqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementResType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://unitarius.ru/integration/schema/loans", name = "StatementRes")
    public JAXBElement<StatementResType> createStatementRes(StatementResType value) {
        return new JAXBElement<StatementResType>(_StatementRes_QNAME, StatementResType.class, null, value);
    }

}
