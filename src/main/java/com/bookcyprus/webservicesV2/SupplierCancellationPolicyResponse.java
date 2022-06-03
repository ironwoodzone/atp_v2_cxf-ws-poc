
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SupplierCancellationPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierCancellationPolicyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseResponse" type="{http://webservicesV2.bookcyprus.com/}ResponseBase" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://webservicesV2.bookcyprus.com/}ArrayOfSupplierCancellationPolicyItem" minOccurs="0"/&gt;
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CheckinDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IndicativeServiceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierCancellationPolicyResponse", propOrder = {
    "baseResponse",
    "items",
    "supplierId",
    "checkinDate",
    "indicativeServiceAmount"
})
public class SupplierCancellationPolicyResponse {

    @XmlElement(name = "BaseResponse")
    protected ResponseBase baseResponse;
    @XmlElement(name = "Items")
    protected ArrayOfSupplierCancellationPolicyItem items;
    @XmlElement(name = "SupplierId")
    protected int supplierId;
    @XmlElement(name = "CheckinDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkinDate;
    @XmlElement(name = "IndicativeServiceAmount", required = true)
    protected BigDecimal indicativeServiceAmount;

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
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplierCancellationPolicyItem }
     *     
     */
    public ArrayOfSupplierCancellationPolicyItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplierCancellationPolicyItem }
     *     
     */
    public void setItems(ArrayOfSupplierCancellationPolicyItem value) {
        this.items = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the checkinDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckinDate() {
        return checkinDate;
    }

    /**
     * Sets the value of the checkinDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckinDate(XMLGregorianCalendar value) {
        this.checkinDate = value;
    }

    /**
     * Gets the value of the indicativeServiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIndicativeServiceAmount() {
        return indicativeServiceAmount;
    }

    /**
     * Sets the value of the indicativeServiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIndicativeServiceAmount(BigDecimal value) {
        this.indicativeServiceAmount = value;
    }

}
