
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExcursionQuestionAnswer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExcursionQuestionAnswer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionQuestionAnswer" type="{http://webservicesV2.bookcyprus.com/}ExcursionQuestionAnswer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExcursionQuestionAnswer", propOrder = {
    "excursionQuestionAnswer"
})
public class ArrayOfExcursionQuestionAnswer {

    @XmlElement(name = "ExcursionQuestionAnswer", nillable = true)
    protected List<ExcursionQuestionAnswer> excursionQuestionAnswer;

    /**
     * Gets the value of the excursionQuestionAnswer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excursionQuestionAnswer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcursionQuestionAnswer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcursionQuestionAnswer }
     * 
     * 
     */
    public List<ExcursionQuestionAnswer> getExcursionQuestionAnswer() {
        if (excursionQuestionAnswer == null) {
            excursionQuestionAnswer = new ArrayList<ExcursionQuestionAnswer>();
        }
        return this.excursionQuestionAnswer;
    }

}
