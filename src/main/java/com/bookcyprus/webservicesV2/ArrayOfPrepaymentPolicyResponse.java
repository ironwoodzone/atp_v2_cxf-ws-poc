
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPrepaymentPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPrepaymentPolicyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrepaymentPolicyResponse" type="{http://webservicesV2.bookcyprus.com/}PrepaymentPolicyResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPrepaymentPolicyResponse", propOrder = {
    "prepaymentPolicyResponse"
})
public class ArrayOfPrepaymentPolicyResponse {

    @XmlElement(name = "PrepaymentPolicyResponse", nillable = true)
    protected List<PrepaymentPolicyResponse> prepaymentPolicyResponse;

    /**
     * Gets the value of the prepaymentPolicyResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prepaymentPolicyResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrepaymentPolicyResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrepaymentPolicyResponse }
     * 
     * 
     */
    public List<PrepaymentPolicyResponse> getPrepaymentPolicyResponse() {
        if (prepaymentPolicyResponse == null) {
            prepaymentPolicyResponse = new ArrayList<PrepaymentPolicyResponse>();
        }
        return this.prepaymentPolicyResponse;
    }

}
