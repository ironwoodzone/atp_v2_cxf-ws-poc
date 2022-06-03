
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHotelService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHotelService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelService" type="{http://webservicesV2.bookcyprus.com/}HotelService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHotelService", propOrder = {
    "hotelService"
})
public class ArrayOfHotelService {

    @XmlElement(name = "HotelService", nillable = true)
    protected List<HotelService> hotelService;

    /**
     * Gets the value of the hotelService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelService }
     * 
     * 
     */
    public List<HotelService> getHotelService() {
        if (hotelService == null) {
            hotelService = new ArrayList<HotelService>();
        }
        return this.hotelService;
    }

}
