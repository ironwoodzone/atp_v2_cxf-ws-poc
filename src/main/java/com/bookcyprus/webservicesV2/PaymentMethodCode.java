
package com.bookcyprus.webservicesV2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PaymentMethodCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ONACCOUNT"/&gt;
 *     &lt;enumeration value="CREDITCARD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodCode")
@XmlEnum
public enum PaymentMethodCode {

    ONACCOUNT,
    CREDITCARD;

    public String value() {
        return name();
    }

    public static PaymentMethodCode fromValue(String v) {
        return valueOf(v);
    }

}
