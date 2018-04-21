
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="idWojewodztwo" type="{http://e-nadawca.poczta-polska.pl}idWojewodztwoType"/>
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
    "idWojewodztwo"
})
@XmlRootElement(name = "getPlacowkiPocztowe")
public class GetPlacowkiPocztowe {

    @XmlElement(required = true)
    protected String idWojewodztwo;

    /**
     * Gets the value of the idWojewodztwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWojewodztwo() {
        return idWojewodztwo;
    }

    /**
     * Sets the value of the idWojewodztwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWojewodztwo(String value) {
        this.idWojewodztwo = value;
    }

}
