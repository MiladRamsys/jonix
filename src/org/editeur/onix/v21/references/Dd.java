//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:12 AM IST 
//


package org.editeur.onix.v21.references;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}p"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h1"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h2"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h3"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h4"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h5"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h6"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}div"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ul"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ol"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}dl"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}pre"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}hr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}blockquote"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}address"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}table"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}a"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}br"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}span"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}bdo"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}object"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}img"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}map"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}tt"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}i"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}b"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}big"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}small"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}em"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}strong"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}dfn"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}code"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}q"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}sub"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}sup"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}samp"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}kbd"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}var"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}cite"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}abbr"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}acronym"/>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ruby"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="dir">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ltr"/>
 *             &lt;enumeration value="rtl"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "dd")
public class Dd {

    @XmlElementRefs({
        @XmlElementRef(name = "sub", namespace = "http://www.editeur.org/onix/2.1/reference", type = Sub.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.editeur.org/onix/2.1/reference", type = Samp.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.editeur.org/onix/2.1/reference", type = Blockquote.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.editeur.org/onix/2.1/reference", type = Dfn.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.editeur.org/onix/2.1/reference", type = Abbr.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.editeur.org/onix/2.1/reference", type = H1 .class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.editeur.org/onix/2.1/reference", type = Br.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.editeur.org/onix/2.1/reference", type = B.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.editeur.org/onix/2.1/reference", type = Acronym.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.editeur.org/onix/2.1/reference", type = I.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.editeur.org/onix/2.1/reference", type = A.class, required = false),
        @XmlElementRef(name = "map", namespace = "http://www.editeur.org/onix/2.1/reference", type = Map.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.editeur.org/onix/2.1/reference", type = Var.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.editeur.org/onix/2.1/reference", type = Pre.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.editeur.org/onix/2.1/reference", type = org.editeur.onix.v21.references.Object.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.editeur.org/onix/2.1/reference", type = Ol.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.editeur.org/onix/2.1/reference", type = Tt.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.editeur.org/onix/2.1/reference", type = Div.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.editeur.org/onix/2.1/reference", type = Address.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.editeur.org/onix/2.1/reference", type = Kbd.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.editeur.org/onix/2.1/reference", type = H4 .class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.editeur.org/onix/2.1/reference", type = P.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.editeur.org/onix/2.1/reference", type = Code.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.editeur.org/onix/2.1/reference", type = Hr.class, required = false),
        @XmlElementRef(name = "bdo", namespace = "http://www.editeur.org/onix/2.1/reference", type = Bdo.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.editeur.org/onix/2.1/reference", type = H6 .class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.editeur.org/onix/2.1/reference", type = Ul.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.editeur.org/onix/2.1/reference", type = Cite.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.editeur.org/onix/2.1/reference", type = Q.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.editeur.org/onix/2.1/reference", type = Small.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.editeur.org/onix/2.1/reference", type = Dl.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.editeur.org/onix/2.1/reference", type = H2 .class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.editeur.org/onix/2.1/reference", type = Table.class, required = false),
        @XmlElementRef(name = "ruby", namespace = "http://www.editeur.org/onix/2.1/reference", type = Ruby.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.editeur.org/onix/2.1/reference", type = Sup.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.editeur.org/onix/2.1/reference", type = Big.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.editeur.org/onix/2.1/reference", type = Span.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.editeur.org/onix/2.1/reference", type = H5 .class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.editeur.org/onix/2.1/reference", type = H3 .class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.editeur.org/onix/2.1/reference", type = Strong.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.editeur.org/onix/2.1/reference", type = Img.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.editeur.org/onix/2.1/reference", type = Em.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "style")
    protected String style;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sub }
     * {@link Samp }
     * {@link Blockquote }
     * {@link Dfn }
     * {@link Br }
     * {@link H1 }
     * {@link Abbr }
     * {@link B }
     * {@link A }
     * {@link I }
     * {@link Acronym }
     * {@link Map }
     * {@link Var }
     * {@link Pre }
     * {@link org.editeur.onix.v21.references.Object }
     * {@link Ol }
     * {@link Tt }
     * {@link Div }
     * {@link Address }
     * {@link H4 }
     * {@link Kbd }
     * {@link P }
     * {@link Hr }
     * {@link Code }
     * {@link Bdo }
     * {@link H6 }
     * {@link Ul }
     * {@link Small }
     * {@link Q }
     * {@link Cite }
     * {@link Dl }
     * {@link Table }
     * {@link H2 }
     * {@link String }
     * {@link Sup }
     * {@link Ruby }
     * {@link Span }
     * {@link Big }
     * {@link H5 }
     * {@link H3 }
     * {@link Img }
     * {@link Strong }
     * {@link Em }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

}
