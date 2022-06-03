
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelServiceExtented complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelServiceExtented"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservicesV2.bookcyprus.com/}HotelService"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoomsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecreationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiningDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POIDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Policies" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Longtitue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Popularity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Media" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelServiceMedia" minOccurs="0"/&gt;
 *         &lt;element name="Rooms" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelResultRoom" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelServiceExtented", propOrder = {
    "shortDescription",
    "longDescription",
    "roomsDescription",
    "recreationDescription",
    "diningDescription",
    "poiDescription",
    "policies",
    "latitude",
    "longtitue",
    "popularity",
    "imagePath",
    "media",
    "rooms"
})
public class HotelServiceExtented
    extends HotelService
{

    @XmlElement(name = "ShortDescription")
    protected String shortDescription;
    @XmlElement(name = "LongDescription")
    protected String longDescription;
    @XmlElement(name = "RoomsDescription")
    protected String roomsDescription;
    @XmlElement(name = "RecreationDescription")
    protected String recreationDescription;
    @XmlElement(name = "DiningDescription")
    protected String diningDescription;
    @XmlElement(name = "POIDescription")
    protected String poiDescription;
    @XmlElement(name = "Policies")
    protected String policies;
    @XmlElement(name = "Latitude")
    protected String latitude;
    @XmlElement(name = "Longtitue")
    protected String longtitue;
    @XmlElement(name = "Popularity")
    protected int popularity;
    @XmlElement(name = "ImagePath")
    protected String imagePath;
    @XmlElement(name = "Media")
    protected ArrayOfHotelServiceMedia media;
    @XmlElement(name = "Rooms")
    protected ArrayOfHotelResultRoom rooms;

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the longDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets the value of the longDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Gets the value of the roomsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomsDescription() {
        return roomsDescription;
    }

    /**
     * Sets the value of the roomsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomsDescription(String value) {
        this.roomsDescription = value;
    }

    /**
     * Gets the value of the recreationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecreationDescription() {
        return recreationDescription;
    }

    /**
     * Sets the value of the recreationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecreationDescription(String value) {
        this.recreationDescription = value;
    }

    /**
     * Gets the value of the diningDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiningDescription() {
        return diningDescription;
    }

    /**
     * Sets the value of the diningDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiningDescription(String value) {
        this.diningDescription = value;
    }

    /**
     * Gets the value of the poiDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIDescription() {
        return poiDescription;
    }

    /**
     * Sets the value of the poiDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIDescription(String value) {
        this.poiDescription = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicies(String value) {
        this.policies = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longtitue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongtitue() {
        return longtitue;
    }

    /**
     * Sets the value of the longtitue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongtitue(String value) {
        this.longtitue = value;
    }

    /**
     * Gets the value of the popularity property.
     * 
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Sets the value of the popularity property.
     * 
     */
    public void setPopularity(int value) {
        this.popularity = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelServiceMedia }
     *     
     */
    public ArrayOfHotelServiceMedia getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelServiceMedia }
     *     
     */
    public void setMedia(ArrayOfHotelServiceMedia value) {
        this.media = value;
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
