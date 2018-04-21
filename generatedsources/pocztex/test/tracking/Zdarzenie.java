
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Zdarzenie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Zdarzenie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="czas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jednostka" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Jednostka" minOccurs="0"/>
 *         &lt;element name="kod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="konczace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="przyczyna" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Przyczyna" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zdarzenie", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "czas",
    "jednostka",
    "kod",
    "konczace",
    "nazwa",
    "przyczyna"
})
public class Zdarzenie {

    @XmlElementRef(name = "czas", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> czas;
    @XmlElementRef(name = "jednostka", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<Jednostka> jednostka;
    @XmlElementRef(name = "kod", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> kod;
    protected Boolean konczace;
    @XmlElementRef(name = "nazwa", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nazwa;
    @XmlElementRef(name = "przyczyna", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<Przyczyna> przyczyna;

    /**
     * Gets the value of the czas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCzas() {
        return czas;
    }

    /**
     * Sets the value of the czas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCzas(JAXBElement<String> value) {
        this.czas = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the jednostka property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public JAXBElement<Jednostka> getJednostka() {
        return jednostka;
    }

    /**
     * Sets the value of the jednostka property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Jednostka }{@code >}
     *     
     */
    public void setJednostka(JAXBElement<Jednostka> value) {
        this.jednostka = ((JAXBElement<Jednostka> ) value);
    }

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKod(JAXBElement<String> value) {
        this.kod = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the konczace property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKonczace() {
        return konczace;
    }

    /**
     * Sets the value of the konczace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKonczace(Boolean value) {
        this.konczace = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa(JAXBElement<String> value) {
        this.nazwa = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the przyczyna property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Przyczyna }{@code >}
     *     
     */
    public JAXBElement<Przyczyna> getPrzyczyna() {
        return przyczyna;
    }

    /**
     * Sets the value of the przyczyna property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Przyczyna }{@code >}
     *     
     */
    public void setPrzyczyna(JAXBElement<Przyczyna> value) {
        this.przyczyna = ((JAXBElement<Przyczyna> ) value);
    }

}
