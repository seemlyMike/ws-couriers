
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paczkaZagranicznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paczkaZagranicznaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="zwrot" type="{http://e-nadawca.poczta-polska.pl}zwrotType" minOccurs="0"/>
 *         &lt;element name="deklaracjaCelna" type="{http://e-nadawca.poczta-polska.pl}deklaracjaCelnaType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" />
 *       &lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" />
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" />
 *       &lt;attribute name="utrudnionaManipulacja" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ekspres" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="numerReferencyjnyCelny" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paczkaZagranicznaType", propOrder = {
    "zwrot",
    "deklaracjaCelna"
})
public class PaczkaZagranicznaType
    extends PrzesylkaRejestrowanaType
{

    protected ZwrotType zwrot;
    protected DeklaracjaCelnaType deklaracjaCelna;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "utrudnionaManipulacja")
    protected Boolean utrudnionaManipulacja;
    @XmlAttribute(name = "ekspres")
    protected Boolean ekspres;
    @XmlAttribute(name = "numerReferencyjnyCelny")
    protected String numerReferencyjnyCelny;

    /**
     * Gets the value of the zwrot property.
     * 
     * @return
     *     possible object is
     *     {@link ZwrotType }
     *     
     */
    public ZwrotType getZwrot() {
        return zwrot;
    }

    /**
     * Sets the value of the zwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZwrotType }
     *     
     */
    public void setZwrot(ZwrotType value) {
        this.zwrot = value;
    }

    /**
     * Gets the value of the deklaracjaCelna property.
     * 
     * @return
     *     possible object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public DeklaracjaCelnaType getDeklaracjaCelna() {
        return deklaracjaCelna;
    }

    /**
     * Sets the value of the deklaracjaCelna property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeklaracjaCelnaType }
     *     
     */
    public void setDeklaracjaCelna(DeklaracjaCelnaType value) {
        this.deklaracjaCelna = value;
    }

    /**
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosteRestante() {
        return posteRestante;
    }

    /**
     * Sets the value of the posteRestante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosteRestante(Boolean value) {
        this.posteRestante = value;
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
     * Gets the value of the kategoria property.
     * 
     * @return
     *     possible object is
     *     {@link KategoriaType }
     *     
     */
    public KategoriaType getKategoria() {
        return kategoria;
    }

    /**
     * Sets the value of the kategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategoriaType }
     *     
     */
    public void setKategoria(KategoriaType value) {
        this.kategoria = value;
    }

    /**
     * Gets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIloscPotwierdzenOdbioru() {
        return iloscPotwierdzenOdbioru;
    }

    /**
     * Sets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIloscPotwierdzenOdbioru(Integer value) {
        this.iloscPotwierdzenOdbioru = value;
    }

    /**
     * Gets the value of the utrudnionaManipulacja property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtrudnionaManipulacja() {
        return utrudnionaManipulacja;
    }

    /**
     * Sets the value of the utrudnionaManipulacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtrudnionaManipulacja(Boolean value) {
        this.utrudnionaManipulacja = value;
    }

    /**
     * Gets the value of the ekspres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEkspres() {
        return ekspres;
    }

    /**
     * Sets the value of the ekspres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEkspres(Boolean value) {
        this.ekspres = value;
    }

    /**
     * Gets the value of the numerReferencyjnyCelny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerReferencyjnyCelny() {
        return numerReferencyjnyCelny;
    }

    /**
     * Sets the value of the numerReferencyjnyCelny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerReferencyjnyCelny(String value) {
        this.numerReferencyjnyCelny = value;
    }

}
