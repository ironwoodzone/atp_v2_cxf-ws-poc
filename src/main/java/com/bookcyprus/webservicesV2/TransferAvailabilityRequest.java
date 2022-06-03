
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransferAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAvailabilityRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FromLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAvailabilityRequest", propOrder = {
    "baseRequest",
    "fromDate",
    "toDate",
    "fromLocationId",
    "toLocationId",
    "fromHotelId",
    "toHotelId",
    "isOneWay",
    "passengers"
})
public class TransferAvailabilityRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "FromLocationId")
    protected int fromLocationId;
    @XmlElement(name = "ToLocationId")
    protected int toLocationId;
    @XmlElement(name = "FromHotelId")
    protected int fromHotelId;
    @XmlElement(name = "ToHotelId")
    protected int toHotelId;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "Passengers")
    protected int passengers;

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
     * Gets the value of the fromLocationId property.
     * 
     */
    public int getFromLocationId() {
        return fromLocationId;
    }

    /**
     * Sets the value of the fromLocationId property.
     * 
     */
    public void setFromLocationId(int value) {
        this.fromLocationId = value;
    }

    /**
     * Gets the value of the toLocationId property.
     * 
     */
    public int getToLocationId() {
        return toLocationId;
    }

    /**
     * Sets the value of the toLocationId property.
     * 
     */
    public void setToLocationId(int value) {
        this.toLocationId = value;
    }

    /**
     * Gets the value of the fromHotelId property.
     * 
     */
    public int getFromHotelId() {
        return fromHotelId;
    }

    /**
     * Sets the value of the fromHotelId property.
     * 
     */
    public void setFromHotelId(int value) {
        this.fromHotelId = value;
    }

    /**
     * Gets the value of the toHotelId property.
     * 
     */
    public int getToHotelId() {
        return toHotelId;
    }

    /**
     * Sets the value of the toHotelId property.
     * 
     */
    public void setToHotelId(int value) {
        this.toHotelId = value;
    }

    /**
     * Gets the value of the isOneWay property.
     * 
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }

    /**
     * Sets the value of the isOneWay property.
     * 
     */
    public void setIsOneWay(boolean value) {
        this.isOneWay = value;
    }

    /**
     * Gets the value of the passengers property.
     * 
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * Sets the value of the passengers property.
     * 
     */
    public void setPassengers(int value) {
        this.passengers = value;
    }

}
