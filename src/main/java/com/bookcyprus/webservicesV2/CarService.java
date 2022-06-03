
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AvailableCars" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarService", propOrder = {
    "carServiceId",
    "carServiceName",
    "availableCars"
})
public class CarService {

    @XmlElement(name = "CarServiceId")
    protected int carServiceId;
    @XmlElement(name = "CarServiceName")
    protected String carServiceName;
    @XmlElement(name = "AvailableCars")
    protected ArrayOfCarGroup availableCars;

    /**
     * Gets the value of the carServiceId property.
     * 
     */
    public int getCarServiceId() {
        return carServiceId;
    }

    /**
     * Sets the value of the carServiceId property.
     * 
     */
    public void setCarServiceId(int value) {
        this.carServiceId = value;
    }

    /**
     * Gets the value of the carServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarServiceName() {
        return carServiceName;
    }

    /**
     * Sets the value of the carServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarServiceName(String value) {
        this.carServiceName = value;
    }

    /**
     * Gets the value of the availableCars property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarGroup }
     *     
     */
    public ArrayOfCarGroup getAvailableCars() {
        return availableCars;
    }

    /**
     * Sets the value of the availableCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarGroup }
     *     
     */
    public void setAvailableCars(ArrayOfCarGroup value) {
        this.availableCars = value;
    }

}
