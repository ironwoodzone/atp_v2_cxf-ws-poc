
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransferAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferAvailabilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FromLocation" type="{http://webservicesV2.bookcyprus.com/}Location" minOccurs="0"/&gt;
 *         &lt;element name="ToLocation" type="{http://webservicesV2.bookcyprus.com/}Location" minOccurs="0"/&gt;
 *         &lt;element name="FromHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromHotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToHotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferServices" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferService" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferAvailabilityResponse", propOrder = {
    "baseResponse",
    "resultCount",
    "currency",
    "token",
    "fromDate",
    "toDate",
    "fromLocation",
    "toLocation",
    "fromHotelId",
    "fromHotelName",
    "toHotelId",
    "toHotelName",
    "isOneWay",
    "passengers",
    "transferServices"
})
public class TransferAvailabilityResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "FromLocation")
    protected Location fromLocation;
    @XmlElement(name = "ToLocation")
    protected Location toLocation;
    @XmlElement(name = "FromHotelId")
    protected int fromHotelId;
    @XmlElement(name = "FromHotelName")
    protected String fromHotelName;
    @XmlElement(name = "ToHotelId")
    protected int toHotelId;
    @XmlElement(name = "ToHotelName")
    protected String toHotelName;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "Passengers")
    protected int passengers;
    @XmlElement(name = "TransferServices")
    protected ArrayOfTransferService transferServices;

    /**
     * Gets the value of the baseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBase }
     *     
     */
    public ResponseBase getBaseResponse() {
        return baseResponse;
    }

    /**
     * Sets the value of the baseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBase }
     *     
     */
    public void setBaseResponse(ResponseBase value) {
        this.baseResponse = value;
    }

    /**
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
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
     * Gets the value of the fromLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getFromLocation() {
        return fromLocation;
    }

    /**
     * Sets the value of the fromLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setFromLocation(Location value) {
        this.fromLocation = value;
    }

    /**
     * Gets the value of the toLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getToLocation() {
        return toLocation;
    }

    /**
     * Sets the value of the toLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setToLocation(Location value) {
        this.toLocation = value;
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
     * Gets the value of the fromHotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromHotelName() {
        return fromHotelName;
    }

    /**
     * Sets the value of the fromHotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromHotelName(String value) {
        this.fromHotelName = value;
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
     * Gets the value of the toHotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToHotelName() {
        return toHotelName;
    }

    /**
     * Sets the value of the toHotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToHotelName(String value) {
        this.toHotelName = value;
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

    /**
     * Gets the value of the transferServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferService }
     *     
     */
    public ArrayOfTransferService getTransferServices() {
        return transferServices;
    }

    /**
     * Sets the value of the transferServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferService }
     *     
     */
    public void setTransferServices(ArrayOfTransferService value) {
        this.transferServices = value;
    }

}
