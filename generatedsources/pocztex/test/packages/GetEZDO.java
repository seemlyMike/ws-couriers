
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
 *         &lt;element name="idEZDOPakiet" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEZDOPakiet"
})
@XmlRootElement(name = "getEZDO")
public class GetEZDO {

    protected int idEZDOPakiet;

    /**
     * Gets the value of the idEZDOPakiet property.
     * 
     */
    public int getIdEZDOPakiet() {
        return idEZDOPakiet;
    }

    /**
     * Sets the value of the idEZDOPakiet property.
     * 
     */
    public void setIdEZDOPakiet(int value) {
        this.idEZDOPakiet = value;
    }

}
