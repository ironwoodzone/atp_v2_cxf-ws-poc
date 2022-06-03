
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoundtripAvailabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoundtripAvailabilityResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="IsOnRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "RoundtripAvailabilityResponse", propOrder = {
    "baseResponse",
    "currency",
    "totalPrice",
    "isOnRequest",
    "roundtripInfo"
})
public class RoundtripAvailabilityResponse2 {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "TotalPrice", required = true)
    protected BigDecimal totalPrice;
    @XmlElement(name = "IsOnRequest")
    protected boolean isOnRequest;
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
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPrice(BigDecimal value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the isOnRequest property.
     * 
     */
    public boolean isIsOnRequest() {
        return isOnRequest;
    }

    /**
     * Sets the value of the isOnRequest property.
     * 
     */
    public void setIsOnRequest(boolean value) {
        this.isOnRequest = value;
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
