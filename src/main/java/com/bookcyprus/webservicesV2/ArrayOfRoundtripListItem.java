
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoundtripListItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoundtripListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripListItem" type="{http://webservicesV2.bookcyprus.com/}RoundtripListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoundtripListItem", propOrder = {
    "roundtripListItem"
})
public class ArrayOfRoundtripListItem {

    @XmlElement(name = "RoundtripListItem", nillable = true)
    protected List<RoundtripListItem> roundtripListItem;

    /**
     * Gets the value of the roundtripListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roundtripListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoundtripListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoundtripListItem }
     * 
     * 
     */
    public List<RoundtripListItem> getRoundtripListItem() {
        if (roundtripListItem == null) {
            roundtripListItem = new ArrayList<RoundtripListItem>();
        }
        return this.roundtripListItem;
    }

}
