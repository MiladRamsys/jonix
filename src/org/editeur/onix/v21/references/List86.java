//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:12 AM IST 
//


package org.editeur.onix.v21.references;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for List86.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="List86">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHR"/>
 *     &lt;enumeration value="CHA"/>
 *     &lt;enumeration value="INT"/>
 *     &lt;enumeration value="PAR"/>
 *     &lt;enumeration value="STN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List86")
@XmlEnum
public enum List86 {


    /**
     * A Bible with the text organized in the order in which events are believed to have happened.
     * 
     */
    CHR,

    /**
     * A Bible which explores keywords or themes by referring text to preceding or following text.
     * 
     */
    CHA,

    /**
     * A Bible or other text in which different versions are printed one line above the other, so that the variations can easily be detected.
     * 
     */
    INT,

    /**
     * A Bible with two or more versions printed side by side.
     * 
     */
    PAR,

    /**
     * A Bible in which the text is presented in the traditional order.
     * 
     */
    STN;

    public String value() {
        return name();
    }

    public static List86 fromValue(String v) {
        return valueOf(v);
    }

}
