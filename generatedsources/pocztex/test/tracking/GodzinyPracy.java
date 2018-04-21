
package pocztex.test.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GodzinyPracy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GodzinyPracy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dniRobocze" type="{http://ws.sledzenie.pocztapolska.pl/xsd}GodzinyZUwagami" minOccurs="0"/>
 *         &lt;element name="niedzISw" type="{http://ws.sledzenie.pocztapolska.pl/xsd}GodzinyZUwagami" minOccurs="0"/>
 *         &lt;element name="soboty" type="{http://ws.sledzenie.pocztapolska.pl/xsd}GodzinyZUwagami" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GodzinyPracy", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "dniRobocze",
    "niedzISw",
    "soboty"
})
public class GodzinyPracy {

    @XmlElementRef(name = "dniRobocze", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<GodzinyZUwagami> dniRobocze;
    @XmlElementRef(name = "niedzISw", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<GodzinyZUwagami> niedzISw;
    @XmlElementRef(name = "soboty", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", type = JAXBElement.class)
    protected JAXBElement<GodzinyZUwagami> soboty;

    /**
     * Gets the value of the dniRobocze property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public JAXBElement<GodzinyZUwagami> getDniRobocze() {
        return dniRobocze;
    }

    /**
     * Sets the value of the dniRobocze property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public void setDniRobocze(JAXBElement<GodzinyZUwagami> value) {
        this.dniRobocze = ((JAXBElement<GodzinyZUwagami> ) value);
    }

    /**
     * Gets the value of the niedzISw property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public JAXBElement<GodzinyZUwagami> getNiedzISw() {
        return niedzISw;
    }

    /**
     * Sets the value of the niedzISw property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public void setNiedzISw(JAXBElement<GodzinyZUwagami> value) {
        this.niedzISw = ((JAXBElement<GodzinyZUwagami> ) value);
    }

    /**
     * Gets the value of the soboty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public JAXBElement<GodzinyZUwagami> getSoboty() {
        return soboty;
    }

    /**
     * Sets the value of the soboty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GodzinyZUwagami }{@code >}
     *     
     */
    public void setSoboty(JAXBElement<GodzinyZUwagami> value) {
        this.soboty = ((JAXBElement<GodzinyZUwagami> ) value);
    }

}
