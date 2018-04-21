
package pocztex.test.tracking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaZdarzen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaZdarzen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zdarzenie" type="{http://ws.sledzenie.pocztapolska.pl/xsd}Zdarzenie" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaZdarzen", namespace = "http://ws.sledzenie.pocztapolska.pl/xsd", propOrder = {
    "zdarzenie"
})
public class ListaZdarzen {

    @XmlElement(nillable = true)
    protected List<Zdarzenie> zdarzenie;

    /**
     * Gets the value of the zdarzenie property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zdarzenie property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZdarzenie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zdarzenie }
     * 
     * 
     */
    public List<Zdarzenie> getZdarzenie() {
        if (zdarzenie == null) {
            zdarzenie = new ArrayList<Zdarzenie>();
        }
        return this.zdarzenie;
    }

}
