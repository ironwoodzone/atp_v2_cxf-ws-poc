
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationPaymentRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationPaymentRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://webservicesV2.bookcyprus.com/}PaymentMethodCode"/&gt;
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReservationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardCVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardExpiryYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientDetails" type="{http://webservicesV2.bookcyprus.com/}ReservationClientDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationPaymentRequest", propOrder = {
    "baseRequest",
    "paymentMethod",
    "reservationId",
    "reservationCode",
    "creditCardNumber",
    "creditCardCVV",
    "creditCardExpiryMonth",
    "creditCardExpiryYear",
    "clientDetails"
})
public class ReservationPaymentRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "PaymentMethod", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethodCode paymentMethod;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "ReservationCode")
    protected String reservationCode;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardCVV")
    protected String creditCardCVV;
    @XmlElement(name = "CreditCardExpiryMonth")
    protected String creditCardExpiryMonth;
    @XmlElement(name = "CreditCardExpiryYear")
    protected String creditCardExpiryYear;
    @XmlElement(name = "ClientDetails")
    protected ReservationClientDetails clientDetails;

    /**
     * Gets the value of the baseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RequestBase }
     *     
     */
    public RequestBase getBaseRequest() {
        return baseRequest;
    }

    /**
     * Sets the value of the baseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestBase }
     *     
     */
    public void setBaseRequest(RequestBase value) {
        this.baseRequest = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodCode }
     *     
     */
    public PaymentMethodCode getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodCode }
     *     
     */
    public void setPaymentMethod(PaymentMethodCode value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the reservationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationCode() {
        return reservationCode;
    }

    /**
     * Sets the value of the reservationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationCode(String value) {
        this.reservationCode = value;
    }

    /**
     * Gets the value of the creditCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * Sets the value of the creditCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardNumber(String value) {
        this.creditCardNumber = value;
    }

    /**
     * Gets the value of the creditCardCVV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCVV() {
        return creditCardCVV;
    }

    /**
     * Sets the value of the creditCardCVV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCVV(String value) {
        this.creditCardCVV = value;
    }

    /**
     * Gets the value of the creditCardExpiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiryMonth() {
        return creditCardExpiryMonth;
    }

    /**
     * Sets the value of the creditCardExpiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiryMonth(String value) {
        this.creditCardExpiryMonth = value;
    }

    /**
     * Gets the value of the creditCardExpiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardExpiryYear() {
        return creditCardExpiryYear;
    }

    /**
     * Sets the value of the creditCardExpiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardExpiryYear(String value) {
        this.creditCardExpiryYear = value;
    }

    /**
     * Gets the value of the clientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationClientDetails }
     *     
     */
    public ReservationClientDetails getClientDetails() {
        return clientDetails;
    }

    /**
     * Sets the value of the clientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationClientDetails }
     *     
     */
    public void setClientDetails(ReservationClientDetails value) {
        this.clientDetails = value;
    }

}
