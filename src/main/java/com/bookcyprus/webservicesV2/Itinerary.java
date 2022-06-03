
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Itinerary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Itinerary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Stays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItineraryServices" type="{http://webservicesV2.bookcyprus.com/}ArrayOfItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeItineraryServices" type="{http://webservicesV2.bookcyprus.com/}ArrayOfItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Itinerary", propOrder = {
    "itineraryId",
    "title",
    "startDay",
    "stays",
    "imagePath",
    "itineraryServices",
    "alternativeItineraryServices",
    "description"
})
public class Itinerary {

    @XmlElement(name = "ItineraryId")
    protected int itineraryId;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "StartDay")
    protected int startDay;
    @XmlElement(name = "Stays")
    protected int stays;
    @XmlElement(name = "ImagePath")
    protected String imagePath;
    @XmlElement(name = "ItineraryServices")
    protected ArrayOfItineraryService itineraryServices;
    @XmlElement(name = "AlternativeItineraryServices")
    protected ArrayOfItineraryService alternativeItineraryServices;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the itineraryId property.
     * 
     */
    public int getItineraryId() {
        return itineraryId;
    }

    /**
     * Sets the value of the itineraryId property.
     * 
     */
    public void setItineraryId(int value) {
        this.itineraryId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the startDay property.
     * 
     */
    public int getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     */
    public void setStartDay(int value) {
        this.startDay = value;
    }

    /**
     * Gets the value of the stays property.
     * 
     */
    public int getStays() {
        return stays;
    }

    /**
     * Sets the value of the stays property.
     * 
     */
    public void setStays(int value) {
        this.stays = value;
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
     * Gets the value of the itineraryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItineraryService }
     *     
     */
    public ArrayOfItineraryService getItineraryServices() {
        return itineraryServices;
    }

    /**
     * Sets the value of the itineraryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItineraryService }
     *     
     */
    public void setItineraryServices(ArrayOfItineraryService value) {
        this.itineraryServices = value;
    }

    /**
     * Gets the value of the alternativeItineraryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItineraryService }
     *     
     */
    public ArrayOfItineraryService getAlternativeItineraryServices() {
        return alternativeItineraryServices;
    }

    /**
     * Sets the value of the alternativeItineraryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItineraryService }
     *     
     */
    public void setAlternativeItineraryServices(ArrayOfItineraryService value) {
        this.alternativeItineraryServices = value;
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

}
