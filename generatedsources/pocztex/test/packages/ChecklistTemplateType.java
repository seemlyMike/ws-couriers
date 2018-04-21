
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for checklistTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checklistTemplateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idChecklistTemplate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://e-nadawca.poczta-polska.pl}nameChecklistType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://e-nadawca.poczta-polska.pl}titleChecklistType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://e-nadawca.poczta-polska.pl}descriptionChecklistType" minOccurs="0"/>
 *         &lt;element name="infoForCourier" type="{http://e-nadawca.poczta-polska.pl}infoForCourierType" minOccurs="0"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="logo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="service" type="{http://e-nadawca.poczta-polska.pl}serwisPrzesylkaProceduralnaType" minOccurs="0"/>
 *         &lt;element name="additionalActivity" type="{http://e-nadawca.poczta-polska.pl}additionalActivityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checklistTemplateType", propOrder = {
    "idChecklistTemplate",
    "idKarta",
    "name",
    "title",
    "description",
    "infoForCourier",
    "_default",
    "validFrom",
    "validTo",
    "logo",
    "service",
    "additionalActivity",
    "guid"
})
public class ChecklistTemplateType {

    protected Integer idChecklistTemplate;
    protected Integer idKarta;
    protected String name;
    protected String title;
    protected String description;
    protected String infoForCourier;
    @XmlElement(name = "default")
    protected Boolean _default;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    protected byte[] logo;
    protected SerwisPrzesylkaProceduralnaType service;
    protected List<AdditionalActivityType> additionalActivity;
    protected String guid;

    /**
     * Gets the value of the idChecklistTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdChecklistTemplate() {
        return idChecklistTemplate;
    }

    /**
     * Sets the value of the idChecklistTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdChecklistTemplate(Integer value) {
        this.idChecklistTemplate = value;
    }

    /**
     * Gets the value of the idKarta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdKarta() {
        return idKarta;
    }

    /**
     * Sets the value of the idKarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdKarta(Integer value) {
        this.idKarta = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the infoForCourier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoForCourier() {
        return infoForCourier;
    }

    /**
     * Sets the value of the infoForCourier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoForCourier(String value) {
        this.infoForCourier = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setLogo(byte[] value) {
        this.logo = ((byte[]) value);
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link SerwisPrzesylkaProceduralnaType }
     *     
     */
    public SerwisPrzesylkaProceduralnaType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerwisPrzesylkaProceduralnaType }
     *     
     */
    public void setService(SerwisPrzesylkaProceduralnaType value) {
        this.service = value;
    }

    /**
     * Gets the value of the additionalActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalActivityType }
     * 
     * 
     */
    public List<AdditionalActivityType> getAdditionalActivity() {
        if (additionalActivity == null) {
            additionalActivity = new ArrayList<AdditionalActivityType>();
        }
        return this.additionalActivity;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
