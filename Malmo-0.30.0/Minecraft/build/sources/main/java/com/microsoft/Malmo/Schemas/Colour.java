//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.11 at 01:22:48 PM PDT 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Colour.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Colour">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="MAGENTA"/>
 *     &lt;enumeration value="LIGHT_BLUE"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="LIME"/>
 *     &lt;enumeration value="PINK"/>
 *     &lt;enumeration value="GRAY"/>
 *     &lt;enumeration value="SILVER"/>
 *     &lt;enumeration value="CYAN"/>
 *     &lt;enumeration value="PURPLE"/>
 *     &lt;enumeration value="BLUE"/>
 *     &lt;enumeration value="BROWN"/>
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="BLACK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Colour")
@XmlEnum
public enum Colour {

    WHITE,
    ORANGE,
    MAGENTA,
    LIGHT_BLUE,
    YELLOW,
    LIME,
    PINK,
    GRAY,
    SILVER,
    CYAN,
    PURPLE,
    BLUE,
    BROWN,
    GREEN,
    RED,
    BLACK;

    public String value() {
        return name();
    }

    public static Colour fromValue(String v) {
        return valueOf(v);
    }

}