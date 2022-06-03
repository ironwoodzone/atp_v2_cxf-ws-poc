
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
 *         &lt;element name="RoundtripListResult" type="{http://webservicesV2.bookcyprus.com/}RoundtripListResponse" minOccurs="0"/&gt;
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
    "roundtripListResult"
})
@XmlRootElement(name = "RoundtripListResponse")
public class RoundtripListResponse {

    @XmlElement(name = "RoundtripListResult")
    protected RoundtripListResponse2 roundtripListResult;

    /**
     * Gets the value of the roundtripListResult property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripListResponse2 }
     *     
     */
    public RoundtripListResponse2 getRoundtripListResult() {
        return roundtripListResult;
    }

    /**
     * Sets the value of the roundtripListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripListResponse2 }
     *     
     */
    public void setRoundtripListResult(RoundtripListResponse2 value) {
        this.roundtripListResult = value;
    }

}
