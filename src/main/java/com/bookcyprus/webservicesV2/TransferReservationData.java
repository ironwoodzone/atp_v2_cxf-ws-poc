
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferReservationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferReservationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrivalFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartureZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnArrivalZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureFlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureAirline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnDepartureZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsOneWayArrival" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferReservationData", propOrder = {
    "arrivalFlightNumber",
    "arrivalAirline",
    "arrivalTime",
    "arrivalHotel",
    "arrivalAddress",
    "arrivalCity",
    "arrivalState",
    "arrivalZip",
    "departureFlightNumber",
    "departureAirline",
    "departureTime",
    "departureHotel",
    "departureAddress",
    "departureCity",
    "departureState",
    "departureZip",
    "returnArrivalFlightNumber",
    "returnArrivalAirline",
    "returnArrivalTime",
    "returnArrivalHotel",
    "returnArrivalAddress",
    "returnArrivalCity",
    "returnArrivalState",
    "returnArrivalZip",
    "returnDepartureFlightNumber",
    "returnDepartureAirline",
    "returnDepartureTime",
    "returnDepartureHotel",
    "returnDepartureAddress",
    "returnDepartureCity",
    "returnDepartureState",
    "returnDepartureZip",
    "isOneWay",
    "isOneWayArrival"
})
public class TransferReservationData {

