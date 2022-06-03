
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
 *         &lt;element name="GetTransferSearchLocationsResult" type="{http://webservicesV2.bookcyprus.com/}TransferSearchLocationResponse" minOccurs="0"/&gt;
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
    "getTransferSearchLocationsResult"
})
@XmlRootElement(name = "GetTransferSearchLocationsResponse")
public class GetTransferSearchLocationsResponse {

    @XmlElement(name = "GetTransferSearchLocationsResult")
    protected TransferSearchLocationResponse getTransferSearchLocationsResult;

    /**
     * Gets the value of the getTransferSearchLocationsResult property.
     * 
     * @return
     *     possible object is
     *     {@link TransferSearchLocationResponse }
     *     
     */
    public TransferSearchLocationResponse getGetTransferSearchLocationsResult() {
        return getTransferSearchLocationsResult;
    }

    /**
     * Sets the value of the getTransferSearchLocationsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferSearchLocationResponse }
     *     
     */
    public void setGetTransferSearchLocationsResult(TransferSearchLocationResponse value) {
        this.getTransferSearchLocationsResult = value;
    }

}
