
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcursionSearchLocationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionSearchLocationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchLocations" type="{http://webservicesV2.bookcyprus.com/}ArrayOfExcursionSearchLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionSearchLocationResponse", propOrder = {
    "baseResponse",
    "resultCount",
    "searchLocations"
})
public class ExcursionSearchLocationResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "SearchLocations")
    protected ArrayOfExcursionSearchLocation searchLocations;

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
     * Gets the value of the resultCount property.
     * 
     */
    public int getResultCount() {
        return resultCount;
    }

    /**
     * Sets the value of the resultCount property.
     * 
     */
    public void setResultCount(int value) {
        this.resultCount = value;
    }

    /**
     * Gets the value of the searchLocations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExcursionSearchLocation }
     *     
     */
    public ArrayOfExcursionSearchLocation getSearchLocations() {
        return searchLocations;
    }

    /**
     * Sets the value of the searchLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExcursionSearchLocation }
     *     
     */
    public void setSearchLocations(ArrayOfExcursionSearchLocation value) {
        this.searchLocations = value;
    }

}
