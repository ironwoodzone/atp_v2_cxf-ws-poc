
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookingConditionItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingConditionItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingConditionItem" type="{http://webservicesV2.bookcyprus.com/}BookingConditionItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBookingConditionItem", propOrder = {
    "bookingConditionItem"
})
public class ArrayOfBookingConditionItem {

    @XmlElement(name = "BookingConditionItem", nillable = true)
    protected List<BookingConditionItem> bookingConditionItem;

    /**
     * Gets the value of the bookingConditionItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingConditionItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingConditionItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingConditionItem }
     * 
     * 
     */
    public List<BookingConditionItem> getBookingConditionItem() {
        if (bookingConditionItem == null) {
            bookingConditionItem = new ArrayList<BookingConditionItem>();
        }
        return this.bookingConditionItem;
    }

}
