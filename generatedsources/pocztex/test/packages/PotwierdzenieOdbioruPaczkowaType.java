
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for potwierdzenieOdbioruPaczkowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="potwierdzenieOdbioruPaczkowaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ilosc" type="{http://e-nadawca.poczta-polska.pl}iloscPotwierdzenOdbioruType" />
 *       &lt;attribute name="sposob" type="{http://e-nadawca.poczta-polska.pl}sposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potwierdzenieOdbioruPaczkowaType")
public class PotwierdzenieOdbioruPaczkowaType {

    @XmlAttribute(name = "ilosc")
    protected Integer ilosc;
    @XmlAttribute(name = "sposob")
    protected SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType sposob;

    /**
     * Gets the value of the ilosc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlosc() {
        return ilosc;
    }

    /**
     * Sets the value of the ilosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlosc(Integer value) {
        this.ilosc = value;
    }

    /**
     * Gets the value of the sposob property.
     * 
     * @return
     *     possible object is
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType }
     *     
     */
    public SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType getSposob() {
        return sposob;
    }

    /**
     * Sets the value of the sposob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType }
     *     
     */
    public void setSposob(SposobPrzekazaniaPotwierdzeniaOdbioruPocztowaType value) {
        this.sposob = value;
    }

}
