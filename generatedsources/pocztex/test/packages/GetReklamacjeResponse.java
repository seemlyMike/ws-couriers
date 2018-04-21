
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="reklamacja" type="{http://e-nadawca.poczta-polska.pl}reklamacjaRozpatrzonaType" maxOccurs="unbounded" minOccurs="0"/>
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
    "reklamacja"
})
@XmlRootElement(name = "getReklamacjeResponse")
public class GetReklamacjeResponse {

    protected List<ReklamacjaRozpatrzonaType> reklamacja;

    /**
     * Gets the value of the reklamacja property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reklamacja property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReklamacja().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReklamacjaRozpatrzonaType }
     * 
     * 
     */
    public List<ReklamacjaRozpatrzonaType> getReklamacja() {
        if (reklamacja == null) {
            reklamacja = new ArrayList<ReklamacjaRozpatrzonaType>();
        }
        return this.reklamacja;
    }

}
