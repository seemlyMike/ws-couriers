
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pobranieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pobranieType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sposobPobrania" type="{http://e-nadawca.poczta-polska.pl}sposobPobraniaType" />
 *       &lt;attribute name="kwotaPobrania" type="{http://e-nadawca.poczta-polska.pl}kwotaPobraniaType" />
 *       &lt;attribute name="nrb">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="26"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="tytulem">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="54"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="sprawdzenieZawartosciPrzesylkiPrzezOdbiorce" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pobranieType")
public class PobranieType {

    @XmlAttribute(name = "sposobPobrania")
    protected SposobPobraniaType sposobPobrania;
    @XmlAttribute(name = "kwotaPobrania")
    protected Integer kwotaPobrania;
    @XmlAttribute(name = "nrb")
    protected String nrb;
    @XmlAttribute(name = "tytulem")
    protected String tytulem;
    @XmlAttribute(name = "sprawdzenieZawartosciPrzesylkiPrzezOdbiorce")
    protected Boolean sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;

    /**
     * Gets the value of the sposobPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link SposobPobraniaType }
     *     
     */
    public SposobPobraniaType getSposobPobrania() {
        return sposobPobrania;
    }

    /**
     * Sets the value of the sposobPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPobraniaType }
     *     
     */
    public void setSposobPobrania(SposobPobraniaType value) {
        this.sposobPobrania = value;
    }

    /**
     * Gets the value of the kwotaPobrania property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKwotaPobrania() {
        return kwotaPobrania;
    }

    /**
     * Sets the value of the kwotaPobrania property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKwotaPobrania(Integer value) {
        this.kwotaPobrania = value;
    }

    /**
     * Gets the value of the nrb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrb() {
        return nrb;
    }

    /**
     * Sets the value of the nrb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrb(String value) {
        this.nrb = value;
    }

    /**
     * Gets the value of the tytulem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTytulem() {
        return tytulem;
    }

    /**
     * Sets the value of the tytulem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTytulem(String value) {
        this.tytulem = value;
    }

    /**
     * Gets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSprawdzenieZawartosciPrzesylkiPrzezOdbiorce() {
        return sprawdzenieZawartosciPrzesylkiPrzezOdbiorce;
    }

    /**
     * Sets the value of the sprawdzenieZawartosciPrzesylkiPrzezOdbiorce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSprawdzenieZawartosciPrzesylkiPrzezOdbiorce(Boolean value) {
        this.sprawdzenieZawartosciPrzesylkiPrzezOdbiorce = value;
    }

}
