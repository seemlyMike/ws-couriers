
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reklamacjaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reklamacjaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idReklamacja" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="guidPrzesylki" type="{http://e-nadawca.poczta-polska.pl}guidType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reklamacjaInfoType", propOrder = {
    "idReklamacja",
    "guidPrzesylki"
})
public class ReklamacjaInfoType {

    @XmlElement(required = true)
    protected String idReklamacja;
    @XmlElement(required = true)
    protected String guidPrzesylki;

    /**
     * Gets the value of the idReklamacja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReklamacja() {
        return idReklamacja;
    }

    /**
     * Sets the value of the idReklamacja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReklamacja(String value) {
        this.idReklamacja = value;
    }

    /**
     * Gets the value of the guidPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidPrzesylki() {
        return guidPrzesylki;
    }

    /**
     * Sets the value of the guidPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidPrzesylki(String value) {
        this.guidPrzesylki = value;
    }

}
