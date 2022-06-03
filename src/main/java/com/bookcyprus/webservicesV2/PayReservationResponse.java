
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
 *         &lt;element name="PayReservationResult" type="{http://webservicesV2.bookcyprus.com/}ReservationResponse" minOccurs="0"/&gt;
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
    "payReservationResult"
})
@XmlRootElement(name = "PayReservationResponse")
public class PayReservationResponse {

    @XmlElement(name = "PayReservationResult")
    protected ReservationResponse payReservationResult;

    /**
     * Gets the value of the payReservationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationResponse }
     *     
     */
    public ReservationResponse getPayReservationResult() {
        return payReservationResult;
    }

    /**
     * Sets the value of the payReservationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationResponse }
     *     
     */
    public void setPayReservationResult(ReservationResponse value) {
        this.payReservationResult = value;
    }

}
