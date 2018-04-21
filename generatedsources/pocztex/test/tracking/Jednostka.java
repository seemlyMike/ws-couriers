
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Jednostka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Jednostka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="daneSzczegolowe" type="{http://ws.sledzenie.pocztapolska.pl/xsd}SzczDaneJednostki" minOccurs="0"/>
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Jednostka", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "daneSzczegolowe",
    "nazwa"
})
public class Jednostka {

    @XmlElementRef(name = "daneSzczegolowe", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<SzczDaneJednostki> daneSzczegolowe;
    @XmlElementRef(name = "nazwa", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> nazwa;

    /**
     * Gets the value of the daneSzczegolowe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SzczDaneJednostki }{@code >}
     *     
     */
    public JAXBElement<SzczDaneJednostki> getDaneSzczegolowe() {
        return daneSzczegolowe;
    }

    /**
     * Sets the value of the daneSzczegolowe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SzczDaneJednostki }{@code >}
     *     
     */
    public void setDaneSzczegolowe(JAXBElement<SzczDaneJednostki> value) {
        this.daneSzczegolowe = ((JAXBElement<SzczDaneJednostki> ) value);
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

}
