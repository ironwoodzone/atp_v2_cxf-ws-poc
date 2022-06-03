
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelOccupancy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelOccupancy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Adults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ChildrenAges" type="{http://webservicesV2.bookcyprus.com/}ArrayOfInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelOccupancy", propOrder = {
    "roomIndex",
    "adults",
    "childrenAges"
})
public class HotelOccupancy {

    @XmlElement(name = "RoomIndex")
    protected int roomIndex;
    @XmlElement(name = "Adults")
    protected int adults;
    @XmlElement(name = "ChildrenAges")
    protected ArrayOfInt childrenAges;

    /**
     * Gets the value of the roomIndex property.
     * 
     */
    public int getRoomIndex() {
        return roomIndex;
    }

    /**
     * Sets the value of the roomIndex property.
     * 
     */
    public void setRoomIndex(int value) {
        this.roomIndex = value;
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
     * Gets the value of the childrenAges property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getChildrenAges() {
        return childrenAges;
    }

    /**
     * Sets the value of the childrenAges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setChildrenAges(ArrayOfInt value) {
        this.childrenAges = value;
    }

}
