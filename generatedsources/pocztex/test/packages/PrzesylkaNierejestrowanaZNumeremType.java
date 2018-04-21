
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaNierejestrowanaZNumeremType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaNierejestrowanaZNumeremType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaRejestrowanaType">
 *       &lt;sequence>
 *         &lt;element name="adres" type="{http://e-nadawca.poczta-polska.pl}adresType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="miejscowa" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="egzemplarzBiblioteczny" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="dlaOciemnialych" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="obszarMiasto" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" />
 *       &lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytType" />
 *       &lt;attribute name="serwis" type="{http://e-nadawca.poczta-polska.pl}serwisNierejestrowanaZNumeremType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaNierejestrowanaZNumeremType", propOrder = {
    "rest"
})
public class PrzesylkaNierejestrowanaZNumeremType
    extends PrzesylkaRejestrowanaType
{

    @XmlElementRef(name = "adres", type = JAXBElement.class)
    protected List<JAXBElement<AdresType>> rest;
    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "miejscowa")
    protected Boolean miejscowa;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "egzemplarzBiblioteczny")
    protected Boolean egzemplarzBiblioteczny;
    @XmlAttribute(name = "dlaOciemnialych")
    protected Boolean dlaOciemnialych;
    @XmlAttribute(name = "obszarMiasto")
    protected Boolean obszarMiasto;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "gabaryt")
    protected GabarytType gabaryt;
    @XmlAttribute(name = "serwis")
    protected SerwisNierejestrowanaZNumeremType serwis;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Adres" is used by two different parts of a schema. See: 
     * line 1724 of file:/home/mszwed/euvic/ws-couriers/src/main/resources/wsdl/pocztex_packages.wsdl
     * line 816 of file:/home/mszwed/euvic/ws-couriers/src/main/resources/wsdl/pocztex_packages.wsdl
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AdresType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<AdresType>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<AdresType>>();
        }
        return this.rest;
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
     * Gets the value of the miejscowa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMiejscowa() {
        if (miejscowa == null) {
            return false;
        } else {
            return miejscowa;
        }
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
     * Gets the value of the serwis property.
     * 
     * @return
     *     possible object is
     *     {@link SerwisNierejestrowanaZNumeremType }
     *     
     */
    public SerwisNierejestrowanaZNumeremType getSerwis() {
        return serwis;
    }

    /**
     * Sets the value of the serwis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SerwisNierejestrowanaZNumeremType }
     *     
     */
    public void setSerwis(SerwisNierejestrowanaZNumeremType value) {
        this.serwis = value;
    }

}
