
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaPoleconaKrajowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaPoleconaKrajowaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/>
 *         &lt;element name="potwierdzenieDoreczenia" type="{http://e-nadawca.poczta-polska.pl}potwierdzenieDoreczeniaType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" />
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" default="0" />
 *       &lt;attribute name="kategoria" use="required" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" />
 *       &lt;attribute name="gabaryt" use="required" type="{http://e-nadawca.poczta-polska.pl}gabarytType" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="egzemplarzBiblioteczny" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="dlaOciemnialych" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="obszarMiasto" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="miejscowa" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaPoleconaKrajowaType", propOrder = {
    "epo",
    "potwierdzenieDoreczenia"
})
public class PrzesylkaPoleconaKrajowaType
    extends PrzesylkaRejestrowanaType
{

    protected EPOType epo;
    protected PotwierdzenieDoreczeniaType potwierdzenieDoreczenia;
    @XmlAttribute(name = "zasadySpecjalne")
    protected ZasadySpecjalneEnum zasadySpecjalne;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "iloscPotwierdzenOdbioru")
    protected Integer iloscPotwierdzenOdbioru;
    @XmlAttribute(name = "kategoria", required = true)
    protected KategoriaType kategoria;
    @XmlAttribute(name = "gabaryt", required = true)
    protected GabarytType gabaryt;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "egzemplarzBiblioteczny")
    protected Boolean egzemplarzBiblioteczny;
    @XmlAttribute(name = "dlaOciemnialych")
    protected Boolean dlaOciemnialych;
    @XmlAttribute(name = "obszarMiasto")
    protected Boolean obszarMiasto;
    @XmlAttribute(name = "miejscowa")
    protected Boolean miejscowa;

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
     * Gets the value of the potwierdzenieDoreczenia property.
     * 
     * @return
     *     possible object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public PotwierdzenieDoreczeniaType getPotwierdzenieDoreczenia() {
        return potwierdzenieDoreczenia;
    }

    /**
     * Sets the value of the potwierdzenieDoreczenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PotwierdzenieDoreczeniaType }
     *     
     */
    public void setPotwierdzenieDoreczenia(PotwierdzenieDoreczeniaType value) {
        this.potwierdzenieDoreczenia = value;
    }

    /**
     * Gets the value of the zasadySpecjalne property.
     * 
     * @return
     *     possible object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public ZasadySpecjalneEnum getZasadySpecjalne() {
        return zasadySpecjalne;
    }

    /**
     * Sets the value of the zasadySpecjalne property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZasadySpecjalneEnum }
     *     
     */
    public void setZasadySpecjalne(ZasadySpecjalneEnum value) {
        this.zasadySpecjalne = value;
    }

    /**
     * Gets the value of the posteRestante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPosteRestante() {
        if (posteRestante == null) {
            return false;
        } else {
            return posteRestante;
        }
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
     * Gets the value of the iloscPotwierdzenOdbioru property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getIloscPotwierdzenOdbioru() {
        if (iloscPotwierdzenOdbioru == null) {
            return  0;
        } else {
            return iloscPotwierdzenOdbioru;
        }
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
     * Gets the value of the gabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link GabarytType }
     *     
     */
    public GabarytType getGabaryt() {
        return gabaryt;
    }

    /**
     * Sets the value of the gabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GabarytType }
     *     
     */
    public void setGabaryt(GabarytType value) {
        this.gabaryt = value;
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
     * Gets the value of the egzemplarzBiblioteczny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEgzemplarzBiblioteczny() {
        return egzemplarzBiblioteczny;
    }

    /**
     * Sets the value of the egzemplarzBiblioteczny property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEgzemplarzBiblioteczny(Boolean value) {
        this.egzemplarzBiblioteczny = value;
    }

    /**
     * Gets the value of the dlaOciemnialych property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDlaOciemnialych() {
        return dlaOciemnialych;
    }

    /**
     * Sets the value of the dlaOciemnialych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDlaOciemnialych(Boolean value) {
        this.dlaOciemnialych = value;
    }

    /**
     * Gets the value of the obszarMiasto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isObszarMiasto() {
        return obszarMiasto;
    }

    /**
     * Sets the value of the obszarMiasto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setObszarMiasto(Boolean value) {
        this.obszarMiasto = value;
    }

    /**
     * Gets the value of the miejscowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiejscowa() {
        return miejscowa;
    }

    /**
     * Sets the value of the miejscowa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiejscowa(Boolean value) {
        this.miejscowa = value;
    }

}
