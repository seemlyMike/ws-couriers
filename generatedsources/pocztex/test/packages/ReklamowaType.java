
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reklamowaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reklamowaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaNieRejestrowanaType">
 *       &lt;attribute name="masa" type="{http://e-nadawca.poczta-polska.pl}masaType" />
 *       &lt;attribute name="gabaryt" type="{http://e-nadawca.poczta-polska.pl}gabarytType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reklamowaType")
public class ReklamowaType
    extends PrzesylkaNieRejestrowanaType
{

    @XmlAttribute(name = "masa")
    protected Integer masa;
    @XmlAttribute(name = "gabaryt")
    protected GabarytType gabaryt;

    /**
     * Gets the value of the masa property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasa() {
        return masa;
    }

    /**
     * Sets the value of the masa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasa(Integer value) {
        this.masa = value;
    }

    /**
     * Gets the value of the gabaryt property.
     * 
     * @return
     *     possible object is
     *     {@link GabarytType }
     *     
     */
    public GabarytType getGabaryt() {
        return gabaryt;
    }

    /**
     * Sets the value of the gabaryt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GabarytType }
     *     
     */
    public void setGabaryt(GabarytType value) {
        this.gabaryt = value;
    }

}
