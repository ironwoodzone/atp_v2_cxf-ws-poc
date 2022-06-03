
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcursionGrade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionGrade"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionGradeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ExcursionGradeLanguages" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionGradeLanguage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionGrade", propOrder = {
    "excursionGradeCode",
    "title",
    "description",
    "fromPrice",
    "excursionGradeLanguages"
})
public class ExcursionGrade {

    @XmlElement(name = "ExcursionGradeCode")
    protected String excursionGradeCode;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FromPrice", required = true)
    protected BigDecimal fromPrice;
    @XmlElement(name = "ExcursionGradeLanguages")
    protected ArrayOfExcursionGradeLanguage excursionGradeLanguages;

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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fromPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromPrice() {
        return fromPrice;
    }

    /**
     * Sets the value of the fromPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromPrice(BigDecimal value) {
        this.fromPrice = value;
    }

    /**
     * Gets the value of the excursionGradeLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionGradeLanguage }
     *     
     */
    public ArrayOfExcursionGradeLanguage getExcursionGradeLanguages() {
        return excursionGradeLanguages;
    }

    /**
     * Sets the value of the excursionGradeLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionGradeLanguage }
     *     
     */
    public void setExcursionGradeLanguages(ArrayOfExcursionGradeLanguage value) {
        this.excursionGradeLanguages = value;
    }

}
