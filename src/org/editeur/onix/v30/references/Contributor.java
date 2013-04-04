//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.15 at 09:12:39 AM IST 
//


package org.editeur.onix.v30.references;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SequenceNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContributorRole" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}FromLanguage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ToLanguage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NameType" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NameIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}PersonName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}PersonNameInverted" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TitlesBeforeNames" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NamesBeforeKey" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}PrefixToKey" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}KeyNames"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}NamesAfterKey" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}SuffixToKey" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}LettersAfterNames" minOccurs="0"/>
 *           &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}TitlesAfterNames" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}CorporateName" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}CorporateNameInverted" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}AlternativeName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContributorDate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ProfessionalAffiliation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}BiographicalNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}Website" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContributorDescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}UnnamedPersons" minOccurs="0"/>
 *         &lt;element ref="{http://ns.editeur.org/onix/3.0/reference}ContributorPlace" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://ns.editeur.org/onix/3.0/reference}generalAttributes"/>
 *       &lt;attribute name="refname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="Contributor"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shortname">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="contributor"/>
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
    "sequenceNumber",
    "contributorRole",
    "fromLanguage",
    "toLanguage",
    "nameType",
    "nameIdentifier",
    "personName",
    "personNameInverted",
    "titlesBeforeNames",
    "namesBeforeKey",
    "prefixToKey",
    "keyNames",
    "namesAfterKey",
    "suffixToKey",
    "lettersAfterNames",
    "titlesAfterNames",
    "corporateName",
    "corporateNameInverted",
    "alternativeName",
    "contributorDate",
    "professionalAffiliation",
    "biographicalNote",
    "website",
    "contributorDescription",
    "unnamedPersons",
    "contributorPlace"
})
@XmlRootElement(name = "Contributor")
public class Contributor {

    @XmlElement(name = "SequenceNumber")
    protected SequenceNumber sequenceNumber;
    @XmlElement(name = "ContributorRole", required = true)
    protected List<ContributorRole> contributorRole;
    @XmlElement(name = "FromLanguage")
    protected List<FromLanguage> fromLanguage;
    @XmlElement(name = "ToLanguage")
    protected List<ToLanguage> toLanguage;
    @XmlElement(name = "NameType")
    protected NameType nameType;
    @XmlElement(name = "NameIdentifier")
    protected List<NameIdentifier> nameIdentifier;
    @XmlElement(name = "PersonName")
    protected PersonName personName;
    @XmlElement(name = "PersonNameInverted")
    protected PersonNameInverted personNameInverted;
    @XmlElement(name = "TitlesBeforeNames")
    protected TitlesBeforeNames titlesBeforeNames;
    @XmlElement(name = "NamesBeforeKey")
    protected NamesBeforeKey namesBeforeKey;
    @XmlElement(name = "PrefixToKey")
    protected PrefixToKey prefixToKey;
    @XmlElement(name = "KeyNames")
    protected KeyNames keyNames;
    @XmlElement(name = "NamesAfterKey")
    protected NamesAfterKey namesAfterKey;
    @XmlElement(name = "SuffixToKey")
    protected SuffixToKey suffixToKey;
    @XmlElement(name = "LettersAfterNames")
    protected LettersAfterNames lettersAfterNames;
    @XmlElement(name = "TitlesAfterNames")
    protected TitlesAfterNames titlesAfterNames;
    @XmlElement(name = "CorporateName")
    protected CorporateName corporateName;
    @XmlElement(name = "CorporateNameInverted")
    protected CorporateNameInverted corporateNameInverted;
    @XmlElement(name = "AlternativeName")
    protected List<AlternativeName> alternativeName;
    @XmlElement(name = "ContributorDate")
    protected List<ContributorDate> contributorDate;
    @XmlElement(name = "ProfessionalAffiliation")
    protected List<ProfessionalAffiliation> professionalAffiliation;
    @XmlElement(name = "BiographicalNote")
    protected List<BiographicalNote> biographicalNote;
    @XmlElement(name = "Website")
    protected List<Website> website;
    @XmlElement(name = "ContributorDescription")
    protected List<ContributorDescription> contributorDescription;
    @XmlElement(name = "UnnamedPersons")
    protected UnnamedPersons unnamedPersons;
    @XmlElement(name = "ContributorPlace")
    protected List<ContributorPlace> contributorPlace;
    @XmlAttribute(name = "refname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refname;
    @XmlAttribute(name = "shortname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shortname;
    @XmlAttribute(name = "datestamp")
    protected String datestamp;
    @XmlAttribute(name = "sourcetype")
    protected String sourcetype;
    @XmlAttribute(name = "sourcename")
    @XmlSchemaType(name = "anySimpleType")
    protected String sourcename;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceNumber }
     *     
     */
    public SequenceNumber getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceNumber }
     *     
     */
    public void setSequenceNumber(SequenceNumber value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the contributorRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorRole }
     * 
     * 
     */
    public List<ContributorRole> getContributorRole() {
        if (contributorRole == null) {
            contributorRole = new ArrayList<ContributorRole>();
        }
        return this.contributorRole;
    }

