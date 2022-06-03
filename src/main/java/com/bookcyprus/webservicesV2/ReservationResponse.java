
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReservationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Languge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="AmountDue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencyReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Hotels" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelReservationResponse" minOccurs="0"/&gt;
 *         &lt;element name="Cars" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarReservationResponse" minOccurs="0"/&gt;
 *         &lt;element name="Transfers" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferReservationResponse" minOccurs="0"/&gt;
 *         &lt;element name="Excursions" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionReservationResponse" minOccurs="0"/&gt;
 *         &lt;element name="Roundtrip" type="{http://webservicesV2.bookcyprus.com/}RoundtripReservationResponse" minOccurs="0"/&gt;
 *         &lt;element name="PaymentResponse" type="{http://webservicesV2.bookcyprus.com/}ReservationPaymentResponse" minOccurs="0"/&gt;
 *         &lt;element name="ClientReservationReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationResponse", propOrder = {
    "baseResponse",
    "reservationId",
    "reservationCode",
    "createdOn",
    "title",
    "firstName",
    "lastName",
    "address",
    "email",
    "city",
    "countryId",
    "country",
    "mobileNumber",
    "remarks",
    "currency",
    "languge",
    "amount",
    "amountDue",
    "status",
    "agencyReference",
    "hotels",
    "cars",
    "transfers",
    "excursions",
    "roundtrip",
    "paymentResponse",
    "clientReservationReference"
})
public class ReservationResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "ReservationCode")
    protected String reservationCode;
    @XmlElement(name = "CreatedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
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
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "MobileNumber")
    protected String mobileNumber;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Languge")
    protected String languge;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "AmountDue", required = true)
    protected BigDecimal amountDue;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AgencyReference")
    protected String agencyReference;
    @XmlElement(name = "Hotels")
    protected ArrayOfHotelReservationResponse hotels;
    @XmlElement(name = "Cars")
    protected ArrayOfCarReservationResponse cars;
    @XmlElement(name = "Transfers")
    protected ArrayOfTransferReservationResponse transfers;
    @XmlElement(name = "Excursions")
    protected ArrayOfExcursionReservationResponse excursions;
    @XmlElement(name = "Roundtrip")
    protected RoundtripReservationResponse roundtrip;
    @XmlElement(name = "PaymentResponse")
    protected ReservationPaymentResponse paymentResponse;
    @XmlElement(name = "ClientReservationReference")
    protected String clientReservationReference;

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
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the languge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguge() {
        return languge;
    }

    /**
     * Sets the value of the languge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguge(String value) {
        this.languge = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountDue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    /**
     * Sets the value of the amountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountDue(BigDecimal value) {
        this.amountDue = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the hotels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationResponse }
     *     
     */
    public ArrayOfHotelReservationResponse getHotels() {
        return hotels;
    }

    /**
     * Sets the value of the hotels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationResponse }
     *     
     */
    public void setHotels(ArrayOfHotelReservationResponse value) {
        this.hotels = value;
    }

    /**
     * Gets the value of the cars property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarReservationResponse }
     *     
     */
    public ArrayOfCarReservationResponse getCars() {
        return cars;
    }

    /**
     * Sets the value of the cars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarReservationResponse }
     *     
     */
    public void setCars(ArrayOfCarReservationResponse value) {
        this.cars = value;
    }

    /**
     * Gets the value of the transfers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferReservationResponse }
     *     
     */
    public ArrayOfTransferReservationResponse getTransfers() {
        return transfers;
    }

    /**
     * Sets the value of the transfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferReservationResponse }
     *     
     */
    public void setTransfers(ArrayOfTransferReservationResponse value) {
        this.transfers = value;
    }

    /**
     * Gets the value of the excursions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionReservationResponse }
     *     
     */
    public ArrayOfExcursionReservationResponse getExcursions() {
        return excursions;
    }

    /**
     * Sets the value of the excursions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionReservationResponse }
     *     
     */
    public void setExcursions(ArrayOfExcursionReservationResponse value) {
        this.excursions = value;
    }

    /**
     * Gets the value of the roundtrip property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripReservationResponse }
     *     
     */
    public RoundtripReservationResponse getRoundtrip() {
        return roundtrip;
    }

    /**
     * Sets the value of the roundtrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripReservationResponse }
     *     
     */
    public void setRoundtrip(RoundtripReservationResponse value) {
        this.roundtrip = value;
    }

    /**
     * Gets the value of the paymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationPaymentResponse }
     *     
     */
    public ReservationPaymentResponse getPaymentResponse() {
        return paymentResponse;
    }

    /**
     * Sets the value of the paymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationPaymentResponse }
     *     
     */
    public void setPaymentResponse(ReservationPaymentResponse value) {
        this.paymentResponse = value;
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

}
