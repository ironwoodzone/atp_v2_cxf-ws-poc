
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetailsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountCurrentBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CreditLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrepaymentPolicies" type="{http://webservicesV2.bookcyprus.com/}ArrayOfPrepaymentPolicyResponse" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPolicies" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCancellationPolicyResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsResponse", propOrder = {
    "baseResponse",
    "customerName",
    "accountCurrentBalance",
    "creditLimit",
    "currency",
    "prepaymentPolicies",
    "cancellationPolicies"
})
public class AccountDetailsResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "AccountCurrentBalance", required = true)
    protected BigDecimal accountCurrentBalance;
    @XmlElement(name = "CreditLimit", required = true)
    protected BigDecimal creditLimit;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "PrepaymentPolicies")
    protected ArrayOfPrepaymentPolicyResponse prepaymentPolicies;
    @XmlElement(name = "CancellationPolicies")
    protected ArrayOfCancellationPolicyResponse cancellationPolicies;

    /**
     * Gets the value of the baseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBase }
     *     
     */
    public ResponseBase getBaseResponse() {
        return baseResponse;
    }

    /**
     * Sets the value of the baseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBase }
     *     
     */
    public void setBaseResponse(ResponseBase value) {
        this.baseResponse = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the accountCurrentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccountCurrentBalance() {
        return accountCurrentBalance;
    }

    /**
     * Sets the value of the accountCurrentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccountCurrentBalance(BigDecimal value) {
        this.accountCurrentBalance = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLimit(BigDecimal value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the prepaymentPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrepaymentPolicyResponse }
     *     
     */
    public ArrayOfPrepaymentPolicyResponse getPrepaymentPolicies() {
        return prepaymentPolicies;
    }

    /**
     * Sets the value of the prepaymentPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrepaymentPolicyResponse }
     *     
     */
    public void setPrepaymentPolicies(ArrayOfPrepaymentPolicyResponse value) {
        this.prepaymentPolicies = value;
    }

    /**
     * Gets the value of the cancellationPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCancellationPolicyResponse }
     *     
     */
    public ArrayOfCancellationPolicyResponse getCancellationPolicies() {
        return cancellationPolicies;
    }

    /**
     * Sets the value of the cancellationPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCancellationPolicyResponse }
     *     
     */
    public void setCancellationPolicies(ArrayOfCancellationPolicyResponse value) {
        this.cancellationPolicies = value;
    }

}
