
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Response" type="{http://webservicesV2.bookcyprus.com/}ResponseCode"/&gt;
 *         &lt;element name="ExecutionTime" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShortMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LongMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBase", propOrder = {
    "response",
    "executionTime",
    "shortMsg",
    "longMsg"
})
public class ResponseBase {

    @XmlElement(name = "Response", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseCode response;
    @XmlElement(name = "ExecutionTime")
    protected int executionTime;
    @XmlElement(name = "ShortMsg")
    protected String shortMsg;
    @XmlElement(name = "LongMsg")
    protected String longMsg;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseCode }
     *     
     */
    public ResponseCode getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseCode }
     *     
     */
    public void setResponse(ResponseCode value) {
        this.response = value;
    }

    /**
     * Gets the value of the executionTime property.
     * 
     */
    public int getExecutionTime() {
        return executionTime;
    }

    /**
     * Sets the value of the executionTime property.
     * 
     */
    public void setExecutionTime(int value) {
        this.executionTime = value;
    }

    /**
     * Gets the value of the shortMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortMsg() {
        return shortMsg;
    }

    /**
     * Sets the value of the shortMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortMsg(String value) {
        this.shortMsg = value;
    }

    /**
     * Gets the value of the longMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongMsg() {
        return longMsg;
    }

    /**
     * Sets the value of the longMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongMsg(String value) {
        this.longMsg = value;
    }

}
