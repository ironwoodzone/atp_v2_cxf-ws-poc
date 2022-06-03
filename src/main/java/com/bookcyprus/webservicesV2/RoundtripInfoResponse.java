
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
 *         &lt;element name="RoundtripInfoResult" type="{http://webservicesV2.bookcyprus.com/}RoundtripInfoResponse" minOccurs="0"/&gt;
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
    "roundtripInfoResult"
})
@XmlRootElement(name = "RoundtripInfoResponse")
public class RoundtripInfoResponse {

    @XmlElement(name = "RoundtripInfoResult")
    protected RoundtripInfoResponse2 roundtripInfoResult;

    /**
     * Gets the value of the roundtripInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripInfoResponse2 }
     *     
     */
    public RoundtripInfoResponse2 getRoundtripInfoResult() {
        return roundtripInfoResult;
    }

    /**
     * Sets the value of the roundtripInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripInfoResponse2 }
     *     
     */
    public void setRoundtripInfoResult(RoundtripInfoResponse2 value) {
        this.roundtripInfoResult = value;
    }

}
