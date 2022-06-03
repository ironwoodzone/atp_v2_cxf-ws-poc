
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelAvailabilitySearchResult" type="{http://webservicesV2.bookcyprus.com/}HotelAvailabilityResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelAvailabilitySearchResult"
})
@XmlRootElement(name = "HotelAvailabilitySearchResponse")
public class HotelAvailabilitySearchResponse {

    @XmlElement(name = "HotelAvailabilitySearchResult")
    protected HotelAvailabilityResponse hotelAvailabilitySearchResult;

    /**
     * Gets the value of the hotelAvailabilitySearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAvailabilityResponse }
     *     
     */
    public HotelAvailabilityResponse getHotelAvailabilitySearchResult() {
        return hotelAvailabilitySearchResult;
    }

    /**
     * Sets the value of the hotelAvailabilitySearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAvailabilityResponse }
     *     
     */
    public void setHotelAvailabilitySearchResult(HotelAvailabilityResponse value) {
        this.hotelAvailabilitySearchResult = value;
    }

}
