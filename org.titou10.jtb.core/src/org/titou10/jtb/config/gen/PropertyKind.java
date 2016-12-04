
package org.titou10.jtb.config.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyKind.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propertyKind">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="LONG"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="SHORT"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="DOUBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propertyKind")
@XmlEnum
public enum PropertyKind {

    STRING,
    BOOLEAN,
    LONG,
    INT,
    SHORT,
    FLOAT,
    DOUBLE;

    public String value() {
        return name();
    }

    public static PropertyKind fromValue(String v) {
        return valueOf(v);
    }

}
