
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
 *         &lt;element name="ExcursionAvailabilitySearchResult" type="{http://webservicesV2.bookcyprus.com/}ExcursionAvailabilityResponse" minOccurs="0"/&gt;
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
    "excursionAvailabilitySearchResult"
})
@XmlRootElement(name = "ExcursionAvailabilitySearchResponse")
public class ExcursionAvailabilitySearchResponse {

    @XmlElement(name = "ExcursionAvailabilitySearchResult")
    protected ExcursionAvailabilityResponse excursionAvailabilitySearchResult;

    /**
     * Gets the value of the excursionAvailabilitySearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExcursionAvailabilityResponse }
     *     
     */
    public ExcursionAvailabilityResponse getExcursionAvailabilitySearchResult() {
        return excursionAvailabilitySearchResult;
    }

    /**
     * Sets the value of the excursionAvailabilitySearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcursionAvailabilityResponse }
     *     
     */
    public void setExcursionAvailabilitySearchResult(ExcursionAvailabilityResponse value) {
        this.excursionAvailabilitySearchResult = value;
    }

}
