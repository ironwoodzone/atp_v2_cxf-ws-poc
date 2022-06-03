
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingConditionsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingConditionsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="HotelRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="CarRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="TransferRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionReservationRequest" minOccurs="0"/&gt;
 *         &lt;element name="RoundtripRequest" type="{http://webservicesV2.bookcyprus.com/}RoundtripReservationRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingConditionsRequest", propOrder = {
    "baseRequest",
    "hotelRequests",
    "carRequests",
    "transferRequests",
    "excursionRequests",
    "roundtripRequest"
})
public class BookingConditionsRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
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

}