    /**
     * Gets the value of the fromLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fromLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FromLanguage }
     * 
     * 
     */
    public List<FromLanguage> getFromLanguage() {
        if (fromLanguage == null) {
            fromLanguage = new ArrayList<FromLanguage>();
        }
        return this.fromLanguage;
    }

    /**
     * Gets the value of the toLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToLanguage }
     * 
     * 
     */
    public List<ToLanguage> getToLanguage() {
        if (toLanguage == null) {
            toLanguage = new ArrayList<ToLanguage>();
        }
        return this.toLanguage;
    }

    /**
     * Gets the value of the nameType property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getNameType() {
        return nameType;
    }

    /**
     * Sets the value of the nameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setNameType(NameType value) {
        this.nameType = value;
    }

    /**
     * Gets the value of the nameIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameIdentifier }
     * 
     * 
     */
    public List<NameIdentifier> getNameIdentifier() {
        if (nameIdentifier == null) {
            nameIdentifier = new ArrayList<NameIdentifier>();
        }
        return this.nameIdentifier;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setPersonName(PersonName value) {
        this.personName = value;
    }

    /**
     * Gets the value of the personNameInverted property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameInverted }
     *     
     */
    public PersonNameInverted getPersonNameInverted() {
        return personNameInverted;
    }

    /**
     * Sets the value of the personNameInverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameInverted }
     *     
     */
    public void setPersonNameInverted(PersonNameInverted value) {
        this.personNameInverted = value;
    }

    /**
     * Gets the value of the titlesBeforeNames property.
     * 
     * @return
     *     possible object is
     *     {@link TitlesBeforeNames }
     *     
     */
    public TitlesBeforeNames getTitlesBeforeNames() {
        return titlesBeforeNames;
    }

    /**
     * Sets the value of the titlesBeforeNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitlesBeforeNames }
     *     
     */
    public void setTitlesBeforeNames(TitlesBeforeNames value) {
        this.titlesBeforeNames = value;
    }

    /**
     * Gets the value of the namesBeforeKey property.
     * 
     * @return
     *     possible object is
     *     {@link NamesBeforeKey }
     *     
     */
    public NamesBeforeKey getNamesBeforeKey() {
        return namesBeforeKey;
    }

    /**
     * Sets the value of the namesBeforeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamesBeforeKey }
     *     
     */
    public void setNamesBeforeKey(NamesBeforeKey value) {
        this.namesBeforeKey = value;
    }

    /**
     * Gets the value of the prefixToKey property.
     * 
     * @return
     *     possible object is
     *     {@link PrefixToKey }
     *     
     */
    public PrefixToKey getPrefixToKey() {
        return prefixToKey;
    }

    /**
     * Sets the value of the prefixToKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixToKey }
     *     
     */
    public void setPrefixToKey(PrefixToKey value) {
        this.prefixToKey = value;
    }

    /**
     * Gets the value of the keyNames property.
     * 
     * @return
     *     possible object is
     *     {@link KeyNames }
     *     
     */
    public KeyNames getKeyNames() {
        return keyNames;
    }

    /**
     * Sets the value of the keyNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyNames }
     *     
     */
    public void setKeyNames(KeyNames value) {
        this.keyNames = value;
    }

    /**
     * Gets the value of the namesAfterKey property.
     * 
     * @return
     *     possible object is
     *     {@link NamesAfterKey }
     *     
     */
    public NamesAfterKey getNamesAfterKey() {
        return namesAfterKey;
    }

    /**
     * Sets the value of the namesAfterKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamesAfterKey }
     *     
     */
    public void setNamesAfterKey(NamesAfterKey value) {
        this.namesAfterKey = value;
    }

    /**
     * Gets the value of the suffixToKey property.
     * 
     * @return
     *     possible object is
     *     {@link SuffixToKey }
     *     
     */
    public SuffixToKey getSuffixToKey() {
        return suffixToKey;
    }

    /**
     * Sets the value of the suffixToKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuffixToKey }
     *     
     */
    public void setSuffixToKey(SuffixToKey value) {
        this.suffixToKey = value;
    }

    /**
     * Gets the value of the lettersAfterNames property.
     * 
     * @return
     *     possible object is
     *     {@link LettersAfterNames }
     *     
     */
    public LettersAfterNames getLettersAfterNames() {
        return lettersAfterNames;
    }

    /**
     * Sets the value of the lettersAfterNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link LettersAfterNames }
     *     
     */
    public void setLettersAfterNames(LettersAfterNames value) {
        this.lettersAfterNames = value;
    }

    /**
     * Gets the value of the titlesAfterNames property.
     * 
     * @return
     *     possible object is
     *     {@link TitlesAfterNames }
     *     
     */
    public TitlesAfterNames getTitlesAfterNames() {
        return titlesAfterNames;
    }

    /**
     * Sets the value of the titlesAfterNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitlesAfterNames }
     *     
     */
    public void setTitlesAfterNames(TitlesAfterNames value) {
        this.titlesAfterNames = value;
    }

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateName }
     *     
     */
    public CorporateName getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateName }
     *     
     */
    public void setCorporateName(CorporateName value) {
        this.corporateName = value;
    }

    /**
     * Gets the value of the corporateNameInverted property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateNameInverted }
     *     
     */
    public CorporateNameInverted getCorporateNameInverted() {
        return corporateNameInverted;
    }

    /**
     * Sets the value of the corporateNameInverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateNameInverted }
     *     
     */
    public void setCorporateNameInverted(CorporateNameInverted value) {
        this.corporateNameInverted = value;
    }

    /**
     * Gets the value of the alternativeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeName }
     * 
     * 
     */
    public List<AlternativeName> getAlternativeName() {
        if (alternativeName == null) {
            alternativeName = new ArrayList<AlternativeName>();
        }
        return this.alternativeName;
    }

    /**
     * Gets the value of the contributorDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorDate }
     * 
     * 
     */
    public List<ContributorDate> getContributorDate() {
        if (contributorDate == null) {
            contributorDate = new ArrayList<ContributorDate>();
        }
        return this.contributorDate;
    }

    /**
     * Gets the value of the professionalAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalAffiliation }
     * 
     * 
     */
    public List<ProfessionalAffiliation> getProfessionalAffiliation() {
        if (professionalAffiliation == null) {
            professionalAffiliation = new ArrayList<ProfessionalAffiliation>();
        }
        return this.professionalAffiliation;
    }

    /**
     * Gets the value of the biographicalNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biographicalNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiographicalNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiographicalNote }
     * 
     * 
     */
    public List<BiographicalNote> getBiographicalNote() {
        if (biographicalNote == null) {
            biographicalNote = new ArrayList<BiographicalNote>();
        }
        return this.biographicalNote;
    }

    /**
     * Gets the value of the website property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the website property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebsite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Website }
     * 
     * 
     */
    public List<Website> getWebsite() {
        if (website == null) {
            website = new ArrayList<Website>();
        }
        return this.website;
    }

    /**
     * Gets the value of the contributorDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorDescription }
     * 
     * 
     */
    public List<ContributorDescription> getContributorDescription() {
        if (contributorDescription == null) {
            contributorDescription = new ArrayList<ContributorDescription>();
        }
        return this.contributorDescription;
    }

    /**
     * Gets the value of the unnamedPersons property.
     * 
     * @return
     *     possible object is
     *     {@link UnnamedPersons }
     *     
     */
    public UnnamedPersons getUnnamedPersons() {
        return unnamedPersons;
    }

    /**
     * Sets the value of the unnamedPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnnamedPersons }
     *     
     */
    public void setUnnamedPersons(UnnamedPersons value) {
        this.unnamedPersons = value;
    }

    /**
     * Gets the value of the contributorPlace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributorPlace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributorPlace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContributorPlace }
     * 
     * 
     */
    public List<ContributorPlace> getContributorPlace() {
        if (contributorPlace == null) {
            contributorPlace = new ArrayList<ContributorPlace>();
        }
        return this.contributorPlace;
    }

    /**
     * Gets the value of the refname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefname() {
        return refname;
    }

    /**
     * Sets the value of the refname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefname(String value) {
        this.refname = value;
    }

    /**
     * Gets the value of the shortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Sets the value of the shortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Gets the value of the datestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatestamp() {
        return datestamp;
    }

    /**
     * Sets the value of the datestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatestamp(String value) {
        this.datestamp = value;
    }

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the sourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcename() {
        return sourcename;
    }

    /**
     * Sets the value of the sourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcename(String value) {
        this.sourcename = value;
    }

}