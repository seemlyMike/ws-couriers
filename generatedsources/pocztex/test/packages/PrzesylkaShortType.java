
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for przesylkaShortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaShortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="czynnosciUpustowe" type="{http://e-nadawca.poczta-polska.pl}czynnoscUpustowaType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" />
 *       &lt;attribute name="guid" use="required" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *       &lt;attribute name="dataNadania" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="razem" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pobranie" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="status" type="{http://e-nadawca.poczta-polska.pl}statusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaShortType", propOrder = {
    "czynnosciUpustowe"
})
public class PrzesylkaShortType {

    protected List<CzynnoscUpustowaType> czynnosciUpustowe;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "guid", required = true)
    protected String guid;
    @XmlAttribute(name = "dataNadania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNadania;
    @XmlAttribute(name = "razem")
    protected Integer razem;
    @XmlAttribute(name = "pobranie")
    protected Integer pobranie;
    @XmlAttribute(name = "status")
    protected StatusType status;

    /**
     * Gets the value of the czynnosciUpustowe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the czynnosciUpustowe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCzynnosciUpustowe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CzynnoscUpustowaType }
     * 
     * 
     */
    public List<CzynnoscUpustowaType> getCzynnosciUpustowe() {
        if (czynnosciUpustowe == null) {
            czynnosciUpustowe = new ArrayList<CzynnoscUpustowaType>();
        }
        return this.czynnosciUpustowe;
    }

    /**
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadania(String value) {
        this.numerNadania = value;
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

    /**
     * Gets the value of the dataNadania property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNadania() {
        return dataNadania;
    }

    /**
     * Sets the value of the dataNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNadania(XMLGregorianCalendar value) {
        this.dataNadania = value;
    }

    /**
     * Gets the value of the razem property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRazem() {
        return razem;
    }

    /**
     * Sets the value of the razem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRazem(Integer value) {
        this.razem = value;
    }

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPobranie(Integer value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
