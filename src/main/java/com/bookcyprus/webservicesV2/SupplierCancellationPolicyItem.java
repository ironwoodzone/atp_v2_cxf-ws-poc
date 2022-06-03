
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierCancellationPolicyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierCancellationPolicyItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="CalculatedFee" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PrepaymentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="FullPaymentPercentage" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CancellationStays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NoShows" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CancellationPolicyMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierCancellationPolicyItem", propOrder = {
    "fromDate",
    "toDate",
    "calculatedFee",
    "prepaymentPercentage",
    "fullPaymentPercentage",
    "cancellationStays",
    "noShows",
    "cancellationPolicyMessage"
})
public class SupplierCancellationPolicyItem {

    @XmlElement(name = "FromDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "CalculatedFee", required = true)
    protected BigDecimal calculatedFee;
    @XmlElement(name = "PrepaymentPercentage", required = true)
    protected BigDecimal prepaymentPercentage;
    @XmlElement(name = "FullPaymentPercentage", required = true)
    protected BigDecimal fullPaymentPercentage;
    @XmlElement(name = "CancellationStays")
    protected String cancellationStays;
    @XmlElement(name = "NoShows")
    protected String noShows;
    @XmlElement(name = "CancellationPolicyMessage")
    protected String cancellationPolicyMessage;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Gets the value of the calculatedFee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCalculatedFee() {
        return calculatedFee;
    }

    /**
     * Sets the value of the calculatedFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCalculatedFee(BigDecimal value) {
        this.calculatedFee = value;
    }

    /**
     * Gets the value of the prepaymentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaymentPercentage() {
        return prepaymentPercentage;
    }

    /**
     * Sets the value of the prepaymentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaymentPercentage(BigDecimal value) {
        this.prepaymentPercentage = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationStays() {
        return cancellationStays;
    }

    /**
     * Sets the value of the cancellationStays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationStays(String value) {
        this.cancellationStays = value;
    }

    /**
     * Gets the value of the noShows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoShows() {
        return noShows;
    }

    /**
     * Sets the value of the noShows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoShows(String value) {
        this.noShows = value;
    }

    /**
     * Gets the value of the cancellationPolicyMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationPolicyMessage() {
        return cancellationPolicyMessage;
    }

    /**
     * Sets the value of the cancellationPolicyMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationPolicyMessage(String value) {
        this.cancellationPolicyMessage = value;
    }

}
