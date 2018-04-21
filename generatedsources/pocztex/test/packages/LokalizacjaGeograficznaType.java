
package pocztex.test.packages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lokalizacjaGeograficznaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lokalizacjaGeograficznaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dlugosc" type="{http://e-nadawca.poczta-polska.pl}wspolrzednaGeograficznaType"/>
 *         &lt;element name="szerokosc" type="{http://e-nadawca.poczta-polska.pl}wspolrzednaGeograficznaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lokalizacjaGeograficznaType", propOrder = {
    "dlugosc",
    "szerokosc"
})
public class LokalizacjaGeograficznaType {

    @XmlElement(required = true)
    protected WspolrzednaGeograficznaType dlugosc;
    @XmlElement(required = true)
    protected WspolrzednaGeograficznaType szerokosc;

    /**
     * Gets the value of the dlugosc property.
     * 
     * @return
     *     possible object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public WspolrzednaGeograficznaType getDlugosc() {
        return dlugosc;
    }

    /**
     * Sets the value of the dlugosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public void setDlugosc(WspolrzednaGeograficznaType value) {
        this.dlugosc = value;
    }

    /**
     * Gets the value of the szerokosc property.
     * 
     * @return
     *     possible object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public WspolrzednaGeograficznaType getSzerokosc() {
        return szerokosc;
    }

    /**
     * Sets the value of the szerokosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link WspolrzednaGeograficznaType }
     *     
     */
    public void setSzerokosc(WspolrzednaGeograficznaType value) {
        this.szerokosc = value;
    }

}
