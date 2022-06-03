
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcursionService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ExcursionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionTypeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Locations" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionSearchLocation" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionStartTimes" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionStartTime" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionDates" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionDate" minOccurs="0"/&gt;
 *         &lt;element name="ExcursionGrades" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionGrade" minOccurs="0"/&gt;
 *         &lt;element name="FromPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAdultsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsChildrenAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsInfantsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSeniorsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsYouthsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="AdultAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChildAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfantAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeniorAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YouthsAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionService", propOrder = {
    "excursionId",
    "excursionName",
    "excursionTypeName",
    "excursionTypeId",
    "locations",
    "excursionStartTimes",
    "excursionDates",
    "excursionGrades",
    "fromPrice",
    "onRequest",
    "isAdultsAllowed",
    "isChildrenAllowed",
    "isInfantsAllowed",
    "isSeniorsAllowed",
    "isYouthsAllowed",
    "adultAgeRange",
    "childAgeRange",
    "infantAgeRange",
    "seniorAgeRange",
    "youthsAgeRange",
    "vehicleCapacity"
})
public class ExcursionService {

    @XmlElement(name = "ExcursionId")
    protected int excursionId;
    @XmlElement(name = "ExcursionName")
    protected String excursionName;
    @XmlElement(name = "ExcursionTypeName")
    protected String excursionTypeName;
    @XmlElement(name = "ExcursionTypeId")
    protected int excursionTypeId;
    @XmlElement(name = "Locations")
    protected ArrayOfExcursionSearchLocation locations;
    @XmlElement(name = "ExcursionStartTimes")
    protected ArrayOfExcursionStartTime excursionStartTimes;
    @XmlElement(name = "ExcursionDates")
    protected ArrayOfExcursionDate excursionDates;
    @XmlElement(name = "ExcursionGrades")
    protected ArrayOfExcursionGrade excursionGrades;
    @XmlElement(name = "FromPrice")
    protected String fromPrice;
    @XmlElement(name = "OnRequest")
    protected boolean onRequest;
    @XmlElement(name = "IsAdultsAllowed")
    protected boolean isAdultsAllowed;
    @XmlElement(name = "IsChildrenAllowed")
    protected boolean isChildrenAllowed;
    @XmlElement(name = "IsInfantsAllowed")
    protected boolean isInfantsAllowed;
    @XmlElement(name = "IsSeniorsAllowed")
    protected boolean isSeniorsAllowed;
    @XmlElement(name = "IsYouthsAllowed")
    protected boolean isYouthsAllowed;
    @XmlElement(name = "AdultAgeRange")
    protected String adultAgeRange;
    @XmlElement(name = "ChildAgeRange")
    protected String childAgeRange;
    @XmlElement(name = "InfantAgeRange")
    protected String infantAgeRange;
    @XmlElement(name = "SeniorAgeRange")
    protected String seniorAgeRange;
    @XmlElement(name = "YouthsAgeRange")
    protected String youthsAgeRange;
    @XmlElement(name = "VehicleCapacity")
    protected String vehicleCapacity;

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
     * Gets the value of the excursionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcursionName() {
        return excursionName;
    }

    /**
     * Sets the value of the excursionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcursionName(String value) {
        this.excursionName = value;
    }

    /**
     * Gets the value of the excursionTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcursionTypeName() {
        return excursionTypeName;
    }

    /**
     * Sets the value of the excursionTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcursionTypeName(String value) {
        this.excursionTypeName = value;
    }

    /**
     * Gets the value of the excursionTypeId property.
     * 
     */
    public int getExcursionTypeId() {
        return excursionTypeId;
    }

