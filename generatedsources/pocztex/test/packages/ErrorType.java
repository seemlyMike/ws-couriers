
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="errorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="errorNumber" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="guid" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "errorType")
public class ErrorType {

    @XmlAttribute(name = "errorNumber")
    protected Integer errorNumber;
    @XmlAttribute(name = "errorDesc")
    protected String errorDesc;
    @XmlAttribute(name = "guid")
    protected String guid;

    /**
     * Gets the value of the errorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getErrorNumber() {
        if (errorNumber == null) {
            return  0;
        } else {
            return errorNumber;
        }
    }

    /**
     * Sets the value of the errorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorNumber(Integer value) {
        this.errorNumber = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
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
