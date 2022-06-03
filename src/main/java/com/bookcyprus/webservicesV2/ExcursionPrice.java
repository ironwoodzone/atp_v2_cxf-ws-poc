
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExcursionPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExcursionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Children" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Infants" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Seniors" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Youths" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Vehicles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TravelDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ExcursionGradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionGradeLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionQuestions" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionQuestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionPrice", propOrder = {
    "amount",
    "excursionId",
    "locationId",
    "onRequest",
    "adults",
    "children",
    "infants",
    "seniors",
    "youths",
    "vehicles",
    "travelDate",
    "startTime",
    "excursionGradeCode",
    "excursionGradeLanguageCode",
    "excursionQuestions"
})
public class ExcursionPrice {

    @XmlElement(name = "Amount", required = true)
    protected BigDecimal amount;
    @XmlElement(name = "ExcursionId")
    protected int excursionId;
    @XmlElement(name = "LocationId")
    protected int locationId;
    @XmlElement(name = "OnRequest")
    protected boolean onRequest;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "Children")
    protected int children;
    @XmlElement(name = "Infants")
    protected int infants;
    @XmlElement(name = "Seniors")
    protected int seniors;
    @XmlElement(name = "Youths")
    protected int youths;
    @XmlElement(name = "Vehicles")
    protected int vehicles;
    @XmlElement(name = "TravelDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar travelDate;
    @XmlElement(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "ExcursionGradeCode")
    protected String excursionGradeCode;
    @XmlElement(name = "ExcursionGradeLanguageCode")
    protected String excursionGradeLanguageCode;
    @XmlElement(name = "ExcursionQuestions")
    protected ArrayOfExcursionQuestion excursionQuestions;

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
     * Gets the value of the excursionId property.
     * 
     */
    public int getExcursionId() {
        return excursionId;
    }

    /**
     * Sets the value of the excursionId property.
     * 
     */
    public void setExcursionId(int value) {
        this.excursionId = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     */
    public int getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     */
    public void setLocationId(int value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the onRequest property.
     * 
     */
    public boolean isOnRequest() {
        return onRequest;
    }

    /**
     * Sets the value of the onRequest property.
     * 
     */
    public void setOnRequest(boolean value) {
        this.onRequest = value;
    }

    /**
     * Gets the value of the adults property.
     * 
     */
    public int getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     */
    public void setAdults(int value) {
        this.adults = value;
    }

    /**
     * Gets the value of the children property.
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     */
    public void setChildren(int value) {
        this.children = value;
    }

    /**
     * Gets the value of the infants property.
     * 
     */
    public int getInfants() {
        return infants;
    }

    /**
     * Sets the value of the infants property.
     * 
     */
    public void setInfants(int value) {
        this.infants = value;
    }

    /**
     * Gets the value of the seniors property.
     * 
     */
    public int getSeniors() {
        return seniors;
    }

    /**
     * Sets the value of the seniors property.
     * 
     */
    public void setSeniors(int value) {
        this.seniors = value;
    }

    /**
     * Gets the value of the youths property.
     * 
     */
    public int getYouths() {
        return youths;
    }

    /**
     * Sets the value of the youths property.
     * 
     */
    public void setYouths(int value) {
        this.youths = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     */
    public int getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     */
    public void setVehicles(int value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the travelDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTravelDate() {
        return travelDate;
    }

    /**
     * Sets the value of the travelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTravelDate(XMLGregorianCalendar value) {
        this.travelDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the excursionGradeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcursionGradeCode() {
        return excursionGradeCode;
    }

    /**
     * Sets the value of the excursionGradeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcursionGradeCode(String value) {
        this.excursionGradeCode = value;
    }

    /**
     * Gets the value of the excursionGradeLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcursionGradeLanguageCode() {
        return excursionGradeLanguageCode;
    }

    /**
     * Sets the value of the excursionGradeLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcursionGradeLanguageCode(String value) {
        this.excursionGradeLanguageCode = value;
    }

    /**
     * Gets the value of the excursionQuestions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionQuestion }
     *     
     */
    public ArrayOfExcursionQuestion getExcursionQuestions() {
        return excursionQuestions;
    }

    /**
     * Sets the value of the excursionQuestions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionQuestion }
     *     
     */
    public void setExcursionQuestions(ArrayOfExcursionQuestion value) {
        this.excursionQuestions = value;
    }

}
