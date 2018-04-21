
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
 *         &lt;element name="idProfile" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idProfile"
})
@XmlRootElement(name = "deleteReturnDocumentsProfile")
public class DeleteReturnDocumentsProfile {

    protected int idProfile;

    /**
     * Gets the value of the idProfile property.
     * 
     */
    public int getIdProfile() {
        return idProfile;
    }

    /**
     * Sets the value of the idProfile property.
     * 
     */
    public void setIdProfile(int value) {
        this.idProfile = value;
    }

}
