
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransferReservationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferReservationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToLocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FromTimeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToTimeString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Passengers" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExternalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransferData" type="{http://webservicesV2.bookcyprus.com/}TransferReservationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferReservationRequest", propOrder = {
    "vehicleId",
    "transferServiceId",
    "fromLocationId",
    "toLocationId",
    "fromHotelId",
    "toHotelId",
    "fromDate",
    "toDate",
    "fromTimeString",
    "toTimeString",
    "numberOfVehicles",
    "isOneWay",
    "passengers",
    "externalData",
    "transferData"
})
public class TransferReservationRequest {

    @XmlElement(name = "VehicleId")
    protected int vehicleId;
    @XmlElement(name = "TransferServiceId")
    protected int transferServiceId;
    @XmlElement(name = "FromLocationId")
    protected int fromLocationId;
    @XmlElement(name = "ToLocationId")
    protected int toLocationId;
    @XmlElement(name = "FromHotelId")
    protected int fromHotelId;
    @XmlElement(name = "ToHotelId")
    protected int toHotelId;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "FromTimeString")
    protected String fromTimeString;
    @XmlElement(name = "ToTimeString")
    protected String toTimeString;
    @XmlElement(name = "NumberOfVehicles")
    protected int numberOfVehicles;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "Passengers")
    protected int passengers;
    @XmlElement(name = "ExternalData")
    protected String externalData;
    @XmlElement(name = "TransferData")
    protected TransferReservationData transferData;

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
     * Gets the value of the transferServiceId property.
     * 
     */
    public int getTransferServiceId() {
        return transferServiceId;
    }

    /**
     * Sets the value of the transferServiceId property.
     * 
     */
    public void setTransferServiceId(int value) {
        this.transferServiceId = value;
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
     * Gets the value of the fromTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTimeString() {
        return fromTimeString;
    }

    /**
     * Sets the value of the fromTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTimeString(String value) {
        this.fromTimeString = value;
    }

    /**
     * Gets the value of the toTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTimeString() {
        return toTimeString;
    }

    /**
     * Sets the value of the toTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTimeString(String value) {
        this.toTimeString = value;
    }

    /**
     * Gets the value of the numberOfVehicles property.
     * 
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Sets the value of the numberOfVehicles property.
     * 
     */
    public void setNumberOfVehicles(int value) {
        this.numberOfVehicles = value;
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

    /**
     * Gets the value of the transferData property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReservationData }
     *     
     */
    public TransferReservationData getTransferData() {
        return transferData;
    }

    /**
     * Sets the value of the transferData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReservationData }
     *     
     */
    public void setTransferData(TransferReservationData value) {
        this.transferData = value;
    }

}
