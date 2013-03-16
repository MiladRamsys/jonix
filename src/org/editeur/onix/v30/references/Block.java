//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:39 AM IST 
//


package org.editeur.onix.v30.references;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Block">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}block" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Block", propOrder = {
    "block"
})
@XmlSeeAlso({
    Blockquote.class
})
public class Block {

    @XmlElementRef(name = "block", namespace = "http://ns.editeur.org/onix/3.0/reference", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> block;

    /**
     * Gets the value of the block property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the block property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Address }{@code >}
     * {@link JAXBElement }{@code <}{@link H6 }{@code >}
     * {@link JAXBElement }{@code <}{@link Table }{@code >}
     * {@link JAXBElement }{@code <}{@link Ol }{@code >}
     * {@link JAXBElement }{@code <}{@link Ul }{@code >}
     * {@link JAXBElement }{@code <}{@link Blockquote }{@code >}
     * {@link JAXBElement }{@code <}{@link H5 }{@code >}
     * {@link JAXBElement }{@code <}{@link P }{@code >}
     * {@link JAXBElement }{@code <}{@link H4 }{@code >}
     * {@link JAXBElement }{@code <}{@link Dl }{@code >}
     * {@link JAXBElement }{@code <}{@link H1 }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Div }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link H2 }{@code >}
     * {@link JAXBElement }{@code <}{@link H3 }{@code >}
     * {@link JAXBElement }{@code <}{@link Hr }{@code >}
     * {@link JAXBElement }{@code <}{@link java.lang.Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Pre }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getBlock() {
        if (block == null) {
            block = new ArrayList<JAXBElement<?>>();
        }
        return this.block;
    }

}
