//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.27 at 09:48:13 AM EDT 
//


package com.solacesystems.semp_jaxb.r7_2VMR.request;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DISK_UTILIZATION_PARAM.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DISK_UTILIZATION_PARAM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="md2"/>
 *     &lt;enumeration value="md6"/>
 *     &lt;enumeration value="externalSpool/p1"/>
 *     &lt;enumeration value="externalSpool/p2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DISK_UTILIZATION_PARAM")
@XmlEnum
public enum DISKUTILIZATIONPARAM {

    @XmlEnumValue("md2")
    MD_2("md2"),
    @XmlEnumValue("md6")
    MD_6("md6"),
    @XmlEnumValue("externalSpool/p1")
    EXTERNAL_SPOOL_P_1("externalSpool/p1"),
    @XmlEnumValue("externalSpool/p2")
    EXTERNAL_SPOOL_P_2("externalSpool/p2");
    private final String value;

    DISKUTILIZATIONPARAM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DISKUTILIZATIONPARAM fromValue(String v) {
        for (DISKUTILIZATIONPARAM c: DISKUTILIZATIONPARAM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}