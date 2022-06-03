
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StarClassId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StarClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LandingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableRooms" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelResult" minOccurs="0"/&gt;
 *         &lt;element name="LowestPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelService", propOrder = {
    "hotelId",
    "hotelName",
    "locationId",
    "locationName",
    "starClassId",
    "starClassName",
    "landingURL",
    "availableRooms",
    "lowestPrice"
})
@XmlSeeAlso({
    HotelServiceExtented.class
})
public class HotelService {

    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "HotelName")
    protected String hotelName;
    @XmlElement(name = "LocationId")
    protected int locationId;
    @XmlElement(name = "LocationName")
    protected String locationName;
    @XmlElement(name = "StarClassId")
    protected int starClassId;
    @XmlElement(name = "StarClassName")
    protected String starClassName;
    @XmlElement(name = "LandingURL")
    protected String landingURL;
    @XmlElement(name = "AvailableRooms")
    protected ArrayOfHotelResult availableRooms;
    @XmlElement(name = "LowestPrice", required = true)
    protected BigDecimal lowestPrice;

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
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the starClassId property.
     * 
     */
    public int getStarClassId() {
        return starClassId;
    }

    /**
     * Sets the value of the starClassId property.
     * 
     */
    public void setStarClassId(int value) {
        this.starClassId = value;
    }

    /**
     * Gets the value of the starClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarClassName() {
        return starClassName;
    }

    /**
     * Sets the value of the starClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarClassName(String value) {
        this.starClassName = value;
    }

    /**
     * Gets the value of the landingURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingURL() {
        return landingURL;
    }

    /**
     * Sets the value of the landingURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingURL(String value) {
        this.landingURL = value;
    }

    /**
     * Gets the value of the availableRooms property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelResult }
     *     
     */
    public ArrayOfHotelResult getAvailableRooms() {
        return availableRooms;
    }

    /**
     * Sets the value of the availableRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelResult }
     *     
     */
    public void setAvailableRooms(ArrayOfHotelResult value) {
        this.availableRooms = value;
    }

    /**
     * Gets the value of the lowestPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    /**
     * Sets the value of the lowestPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowestPrice(BigDecimal value) {
        this.lowestPrice = value;
    }

}
