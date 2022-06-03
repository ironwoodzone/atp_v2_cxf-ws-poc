
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplyPrepayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AgencyReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentRequest" type="{http://webservicesV2.bookcyprus.com/}ReservationPaymentRequest" minOccurs="0"/&gt;
 *         &lt;element name="HotelRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="CarRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="TransferRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="RoundtripRequest" type="{http://webservicesV2.bookcyprus.com/}RoundtripReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="ClientReservationReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExistingReservationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationRequest", propOrder = {
    "baseRequest",
    "title",
    "firstName",
    "lastName",
    "address",
    "email",
    "city",
    "countryId",
    "mobileNumber",
    "remarks",
    "applyPrepayment",
    "agencyReference",
    "paymentRequest",
    "hotelRequests",
    "carRequests",
    "transferRequests",
    "excursionRequests",
    "roundtripRequest",
    "clientReservationReference",
    "existingReservationId"
})
public class ReservationRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "CountryId")
    protected int countryId;
    @XmlElement(name = "MobileNumber")
    protected String mobileNumber;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ApplyPrepayment")
    protected boolean applyPrepayment;
    @XmlElement(name = "AgencyReference")
    protected String agencyReference;
    @XmlElement(name = "PaymentRequest")
    protected ReservationPaymentRequest paymentRequest;
    @XmlElement(name = "HotelRequests")
    protected ArrayOfHotelReservationRequest hotelRequests;
    @XmlElement(name = "CarRequests")
    protected ArrayOfCarReservationRequest carRequests;
    @XmlElement(name = "TransferRequests")
    protected ArrayOfTransferReservationRequest transferRequests;
    @XmlElement(name = "ExcursionRequests")
    protected ArrayOfExcursionReservationRequest excursionRequests;
    @XmlElement(name = "RoundtripRequest")
    protected RoundtripReservationRequest roundtripRequest;
    @XmlElement(name = "ClientReservationReference")
    protected String clientReservationReference;
    @XmlElement(name = "ExistingReservationId")
    protected String existingReservationId;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryId property.
     * 
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(int value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the applyPrepayment property.
     * 
     */
    public boolean isApplyPrepayment() {
        return applyPrepayment;
    }

    /**
     * Sets the value of the applyPrepayment property.
     * 
     */
    public void setApplyPrepayment(boolean value) {
        this.applyPrepayment = value;
    }

    /**
     * Gets the value of the agencyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyReference() {
        return agencyReference;
    }

    /**
     * Sets the value of the agencyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyReference(String value) {
        this.agencyReference = value;
    }

    /**
     * Gets the value of the paymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationPaymentRequest }
     *     
     */
    public ReservationPaymentRequest getPaymentRequest() {
        return paymentRequest;
    }

    /**
     * Sets the value of the paymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationPaymentRequest }
     *     
     */
    public void setPaymentRequest(ReservationPaymentRequest value) {
        this.paymentRequest = value;
    }

    /**
     * Gets the value of the hotelRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationRequest }
     *     
     */
    public ArrayOfHotelReservationRequest getHotelRequests() {
        return hotelRequests;
    }

    /**
     * Sets the value of the hotelRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationRequest }
     *     
     */
    public void setHotelRequests(ArrayOfHotelReservationRequest value) {
        this.hotelRequests = value;
    }

    /**
     * Gets the value of the carRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarReservationRequest }
     *     
     */
    public ArrayOfCarReservationRequest getCarRequests() {
        return carRequests;
    }

    /**
     * Sets the value of the carRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarReservationRequest }
     *     
     */
    public void setCarRequests(ArrayOfCarReservationRequest value) {
        this.carRequests = value;
    }

    /**
     * Gets the value of the transferRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferReservationRequest }
     *     
     */
    public ArrayOfTransferReservationRequest getTransferRequests() {
        return transferRequests;
    }

    /**
     * Sets the value of the transferRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferReservationRequest }
     *     
     */
    public void setTransferRequests(ArrayOfTransferReservationRequest value) {
        this.transferRequests = value;
    }

    /**
     * Gets the value of the excursionRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionReservationRequest }
     *     
     */
    public ArrayOfExcursionReservationRequest getExcursionRequests() {
        return excursionRequests;
    }

    /**
     * Sets the value of the excursionRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionReservationRequest }
     *     
     */
    public void setExcursionRequests(ArrayOfExcursionReservationRequest value) {
        this.excursionRequests = value;
    }

    /**
     * Gets the value of the roundtripRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripReservationRequest }
     *     
     */
    public RoundtripReservationRequest getRoundtripRequest() {
        return roundtripRequest;
    }

    /**
     * Sets the value of the roundtripRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripReservationRequest }
     *     
     */
    public void setRoundtripRequest(RoundtripReservationRequest value) {
        this.roundtripRequest = value;
    }

    /**
     * Gets the value of the clientReservationReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReservationReference() {
        return clientReservationReference;
    }

    /**
     * Sets the value of the clientReservationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReservationReference(String value) {
        this.clientReservationReference = value;
    }

    /**
     * Gets the value of the existingReservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingReservationId() {
        return existingReservationId;
    }

    /**
     * Sets the value of the existingReservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingReservationId(String value) {
        this.existingReservationId = value;
    }

}
