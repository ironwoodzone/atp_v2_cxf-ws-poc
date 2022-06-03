
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationDetailId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Hotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RoomIndx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MealId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Meal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Occupancy" type="{http://webservicesV2.bookcyprus.com/}HotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsNonRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CancellationFeePaid" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CancellationFeeIfCancelledToday" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CancellationPolicy" type="{http://webservicesV2.bookcyprus.com/}ArrayOfBookingConditionItemDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationResponse", propOrder = {
    "reservationDetailId",
    "hotelId",
    "hotel",
    "roomId",
    "room",
    "isOnRequest",
    "roomIndx",
    "mealId",
    "meal",
    "occupancy",
    "fromDate",
    "toDate",
    "amount",
    "status",
    "groupIdentifier",
    "providerId",
    "isNonRef",
    "cancellationFeePaid",
    "cancellationFeeIfCancelledToday",
    "cancellationPolicy"
})
public class HotelReservationResponse {

    @XmlElement(name = "ReservationDetailId")
    protected int reservationDetailId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "Hotel")
    protected String hotel;
    @XmlElement(name = "RoomId")
    protected int roomId;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "IsOnRequest")
    protected boolean isOnRequest;
    @XmlElement(name = "RoomIndx")
    protected String roomIndx;
    @XmlElement(name = "MealId")
    protected int mealId;
    @XmlElement(name = "Meal")
    protected String meal;
    @XmlElement(name = "Occupancy")
    protected HotelOccupancy occupancy;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "IsNonRef")
    protected boolean isNonRef;
    @XmlElement(name = "CancellationFeePaid", required = true)
    protected BigDecimal cancellationFeePaid;
    @XmlElement(name = "CancellationFeeIfCancelledToday", required = true)
    protected BigDecimal cancellationFeeIfCancelledToday;
    @XmlElement(name = "CancellationPolicy")
    protected ArrayOfBookingConditionItemDetail cancellationPolicy;

    /**
     * Gets the value of the reservationDetailId property.
     * 
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }

    /**
     * Sets the value of the reservationDetailId property.
     * 
     */
    public void setReservationDetailId(int value) {
        this.reservationDetailId = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     */
    public int getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     */
    public void setHotelId(int value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotel(String value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the roomId property.
     * 
     */
    public int getRoomId() {
        return roomId;
    }

    /**
     * Sets the value of the roomId property.
     * 
     */
    public void setRoomId(int value) {
        this.roomId = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
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
     * Gets the value of the roomIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomIndx() {
        return roomIndx;
    }

    /**
     * Sets the value of the roomIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomIndx(String value) {
        this.roomIndx = value;
    }

    /**
     * Gets the value of the mealId property.
     * 
     */
    public int getMealId() {
        return mealId;
    }

    /**
     * Sets the value of the mealId property.
     * 
     */
    public void setMealId(int value) {
        this.mealId = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeal(String value) {
        this.meal = value;
    }

    /**
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link HotelOccupancy }
     *     
     */
    public HotelOccupancy getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelOccupancy }
     *     
     */
    public void setOccupancy(HotelOccupancy value) {
        this.occupancy = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
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
     * Gets the value of the groupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * Sets the value of the groupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIdentifier(String value) {
        this.groupIdentifier = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     */
    public void setProviderId(int value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the isNonRef property.
     * 
     */
    public boolean isIsNonRef() {
        return isNonRef;
    }

    /**
     * Sets the value of the isNonRef property.
     * 
     */
    public void setIsNonRef(boolean value) {
        this.isNonRef = value;
    }

    /**
     * Gets the value of the cancellationFeePaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancellationFeePaid() {
        return cancellationFeePaid;
    }

    /**
     * Sets the value of the cancellationFeePaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancellationFeePaid(BigDecimal value) {
        this.cancellationFeePaid = value;
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

    /**
     * Gets the value of the cancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public ArrayOfBookingConditionItemDetail getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Sets the value of the cancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public void setCancellationPolicy(ArrayOfBookingConditionItemDetail value) {
        this.cancellationPolicy = value;
    }

}
