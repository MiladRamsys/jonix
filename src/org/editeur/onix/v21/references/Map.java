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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
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
 *       &lt;choice>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}p"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h1"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h2"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h3"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h4"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h5"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}h6"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}div"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ul"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}ol"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}dl"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}pre"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}hr"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}blockquote"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}address"/>
 *           &lt;element ref="{http://www.editeur.org/onix/2.1/reference}table"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.editeur.org/onix/2.1/reference}area" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="dir">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="ltr"/>
 *             &lt;enumeration value="rtl"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pOrH1OrH2",
    "area"
})
@XmlRootElement(name = "map")
public class Map {

    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "h1", type = H1 .class),
        @XmlElement(name = "h2", type = H2 .class),
        @XmlElement(name = "h3", type = H3 .class),
        @XmlElement(name = "h4", type = H4 .class),
        @XmlElement(name = "h5", type = H5 .class),
        @XmlElement(name = "h6", type = H6 .class),
        @XmlElement(name = "div", type = Div.class),
        @XmlElement(name = "ul", type = Ul.class),
        @XmlElement(name = "ol", type = Ol.class),
        @XmlElement(name = "dl", type = Dl.class),
        @XmlElement(name = "pre", type = Pre.class),
        @XmlElement(name = "hr", type = Hr.class),
        @XmlElement(name = "blockquote", type = Blockquote.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "table", type = Table.class)
    })
    protected List<java.lang.Object> pOrH1OrH2;
    protected List<Area> area;
    @XmlAttribute(name = "lang")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String lang;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "id", required = true)
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
    @XmlAttribute(name = "name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;

    /**
     * Gets the value of the pOrH1OrH2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pOrH1OrH2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOrH1OrH2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link H1 }
     * {@link H2 }
     * {@link H3 }
     * {@link H4 }
     * {@link H5 }
     * {@link H6 }
     * {@link Div }
     * {@link Ul }
     * {@link Ol }
     * {@link Dl }
     * {@link Pre }
     * {@link Hr }
     * {@link Blockquote }
     * {@link Address }
     * {@link Table }
     * 
     * 
     */
    public List<java.lang.Object> getPOrH1OrH2() {
        if (pOrH1OrH2 == null) {
            pOrH1OrH2 = new ArrayList<java.lang.Object>();
        }
        return this.pOrH1OrH2;
    }

    /**
     * Gets the value of the area property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the area property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Area }
     * 
     * 
     */
    public List<Area> getArea() {
        if (area == null) {
            area = new ArrayList<Area>();
        }
        return this.area;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
