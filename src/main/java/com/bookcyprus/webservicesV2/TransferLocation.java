
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartingPointId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="StartingPointName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferLocation", propOrder = {
    "startingPointId",
    "startingPointName"
})
public class TransferLocation {

    @XmlElement(name = "StartingPointId")
    protected int startingPointId;
    @XmlElement(name = "StartingPointName")
    protected String startingPointName;

    /**
     * Gets the value of the startingPointId property.
     * 
     */
    public int getStartingPointId() {
        return startingPointId;
    }

    /**
     * Sets the value of the startingPointId property.
     * 
     */
    public void setStartingPointId(int value) {
        this.startingPointId = value;
    }

    /**
     * Gets the value of the startingPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartingPointName() {
        return startingPointName;
    }

    /**
     * Sets the value of the startingPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartingPointName(String value) {
        this.startingPointName = value;
    }

}
