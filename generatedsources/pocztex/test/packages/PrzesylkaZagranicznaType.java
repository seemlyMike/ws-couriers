
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaZagranicznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaZagranicznaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaNieRejestrowanaType">
 *       &lt;attribute name="posteRestante" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="kategoria" type="{http://e-nadawca.poczta-polska.pl}kategoriaType" />
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="ekspres" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="kraj" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaZagranicznaType")
public class PrzesylkaZagranicznaType
    extends PrzesylkaNieRejestrowanaType
{

    @XmlAttribute(name = "posteRestante")
    protected Boolean posteRestante;
    @XmlAttribute(name = "kategoria")
    protected KategoriaType kategoria;
    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "ekspres")
    protected Boolean ekspres;
    @XmlAttribute(name = "kraj")
    protected String kraj;

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
     * Gets the value of the ekspres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEkspres() {
        if (ekspres == null) {
            return false;
        } else {
            return ekspres;
        }
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
     * Gets the value of the kraj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKraj() {
        return kraj;
    }

    /**
     * Sets the value of the kraj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKraj(String value) {
        this.kraj = value;
    }

}
