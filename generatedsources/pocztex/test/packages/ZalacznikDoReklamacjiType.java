
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for zalacznikDoReklamacjiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zalacznikDoReklamacjiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zalacznikDoReklamacjiType", propOrder = {
    "fileContent",
    "fileName",
    "fileDesc"
})
public class ZalacznikDoReklamacjiType {

    @XmlElement(required = true)
    protected byte[] fileContent;
    @XmlElement(required = true)
    protected String fileName;
    protected String fileDesc;

    /**
     * Gets the value of the fileContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileContent() {
        return fileContent;
    }

    /**
     * Sets the value of the fileContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFileContent(byte[] value) {
        this.fileContent = ((byte[]) value);
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * Sets the value of the fileDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDesc(String value) {
        this.fileDesc = value;
    }

}
