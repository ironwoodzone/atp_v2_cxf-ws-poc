
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Occupancy" type="{http://webservicesV2.bookcyprus.com/}HotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="Rooms" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelResultRoom" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResult", propOrder = {
    "occupancy",
    "rooms"
})
public class HotelResult {

    @XmlElement(name = "Occupancy")
    protected HotelOccupancy occupancy;
    @XmlElement(name = "Rooms")
    protected ArrayOfHotelResultRoom rooms;

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
     * Gets the value of the rooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelResultRoom }
     *     
     */
    public ArrayOfHotelResultRoom getRooms() {
        return rooms;
    }

    /**
     * Sets the value of the rooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelResultRoom }
     *     
     */
    public void setRooms(ArrayOfHotelResultRoom value) {
        this.rooms = value;
    }

}
