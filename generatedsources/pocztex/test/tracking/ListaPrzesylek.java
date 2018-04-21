
package pocztex.test.tracking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaPrzesylek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaPrzesylek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="przesylka" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Przesylka" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaPrzesylek", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "przesylka"
})
public class ListaPrzesylek {

    @XmlElement(nillable = true)
    protected List<Przesylka> przesylka;

    /**
     * Gets the value of the przesylka property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the przesylka property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrzesylka().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Przesylka }
     * 
     * 
     */
    public List<Przesylka> getPrzesylka() {
        if (przesylka == null) {
            przesylka = new ArrayList<Przesylka>();
        }
        return this.przesylka;
    }

}
