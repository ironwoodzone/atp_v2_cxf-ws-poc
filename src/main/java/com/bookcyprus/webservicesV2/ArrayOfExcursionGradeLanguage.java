
package com.bookcyprus.webservicesV2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExcursionGradeLanguage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExcursionGradeLanguage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExcursionGradeLanguage" type="{http://webservicesV2.bookcyprus.com/}ExcursionGradeLanguage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExcursionGradeLanguage", propOrder = {
    "excursionGradeLanguage"
})
public class ArrayOfExcursionGradeLanguage {

    @XmlElement(name = "ExcursionGradeLanguage", nillable = true)
    protected List<ExcursionGradeLanguage> excursionGradeLanguage;

    /**
     * Gets the value of the excursionGradeLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excursionGradeLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcursionGradeLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExcursionGradeLanguage }
     * 
     * 
     */
    public List<ExcursionGradeLanguage> getExcursionGradeLanguage() {
        if (excursionGradeLanguage == null) {
            excursionGradeLanguage = new ArrayList<ExcursionGradeLanguage>();
        }
        return this.excursionGradeLanguage;
    }

}
