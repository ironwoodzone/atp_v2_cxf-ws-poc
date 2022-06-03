
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
 *         &lt;element name="RoundtripExtendedAvailabilityResult" type="{http://webservicesV2.bookcyprus.com/}RoundtripExtendedAvailabilityResponse" minOccurs="0"/&gt;
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
    "roundtripExtendedAvailabilityResult"
})
@XmlRootElement(name = "RoundtripExtendedAvailabilityResponse")
public class RoundtripExtendedAvailabilityResponse {

    @XmlElement(name = "RoundtripExtendedAvailabilityResult")
    protected RoundtripExtendedAvailabilityResponse2 roundtripExtendedAvailabilityResult;

    /**
     * Gets the value of the roundtripExtendedAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripExtendedAvailabilityResponse2 }
     *     
     */
    public RoundtripExtendedAvailabilityResponse2 getRoundtripExtendedAvailabilityResult() {
        return roundtripExtendedAvailabilityResult;
    }

    /**
     * Sets the value of the roundtripExtendedAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripExtendedAvailabilityResponse2 }
     *     
     */
    public void setRoundtripExtendedAvailabilityResult(RoundtripExtendedAvailabilityResponse2 value) {
        this.roundtripExtendedAvailabilityResult = value;
    }

}
