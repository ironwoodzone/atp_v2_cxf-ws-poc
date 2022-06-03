
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransferReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationDetailId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VehicleTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromLocation" type="{http://webservicesV2.bookcyprus.com/}Location" minOccurs="0"/&gt;
 *         &lt;element name="ToLocation" type="{http://webservicesV2.bookcyprus.com/}Location" minOccurs="0"/&gt;
 *         &lt;element name="FromHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FromHotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToHotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToHotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExternalData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPolicy" type="{http://webservicesV2.bookcyprus.com/}ArrayOfBookingConditionItemDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferReservationResponse", propOrder = {
    "reservationDetailId",
    "transferServiceId",
    "transferServiceName",
    "vehicleId",
    "vehicleTypeName",
    "fromLocation",
    "toLocation",
    "fromHotelId",
    "fromHotelName",
    "toHotelId",
    "toHotelName",
    "fromDate",
    "toDate",
    "numberOfVehicles",
    "isOneWay",
    "amount",
    "status",
    "externalData",
    "cancellationPolicy"
})
public class TransferReservationResponse {

    @XmlElement(name = "ReservationDetailId")
    protected int reservationDetailId;
    @XmlElement(name = "TransferServiceId")
    protected int transferServiceId;
    @XmlElement(name = "TransferServiceName")
    protected String transferServiceName;
    @XmlElement(name = "VehicleId")
    protected int vehicleId;
    @XmlElement(name = "VehicleTypeName")
    protected String vehicleTypeName;
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
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "NumberOfVehicles")
    protected int numberOfVehicles;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ExternalData")
    protected String externalData;
    @XmlElement(name = "CancellationPolicy")
    protected ArrayOfBookingConditionItemDetail cancellationPolicy;

    /**
     * Gets the value of the reservationDetailId property.
     * 
     */
    public int getReservationDetailId() {
        return reservationDetailId;
    }

    /**
     * Sets the value of the reservationDetailId property.
     * 
     */
    public void setReservationDetailId(int value) {
        this.reservationDetailId = value;
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
     * Gets the value of the transferServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferServiceName() {
        return transferServiceName;
    }

    /**
     * Sets the value of the transferServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferServiceName(String value) {
        this.transferServiceName = value;
    }

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
     * Gets the value of the vehicleTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    /**
     * Sets the value of the vehicleTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeName(String value) {
        this.vehicleTypeName = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the cancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public ArrayOfBookingConditionItemDetail getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Sets the value of the cancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public void setCancellationPolicy(ArrayOfBookingConditionItemDetail value) {
        this.cancellationPolicy = value;
    }

}
