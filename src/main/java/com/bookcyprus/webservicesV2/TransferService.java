
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransferServiceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPointId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToPointId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DistanceKM" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DistanceMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="AvailableVehicles" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferVehicle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferService", propOrder = {
    "transferServiceId",
    "transferServiceName",
    "fromPointId",
    "toPointId",
    "distanceKM",
    "distanceMinutes",
    "availableVehicles"
})
public class TransferService {

    @XmlElement(name = "TransferServiceId")
    protected int transferServiceId;
    @XmlElement(name = "TransferServiceName")
    protected String transferServiceName;
    @XmlElement(name = "FromPointId")
    protected int fromPointId;
    @XmlElement(name = "ToPointId")
    protected int toPointId;
    @XmlElement(name = "DistanceKM")
    protected int distanceKM;
    @XmlElement(name = "DistanceMinutes")
    protected int distanceMinutes;
    @XmlElement(name = "AvailableVehicles")
    protected ArrayOfTransferVehicle availableVehicles;

    /**
     * Gets the value of the transferServiceId property.
     * 
     */
    public int getTransferServiceId() {
        return transferServiceId;
    }

    /**
     * Sets the value of the transferServiceId property.
     * 
     */
    public void setTransferServiceId(int value) {
        this.transferServiceId = value;
    }

    /**
     * Gets the value of the transferServiceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferServiceName() {
        return transferServiceName;
    }

    /**
     * Sets the value of the transferServiceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferServiceName(String value) {
        this.transferServiceName = value;
    }

    /**
     * Gets the value of the fromPointId property.
     * 
     */
    public int getFromPointId() {
        return fromPointId;
    }

    /**
     * Sets the value of the fromPointId property.
     * 
     */
    public void setFromPointId(int value) {
        this.fromPointId = value;
    }

    /**
     * Gets the value of the toPointId property.
     * 
     */
    public int getToPointId() {
        return toPointId;
    }

    /**
     * Sets the value of the toPointId property.
     * 
     */
    public void setToPointId(int value) {
        this.toPointId = value;
    }

    /**
     * Gets the value of the distanceKM property.
     * 
     */
    public int getDistanceKM() {
        return distanceKM;
    }

    /**
     * Sets the value of the distanceKM property.
     * 
     */
    public void setDistanceKM(int value) {
        this.distanceKM = value;
    }

    /**
     * Gets the value of the distanceMinutes property.
     * 
     */
    public int getDistanceMinutes() {
        return distanceMinutes;
    }

    /**
     * Sets the value of the distanceMinutes property.
     * 
     */
    public void setDistanceMinutes(int value) {
        this.distanceMinutes = value;
    }

    /**
     * Gets the value of the availableVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransferVehicle }
     *     
     */
    public ArrayOfTransferVehicle getAvailableVehicles() {
        return availableVehicles;
    }

    /**
     * Sets the value of the availableVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferVehicle }
     *     
     */
    public void setAvailableVehicles(ArrayOfTransferVehicle value) {
        this.availableVehicles = value;
    }

}
