
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DanePrzesylki complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DanePrzesylki">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataNadania" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="kodKrajuNadania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodKrajuPrzezn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kodRodzPrzes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="krajNadania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="krajPrzezn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masa" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rodzPrzes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urzadNadania" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Jednostka" minOccurs="0"/>
 *         &lt;element name="urzadPrzezn" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Jednostka" minOccurs="0"/>
 *         &lt;element name="zakonczonoObsluge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="zdarzenia" type="{http://ws.sledzenie.pocztapolska.pl/xsd}ListaZdarzen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DanePrzesylki", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "dataNadania",
    "kodKrajuNadania",
    "kodKrajuPrzezn",
    "kodRodzPrzes",
    "krajNadania",
    "krajPrzezn",
    "masa",
    "numer",
    "rodzPrzes",
    "urzadNadania",
    "urzadPrzezn",
    "zakonczonoObsluge",
    "zdarzenia"
})
public class DanePrzesylki {

    @XmlElementRef(name = "dataNadania", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataNadania;
    @XmlElementRef(name = "kodKrajuNadania", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> kodKrajuNadania;
    @XmlElementRef(name = "kodKrajuPrzezn", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> kodKrajuPrzezn;
    @XmlElementRef(name = "kodRodzPrzes", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> kodRodzPrzes;
    @XmlElementRef(name = "krajNadania", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> krajNadania;
    @XmlElementRef(name = "krajPrzezn", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> krajPrzezn;
    @XmlElementRef(name = "masa", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<Float> masa;
    @XmlElementRef(name = "numer", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> numer;
    @XmlElementRef(name = "rodzPrzes", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> rodzPrzes;
    @XmlElementRef(name = "urzadNadania", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<Jednostka> urzadNadania;
    @XmlElementRef(name = "urzadPrzezn", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<Jednostka> urzadPrzezn;
    protected Boolean zakonczonoObsluge;
    @XmlElementRef(name = "zdarzenia", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<ListaZdarzen> zdarzenia;

    /**
     * Gets the value of the dataNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNadania() {
        return dataNadania;
    }

    /**
     * Sets the value of the dataNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNadania(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNadania = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the kodKrajuNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodKrajuNadania() {
        return kodKrajuNadania;
    }

    /**
     * Sets the value of the kodKrajuNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodKrajuNadania(JAXBElement<String> value) {
        this.kodKrajuNadania = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the kodKrajuPrzezn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodKrajuPrzezn() {
        return kodKrajuPrzezn;
    }

    /**
     * Sets the value of the kodKrajuPrzezn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodKrajuPrzezn(JAXBElement<String> value) {
        this.kodKrajuPrzezn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the kodRodzPrzes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodRodzPrzes() {
        return kodRodzPrzes;
    }

    /**
     * Sets the value of the kodRodzPrzes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodRodzPrzes(JAXBElement<String> value) {
        this.kodRodzPrzes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the krajNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKrajNadania() {
        return krajNadania;
    }

    /**
     * Sets the value of the krajNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKrajNadania(JAXBElement<String> value) {
        this.krajNadania = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the krajPrzezn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKrajPrzezn() {
        return krajPrzezn;
    }

    /**
     * Sets the value of the krajPrzezn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKrajPrzezn(JAXBElement<String> value) {
        this.krajPrzezn = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setMasa(JAXBElement<Float> value) {
        this.masa = ((JAXBElement<Float> ) value);
    }

    /**
     * Gets the value of the numer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumer() {
        return numer;
    }

    /**
     * Sets the value of the numer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumer(JAXBElement<String> value) {
        this.numer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the rodzPrzes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzPrzes() {
        return rodzPrzes;
    }

    /**
     * Sets the value of the rodzPrzes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzPrzes(JAXBElement<String> value) {
        this.rodzPrzes = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the urzadNadania property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public JAXBElement<Jednostka> getUrzadNadania() {
        return urzadNadania;
    }

    /**
     * Sets the value of the urzadNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public void setUrzadNadania(JAXBElement<Jednostka> value) {
        this.urzadNadania = ((JAXBElement<Jednostka> ) value);
    }

    /**
     * Gets the value of the urzadPrzezn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public JAXBElement<Jednostka> getUrzadPrzezn() {
        return urzadPrzezn;
    }

    /**
     * Sets the value of the urzadPrzezn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public void setUrzadPrzezn(JAXBElement<Jednostka> value) {
        this.urzadPrzezn = ((JAXBElement<Jednostka> ) value);
    }

    /**
     * Gets the value of the zakonczonoObsluge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZakonczonoObsluge() {
        return zakonczonoObsluge;
    }

    /**
     * Sets the value of the zakonczonoObsluge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZakonczonoObsluge(Boolean value) {
        this.zakonczonoObsluge = value;
    }

    /**
     * Gets the value of the zdarzenia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaZdarzen }{@code >}
     *     
     */
    public JAXBElement<ListaZdarzen> getZdarzenia() {
        return zdarzenia;
    }

    /**
     * Sets the value of the zdarzenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaZdarzen }{@code >}
     *     
     */
    public void setZdarzenia(JAXBElement<ListaZdarzen> value) {
        this.zdarzenia = ((JAXBElement<ListaZdarzen> ) value);
    }

}
