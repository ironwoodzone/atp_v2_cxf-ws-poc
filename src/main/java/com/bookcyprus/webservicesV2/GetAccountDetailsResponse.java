
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
 *         &lt;element name="GetAccountDetailsResult" type="{http://webservicesV2.bookcyprus.com/}AccountDetailsResponse" minOccurs="0"/&gt;
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
    "getAccountDetailsResult"
})
@XmlRootElement(name = "GetAccountDetailsResponse")
public class GetAccountDetailsResponse {

    @XmlElement(name = "GetAccountDetailsResult")
    protected AccountDetailsResponse getAccountDetailsResult;

    /**
     * Gets the value of the getAccountDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetailsResponse }
     *     
     */
    public AccountDetailsResponse getGetAccountDetailsResult() {
        return getAccountDetailsResult;
    }

    /**
     * Sets the value of the getAccountDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetailsResponse }
     *     
     */
    public void setGetAccountDetailsResult(AccountDetailsResponse value) {
        this.getAccountDetailsResult = value;
    }

}
