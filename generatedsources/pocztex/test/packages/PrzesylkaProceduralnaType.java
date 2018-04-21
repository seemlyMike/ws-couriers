
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaProceduralnaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaProceduralnaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/>
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/>
 *         &lt;element name="urzadWydaniaEPrzesylki" type="{http://e-nadawca.poczta-polska.pl}urzadWydaniaEPrzesylkiType" minOccurs="0"/>
 *         &lt;element name="pobranie" type="{http://e-nadawca.poczta-polska.pl}pobranieType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="serwis" type="{http://e-nadawca.poczta-polska.pl}serwisPrzesylkaProceduralnaType" />
 *       &lt;attribute name="idPrzesylkaZawartosc" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="idListaCzynnosci" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="opakowanie" type="{http://e-nadawca.poczta-polska.pl}opakowaniePrzesylkaProceduralnaType" />
 *       &lt;attribute name="numerPrzesylkiKlienta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" />
 *       &lt;attribute name="idAdresPrzesylkaPowrot" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaProceduralnaType", propOrder = {
    "ubezpieczenie",
    "epo",
    "urzadWydaniaEPrzesylki",
    "pobranie"
})
public class PrzesylkaProceduralnaType
    extends PrzesylkaRejestrowanaType
{

    protected UbezpieczenieType ubezpieczenie;
    protected EPOType epo;
    protected UrzadWydaniaEPrzesylkiType urzadWydaniaEPrzesylki;
    protected PobranieType pobranie;
    @XmlAttribute(name = "serwis")
    protected SerwisPrzesylkaProceduralnaType serwis;
    @XmlAttribute(name = "idPrzesylkaZawartosc")
    protected Integer idPrzesylkaZawartosc;
    @XmlAttribute(name = "idListaCzynnosci")
    protected Integer idListaCzynnosci;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "opakowanie")
    protected OpakowaniePrzesylkaProceduralnaType opakowanie;
    @XmlAttribute(name = "numerPrzesylkiKlienta")
    protected String numerPrzesylkiKlienta;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "idAdresPrzesylkaPowrot")
    protected Integer idAdresPrzesylkaPowrot;

    /**
     * Gets the value of the ubezpieczenie property.
     * 
     * @return
     *     possible object is
     *     {@link UbezpieczenieType }
     *     
     */
    public UbezpieczenieType getUbezpieczenie() {
        return ubezpieczenie;
    }

    /**
     * Sets the value of the ubezpieczenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link UbezpieczenieType }
     *     
     */
    public void setUbezpieczenie(UbezpieczenieType value) {
        this.ubezpieczenie = value;
    }

    /**
     * Gets the value of the epo property.
     * 
     * @return
     *     possible object is
     *     {@link EPOType }
     *     
     */
    public EPOType getEpo() {
        return epo;
    }

    /**
     * Sets the value of the epo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPOType }
     *     
     */
    public void setEpo(EPOType value) {
        this.epo = value;
    }

    /**
     * Gets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public UrzadWydaniaEPrzesylkiType getUrzadWydaniaEPrzesylki() {
        return urzadWydaniaEPrzesylki;
    }

    /**
     * Sets the value of the urzadWydaniaEPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrzadWydaniaEPrzesylkiType }
     *     
     */
    public void setUrzadWydaniaEPrzesylki(UrzadWydaniaEPrzesylkiType value) {
        this.urzadWydaniaEPrzesylki = value;
    }

    /**
     * Gets the value of the pobranie property.
     * 
     * @return
     *     possible object is
     *     {@link PobranieType }
     *     
     */
    public PobranieType getPobranie() {
        return pobranie;
    }

    /**
     * Sets the value of the pobranie property.
     * 
     * @param value
     *     allowed object is
     *     {@link PobranieType }
     *     
     */
    public void setPobranie(PobranieType value) {
        this.pobranie = value;
    }

    /**
     * Gets the value of the serwis property.
     * 
     * @return
     *     possible object is
     *     {@link SerwisPrzesylkaProceduralnaType }
     *     
     */
    public SerwisPrzesylkaProceduralnaType getSerwis() {
        return serwis;
    }

    /**
     * Sets the value of the serwis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerwisPrzesylkaProceduralnaType }
     *     
     */
    public void setSerwis(SerwisPrzesylkaProceduralnaType value) {
        this.serwis = value;
    }

    /**
     * Gets the value of the idPrzesylkaZawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPrzesylkaZawartosc() {
        return idPrzesylkaZawartosc;
    }

    /**
     * Sets the value of the idPrzesylkaZawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPrzesylkaZawartosc(Integer value) {
        this.idPrzesylkaZawartosc = value;
    }

    /**
     * Gets the value of the idListaCzynnosci property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdListaCzynnosci() {
        return idListaCzynnosci;
    }

    /**
     * Sets the value of the idListaCzynnosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdListaCzynnosci(Integer value) {
        this.idListaCzynnosci = value;
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the opakowanie property.
     * 
     * @return
     *     possible object is
     *     {@link OpakowaniePrzesylkaProceduralnaType }
     *     
     */
    public OpakowaniePrzesylkaProceduralnaType getOpakowanie() {
        return opakowanie;
    }

    /**
     * Sets the value of the opakowanie property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpakowaniePrzesylkaProceduralnaType }
     *     
     */
    public void setOpakowanie(OpakowaniePrzesylkaProceduralnaType value) {
        this.opakowanie = value;
    }

    /**
     * Gets the value of the numerPrzesylkiKlienta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerPrzesylkiKlienta() {
        return numerPrzesylkiKlienta;
    }

    /**
     * Sets the value of the numerPrzesylkiKlienta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerPrzesylkiKlienta(String value) {
        this.numerPrzesylkiKlienta = value;
    }

    /**
     * Gets the value of the wartosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWartosc() {
        return wartosc;
    }

    /**
     * Sets the value of the wartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWartosc(Integer value) {
        this.wartosc = value;
    }

    /**
     * Gets the value of the idAdresPrzesylkaPowrot property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAdresPrzesylkaPowrot() {
        return idAdresPrzesylkaPowrot;
    }

    /**
     * Sets the value of the idAdresPrzesylkaPowrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAdresPrzesylkaPowrot(Integer value) {
        this.idAdresPrzesylkaPowrot = value;
    }

}
