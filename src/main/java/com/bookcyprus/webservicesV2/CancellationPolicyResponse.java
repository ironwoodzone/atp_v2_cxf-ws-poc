
package com.bookcyprus.webservicesV2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationPolicyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationPolicyResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PercentIfPendingSettlemet" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="PercentIfPaid" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationPolicyResponse", propOrder = {
    "minDays",
    "percentIfPendingSettlemet",
    "percentIfPaid"
})
public class CancellationPolicyResponse {

    @XmlElement(name = "MinDays")
    protected int minDays;
    @XmlElement(name = "PercentIfPendingSettlemet", required = true)
    protected BigDecimal percentIfPendingSettlemet;
    @XmlElement(name = "PercentIfPaid", required = true)
    protected BigDecimal percentIfPaid;

    /**
     * Gets the value of the minDays property.
     * 
     */
    public int getMinDays() {
        return minDays;
    }

    /**
     * Sets the value of the minDays property.
     * 
     */
    public void setMinDays(int value) {
        this.minDays = value;
    }

    /**
     * Gets the value of the percentIfPendingSettlemet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentIfPendingSettlemet() {
        return percentIfPendingSettlemet;
    }

    /**
     * Sets the value of the percentIfPendingSettlemet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentIfPendingSettlemet(BigDecimal value) {
        this.percentIfPendingSettlemet = value;
    }

    /**
     * Gets the value of the percentIfPaid property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentIfPaid() {
        return percentIfPaid;
    }

    /**
     * Sets the value of the percentIfPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentIfPaid(BigDecimal value) {
        this.percentIfPaid = value;
    }

}
