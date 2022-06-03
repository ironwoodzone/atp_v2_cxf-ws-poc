
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferVehicle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferVehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsOneWay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NumberOfVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsPerPax" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferVehicle", propOrder = {
    "vehicleId",
    "vehicleType",
    "vehicleTypeDescription",
    "vehicleTypeId",
    "supplierId",
    "isOneWay",
    "amount",
    "numberOfVehicles",
    "isPerPax"
})
public class TransferVehicle {

    @XmlElement(name = "VehicleId")
    protected int vehicleId;
    @XmlElement(name = "VehicleType")
    protected String vehicleType;
    @XmlElement(name = "VehicleTypeDescription")
    protected String vehicleTypeDescription;
    @XmlElement(name = "VehicleTypeId")
    protected int vehicleTypeId;
    @XmlElement(name = "SupplierId")
    protected int supplierId;
    @XmlElement(name = "IsOneWay")
    protected boolean isOneWay;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "NumberOfVehicles")
    protected int numberOfVehicles;
    @XmlElement(name = "IsPerPax")
    protected boolean isPerPax;

    /**
     * Gets the value of the vehicleId property.
     * 
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     */
    public void setVehicleId(int value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * Gets the value of the vehicleTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleTypeDescription() {
        return vehicleTypeDescription;
    }

    /**
     * Sets the value of the vehicleTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleTypeDescription(String value) {
        this.vehicleTypeDescription = value;
    }

    /**
     * Gets the value of the vehicleTypeId property.
     * 
     */
    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    /**
     * Sets the value of the vehicleTypeId property.
     * 
     */
    public void setVehicleTypeId(int value) {
        this.vehicleTypeId = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the isOneWay property.
     * 
     */
    public boolean isIsOneWay() {
        return isOneWay;
    }

    /**
     * Sets the value of the isOneWay property.
     * 
     */
    public void setIsOneWay(boolean value) {
        this.isOneWay = value;
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
     * Gets the value of the numberOfVehicles property.
     * 
     */
    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Sets the value of the numberOfVehicles property.
     * 
     */
    public void setNumberOfVehicles(int value) {
        this.numberOfVehicles = value;
    }

    /**
     * Gets the value of the isPerPax property.
     * 
     */
    public boolean isIsPerPax() {
        return isPerPax;
    }

    /**
     * Sets the value of the isPerPax property.
     * 
     */
    public void setIsPerPax(boolean value) {
        this.isPerPax = value;
    }

}
