
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for oczekujeNaZgodeEZwrotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oczekujeNaZgodeEZwrotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="idZgody" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nazwaProduktu" type="{http://e-nadawca.poczta-polska.pl}nazwaProduktuEZwrotType" />
 *       &lt;attribute name="numerZamowienia" type="{http://e-nadawca.poczta-polska.pl}numerZamowieniaEZwrotType" />
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" />
 *       &lt;attribute name="email" type="{http://e-nadawca.poczta-polska.pl}emailType" />
 *       &lt;attribute name="dataNadania" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="guidZgodaEZwrot" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oczekujeNaZgodeEZwrotType")
public class OczekujeNaZgodeEZwrotType {

    @XmlAttribute(name = "idZgody")
    protected Integer idZgody;
    @XmlAttribute(name = "nazwaProduktu")
    protected String nazwaProduktu;
    @XmlAttribute(name = "numerZamowienia")
    protected String numerZamowienia;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "dataNadania")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNadania;
    @XmlAttribute(name = "guidZgodaEZwrot")
    protected String guidZgodaEZwrot;

    /**
     * Gets the value of the idZgody property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdZgody() {
        return idZgody;
    }

    /**
     * Sets the value of the idZgody property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdZgody(Integer value) {
        this.idZgody = value;
    }

    /**
     * Gets the value of the nazwaProduktu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    /**
     * Sets the value of the nazwaProduktu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaProduktu(String value) {
        this.nazwaProduktu = value;
    }

    /**
     * Gets the value of the numerZamowienia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerZamowienia() {
        return numerZamowienia;
    }

    /**
     * Sets the value of the numerZamowienia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerZamowienia(String value) {
        this.numerZamowienia = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the guidZgodaEZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidZgodaEZwrot() {
        return guidZgodaEZwrot;
    }

    /**
     * Sets the value of the guidZgodaEZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidZgodaEZwrot(String value) {
        this.guidZgodaEZwrot = value;
    }

}
