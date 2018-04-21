
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trasaRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trasaRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromUrzadNadania" type="{http://e-nadawca.poczta-polska.pl}urzadNadaniaType"/>
 *         &lt;element name="toKodPocztowy" type="{http://e-nadawca.poczta-polska.pl}kodPocztowyType"/>
 *         &lt;element name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trasaRequestType", propOrder = {
    "fromUrzadNadania",
    "toKodPocztowy",
    "guid"
})
public class TrasaRequestType {

    protected int fromUrzadNadania;
    @XmlElement(required = true)
    protected String toKodPocztowy;
    @XmlElement(required = true)
    protected String guid;

    /**
     * Gets the value of the fromUrzadNadania property.
     * 
     */
    public int getFromUrzadNadania() {
        return fromUrzadNadania;
    }

    /**
     * Sets the value of the fromUrzadNadania property.
     * 
     */
    public void setFromUrzadNadania(int value) {
        this.fromUrzadNadania = value;
    }

    /**
     * Gets the value of the toKodPocztowy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToKodPocztowy() {
        return toKodPocztowy;
    }

    /**
     * Sets the value of the toKodPocztowy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToKodPocztowy(String value) {
        this.toKodPocztowy = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
