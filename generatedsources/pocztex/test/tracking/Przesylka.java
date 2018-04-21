
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Przesylka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Przesylka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="danePrzesylki" type="{http://ws.sledzenie.pocztapolska.pl/xsd}DanePrzesylki" minOccurs="0"/>
 *         &lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Przesylka", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "danePrzesylki",
    "numer",
    "status"
})
public class Przesylka {

    @XmlElementRef(name = "danePrzesylki", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<DanePrzesylki> danePrzesylki;
    @XmlElementRef(name = "numer", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> numer;
    protected Integer status;

    /**
     * Gets the value of the danePrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DanePrzesylki }{@code >}
     *     
     */
    public JAXBElement<DanePrzesylki> getDanePrzesylki() {
        return danePrzesylki;
    }

    /**
     * Sets the value of the danePrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DanePrzesylki }{@code >}
     *     
     */
    public void setDanePrzesylki(JAXBElement<DanePrzesylki> value) {
        this.danePrzesylki = ((JAXBElement<DanePrzesylki> ) value);
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
    }

}
