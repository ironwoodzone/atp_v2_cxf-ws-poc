
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcursionQuestionAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcursionQuestionAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuestionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassengerIndex" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcursionQuestionAnswer", propOrder = {
    "questionCode",
    "passengerIndex",
    "answer"
})
public class ExcursionQuestionAnswer {

    @XmlElement(name = "QuestionCode")
    protected String questionCode;
    @XmlElement(name = "PassengerIndex")
    protected int passengerIndex;
    @XmlElement(name = "Answer")
    protected String answer;

    /**
     * Gets the value of the questionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCode() {
        return questionCode;
    }

    /**
     * Sets the value of the questionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCode(String value) {
        this.questionCode = value;
    }

    /**
     * Gets the value of the passengerIndex property.
     * 
     */
    public int getPassengerIndex() {
        return passengerIndex;
    }

    /**
     * Sets the value of the passengerIndex property.
     * 
     */
    public void setPassengerIndex(int value) {
        this.passengerIndex = value;
    }

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

}
