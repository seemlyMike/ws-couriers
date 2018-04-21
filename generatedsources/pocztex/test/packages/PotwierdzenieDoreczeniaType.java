
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potwierdzenieDoreczeniaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potwierdzenieDoreczeniaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobDoreczeniaPotwierdzeniaType" />
 *       &lt;attribute name="kontakt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieDoreczeniaType")
public class PotwierdzenieDoreczeniaType {

    @XmlAttribute(name = "sposob")
    protected SposobDoreczeniaPotwierdzeniaType sposob;
    @XmlAttribute(name = "kontakt")
    protected String kontakt;

    /**
     * Gets the value of the sposob property.
     * 
     * @return
     *     possible object is
     *     {@link SposobDoreczeniaPotwierdzeniaType }
     *     
     */
    public SposobDoreczeniaPotwierdzeniaType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobDoreczeniaPotwierdzeniaType }
     *     
     */
    public void setSposob(SposobDoreczeniaPotwierdzeniaType value) {
        this.sposob = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontakt(String value) {
        this.kontakt = value;
    }

}
