
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressLabelContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressLabelContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pdfContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nrNadania" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressLabelContent", propOrder = {
    "pdfContent"
})
public class AddressLabelContent {

    @XmlElement(required = true)
    protected byte[] pdfContent;
    @XmlAttribute(name = "nrNadania")
    protected String nrNadania;
    @XmlAttribute(name = "guid")
    protected String guid;

    /**
     * Gets the value of the pdfContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPdfContent() {
        return pdfContent;
    }

    /**
     * Sets the value of the pdfContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPdfContent(byte[] value) {
        this.pdfContent = ((byte[]) value);
    }

    /**
     * Gets the value of the nrNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrNadania() {
        return nrNadania;
    }

    /**
     * Sets the value of the nrNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrNadania(String value) {
        this.nrNadania = value;
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
