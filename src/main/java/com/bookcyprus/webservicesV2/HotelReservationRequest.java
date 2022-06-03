
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="MealId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Occupancy" type="{http://webservicesV2.bookcyprus.com/}HotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GuestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedBookingPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ClientNationality" type="{http://webservicesV2.bookcyprus.com/}ClientNationalityInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationRequest", propOrder = {
    "hotelId",
    "roomId",
    "mealId",
    "providerId",
    "occupancy",
    "fromDate",
    "toDate",
    "guestName",
    "groupIdentifier",
    "expectedBookingPrice",
    "clientNationality"
})
public class HotelReservationRequest {

    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "RoomId")
    protected int roomId;
    @XmlElement(name = "MealId")
    protected int mealId;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "Occupancy")
    protected HotelOccupancy occupancy;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "GuestName")
    protected String guestName;
    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;
    @XmlElement(name = "ExpectedBookingPrice", required = true)
    protected BigDecimal expectedBookingPrice;
    @XmlElement(name = "ClientNationality")
    protected ClientNationalityInfo clientNationality;

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
     * Gets the value of the guestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestName() {
        return guestName;
    }

    /**
     * Sets the value of the guestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestName(String value) {
        this.guestName = value;
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
     * Gets the value of the expectedBookingPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExpectedBookingPrice() {
        return expectedBookingPrice;
    }

    /**
     * Sets the value of the expectedBookingPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExpectedBookingPrice(BigDecimal value) {
        this.expectedBookingPrice = value;
    }

    /**
     * Gets the value of the clientNationality property.
     * 
     * @return
     *     possible object is
     *     {@link ClientNationalityInfo }
     *     
     */
    public ClientNationalityInfo getClientNationality() {
        return clientNationality;
    }

    /**
     * Sets the value of the clientNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientNationalityInfo }
     *     
     */
    public void setClientNationality(ClientNationalityInfo value) {
        this.clientNationality = value;
    }

}
