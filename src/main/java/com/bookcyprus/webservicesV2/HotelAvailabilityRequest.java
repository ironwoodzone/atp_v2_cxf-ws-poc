
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HotelAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelAvailabilityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Occupancy" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelOccupancy" minOccurs="0"/&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RegionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StarClassificationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MultiHotelIds" type="{http://webservicesV2.bookcyprus.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="TrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRatePlanCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "HotelAvailabilityRequest", propOrder = {
    "baseRequest",
    "fromDate",
    "toDate",
    "occupancy",
    "locationId",
    "regionId",
    "starClassificationId",
    "hotelId",
    "searchGroup",
    "multiHotelIds",
    "trackingCode",
    "maxRatePlanCount",
    "clientNationality"
})
public class HotelAvailabilityRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "Occupancy")
    protected ArrayOfHotelOccupancy occupancy;
    @XmlElement(name = "LocationId")
    protected int locationId;
    @XmlElement(name = "RegionId")
    protected int regionId;
    @XmlElement(name = "StarClassificationId")
    protected int starClassificationId;
    @XmlElement(name = "HotelId")
    protected int hotelId;
    @XmlElement(name = "SearchGroup")
    protected String searchGroup;
    @XmlElement(name = "MultiHotelIds")
    protected ArrayOfInt multiHotelIds;
    @XmlElement(name = "TrackingCode")
    protected String trackingCode;
    @XmlElement(name = "MaxRatePlanCount")
    protected int maxRatePlanCount;
    @XmlElement(name = "ClientNationality")
    protected ClientNationalityInfo clientNationality;

    /**
     * Gets the value of the baseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link RequestBase }
     *     
     */
    public RequestBase getBaseRequest() {
        return baseRequest;
    }

    /**
     * Sets the value of the baseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestBase }
     *     
     */
    public void setBaseRequest(RequestBase value) {
        this.baseRequest = value;
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
     * Gets the value of the occupancy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelOccupancy }
     *     
     */
    public ArrayOfHotelOccupancy getOccupancy() {
        return occupancy;
    }

    /**
     * Sets the value of the occupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelOccupancy }
     *     
     */
    public void setOccupancy(ArrayOfHotelOccupancy value) {
        this.occupancy = value;
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
     * Gets the value of the regionId property.
     * 
     */
    public int getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     */
    public void setRegionId(int value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the starClassificationId property.
     * 
     */
    public int getStarClassificationId() {
        return starClassificationId;
    }

    /**
     * Sets the value of the starClassificationId property.
     * 
     */
    public void setStarClassificationId(int value) {
        this.starClassificationId = value;
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
     * Gets the value of the searchGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchGroup() {
        return searchGroup;
    }

    /**
     * Sets the value of the searchGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchGroup(String value) {
        this.searchGroup = value;
    }

    /**
     * Gets the value of the multiHotelIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getMultiHotelIds() {
        return multiHotelIds;
    }

    /**
     * Sets the value of the multiHotelIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setMultiHotelIds(ArrayOfInt value) {
        this.multiHotelIds = value;
    }

    /**
     * Gets the value of the trackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingCode() {
        return trackingCode;
    }

    /**
     * Sets the value of the trackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingCode(String value) {
        this.trackingCode = value;
    }

    /**
     * Gets the value of the maxRatePlanCount property.
     * 
     */
    public int getMaxRatePlanCount() {
        return maxRatePlanCount;
    }

    /**
     * Sets the value of the maxRatePlanCount property.
     * 
     */
    public void setMaxRatePlanCount(int value) {
        this.maxRatePlanCount = value;
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
