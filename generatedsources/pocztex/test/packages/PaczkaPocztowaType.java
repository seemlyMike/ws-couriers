
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paczkaPocztowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paczkaPocztowaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="epo" type="{http://e-nadawca.poczta-polska.pl}EPOType" minOccurs="0"/>
 *         &lt;element name="ubezpieczenie" type="{http://e-nadawca.poczta-polska.pl}ubezpieczenieType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="zasadySpecjalne" type="{http://e-nadawca.poczta-polska.pl}zasadySpecjalneEnum" />
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="iloscPotwierdzenOdbioru" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" default="0" />
 *       &lt;attribute name="kategoria" use="required" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" />
 *       &lt;attribute name="gabaryt" use="required" type="{http://e-nadawca.poczta-polska.pl}gabarytType" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="wartosc" type="{http://e-nadawca.poczta-polska.pl}wartoscType" />
 *       &lt;attribute name="egzemplarzBiblioteczny" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="dlaOciemnialych" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paczkaPocztowaType", propOrder = {
    "epo",
    "ubezpieczenie"
})
public class PaczkaPocztowaType
    extends PrzesylkaRejestrowanaType
{

    protected EPOType epo;
    protected UbezpieczenieType ubezpieczenie;
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
    @XmlAttribute(name = "wartosc")
    protected Integer wartosc;
    @XmlAttribute(name = "egzemplarzBiblioteczny")
    protected Boolean egzemplarzBiblioteczny;
    @XmlAttribute(name = "dlaOciemnialych")
    protected Boolean dlaOciemnialych;

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
     * Gets the value of the egzemplarzBiblioteczny property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEgzemplarzBiblioteczny() {
        if (egzemplarzBiblioteczny == null) {
            return false;
        } else {
            return egzemplarzBiblioteczny;
        }
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
    public boolean isDlaOciemnialych() {
        if (dlaOciemnialych == null) {
            return false;
        } else {
            return dlaOciemnialych;
        }
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

}