    @XmlElement(name = "ArrivalFlightNumber")
    protected String arrivalFlightNumber;
    @XmlElement(name = "ArrivalAirline")
    protected String arrivalAirline;
    @XmlElement(name = "ArrivalTime")
    protected String arrivalTime;
    @XmlElement(name = "ArrivalHotel")
    protected String arrivalHotel;
    @XmlElement(name = "ArrivalAddress")
    protected String arrivalAddress;
    @XmlElement(name = "ArrivalCity")
    protected String arrivalCity;
    @XmlElement(name = "ArrivalState")
    protected String arrivalState;
    @XmlElement(name = "ArrivalZip")
    protected String arrivalZip;
    @XmlElement(name = "DepartureFlightNumber")
    protected String departureFlightNumber;
    @XmlElement(name = "DepartureAirline")
    protected String departureAirline;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
    @XmlElement(name = "DepartureHotel")
    protected String departureHotel;
    @XmlElement(name = "DepartureAddress")
    protected String departureAddress;
    @XmlElement(name = "DepartureCity")
    protected String departureCity;
    @XmlElement(name = "DepartureState")
    protected String departureState;
    @XmlElement(name = "DepartureZip")
    protected String departureZip;
    @XmlElement(name = "ReturnArrivalFlightNumber")
    protected String returnArrivalFlightNumber;
    @XmlElement(name = "ReturnArrivalAirline")
    protected String returnArrivalAirline;
    @XmlElement(name = "ReturnArrivalTime")
    protected String returnArrivalTime;
    @XmlElement(name = "ReturnArrivalHotel")
    protected String returnArrivalHotel;
    @XmlElement(name = "ReturnArrivalAddress")
    protected String returnArrivalAddress;
    @XmlElement(name = "ReturnArrivalCity")
    protected String returnArrivalCity;
    @XmlElement(name = "ReturnArrivalState")
    protected String returnArrivalState;
    @XmlElement(name = "ReturnArrivalZip")
    protected String returnArrivalZip;
    @XmlElement(name = "ReturnDepartureFlightNumber")
    protected String returnDepartureFlightNumber;
    @XmlElement(name = "ReturnDepartureAirline")
    protected String returnDepartureAirline;
    @XmlElement(name = "ReturnDepartureTime")
    protected String returnDepartureTime;
    @XmlElement(name = "ReturnDepartureHotel")
    protected String returnDepartureHotel;
    @XmlElement(name = "ReturnDepartureAddress")
    protected String returnDepartureAddress;
    @XmlElement(name = "ReturnDepartureCity")
    protected String returnDepartureCity;
    @XmlElement(name = "ReturnDepartureState")
    protected String returnDepartureState;
    @XmlElement(name = "ReturnDepartureZip")
    protected String returnDepartureZip;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "IsOneWayArrival")
    protected boolean isOneWayArrival;

    /**
     * Gets the value of the arrivalFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalFlightNumber() {
        return arrivalFlightNumber;
    }

    /**
     * Sets the value of the arrivalFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalFlightNumber(String value) {
        this.arrivalFlightNumber = value;
    }

    /**
     * Gets the value of the arrivalAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirline() {
        return arrivalAirline;
    }

    /**
     * Sets the value of the arrivalAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirline(String value) {
        this.arrivalAirline = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalTime(String value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the arrivalHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalHotel() {
        return arrivalHotel;
    }

    /**
     * Sets the value of the arrivalHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalHotel(String value) {
        this.arrivalHotel = value;
    }

    /**
     * Gets the value of the arrivalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAddress() {
        return arrivalAddress;
    }

    /**
     * Sets the value of the arrivalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAddress(String value) {
        this.arrivalAddress = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalCity(String value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the arrivalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalState() {
        return arrivalState;
    }

    /**
     * Sets the value of the arrivalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalState(String value) {
        this.arrivalState = value;
    }

    /**
     * Gets the value of the arrivalZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalZip() {
        return arrivalZip;
    }

    /**
     * Sets the value of the arrivalZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalZip(String value) {
        this.arrivalZip = value;
    }

    /**
     * Gets the value of the departureFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureFlightNumber() {
        return departureFlightNumber;
    }

    /**
     * Sets the value of the departureFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureFlightNumber(String value) {
        this.departureFlightNumber = value;
    }

    /**
     * Gets the value of the departureAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirline() {
        return departureAirline;
    }

    /**
     * Sets the value of the departureAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirline(String value) {
        this.departureAirline = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the departureHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureHotel() {
        return departureHotel;
    }

    /**
     * Sets the value of the departureHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureHotel(String value) {
        this.departureHotel = value;
    }

    /**
     * Gets the value of the departureAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAddress() {
        return departureAddress;
    }

    /**
     * Sets the value of the departureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAddress(String value) {
        this.departureAddress = value;
    }

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCity(String value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the departureState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureState() {
        return departureState;
    }

    /**
     * Sets the value of the departureState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureState(String value) {
        this.departureState = value;
    }

    /**
     * Gets the value of the departureZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureZip() {
        return departureZip;
    }

    /**
     * Sets the value of the departureZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureZip(String value) {
        this.departureZip = value;
    }

    /**
     * Gets the value of the returnArrivalFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalFlightNumber() {
        return returnArrivalFlightNumber;
    }

    /**
     * Sets the value of the returnArrivalFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalFlightNumber(String value) {
        this.returnArrivalFlightNumber = value;
    }

    /**
     * Gets the value of the returnArrivalAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalAirline() {
        return returnArrivalAirline;
    }

    /**
     * Sets the value of the returnArrivalAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalAirline(String value) {
        this.returnArrivalAirline = value;
    }

    /**
     * Gets the value of the returnArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalTime() {
        return returnArrivalTime;
    }

    /**
     * Sets the value of the returnArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalTime(String value) {
        this.returnArrivalTime = value;
    }

    /**
     * Gets the value of the returnArrivalHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalHotel() {
        return returnArrivalHotel;
    }

    /**
     * Sets the value of the returnArrivalHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalHotel(String value) {
        this.returnArrivalHotel = value;
    }

    /**
     * Gets the value of the returnArrivalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalAddress() {
        return returnArrivalAddress;
    }

    /**
     * Sets the value of the returnArrivalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalAddress(String value) {
        this.returnArrivalAddress = value;
    }

    /**
     * Gets the value of the returnArrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalCity() {
        return returnArrivalCity;
    }

    /**
     * Sets the value of the returnArrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalCity(String value) {
        this.returnArrivalCity = value;
    }

    /**
     * Gets the value of the returnArrivalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalState() {
        return returnArrivalState;
    }

    /**
     * Sets the value of the returnArrivalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalState(String value) {
        this.returnArrivalState = value;
    }

    /**
     * Gets the value of the returnArrivalZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnArrivalZip() {
        return returnArrivalZip;
    }

    /**
     * Sets the value of the returnArrivalZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnArrivalZip(String value) {
        this.returnArrivalZip = value;
    }

    /**
     * Gets the value of the returnDepartureFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureFlightNumber() {
        return returnDepartureFlightNumber;
    }

    /**
     * Sets the value of the returnDepartureFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureFlightNumber(String value) {
        this.returnDepartureFlightNumber = value;
    }

    /**
     * Gets the value of the returnDepartureAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureAirline() {
        return returnDepartureAirline;
    }

    /**
     * Sets the value of the returnDepartureAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureAirline(String value) {
        this.returnDepartureAirline = value;
    }

    /**
     * Gets the value of the returnDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureTime() {
        return returnDepartureTime;
    }

    /**
     * Sets the value of the returnDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureTime(String value) {
        this.returnDepartureTime = value;
    }

    /**
     * Gets the value of the returnDepartureHotel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureHotel() {
        return returnDepartureHotel;
    }

    /**
     * Sets the value of the returnDepartureHotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureHotel(String value) {
        this.returnDepartureHotel = value;
    }

    /**
     * Gets the value of the returnDepartureAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureAddress() {
        return returnDepartureAddress;
    }

    /**
     * Sets the value of the returnDepartureAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureAddress(String value) {
        this.returnDepartureAddress = value;
    }

    /**
     * Gets the value of the returnDepartureCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureCity() {
        return returnDepartureCity;
    }

    /**
     * Sets the value of the returnDepartureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureCity(String value) {
        this.returnDepartureCity = value;
    }

    /**
     * Gets the value of the returnDepartureState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureState() {
        return returnDepartureState;
    }

    /**
     * Sets the value of the returnDepartureState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureState(String value) {
        this.returnDepartureState = value;
    }

    /**
     * Gets the value of the returnDepartureZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDepartureZip() {
        return returnDepartureZip;
    }

    /**
     * Sets the value of the returnDepartureZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDepartureZip(String value) {
        this.returnDepartureZip = value;
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
     * Gets the value of the isOneWayArrival property.
     * 
     */
    public boolean isIsOneWayArrival() {
        return isOneWayArrival;
    }

    /**
     * Sets the value of the isOneWayArrival property.
     * 
     */
    public void setIsOneWayArrival(boolean value) {
        this.isOneWayArrival = value;
    }

}
