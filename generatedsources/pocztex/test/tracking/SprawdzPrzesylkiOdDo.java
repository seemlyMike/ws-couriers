
package pocztex.test.tracking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numer" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="odDnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doDnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numer",
    "odDnia",
    "doDnia"
})
@XmlRootElement(name = "sprawdzPrzesylkiOdDo")
public class SprawdzPrzesylkiOdDo {

    @XmlElement(nillable = true)
    protected List<String> numer;
    @XmlElementRef(name = "odDnia", namespace = "http://sledzenie.pocztapolska.pl", type = JAXBElement.class)
    protected JAXBElement<String> odDnia;
    @XmlElementRef(name = "doDnia", namespace = "http://sledzenie.pocztapolska.pl", type = JAXBElement.class)
    protected JAXBElement<String> doDnia;

    /**
     * Gets the value of the numer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumer() {
        if (numer == null) {
            numer = new ArrayList<String>();
        }
        return this.numer;
    }

    /**
     * Gets the value of the odDnia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdDnia() {
        return odDnia;
    }

    /**
     * Sets the value of the odDnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdDnia(JAXBElement<String> value) {
        this.odDnia = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the doDnia property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoDnia() {
        return doDnia;
    }

    /**
     * Sets the value of the doDnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoDnia(JAXBElement<String> value) {
        this.doDnia = ((JAXBElement<String> ) value);
    }

}
