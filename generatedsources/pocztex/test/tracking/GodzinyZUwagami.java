
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GodzinyZUwagami complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GodzinyZUwagami">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="godziny" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uwagi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GodzinyZUwagami", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "godziny",
    "uwagi"
})
public class GodzinyZUwagami {

    @XmlElementRef(name = "godziny", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> godziny;
    @XmlElementRef(name = "uwagi", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<String> uwagi;

    /**
     * Gets the value of the godziny property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGodziny() {
        return godziny;
    }

    /**
     * Sets the value of the godziny property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGodziny(JAXBElement<String> value) {
        this.godziny = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the uwagi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUwagi() {
        return uwagi;
    }

    /**
     * Sets the value of the uwagi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUwagi(JAXBElement<String> value) {
        this.uwagi = ((JAXBElement<String> ) value);
    }

}
