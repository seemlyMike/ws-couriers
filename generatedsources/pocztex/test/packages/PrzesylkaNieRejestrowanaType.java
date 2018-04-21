
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for przesylkaNieRejestrowanaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="przesylkaNieRejestrowanaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://e-nadawca.poczta-polska.pl}przesylkaType">
 *       &lt;attribute name="ilosc">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="9999999"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "przesylkaNieRejestrowanaType")
@XmlSeeAlso({
    ListZwyklyFirmowyType.class,
    PrzesylkaZagranicznaType.class,
    ListBiznesowyType.class,
    ListZwyklyType.class,
    ReklamowaType.class
})
public abstract class PrzesylkaNieRejestrowanaType
    extends PrzesylkaType
{

    @XmlAttribute(name = "ilosc")
    protected Integer ilosc;

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

}
