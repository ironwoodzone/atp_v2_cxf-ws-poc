
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarGroupSupplement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarGroupSupplement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplementId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupplementName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsPerDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarGroupSupplement", propOrder = {
    "supplementId",
    "supplementName",
    "isMandatory",
    "isPerDay",
    "amount"
})
public class CarGroupSupplement {

    @XmlElement(name = "SupplementId")
    protected int supplementId;
    @XmlElement(name = "SupplementName")
    protected String supplementName;
    @XmlElement(name = "IsMandatory")
    protected boolean isMandatory;
    @XmlElement(name = "IsPerDay")
    protected boolean isPerDay;
    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;

    /**
     * Gets the value of the supplementId property.
     * 
     */
    public int getSupplementId() {
        return supplementId;
    }

    /**
     * Sets the value of the supplementId property.
     * 
     */
    public void setSupplementId(int value) {
        this.supplementId = value;
    }

    /**
     * Gets the value of the supplementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementName() {
        return supplementName;
    }

    /**
     * Sets the value of the supplementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementName(String value) {
        this.supplementName = value;
    }

    /**
     * Gets the value of the isMandatory property.
     * 
     */
    public boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Sets the value of the isMandatory property.
     * 
     */
    public void setIsMandatory(boolean value) {
        this.isMandatory = value;
    }

    /**
     * Gets the value of the isPerDay property.
     * 
     */
    public boolean isIsPerDay() {
        return isPerDay;
    }

    /**
     * Sets the value of the isPerDay property.
     * 
     */
    public void setIsPerDay(boolean value) {
        this.isPerDay = value;
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

}
