
package pocztex.test.packages;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ubezpieczeniaInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ubezpieczeniaInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="typPrzesylki" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="kwota" type="{http://e-nadawca.poczta-polska.pl}kwotaUbezpieczeniaType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubezpieczeniaInfoType")
public class UbezpieczeniaInfoType {

    @XmlAttribute(name = "typPrzesylki")
    protected String typPrzesylki;
    @XmlAttribute(name = "kwota")
    protected BigDecimal kwota;

    /**
     * Gets the value of the typPrzesylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypPrzesylki() {
        return typPrzesylki;
    }

    /**
     * Sets the value of the typPrzesylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypPrzesylki(String value) {
        this.typPrzesylki = value;
    }

    /**
     * Gets the value of the kwota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKwota() {
        return kwota;
    }

    /**
     * Sets the value of the kwota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKwota(BigDecimal value) {
        this.kwota = value;
    }

}
