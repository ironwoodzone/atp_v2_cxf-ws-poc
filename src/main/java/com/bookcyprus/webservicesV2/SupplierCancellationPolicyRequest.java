
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierCancellationPolicyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierCancellationPolicyRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseRequest" type="{http://webservicesV2.bookcyprus.com/}RequestBase" minOccurs="0"/&gt;
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IndicativeServiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="HotelRequests" type="{http://webservicesV2.bookcyprus.com/}ArrayOfHotelReservationRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierCancellationPolicyRequest", propOrder = {
    "baseRequest",
    "supplierId",
    "checkinDate",
    "indicativeServiceAmount",
    "hotelRequests"
})
public class SupplierCancellationPolicyRequest {

    @XmlElement(name = "BaseRequest")
    protected RequestBase baseRequest;
    @XmlElement(name = "SupplierId")
    protected int supplierId;
    @XmlElement(name = "CheckinDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkinDate;
    @XmlElement(name = "IndicativeServiceAmount", required = true)
    protected BigDecimal indicativeServiceAmount;
    @XmlElement(name = "HotelRequests")
    protected ArrayOfHotelReservationRequest hotelRequests;

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
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the checkinDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckinDate() {
        return checkinDate;
    }

    /**
     * Sets the value of the checkinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckinDate(XMLGregorianCalendar value) {
        this.checkinDate = value;
    }

    /**
     * Gets the value of the indicativeServiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndicativeServiceAmount() {
        return indicativeServiceAmount;
    }

    /**
     * Sets the value of the indicativeServiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndicativeServiceAmount(BigDecimal value) {
        this.indicativeServiceAmount = value;
    }

    /**
     * Gets the value of the hotelRequests property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHotelReservationRequest }
     *     
     */
    public ArrayOfHotelReservationRequest getHotelRequests() {
        return hotelRequests;
    }

    /**
     * Sets the value of the hotelRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHotelReservationRequest }
     *     
     */
    public void setHotelRequests(ArrayOfHotelReservationRequest value) {
        this.hotelRequests = value;
    }

}
