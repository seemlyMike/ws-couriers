
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obszarAdresowyResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obszarAdresowyResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="isObszarMiasto" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obszarAdresowyResponseType")
public class ObszarAdresowyResponseType {

    @XmlAttribute(name = "isObszarMiasto")
    protected Boolean isObszarMiasto;
    @XmlAttribute(name = "guid")
    protected String guid;

    /**
     * Gets the value of the isObszarMiasto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsObszarMiasto() {
        return isObszarMiasto;
    }

    /**
     * Sets the value of the isObszarMiasto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsObszarMiasto(Boolean value) {
        this.isObszarMiasto = value;
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
