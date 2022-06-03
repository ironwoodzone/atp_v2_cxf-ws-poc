
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundtripInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoundtripInfo" type="{http://webservicesV2.bookcyprus.com/}RoundtripInfoItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoundtripInfoResponse", propOrder = {
    "baseResponse",
    "token",
    "roundtripInfo"
})
public class RoundtripInfoResponse2 {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "RoundtripInfo")
    protected RoundtripInfoItem roundtripInfo;

    /**
     * Gets the value of the baseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseBase }
     *     
     */
    public ResponseBase getBaseResponse() {
        return baseResponse;
    }

    /**
     * Sets the value of the baseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseBase }
     *     
     */
    public void setBaseResponse(ResponseBase value) {
        this.baseResponse = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the roundtripInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RoundtripInfoItem }
     *     
     */
    public RoundtripInfoItem getRoundtripInfo() {
        return roundtripInfo;
    }

    /**
     * Sets the value of the roundtripInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundtripInfoItem }
     *     
     */
    public void setRoundtripInfo(RoundtripInfoItem value) {
        this.roundtripInfo = value;
    }

}
