
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundtripListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoundtripName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Locations" type="{http://webservicesV2.bookcyprus.com/}ArrayOfRoundtripLocation" minOccurs="0"/&gt;
 *         &lt;element name="RountripTypes" type="{http://webservicesV2.bookcyprus.com/}ArrayOfRoundtripType" minOccurs="0"/&gt;
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDates" type="{http://webservicesV2.bookcyprus.com/}ArrayOfDepartureDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundtripListItem", propOrder = {
    "roundtripId",
    "roundtripName",
    "fromPrice",
    "duration",
    "locations",
    "rountripTypes",
    "imagePath",
    "description",
    "departureDates"
})
public class RoundtripListItem {

    @XmlElement(name = "RoundtripId")
    protected int roundtripId;
    @XmlElement(name = "RoundtripName")
    protected String roundtripName;
    @XmlElement(name = "FromPrice", required = true)
    protected BigDecimal fromPrice;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "Locations")
    protected ArrayOfRoundtripLocation locations;
    @XmlElement(name = "RountripTypes")
    protected ArrayOfRoundtripType rountripTypes;
    @XmlElement(name = "ImagePath")
    protected String imagePath;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DepartureDates")
    protected ArrayOfDepartureDate departureDates;

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
     * Gets the value of the fromPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromPrice() {
        return fromPrice;
    }

    /**
     * Sets the value of the fromPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromPrice(BigDecimal value) {
        this.fromPrice = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     */
    public void setDuration(int value) {
        this.duration = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoundtripLocation }
     *     
     */
    public ArrayOfRoundtripLocation getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoundtripLocation }
     *     
     */
    public void setLocations(ArrayOfRoundtripLocation value) {
        this.locations = value;
    }

    /**
     * Gets the value of the rountripTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoundtripType }
     *     
     */
    public ArrayOfRoundtripType getRountripTypes() {
        return rountripTypes;
    }

    /**
     * Sets the value of the rountripTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoundtripType }
     *     
     */
    public void setRountripTypes(ArrayOfRoundtripType value) {
        this.rountripTypes = value;
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
     * Gets the value of the departureDates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartureDate }
     *     
     */
    public ArrayOfDepartureDate getDepartureDates() {
        return departureDates;
    }

    /**
     * Sets the value of the departureDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartureDate }
     *     
     */
    public void setDepartureDates(ArrayOfDepartureDate value) {
        this.departureDates = value;
    }

}
