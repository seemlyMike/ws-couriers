
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
 *         &lt;element name="idEnvelope" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEnvelope"
})
@XmlRootElement(name = "getAddresLabelCompact")
public class GetAddresLabelCompact {

    protected int idEnvelope;

    /**
     * Gets the value of the idEnvelope property.
     * 
     */
    public int getIdEnvelope() {
        return idEnvelope;
    }

    /**
     * Sets the value of the idEnvelope property.
     * 
     */
    public void setIdEnvelope(int value) {
        this.idEnvelope = value;
    }

}
