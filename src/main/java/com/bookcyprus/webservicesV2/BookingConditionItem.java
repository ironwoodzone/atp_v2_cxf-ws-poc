
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingConditionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelRequest" type="{http://webservicesV2.bookcyprus.com/}HotelReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="CarRequest" type="{http://webservicesV2.bookcyprus.com/}CarReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="TransferRequest" type="{http://webservicesV2.bookcyprus.com/}TransferReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionRequest" type="{http://webservicesV2.bookcyprus.com/}ExcursionReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="RoundtripRequest" type="{http://webservicesV2.bookcyprus.com/}RoundtripReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://webservicesV2.bookcyprus.com/}ArrayOfBookingConditionItemDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingConditionItem", propOrder = {
    "hotelRequest",
    "carRequest",
    "transferRequest",
    "excursionRequest",
    "roundtripRequest",
    "details"
})
public class BookingConditionItem {

    @XmlElement(name = "HotelRequest")
    protected HotelReservationRequest hotelRequest;
    @XmlElement(name = "CarRequest")
    protected CarReservationRequest carRequest;
    @XmlElement(name = "TransferRequest")
    protected TransferReservationRequest transferRequest;
    @XmlElement(name = "ExcursionRequest")
    protected ExcursionReservationRequest excursionRequest;
    @XmlElement(name = "RoundtripRequest")
    protected RoundtripReservationRequest roundtripRequest;
    @XmlElement(name = "Details")
    protected ArrayOfBookingConditionItemDetail details;

    /**
     * Gets the value of the hotelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationRequest }
     *     
     */
    public HotelReservationRequest getHotelRequest() {
        return hotelRequest;
    }

    /**
     * Sets the value of the hotelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationRequest }
     *     
     */
    public void setHotelRequest(HotelReservationRequest value) {
        this.hotelRequest = value;
    }

    /**
     * Gets the value of the carRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CarReservationRequest }
     *     
     */
    public CarReservationRequest getCarRequest() {
        return carRequest;
    }

    /**
     * Sets the value of the carRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarReservationRequest }
     *     
     */
    public void setCarRequest(CarReservationRequest value) {
        this.carRequest = value;
    }

    /**
     * Gets the value of the transferRequest property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReservationRequest }
     *     
     */
    public TransferReservationRequest getTransferRequest() {
        return transferRequest;
    }

    /**
     * Sets the value of the transferRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReservationRequest }
     *     
     */
    public void setTransferRequest(TransferReservationRequest value) {
        this.transferRequest = value;
    }

    /**
     * Gets the value of the excursionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ExcursionReservationRequest }
     *     
     */
    public ExcursionReservationRequest getExcursionRequest() {
        return excursionRequest;
    }

    /**
     * Sets the value of the excursionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcursionReservationRequest }
     *     
     */
    public void setExcursionRequest(ExcursionReservationRequest value) {
        this.excursionRequest = value;
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
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public ArrayOfBookingConditionItemDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public void setDetails(ArrayOfBookingConditionItemDetail value) {
        this.details = value;
    }

}
