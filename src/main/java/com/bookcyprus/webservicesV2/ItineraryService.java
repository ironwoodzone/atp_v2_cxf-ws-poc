
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItineraryServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ItineraryId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupplierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceDiff" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Hotel" type="{http://webservicesV2.bookcyprus.com/}HotelItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="Excursion" type="{http://webservicesV2.bookcyprus.com/}ExcursionItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="Transfer" type="{http://webservicesV2.bookcyprus.com/}TransferItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="Miscellaneous" type="{http://webservicesV2.bookcyprus.com/}MiscellaneousItineraryService" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="IsCustomisable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsAdditionalService" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRemovable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ParentItineraryServiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryService", propOrder = {
    "itineraryServiceId",
    "itineraryId",
    "supplierType",
    "priceDiff",
    "hotel",
    "excursion",
    "transfer",
    "miscellaneous",
    "sortOrder",
    "isCustomisable",
    "isAdditionalService",
    "isRemovable",
    "parentItineraryServiceId"
})
public class ItineraryService {

    @XmlElement(name = "ItineraryServiceId")
    protected int itineraryServiceId;
    @XmlElement(name = "ItineraryId")
    protected int itineraryId;
    @XmlElement(name = "SupplierType")
    protected String supplierType;
    @XmlElement(name = "PriceDiff", required = true)
    protected BigDecimal priceDiff;
    @XmlElement(name = "Hotel")
    protected HotelItineraryService hotel;
    @XmlElement(name = "Excursion")
    protected ExcursionItineraryService excursion;
    @XmlElement(name = "Transfer")
    protected TransferItineraryService transfer;
    @XmlElement(name = "Miscellaneous")
    protected MiscellaneousItineraryService miscellaneous;
    @XmlElement(name = "SortOrder")
    protected int sortOrder;
    @XmlElement(name = "IsCustomisable")
    protected boolean isCustomisable;
    @XmlElement(name = "IsAdditionalService")
    protected boolean isAdditionalService;
    @XmlElement(name = "IsRemovable")
    protected boolean isRemovable;
    @XmlElement(name = "ParentItineraryServiceId")
    protected int parentItineraryServiceId;

    /**
     * Gets the value of the itineraryServiceId property.
     * 
     */
    public int getItineraryServiceId() {
        return itineraryServiceId;
    }

    /**
     * Sets the value of the itineraryServiceId property.
     * 
     */
    public void setItineraryServiceId(int value) {
        this.itineraryServiceId = value;
    }

    /**
     * Gets the value of the itineraryId property.
     * 
     */
    public int getItineraryId() {
        return itineraryId;
    }

    /**
     * Sets the value of the itineraryId property.
     * 
     */
    public void setItineraryId(int value) {
        this.itineraryId = value;
    }

    /**
     * Gets the value of the supplierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierType() {
        return supplierType;
    }

    /**
     * Sets the value of the supplierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierType(String value) {
        this.supplierType = value;
    }

    /**
     * Gets the value of the priceDiff property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceDiff() {
        return priceDiff;
    }

    /**
     * Sets the value of the priceDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceDiff(BigDecimal value) {
        this.priceDiff = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link HotelItineraryService }
     *     
     */
    public HotelItineraryService getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelItineraryService }
     *     
     */
    public void setHotel(HotelItineraryService value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the excursion property.
     * 
     * @return
     *     possible object is
     *     {@link ExcursionItineraryService }
     *     
     */
    public ExcursionItineraryService getExcursion() {
        return excursion;
    }

    /**
     * Sets the value of the excursion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcursionItineraryService }
     *     
     */
    public void setExcursion(ExcursionItineraryService value) {
        this.excursion = value;
    }

    /**
     * Gets the value of the transfer property.
     * 
     * @return
     *     possible object is
     *     {@link TransferItineraryService }
     *     
     */
    public TransferItineraryService getTransfer() {
        return transfer;
    }

    /**
     * Sets the value of the transfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferItineraryService }
     *     
     */
    public void setTransfer(TransferItineraryService value) {
        this.transfer = value;
    }

    /**
     * Gets the value of the miscellaneous property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousItineraryService }
     *     
     */
    public MiscellaneousItineraryService getMiscellaneous() {
        return miscellaneous;
    }

    /**
     * Sets the value of the miscellaneous property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousItineraryService }
     *     
     */
    public void setMiscellaneous(MiscellaneousItineraryService value) {
        this.miscellaneous = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     */
    public int getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     */
    public void setSortOrder(int value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the isCustomisable property.
     * 
     */
    public boolean isIsCustomisable() {
        return isCustomisable;
    }

    /**
     * Sets the value of the isCustomisable property.
     * 
     */
    public void setIsCustomisable(boolean value) {
        this.isCustomisable = value;
    }

    /**
     * Gets the value of the isAdditionalService property.
     * 
     */
    public boolean isIsAdditionalService() {
        return isAdditionalService;
    }

    /**
     * Sets the value of the isAdditionalService property.
     * 
     */
    public void setIsAdditionalService(boolean value) {
        this.isAdditionalService = value;
    }

    /**
     * Gets the value of the isRemovable property.
     * 
     */
    public boolean isIsRemovable() {
        return isRemovable;
    }

    /**
     * Sets the value of the isRemovable property.
     * 
     */
    public void setIsRemovable(boolean value) {
        this.isRemovable = value;
    }

    /**
     * Gets the value of the parentItineraryServiceId property.
     * 
     */
    public int getParentItineraryServiceId() {
        return parentItineraryServiceId;
    }

    /**
     * Sets the value of the parentItineraryServiceId property.
     * 
     */
    public void setParentItineraryServiceId(int value) {
        this.parentItineraryServiceId = value;
    }

}
