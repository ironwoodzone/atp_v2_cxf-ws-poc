
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetSupplierCancellationPolicyResult" type="{http://webservicesV2.bookcyprus.com/}SupplierCancellationPolicyResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getSupplierCancellationPolicyResult"
})
@XmlRootElement(name = "GetSupplierCancellationPolicyResponse")
public class GetSupplierCancellationPolicyResponse {

    @XmlElement(name = "GetSupplierCancellationPolicyResult")
    protected SupplierCancellationPolicyResponse getSupplierCancellationPolicyResult;

    /**
     * Gets the value of the getSupplierCancellationPolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCancellationPolicyResponse }
     *     
     */
    public SupplierCancellationPolicyResponse getGetSupplierCancellationPolicyResult() {
        return getSupplierCancellationPolicyResult;
    }

    /**
     * Sets the value of the getSupplierCancellationPolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCancellationPolicyResponse }
     *     
     */
    public void setGetSupplierCancellationPolicyResult(SupplierCancellationPolicyResponse value) {
        this.getSupplierCancellationPolicyResult = value;
    }

}
