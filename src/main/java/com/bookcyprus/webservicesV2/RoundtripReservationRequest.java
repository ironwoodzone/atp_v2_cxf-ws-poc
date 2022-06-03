
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RoundtripReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RoomOccupancies" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="CustomItineraries" type="{http://webservicesV2.bookcyprus.com/}ArrayOfItinerary" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://webservicesV2.bookcyprus.com/}Language" minOccurs="0"/&gt;
 *         &lt;element name="Travellers" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTraveller" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundtripReservationRequest", propOrder = {
    "roundtripId",
    "startDate",
    "roomOccupancies",
    "customItineraries",
    "language",
    "travellers"
})
public class RoundtripReservationRequest {

    @XmlElement(name = "RoundtripId")
    protected int roundtripId;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "RoomOccupancies")
    protected ArrayOfHotelOccupancy roomOccupancies;
    @XmlElement(name = "CustomItineraries")
    protected ArrayOfItinerary customItineraries;
    @XmlElement(name = "Language")
    protected Language language;
    @XmlElement(name = "Travellers")
    protected ArrayOfTraveller travellers;

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
     * Gets the value of the customItineraries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItinerary }
     *     
     */
    public ArrayOfItinerary getCustomItineraries() {
        return customItineraries;
    }

    /**
     * Sets the value of the customItineraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItinerary }
     *     
     */
    public void setCustomItineraries(ArrayOfItinerary value) {
        this.customItineraries = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguage(Language value) {
        this.language = value;
    }

    /**
     * Gets the value of the travellers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTraveller }
     *     
     */
    public ArrayOfTraveller getTravellers() {
        return travellers;
    }

    /**
     * Sets the value of the travellers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTraveller }
     *     
     */
    public void setTravellers(ArrayOfTraveller value) {
        this.travellers = value;
    }

}
