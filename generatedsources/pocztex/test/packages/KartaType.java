
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kartaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kartaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="idKarta" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="opis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="aktywna" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kartaType")
public class KartaType {

    @XmlAttribute(name = "idKarta")
    protected Integer idKarta;
    @XmlAttribute(name = "opis")
    protected String opis;
    @XmlAttribute(name = "aktywna")
    protected Boolean aktywna;

    /**
     * Gets the value of the idKarta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdKarta() {
        return idKarta;
    }

    /**
     * Sets the value of the idKarta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdKarta(Integer value) {
        this.idKarta = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
    }

    /**
     * Gets the value of the aktywna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktywna() {
        return aktywna;
    }

    /**
     * Sets the value of the aktywna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktywna(Boolean value) {
        this.aktywna = value;
    }

}
