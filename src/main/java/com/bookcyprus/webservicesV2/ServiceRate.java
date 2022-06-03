
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ProviderId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Details" type="{http://webservicesV2.bookcyprus.com/}ArrayOfServiceRateDetail" minOccurs="0"/&gt;
 *         &lt;element name="NonPayableFees" type="{http://webservicesV2.bookcyprus.com/}ArrayOfServiceRateDetail" minOccurs="0"/&gt;
 *         &lt;element name="GroupIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EssentialInformation" type="{http://webservicesV2.bookcyprus.com/}ArrayOfEssentialInformationDetail" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPolicy" type="{http://webservicesV2.bookcyprus.com/}ArrayOfBookingConditionItemDetail" minOccurs="0"/&gt;
 *         &lt;element name="UniqueRoomCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MealId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Meal" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MealName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="IsNonRef" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FreeCancellation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRate", propOrder = {
    "amount",
    "netAmount",
    "taxAmount",
    "providerId",
    "details",
    "nonPayableFees",
    "groupIdentifier",
    "essentialInformation",
    "cancellationPolicy",
    "uniqueRoomCode"
})
public class ServiceRate {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "NetAmount", required = true)
    protected BigDecimal netAmount;
    @XmlElement(name = "TaxAmount", required = true)
    protected BigDecimal taxAmount;
    @XmlElement(name = "ProviderId")
    protected int providerId;
    @XmlElement(name = "Details")
    protected ArrayOfServiceRateDetail details;
    @XmlElement(name = "NonPayableFees")
    protected ArrayOfServiceRateDetail nonPayableFees;
    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;
    @XmlElement(name = "EssentialInformation")
    protected ArrayOfEssentialInformationDetail essentialInformation;
    @XmlElement(name = "CancellationPolicy")
    protected ArrayOfBookingConditionItemDetail cancellationPolicy;
    @XmlElement(name = "UniqueRoomCode")
    protected String uniqueRoomCode;
    @XmlAttribute(name = "MealId", required = true)
    protected int mealId;
    @XmlAttribute(name = "Meal")
    protected String meal;
    @XmlAttribute(name = "MealName")
    protected String mealName;
    @XmlAttribute(name = "IsNonRef", required = true)
    protected boolean isNonRef;
    @XmlAttribute(name = "FreeCancellation", required = true)
    protected boolean freeCancellation;
    @XmlAttribute(name = "PaymentType")
    protected String paymentType;

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
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxAmount(BigDecimal value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the providerId property.
     * 
     */
    public int getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     */
    public void setProviderId(int value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRateDetail }
     *     
     */
    public ArrayOfServiceRateDetail getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRateDetail }
     *     
     */
    public void setDetails(ArrayOfServiceRateDetail value) {
        this.details = value;
    }

    /**
     * Gets the value of the nonPayableFees property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceRateDetail }
     *     
     */
    public ArrayOfServiceRateDetail getNonPayableFees() {
        return nonPayableFees;
    }

    /**
     * Sets the value of the nonPayableFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceRateDetail }
     *     
     */
    public void setNonPayableFees(ArrayOfServiceRateDetail value) {
        this.nonPayableFees = value;
    }

    /**
     * Gets the value of the groupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * Sets the value of the groupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIdentifier(String value) {
        this.groupIdentifier = value;
    }

    /**
     * Gets the value of the essentialInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEssentialInformationDetail }
     *     
     */
    public ArrayOfEssentialInformationDetail getEssentialInformation() {
        return essentialInformation;
    }

    /**
     * Sets the value of the essentialInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEssentialInformationDetail }
     *     
     */
    public void setEssentialInformation(ArrayOfEssentialInformationDetail value) {
        this.essentialInformation = value;
    }

    /**
     * Gets the value of the cancellationPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public ArrayOfBookingConditionItemDetail getCancellationPolicy() {
        return cancellationPolicy;
    }

    /**
     * Sets the value of the cancellationPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBookingConditionItemDetail }
     *     
     */
    public void setCancellationPolicy(ArrayOfBookingConditionItemDetail value) {
        this.cancellationPolicy = value;
    }

    /**
     * Gets the value of the uniqueRoomCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRoomCode() {
        return uniqueRoomCode;
    }

    /**
     * Sets the value of the uniqueRoomCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRoomCode(String value) {
        this.uniqueRoomCode = value;
    }

    /**
     * Gets the value of the mealId property.
     * 
     */
    public int getMealId() {
        return mealId;
    }

    /**
     * Sets the value of the mealId property.
     * 
     */
    public void setMealId(int value) {
        this.mealId = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeal(String value) {
        this.meal = value;
    }

    /**
     * Gets the value of the mealName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMealName() {
        return mealName;
    }

    /**
     * Sets the value of the mealName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMealName(String value) {
        this.mealName = value;
    }

    /**
     * Gets the value of the isNonRef property.
     * 
     */
    public boolean isIsNonRef() {
        return isNonRef;
    }

    /**
     * Sets the value of the isNonRef property.
     * 
     */
    public void setIsNonRef(boolean value) {
        this.isNonRef = value;
    }

    /**
     * Gets the value of the freeCancellation property.
     * 
     */
    public boolean isFreeCancellation() {
        return freeCancellation;
    }

    /**
     * Sets the value of the freeCancellation property.
     * 
     */
    public void setFreeCancellation(boolean value) {
        this.freeCancellation = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

}
