
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PickupPointLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TimeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverAge" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupplementIds" type="{http://webservicesV2.bookcyprus.com/}ArrayOfInt" minOccurs="0"/&gt;
 *         &lt;element name="ExternalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarReservationRequest", propOrder = {
    "vehicleId",
    "carServiceId",
    "pickupPointLocationId",
    "fromDate",
    "toDate",
    "timeFrom",
    "timeTo",
    "driverAge",
    "supplementIds",
    "externalData"
})
public class CarReservationRequest {

    @XmlElement(name = "VehicleId")
    protected int vehicleId;
    @XmlElement(name = "CarServiceId")
    protected int carServiceId;
    @XmlElement(name = "PickupPointLocationId")
    protected int pickupPointLocationId;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "TimeFrom")
    protected String timeFrom;
    @XmlElement(name = "TimeTo")
    protected String timeTo;
    @XmlElement(name = "DriverAge")
    protected int driverAge;
    @XmlElement(name = "SupplementIds")
    protected ArrayOfInt supplementIds;
    @XmlElement(name = "ExternalData")
    protected String externalData;

    /**
     * Gets the value of the vehicleId property.
     * 
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     */
    public void setVehicleId(int value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the carServiceId property.
     * 
     */
    public int getCarServiceId() {
        return carServiceId;
    }

    /**
     * Sets the value of the carServiceId property.
     * 
     */
    public void setCarServiceId(int value) {
        this.carServiceId = value;
    }

    /**
     * Gets the value of the pickupPointLocationId property.
     * 
     */
    public int getPickupPointLocationId() {
        return pickupPointLocationId;
    }

    /**
     * Sets the value of the pickupPointLocationId property.
     * 
     */
    public void setPickupPointLocationId(int value) {
        this.pickupPointLocationId = value;
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
     * Gets the value of the timeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFrom() {
        return timeFrom;
    }

    /**
     * Sets the value of the timeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFrom(String value) {
        this.timeFrom = value;
    }

    /**
     * Gets the value of the timeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTo() {
        return timeTo;
    }

    /**
     * Sets the value of the timeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTo(String value) {
        this.timeTo = value;
    }

    /**
     * Gets the value of the driverAge property.
     * 
     */
    public int getDriverAge() {
        return driverAge;
    }

    /**
     * Sets the value of the driverAge property.
     * 
     */
    public void setDriverAge(int value) {
        this.driverAge = value;
    }

    /**
     * Gets the value of the supplementIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getSupplementIds() {
        return supplementIds;
    }

    /**
     * Sets the value of the supplementIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setSupplementIds(ArrayOfInt value) {
        this.supplementIds = value;
    }

    /**
     * Gets the value of the externalData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalData() {
        return externalData;
    }

    /**
     * Sets the value of the externalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalData(String value) {
        this.externalData = value;
    }

}