    /**
     * Sets the value of the excursionTypeId property.
     * 
     */
    public void setExcursionTypeId(int value) {
        this.excursionTypeId = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionSearchLocation }
     *     
     */
    public ArrayOfExcursionSearchLocation getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionSearchLocation }
     *     
     */
    public void setLocations(ArrayOfExcursionSearchLocation value) {
        this.locations = value;
    }

    /**
     * Gets the value of the excursionStartTimes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionStartTime }
     *     
     */
    public ArrayOfExcursionStartTime getExcursionStartTimes() {
        return excursionStartTimes;
    }

    /**
     * Sets the value of the excursionStartTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionStartTime }
     *     
     */
    public void setExcursionStartTimes(ArrayOfExcursionStartTime value) {
        this.excursionStartTimes = value;
    }

    /**
     * Gets the value of the excursionDates property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionDate }
     *     
     */
    public ArrayOfExcursionDate getExcursionDates() {
        return excursionDates;
    }

    /**
     * Sets the value of the excursionDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionDate }
     *     
     */
    public void setExcursionDates(ArrayOfExcursionDate value) {
        this.excursionDates = value;
    }

    /**
     * Gets the value of the excursionGrades property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionGrade }
     *     
     */
    public ArrayOfExcursionGrade getExcursionGrades() {
        return excursionGrades;
    }

    /**
     * Sets the value of the excursionGrades property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionGrade }
     *     
     */
    public void setExcursionGrades(ArrayOfExcursionGrade value) {
        this.excursionGrades = value;
    }

    /**
     * Gets the value of the fromPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromPrice() {
        return fromPrice;
    }

    /**
     * Sets the value of the fromPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromPrice(String value) {
        this.fromPrice = value;
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
     * Gets the value of the isAdultsAllowed property.
     * 
     */
    public boolean isIsAdultsAllowed() {
        return isAdultsAllowed;
    }

    /**
     * Sets the value of the isAdultsAllowed property.
     * 
     */
    public void setIsAdultsAllowed(boolean value) {
        this.isAdultsAllowed = value;
    }

    /**
     * Gets the value of the isChildrenAllowed property.
     * 
     */
    public boolean isIsChildrenAllowed() {
        return isChildrenAllowed;
    }

    /**
     * Sets the value of the isChildrenAllowed property.
     * 
     */
    public void setIsChildrenAllowed(boolean value) {
        this.isChildrenAllowed = value;
    }

    /**
     * Gets the value of the isInfantsAllowed property.
     * 
     */
    public boolean isIsInfantsAllowed() {
        return isInfantsAllowed;
    }

    /**
     * Sets the value of the isInfantsAllowed property.
     * 
     */
    public void setIsInfantsAllowed(boolean value) {
        this.isInfantsAllowed = value;
    }

    /**
     * Gets the value of the isSeniorsAllowed property.
     * 
     */
    public boolean isIsSeniorsAllowed() {
        return isSeniorsAllowed;
    }

    /**
     * Sets the value of the isSeniorsAllowed property.
     * 
     */
    public void setIsSeniorsAllowed(boolean value) {
        this.isSeniorsAllowed = value;
    }

    /**
     * Gets the value of the isYouthsAllowed property.
     * 
     */
    public boolean isIsYouthsAllowed() {
        return isYouthsAllowed;
    }

    /**
     * Sets the value of the isYouthsAllowed property.
     * 
     */
    public void setIsYouthsAllowed(boolean value) {
        this.isYouthsAllowed = value;
    }

    /**
     * Gets the value of the adultAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdultAgeRange() {
        return adultAgeRange;
    }

    /**
     * Sets the value of the adultAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdultAgeRange(String value) {
        this.adultAgeRange = value;
    }

    /**
     * Gets the value of the childAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildAgeRange() {
        return childAgeRange;
    }

    /**
     * Sets the value of the childAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildAgeRange(String value) {
        this.childAgeRange = value;
    }

    /**
     * Gets the value of the infantAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfantAgeRange() {
        return infantAgeRange;
    }

    /**
     * Sets the value of the infantAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfantAgeRange(String value) {
        this.infantAgeRange = value;
    }

    /**
     * Gets the value of the seniorAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeniorAgeRange() {
        return seniorAgeRange;
    }

    /**
     * Sets the value of the seniorAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeniorAgeRange(String value) {
        this.seniorAgeRange = value;
    }

    /**
     * Gets the value of the youthsAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYouthsAgeRange() {
        return youthsAgeRange;
    }

    /**
     * Sets the value of the youthsAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYouthsAgeRange(String value) {
        this.youthsAgeRange = value;
    }

    /**
     * Gets the value of the vehicleCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCapacity() {
        return vehicleCapacity;
    }

    /**
     * Sets the value of the vehicleCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCapacity(String value) {
        this.vehicleCapacity = value;
    }

}
