
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaEPOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaEPOType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EPOInfo" type="{http://e-nadawca.poczta-polska.pl}EPOInfoType" minOccurs="0"/>
 *         &lt;element name="biometricSignatureContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *       &lt;attribute name="numerNadania" type="{http://e-nadawca.poczta-polska.pl}numerNadaniaType" />
 *       &lt;attribute name="statusEPO" type="{http://e-nadawca.poczta-polska.pl}statusEPOEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaEPOType", propOrder = {
    "epoInfo",
    "biometricSignatureContent"
})
public class PrzesylkaEPOType {

    @XmlElement(name = "EPOInfo")
    protected EPOInfoType epoInfo;
    protected byte[] biometricSignatureContent;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "numerNadania")
    protected String numerNadania;
    @XmlAttribute(name = "statusEPO")
    protected StatusEPOEnum statusEPO;

    /**
     * Gets the value of the epoInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EPOInfoType }
     *     
     */
    public EPOInfoType getEPOInfo() {
        return epoInfo;
    }

    /**
     * Sets the value of the epoInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPOInfoType }
     *     
     */
    public void setEPOInfo(EPOInfoType value) {
        this.epoInfo = value;
    }

    /**
     * Gets the value of the biometricSignatureContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBiometricSignatureContent() {
        return biometricSignatureContent;
    }

    /**
     * Sets the value of the biometricSignatureContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBiometricSignatureContent(byte[] value) {
        this.biometricSignatureContent = ((byte[]) value);
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

    /**
     * Gets the value of the numerNadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerNadania() {
        return numerNadania;
    }

    /**
     * Sets the value of the numerNadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerNadania(String value) {
        this.numerNadania = value;
    }

    /**
     * Gets the value of the statusEPO property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEPOEnum }
     *     
     */
    public StatusEPOEnum getStatusEPO() {
        return statusEPO;
    }

    /**
     * Sets the value of the statusEPO property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEPOEnum }
     *     
     */
    public void setStatusEPO(StatusEPOEnum value) {
        this.statusEPO = value;
    }

}
