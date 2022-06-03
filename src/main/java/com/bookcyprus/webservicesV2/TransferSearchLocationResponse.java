
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferSearchLocationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferSearchLocationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="StartingPointId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ResultCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchLocations" type="{http://webservicesV2.bookcyprus.com/}ArrayOfTransferLocation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferSearchLocationResponse", propOrder = {
    "baseResponse",
    "startingPointId",
    "resultCount",
    "searchLocations"
})
public class TransferSearchLocationResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "StartingPointId")
    protected int startingPointId;
    @XmlElement(name = "ResultCount")
    protected int resultCount;
    @XmlElement(name = "SearchLocations")
    protected ArrayOfTransferLocation searchLocations;

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
     * Gets the value of the startingPointId property.
     * 
     */
    public int getStartingPointId() {
        return startingPointId;
    }

    /**
     * Sets the value of the startingPointId property.
     * 
     */
    public void setStartingPointId(int value) {
        this.startingPointId = value;
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
     *     {@link ArrayOfTransferLocation }
     *     
     */
    public ArrayOfTransferLocation getSearchLocations() {
        return searchLocations;
    }

    /**
     * Sets the value of the searchLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransferLocation }
     *     
     */
    public void setSearchLocations(ArrayOfTransferLocation value) {
        this.searchLocations = value;
    }

}
