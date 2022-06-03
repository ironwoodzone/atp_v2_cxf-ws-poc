
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarGroupId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CarGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarGroupCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Vehicles" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarVehicle" minOccurs="0"/&gt;
 *         &lt;element name="Supplements" type="{http://webservicesV2.bookcyprus.com/}ArrayOfCarGroupSupplement" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarGroup", propOrder = {
    "carGroupId",
    "carGroupName",
    "carGroupCategory",
    "amount",
    "vehicles",
    "supplements"
})
public class CarGroup {

    @XmlElement(name = "CarGroupId")
    protected int carGroupId;
    @XmlElement(name = "CarGroupName")
    protected String carGroupName;
    @XmlElement(name = "CarGroupCategory")
    protected String carGroupCategory;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "Vehicles")
    protected ArrayOfCarVehicle vehicles;
    @XmlElement(name = "Supplements")
    protected ArrayOfCarGroupSupplement supplements;

    /**
     * Gets the value of the carGroupId property.
     * 
     */
    public int getCarGroupId() {
        return carGroupId;
    }

    /**
     * Sets the value of the carGroupId property.
     * 
     */
    public void setCarGroupId(int value) {
        this.carGroupId = value;
    }

    /**
     * Gets the value of the carGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarGroupName() {
        return carGroupName;
    }

    /**
     * Sets the value of the carGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarGroupName(String value) {
        this.carGroupName = value;
    }

    /**
     * Gets the value of the carGroupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarGroupCategory() {
        return carGroupCategory;
    }

    /**
     * Sets the value of the carGroupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarGroupCategory(String value) {
        this.carGroupCategory = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarVehicle }
     *     
     */
    public ArrayOfCarVehicle getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarVehicle }
     *     
     */
    public void setVehicles(ArrayOfCarVehicle value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the supplements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCarGroupSupplement }
     *     
     */
    public ArrayOfCarGroupSupplement getSupplements() {
        return supplements;
    }

    /**
     * Sets the value of the supplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCarGroupSupplement }
     *     
     */
    public void setSupplements(ArrayOfCarGroupSupplement value) {
        this.supplements = value;
    }

}
