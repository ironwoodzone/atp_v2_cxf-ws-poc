
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ExcursionDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionDateId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExcursionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExcursionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AdultUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeniorUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YouthUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionDate", propOrder = {
    "excursionDateId",
    "excursionId",
    "excursionDate",
    "adultUniqueCode",
    "childUniqueCode",
    "infantUniqueCode",
    "seniorUniqueCode",
    "youthUniqueCode"
})
public class ExcursionDate {

    @XmlElement(name = "ExcursionDateId")
    protected int excursionDateId;
    @XmlElement(name = "ExcursionId")
    protected int excursionId;
    @XmlElement(name = "ExcursionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar excursionDate;
    @XmlElement(name = "AdultUniqueCode")
    protected String adultUniqueCode;
    @XmlElement(name = "ChildUniqueCode")
    protected String childUniqueCode;
    @XmlElement(name = "InfantUniqueCode")
    protected String infantUniqueCode;
    @XmlElement(name = "SeniorUniqueCode")
    protected String seniorUniqueCode;
    @XmlElement(name = "YouthUniqueCode")
    protected String youthUniqueCode;

    /**
     * Gets the value of the excursionDateId property.
     * 
     */
    public int getExcursionDateId() {
        return excursionDateId;
    }

    /**
     * Sets the value of the excursionDateId property.
     * 
     */
    public void setExcursionDateId(int value) {
        this.excursionDateId = value;
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
     * Gets the value of the excursionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExcursionDate() {
        return excursionDate;
    }

    /**
     * Sets the value of the excursionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExcursionDate(XMLGregorianCalendar value) {
        this.excursionDate = value;
    }

    /**
     * Gets the value of the adultUniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultUniqueCode() {
        return adultUniqueCode;
    }

    /**
     * Sets the value of the adultUniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultUniqueCode(String value) {
        this.adultUniqueCode = value;
    }

    /**
     * Gets the value of the childUniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildUniqueCode() {
        return childUniqueCode;
    }

    /**
     * Sets the value of the childUniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildUniqueCode(String value) {
        this.childUniqueCode = value;
    }

    /**
     * Gets the value of the infantUniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantUniqueCode() {
        return infantUniqueCode;
    }

    /**
     * Sets the value of the infantUniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantUniqueCode(String value) {
        this.infantUniqueCode = value;
    }

    /**
     * Gets the value of the seniorUniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniorUniqueCode() {
        return seniorUniqueCode;
    }

    /**
     * Sets the value of the seniorUniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniorUniqueCode(String value) {
        this.seniorUniqueCode = value;
    }

    /**
     * Gets the value of the youthUniqueCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYouthUniqueCode() {
        return youthUniqueCode;
    }

    /**
     * Sets the value of the youthUniqueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYouthUniqueCode(String value) {
        this.youthUniqueCode = value;
    }

}
