
package pocztex.test.packages;

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
 *         &lt;element name="idRelkamacja" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idRelkamacja"
})
@XmlRootElement(name = "cancelReklamacja")
public class CancelReklamacja {

    protected int idRelkamacja;

    /**
     * Gets the value of the idRelkamacja property.
     * 
     */
    public int getIdRelkamacja() {
        return idRelkamacja;
    }

    /**
     * Sets the value of the idRelkamacja property.
     * 
     */
    public void setIdRelkamacja(int value) {
        this.idRelkamacja = value;
    }

}
