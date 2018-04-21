
package pocztex.test.packages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusZgodyEZwrotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusZgodyEZwrotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eZwrotPrzesylki" type="{http://e-nadawca.poczta-polska.pl}eZwrotPrzesylkiType" maxOccurs="2"/>
 *       &lt;/sequence>
 *       &lt;attribute name="guidZgodaEZwrot" type="{http://e-nadawca.poczta-polska.pl}guidType" />
 *       &lt;attribute name="status" type="{http://e-nadawca.poczta-polska.pl}statusZgodyEZwrotNameType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusZgodyEZwrotType", propOrder = {
    "eZwrotPrzesylki"
})
public class StatusZgodyEZwrotType {

    @XmlElement(required = true)
    protected List<EZwrotPrzesylkiType> eZwrotPrzesylki;
    @XmlAttribute(name = "guidZgodaEZwrot")
    protected String guidZgodaEZwrot;
    @XmlAttribute(name = "status")
    protected StatusZgodyEZwrotNameType status;

    /**
     * Gets the value of the eZwrotPrzesylki property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eZwrotPrzesylki property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEZwrotPrzesylki().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EZwrotPrzesylkiType }
     * 
     * 
     */
    public List<EZwrotPrzesylkiType> getEZwrotPrzesylki() {
        if (eZwrotPrzesylki == null) {
            eZwrotPrzesylki = new ArrayList<EZwrotPrzesylkiType>();
        }
        return this.eZwrotPrzesylki;
    }

    /**
     * Gets the value of the guidZgodaEZwrot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidZgodaEZwrot() {
        return guidZgodaEZwrot;
    }

    /**
     * Sets the value of the guidZgodaEZwrot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidZgodaEZwrot(String value) {
        this.guidZgodaEZwrot = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusZgodyEZwrotNameType }
     *     
     */
    public StatusZgodyEZwrotNameType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusZgodyEZwrotNameType }
     *     
     */
    public void setStatus(StatusZgodyEZwrotNameType value) {
        this.status = value;
    }

}
