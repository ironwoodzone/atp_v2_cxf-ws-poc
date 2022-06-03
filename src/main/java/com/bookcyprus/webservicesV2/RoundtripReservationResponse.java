
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RoundtripReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoundtripName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RoomOccupancies" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="CancellationFeeIfCancelledToday" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundtripReservationResponse", propOrder = {
    "roundtripId",
    "roundtripName",
    "isOnRequest",
    "startDate",
    "totalPrice",
    "roomOccupancies",
    "cancellationFeeIfCancelledToday"
})
public class RoundtripReservationResponse {

    @XmlElement(name = "RoundtripId")
    protected int roundtripId;
    @XmlElement(name = "RoundtripName")
    protected String roundtripName;
    @XmlElement(name = "IsOnRequest")
    protected boolean isOnRequest;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "RoomOccupancies")
    protected ArrayOfHotelOccupancy roomOccupancies;
    @XmlElement(name = "CancellationFeeIfCancelledToday", required = true)
    protected BigDecimal cancellationFeeIfCancelledToday;

    /**
     * Gets the value of the roundtripId property.
     * 
     */
    public int getRoundtripId() {
        return roundtripId;
    }

    /**
     * Sets the value of the roundtripId property.
     * 
     */
    public void setRoundtripId(int value) {
        this.roundtripId = value;
    }

    /**
     * Gets the value of the roundtripName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundtripName() {
        return roundtripName;
    }

    /**
     * Sets the value of the roundtripName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundtripName(String value) {
        this.roundtripName = value;
    }

    /**
     * Gets the value of the isOnRequest property.
     * 
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }

    /**
     * Sets the value of the isOnRequest property.
     * 
     */
    public void setIsOnRequest(boolean value) {
        this.isOnRequest = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the roomOccupancies property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelOccupancy }
     *     
     */
    public ArrayOfHotelOccupancy getRoomOccupancies() {
        return roomOccupancies;
    }

    /**
     * Sets the value of the roomOccupancies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelOccupancy }
     *     
     */
    public void setRoomOccupancies(ArrayOfHotelOccupancy value) {
        this.roomOccupancies = value;
    }

    /**
     * Gets the value of the cancellationFeeIfCancelledToday property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancellationFeeIfCancelledToday() {
        return cancellationFeeIfCancelledToday;
    }

    /**
     * Sets the value of the cancellationFeeIfCancelledToday property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancellationFeeIfCancelledToday(BigDecimal value) {
        this.cancellationFeeIfCancelledToday = value;
    }

}
