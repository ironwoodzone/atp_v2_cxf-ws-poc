
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetBookingConditionsResult" type="{http://webservicesV2.bookcyprus.com/}BookingConditionsResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBookingConditionsResult"
})
@XmlRootElement(name = "GetBookingConditionsResponse")
public class GetBookingConditionsResponse {

    @XmlElement(name = "GetBookingConditionsResult")
    protected BookingConditionsResponse getBookingConditionsResult;

    /**
     * Gets the value of the getBookingConditionsResult property.
     * 
     * @return
     *     possible object is
     *     {@link BookingConditionsResponse }
     *     
     */
    public BookingConditionsResponse getGetBookingConditionsResult() {
        return getBookingConditionsResult;
    }

    /**
     * Sets the value of the getBookingConditionsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingConditionsResponse }
     *     
     */
    public void setGetBookingConditionsResult(BookingConditionsResponse value) {
        this.getBookingConditionsResult = value;
    }

}
