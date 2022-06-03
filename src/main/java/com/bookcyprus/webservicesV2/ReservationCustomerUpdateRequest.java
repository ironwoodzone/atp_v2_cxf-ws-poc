
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationCustomerUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationCustomerUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ReservationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="ClientDetails" type="{http://webservicesV2.bookcyprus.com/}ReservationClientDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationCustomerUpdateRequest", propOrder = {
    "reservationId",
    "reservationCode",
    "baseRequest",
    "clientDetails"
})
public class ReservationCustomerUpdateRequest {

    @XmlElement(name = "ReservationId")
    protected int reservationId;
    @XmlElement(name = "ReservationCode")
    protected String reservationCode;
    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "ClientDetails")
    protected ReservationClientDetails clientDetails;

    /**
     * Gets the value of the reservationId property.
     * 
     */
    public int getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     */
    public void setReservationId(int value) {
        this.reservationId = value;
    }

    /**
     * Gets the value of the reservationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationCode() {
        return reservationCode;
    }

    /**
     * Sets the value of the reservationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationCode(String value) {
        this.reservationCode = value;
    }

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
     * Gets the value of the clientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationClientDetails }
     *     
     */
    public ReservationClientDetails getClientDetails() {
        return clientDetails;
    }

    /**
     * Sets the value of the clientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationClientDetails }
     *     
     */
    public void setClientDetails(ReservationClientDetails value) {
        this.clientDetails = value;
    }

}
