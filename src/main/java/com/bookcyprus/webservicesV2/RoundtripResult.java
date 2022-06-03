
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundtripResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="RoundtripName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImagePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoundtripAvailabilities" type="{http://webservicesV2.bookcyprus.com/}ArrayOfRoundtripAvailability" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundtripResult", propOrder = {
    "roundtripId",
    "roundtripName",
    "imagePath",
    "roundtripAvailabilities"
})
public class RoundtripResult {

    @XmlElement(name = "RoundtripId")
    protected int roundtripId;
    @XmlElement(name = "RoundtripName")
    protected String roundtripName;
    @XmlElement(name = "ImagePath")
    protected String imagePath;
    @XmlElement(name = "RoundtripAvailabilities")
    protected ArrayOfRoundtripAvailability roundtripAvailabilities;

    /**
     * Gets the value of the roundtripId property.
     * 
     */
    public int getRoundtripId() {
        return roundtripId;
    }

    /**
     * Sets the value of the roundtripId property.
     * 
     */
    public void setRoundtripId(int value) {
        this.roundtripId = value;
    }

    /**
     * Gets the value of the roundtripName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundtripName() {
        return roundtripName;
    }

    /**
     * Sets the value of the roundtripName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundtripName(String value) {
        this.roundtripName = value;
    }

    /**
     * Gets the value of the imagePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Sets the value of the imagePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagePath(String value) {
        this.imagePath = value;
    }

    /**
     * Gets the value of the roundtripAvailabilities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRoundtripAvailability }
     *     
     */
    public ArrayOfRoundtripAvailability getRoundtripAvailabilities() {
        return roundtripAvailabilities;
    }

    /**
     * Sets the value of the roundtripAvailabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRoundtripAvailability }
     *     
     */
    public void setRoundtripAvailabilities(ArrayOfRoundtripAvailability value) {
        this.roundtripAvailabilities = value;
    }

}
