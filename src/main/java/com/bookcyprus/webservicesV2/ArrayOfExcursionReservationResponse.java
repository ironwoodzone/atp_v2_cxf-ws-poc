
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExcursionReservationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExcursionReservationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionReservationResponse" type="{http://webservicesV2.bookcyprus.com/}ExcursionReservationResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExcursionReservationResponse", propOrder = {
    "excursionReservationResponse"
})
public class ArrayOfExcursionReservationResponse {

    @XmlElement(name = "ExcursionReservationResponse", nillable = true)
    protected List<ExcursionReservationResponse> excursionReservationResponse;

    /**
     * Gets the value of the excursionReservationResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excursionReservationResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcursionReservationResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcursionReservationResponse }
     * 
     * 
     */
    public List<ExcursionReservationResponse> getExcursionReservationResponse() {
        if (excursionReservationResponse == null) {
            excursionReservationResponse = new ArrayList<ExcursionReservationResponse>();
        }
        return this.excursionReservationResponse;
    }

}
