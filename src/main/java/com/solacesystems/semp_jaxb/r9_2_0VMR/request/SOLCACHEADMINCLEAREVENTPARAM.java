//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2019.10.25 at 09:51:26 AM EDT 
//


package com.solacesystems.semp_jaxb.r9_2_0VMR.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SOL_CACHE_ADMIN_CLEAR_EVENT_PARAM.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SOL_CACHE_ADMIN_CLEAR_EVENT_PARAM"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="lost-message"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SOL_CACHE_ADMIN_CLEAR_EVENT_PARAM")
@XmlEnum
public enum SOLCACHEADMINCLEAREVENTPARAM {

    @XmlEnumValue("lost-message")
    LOST_MESSAGE("lost-message");
    private final String value;

    SOLCACHEADMINCLEAREVENTPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SOLCACHEADMINCLEAREVENTPARAM fromValue(String v) {
        for (SOLCACHEADMINCLEAREVENTPARAM c: SOLCACHEADMINCLEAREVENTPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}