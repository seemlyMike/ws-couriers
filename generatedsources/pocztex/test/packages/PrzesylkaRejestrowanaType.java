
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaRejestrowanaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaRejestrowanaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType">
 *       &lt;sequence>
 *         &lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/>
 *         &lt;element name="nadawca" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" />
 *       &lt;attribute name="sygnatura" type="{http://e-nadawca.poczta-polska.pl}sygnaturaType" />
 *       &lt;attribute name="terminSprawy" type="{http://e-nadawca.poczta-polska.pl}terminType" />
 *       &lt;attribute name="rodzaj" type="{http://e-nadawca.poczta-polska.pl}rodzajType" />
 *       &lt;attribute name="weryfikacjaPlatnosci" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaRejestrowanaType", propOrder = {
    "adres",
    "nadawca"
})
@XmlSeeAlso({
    PrzesylkaEZwrotPaczkaType.class,
    PrzesylkaPoleconaKrajowaType.class,
    PrzesylkaBiznesowaPlusType.class,
    PrzesylkaNierejestrowanaZNumeremType.class,
    PrzesylkaPaletowaType.class,
    UslugaPaczkowaType.class,
    PrzesylkaZadeklarowanaWartoscZagranicznaType.class,
    PrzesylkaBiznesowaType.class,
    PrzesylkaProceduralnaType.class,
    EMSType.class,
    PrzesylkaPoleconaZagranicznaType.class,
    UslugaKurierskaType.class,
    PaczkaPocztowaType.class,
    PocztexKrajowyType.class,
    PrzesylkaEZwrotPocztexType.class,
    GlobalExpresType.class,
    PrzesylkaListowaZadeklarowanaWartoscType.class,
    PaczkaZagranicznaType.class,
    PrzesylkaHandlowaType.class,
    PrzesylkaFirmowaPoleconaType.class
})
public abstract class PrzesylkaRejestrowanaType
    extends PrzesylkaType
{

    protected AdresType adres;
    protected AdresType nadawca;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "sygnatura")
    protected String sygnatura;
    @XmlAttribute(name = "terminSprawy")
    protected String terminSprawy;
    @XmlAttribute(name = "rodzaj")
    protected String rodzaj;
    @XmlAttribute(name = "weryfikacjaPlatnosci")
    protected Boolean weryfikacjaPlatnosci;

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setAdres(AdresType value) {
        this.adres = value;
    }

    /**
     * Gets the value of the nadawca property.
     * 
     * @return
     *     possible object is
     *     {@link AdresType }
     *     
     */
    public AdresType getNadawca() {
        return nadawca;
    }

    /**
     * Sets the value of the nadawca property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresType }
     *     
     */
    public void setNadawca(AdresType value) {
        this.nadawca = value;
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
     * Gets the value of the sygnatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSygnatura() {
        return sygnatura;
    }

    /**
     * Sets the value of the sygnatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSygnatura(String value) {
        this.sygnatura = value;
    }

    /**
     * Gets the value of the terminSprawy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminSprawy() {
        return terminSprawy;
    }

    /**
     * Sets the value of the terminSprawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminSprawy(String value) {
        this.terminSprawy = value;
    }

    /**
     * Gets the value of the rodzaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzaj() {
        return rodzaj;
    }

    /**
     * Sets the value of the rodzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzaj(String value) {
        this.rodzaj = value;
    }

    /**
     * Gets the value of the weryfikacjaPlatnosci property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeryfikacjaPlatnosci() {
        return weryfikacjaPlatnosci;
    }

    /**
     * Sets the value of the weryfikacjaPlatnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeryfikacjaPlatnosci(Boolean value) {
        this.weryfikacjaPlatnosci = value;
    }

}
