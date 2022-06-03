
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationDetailId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VehicleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Supplements" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarGroupSupplement" minOccurs="0"/&gt;
 *         &lt;element name="PickupPointLocation" type="{http://webservicesV2.bookcyprus.com/}Location" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "CarReservationResponse", propOrder = {
    "reservationDetailId",
    "carServiceId",
    "carServiceName",
    "vehicleId",
    "vehicleDescription",
    "supplements",
    "pickupPointLocation",
    "fromDate",
    "toDate",
    "amount",
    "status",
    "externalData",
    "cancellationPolicy"
})
public class CarReservationResponse {

    @XmlElement(name = "ReservationDetailId")
    protected int reservationDetailId;
    @XmlElement(name = "CarServiceId")
    protected int carServiceId;
    @XmlElement(name = "CarServiceName")
    protected String carServiceName;
    @XmlElement(name = "VehicleId")
    protected int vehicleId;
    @XmlElement(name = "VehicleDescription")
    protected String vehicleDescription;
    @XmlElement(name = "Supplements")
    protected ArrayOfCarGroupSupplement supplements;
    @XmlElement(name = "PickupPointLocation")
    protected Location pickupPointLocation;
    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
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
     * Gets the value of the carServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarServiceName() {
        return carServiceName;
    }

    /**
     * Sets the value of the carServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarServiceName(String value) {
        this.carServiceName = value;
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
     * Gets the value of the vehicleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDescription() {
        return vehicleDescription;
    }

    /**
     * Sets the value of the vehicleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDescription(String value) {
        this.vehicleDescription = value;
    }

    /**
     * Gets the value of the supplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarGroupSupplement }
     *     
     */
    public ArrayOfCarGroupSupplement getSupplements() {
        return supplements;
    }

    /**
     * Sets the value of the supplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarGroupSupplement }
     *     
     */
    public void setSupplements(ArrayOfCarGroupSupplement value) {
        this.supplements = value;
    }

    /**
     * Gets the value of the pickupPointLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getPickupPointLocation() {
        return pickupPointLocation;
    }

    /**
     * Sets the value of the pickupPointLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setPickupPointLocation(Location value) {
        this.pickupPointLocation = value;
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
