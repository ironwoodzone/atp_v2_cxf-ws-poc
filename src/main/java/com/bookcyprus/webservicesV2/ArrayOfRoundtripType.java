
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRoundtripType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoundtripType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoundtripType" type="{http://webservicesV2.bookcyprus.com/}RoundtripType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoundtripType", propOrder = {
    "roundtripType"
})
public class ArrayOfRoundtripType {

    @XmlElement(name = "RoundtripType", nillable = true)
    protected List<RoundtripType> roundtripType;

    /**
     * Gets the value of the roundtripType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roundtripType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoundtripType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoundtripType }
     * 
     * 
     */
    public List<RoundtripType> getRoundtripType() {
        if (roundtripType == null) {
            roundtripType = new ArrayList<RoundtripType>();
        }
        return this.roundtripType;
    }

}
