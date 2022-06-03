
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
 *         &lt;element name="RoundtripAvailabilityResult" type="{http://webservicesV2.bookcyprus.com/}RoundtripAvailabilityResponse" minOccurs="0"/&gt;
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
    "roundtripAvailabilityResult"
})
@XmlRootElement(name = "RoundtripAvailabilityResponse")
public class RoundtripAvailabilityResponse {

    @XmlElement(name = "RoundtripAvailabilityResult")
    protected RoundtripAvailabilityResponse2 roundtripAvailabilityResult;

    /**
     * Gets the value of the roundtripAvailabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripAvailabilityResponse2 }
     *     
     */
    public RoundtripAvailabilityResponse2 getRoundtripAvailabilityResult() {
        return roundtripAvailabilityResult;
    }

    /**
     * Sets the value of the roundtripAvailabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripAvailabilityResponse2 }
     *     
     */
    public void setRoundtripAvailabilityResult(RoundtripAvailabilityResponse2 value) {
        this.roundtripAvailabilityResult = value;
    }

}
