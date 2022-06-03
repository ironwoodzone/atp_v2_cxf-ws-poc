
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBookingConditionItemDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBookingConditionItemDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingConditionItemDetail" type="{http://webservicesV2.bookcyprus.com/}BookingConditionItemDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBookingConditionItemDetail", propOrder = {
    "bookingConditionItemDetail"
})
public class ArrayOfBookingConditionItemDetail {

    @XmlElement(name = "BookingConditionItemDetail", nillable = true)
    protected List<BookingConditionItemDetail> bookingConditionItemDetail;

    /**
     * Gets the value of the bookingConditionItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingConditionItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingConditionItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingConditionItemDetail }
     * 
     * 
     */
    public List<BookingConditionItemDetail> getBookingConditionItemDetail() {
        if (bookingConditionItemDetail == null) {
            bookingConditionItemDetail = new ArrayList<BookingConditionItemDetail>();
        }
        return this.bookingConditionItemDetail;
    }

}
