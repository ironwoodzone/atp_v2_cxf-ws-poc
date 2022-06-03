
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelResultRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelResultRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ammenities" type="{http://webservicesV2.bookcyprus.com/}ArrayOfString" minOccurs="0"/&gt;
 *         &lt;element name="RoomCnt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RoomRates" type="{http://webservicesV2.bookcyprus.com/}ArrayOfServiceRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelResultRoom", propOrder = {
    "roomId",
    "room",
    "description",
    "ammenities",
    "roomCnt",
    "isOnRequest",
    "roomRates"
})
public class HotelResultRoom {

    @XmlElement(name = "RoomId")
    protected int roomId;
    @XmlElement(name = "Room")
    protected String room;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Ammenities")
    protected ArrayOfString ammenities;
    @XmlElement(name = "RoomCnt")
    protected int roomCnt;
    @XmlElement(name = "IsOnRequest")
    protected boolean isOnRequest;
    @XmlElement(name = "RoomRates")
    protected ArrayOfServiceRate roomRates;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ammenities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAmmenities() {
        return ammenities;
    }

    /**
     * Sets the value of the ammenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAmmenities(ArrayOfString value) {
        this.ammenities = value;
    }

    /**
     * Gets the value of the roomCnt property.
     * 
     */
    public int getRoomCnt() {
        return roomCnt;
    }

    /**
     * Sets the value of the roomCnt property.
     * 
     */
    public void setRoomCnt(int value) {
        this.roomCnt = value;
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
     * Gets the value of the roomRates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRate }
     *     
     */
    public ArrayOfServiceRate getRoomRates() {
        return roomRates;
    }

    /**
     * Sets the value of the roomRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRate }
     *     
     */
    public void setRoomRates(ArrayOfServiceRate value) {
        this.roomRates = value;
    }

}
