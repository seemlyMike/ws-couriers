
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SzczDaneJednostki complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SzczDaneJednostki">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dlGeogr" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="godzinyPracy" type="{http://ws.sledzenie.pocztapolska.pl/xsd}GodzinyPracy" minOccurs="0"/>
 *         &lt;element name="miejscowosc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrDomu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrLokalu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="szerGeogr" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="ulica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SzczDaneJednostki", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "dlGeogr",
    "godzinyPracy",
    "miejscowosc",
    "nrDomu",
    "nrLokalu",
    "pna",
    "szerGeogr",
    "ulica"
})
public class SzczDaneJednostki {

    protected Float dlGeogr;
    @XmlElementRef(name = "godzinyPracy", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<GodzinyPracy> godzinyPracy;
    @XmlElementRef(name = "miejscowosc", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> miejscowosc;
    @XmlElementRef(name = "nrDomu", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nrDomu;
    @XmlElementRef(name = "nrLokalu", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nrLokalu;
    @XmlElementRef(name = "pna", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> pna;
    protected Float szerGeogr;
    @XmlElementRef(name = "ulica", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> ulica;

    /**
     * Gets the value of the dlGeogr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDlGeogr() {
        return dlGeogr;
    }

    /**
     * Sets the value of the dlGeogr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDlGeogr(Float value) {
        this.dlGeogr = value;
    }

    /**
     * Gets the value of the godzinyPracy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GodzinyPracy }{@code >}
     *     
     */
    public JAXBElement<GodzinyPracy> getGodzinyPracy() {
        return godzinyPracy;
    }

    /**
     * Sets the value of the godzinyPracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GodzinyPracy }{@code >}
     *     
     */
    public void setGodzinyPracy(JAXBElement<GodzinyPracy> value) {
        this.godzinyPracy = ((JAXBElement<GodzinyPracy> ) value);
    }

    /**
     * Gets the value of the miejscowosc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiejscowosc() {
        return miejscowosc;
    }

    /**
     * Sets the value of the miejscowosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiejscowosc(JAXBElement<String> value) {
        this.miejscowosc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nrDomu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrDomu() {
        return nrDomu;
    }

    /**
     * Sets the value of the nrDomu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrDomu(JAXBElement<String> value) {
        this.nrDomu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nrLokalu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNrLokalu() {
        return nrLokalu;
    }

    /**
     * Sets the value of the nrLokalu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNrLokalu(JAXBElement<String> value) {
        this.nrLokalu = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPna() {
        return pna;
    }

    /**
     * Sets the value of the pna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPna(JAXBElement<String> value) {
        this.pna = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the szerGeogr property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSzerGeogr() {
        return szerGeogr;
    }

    /**
     * Sets the value of the szerGeogr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSzerGeogr(Float value) {
        this.szerGeogr = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUlica(JAXBElement<String> value) {
        this.ulica = ((JAXBElement<String> ) value);
    }

}
