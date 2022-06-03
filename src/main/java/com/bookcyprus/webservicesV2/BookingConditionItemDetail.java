
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookingConditionItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingConditionItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ToDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="FullPaymentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CancellationStays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingConditionItemDetail", propOrder = {
    "fromDays",
    "toDays",
    "fullPaymentPercentage",
    "cancellationStays"
})
public class BookingConditionItemDetail {

    @XmlElement(name = "FromDays")
    protected int fromDays;
    @XmlElement(name = "ToDays")
    protected int toDays;
    @XmlElement(name = "FullPaymentPercentage", required = true)
    protected BigDecimal fullPaymentPercentage;
    @XmlElement(name = "CancellationStays")
    protected int cancellationStays;

    /**
     * Gets the value of the fromDays property.
     * 
     */
    public int getFromDays() {
        return fromDays;
    }

    /**
     * Sets the value of the fromDays property.
     * 
     */
    public void setFromDays(int value) {
        this.fromDays = value;
    }

    /**
     * Gets the value of the toDays property.
     * 
     */
    public int getToDays() {
        return toDays;
    }

    /**
     * Sets the value of the toDays property.
     * 
     */
    public void setToDays(int value) {
        this.toDays = value;
    }

    /**
     * Gets the value of the fullPaymentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFullPaymentPercentage() {
        return fullPaymentPercentage;
    }

    /**
     * Sets the value of the fullPaymentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFullPaymentPercentage(BigDecimal value) {
        this.fullPaymentPercentage = value;
    }

    /**
     * Gets the value of the cancellationStays property.
     * 
     */
    public int getCancellationStays() {
        return cancellationStays;
    }

    /**
     * Sets the value of the cancellationStays property.
     * 
     */
    public void setCancellationStays(int value) {
        this.cancellationStays = value;
    }

}
